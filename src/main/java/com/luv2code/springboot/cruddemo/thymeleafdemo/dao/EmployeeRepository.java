package com.luv2code.springboot.cruddemo.thymeleafdemo.dao;

import com.luv2code.springboot.cruddemo.thymeleafdemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it ... no need to write any code LOL!
//add a method tp sort by last name

    public List<Employee> findAllByOrderByLastNameAsc();
}
