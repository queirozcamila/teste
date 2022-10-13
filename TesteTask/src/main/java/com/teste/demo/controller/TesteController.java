package com.teste.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class TesteController{

    @PostMapping(value = "/retornar")
    public ResponseEntity<String> retornar(@RequestBody String s){

        if(s != null){
            return ResponseEntity.ok(s);
        }
        return ResponseEntity.badRequest().build();
    }
}