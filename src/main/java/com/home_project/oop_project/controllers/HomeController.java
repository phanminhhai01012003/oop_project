package com.home_project.oop_project.controllers;

import java.sql.*;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class HomeController {
	int adminlogcheck = 0;
	String usernameforclass = "";
	//Home ver
    @GetMapping(value = {"/","home"})
	public String home(Model model) {
		if(usernameforclass.equalsIgnoreCase(""))
			return "redirect:/login";
		else {
			model.addAttribute("username", usernameforclass);
			return "home/home";
		}
	}
	@GetMapping(value = {"about"})
	public String about(Model model) {
		return "home/about";
	}
	@GetMapping(value = {"order"})
	public String order(Model model) {
		return "home/order";
	}
	@GetMapping(value = {"join"})
	public String join(Model model) {
		return "home/join";
	}
	

}
