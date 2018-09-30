package com.github.jakimli.panda.domain.http.client;

import com.github.jakimli.panda.domain.http.HttpContext;

import static javax.ws.rs.client.Entity.entity;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON_TYPE;

public class HttpPost extends AbstractHttpClient implements HttpClient {

    @Override
    public void send(HttpContext context) {
        request(context, target -> target.post(entity(context.requestBody(), APPLICATION_JSON_TYPE)));
    }
}