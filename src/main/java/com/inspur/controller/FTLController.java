package com.inspur.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * User: YANG
 * Date: 2019/6/10-22:41
 * Description: No Description
 */
@Controller
public class FTLController {

    @RequestMapping("/ftlIndex")
    public String ftlIndex(){
        return "ftlIndex";
    }
}
