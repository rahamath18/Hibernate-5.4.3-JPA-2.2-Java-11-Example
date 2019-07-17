package com.test.hibernate543;

import java.util.List;

public class App {
    public static void main(String[] args) {
    	
        UserDao userDao = new UserDao();
        
        User newUser = new User("Rahamath" , "S", "rahamath18@yahoo.com");
        userDao.saveUser(newUser);
        System.out.println("After Save : " + newUser);
        
        for (int i = 2; i <= 10; i++) {
        	User user = new User("User-" + i, "U-" + i , "user-" + i + "@info.com");
            userDao.saveUser(user);
		}
        
        List < User > users = userDao.getUsers();
        users.forEach(s -> System.out.println(s.getFirstName()));
        
    }
}