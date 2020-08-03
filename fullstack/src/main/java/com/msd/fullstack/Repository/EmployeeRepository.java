package com.msd.fullstack.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.msd.fullstack.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}