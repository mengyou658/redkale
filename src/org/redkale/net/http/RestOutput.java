/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.redkale.net.http;

import java.io.Serializable;
import java.net.HttpCookie;
import java.util.*;

/**
 *
 * <p>
 * 详情见: https://redkale.org
 *
 * @author zhangjx
 * @param <T> 结果对象的类型
 */
public class RestOutput<T> {

    private Map<String, String> headers;

    private List<HttpCookie> cookies;

    private String contentType;

    private T result;

    public RestOutput() {
    }

    public RestOutput(T result) {
        this.result = result;
    }

    public RestOutput<T> addHeader(String name, Serializable value) {
        if (this.headers == null) this.headers = new HashMap<>();
        this.headers.put(name, String.valueOf(value));
        return this;
    }

    public RestOutput<T> addCookie(HttpCookie cookie) {
        if (this.cookies == null) this.cookies = new ArrayList<>();
        this.cookies.add(cookie);
        return this;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public List<HttpCookie> getCookies() {
        return cookies;
    }

    public void setCookies(List<HttpCookie> cookies) {
        this.cookies = cookies;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

}
