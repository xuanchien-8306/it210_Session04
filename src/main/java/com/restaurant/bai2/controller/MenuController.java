package com.restaurant.bai2.controller;

import com.restaurant.bai1.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/bai2")
public class MenuController {

    private OrderService orderService;

    @Autowired
    public MenuController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/menu")
    @ResponseBody
    public String getMenu(
            @RequestParam(value = "category", required = false, defaultValue = "chay")
            String category) {

        return "Menu loai: " + category;
    }
}