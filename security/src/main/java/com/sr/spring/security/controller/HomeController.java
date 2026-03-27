package com.sr.spring.security.controller;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.OAuth2AccessToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    //http://localhost:8080/public
    @GetMapping("/public")
    public String Home() {
        return "Hello Home!";
    }

    //http://localhost:8080/secured
    @GetMapping("/secured")
    public String SecuredHome(OAuth2AuthenticationToken token) {
        return "Hello Secured Home!"+token.getPrincipal().getAttribute("email");
    }
}
