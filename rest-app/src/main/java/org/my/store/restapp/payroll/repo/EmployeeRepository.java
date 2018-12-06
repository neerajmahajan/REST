package org.my.store.restapp.payroll.repo;

import org.my.store.restapp.payroll.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
