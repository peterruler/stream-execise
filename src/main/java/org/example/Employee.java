package org.example;

public class Employee {
    public Integer id;
    public String name;
    public double salary;

    public Integer getId(Integer id) {
        return id;
    }
    public Integer getId() {
        return this.id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary (double salary) {
        this.salary = salary;
    }

    public void salaryIncrement(double amount) {
        this.setSalary(getSalary()+amount);
    }
    public Employee(Integer id, String name, double salary) {
        this.setId(id);
        this.setName(name);
        this.setSalary(salary);
    }
}
