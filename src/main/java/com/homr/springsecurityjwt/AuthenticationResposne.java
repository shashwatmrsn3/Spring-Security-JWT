package com.homr.springsecurityjwt;

public class AuthenticationResposne {

    private final String token;

    public String getToken() {
        return token;
    }

    public AuthenticationResposne(String token) {
        this.token = token;
    }


}
