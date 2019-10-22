package com.opsigte.demo.jenkinsdemo.controller;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *<p> @ClassName: <i>DemoController</i></p>
 *<p> @Description: <i></i></p>
 *<p> @Author: <i>zzh</i></p>
 *<p> @Created date: <i>2019/10/22 19:09</i></p>
 *<p> @Version: <i>V1.0.0</i> </p>
 */
@RestController
public class DemoController {


    @RequestMapping(value = "/test")
    public String test(String name){
        return StringUtils.isEmpty(name) ? "test3" : name;
    }

}
