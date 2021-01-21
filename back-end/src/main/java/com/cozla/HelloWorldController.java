package com.cozla;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloWorldController {

    @RequestMapping("/welcome")
    public String index() {

        return "index";

    }

    @RequestMapping("/tongasoa")
    public String indexTongasoa() {

        return "index-tongasoa";

    }
}