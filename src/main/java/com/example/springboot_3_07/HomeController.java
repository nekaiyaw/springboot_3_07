package com.example.springboot_3_07;

public class HomeController {
    Employee employee = new Employer();
       employee.setName("Stephen Bullock");
       employee.setSsn("555-12-1234");

    Laptop laptop = new Laptop();
        laptop.setBrand("Dell");
        laptop.setModel("Latitude XL");
        laptop.setSerialnumber("87493759348396939")

        employee.setLaptop(laptop);

        employeeRepository.save(employee);

        model.addAttribute("employees", employeeRepository.findAll());
        return "index";
}
