package com.exuberant.tutorials.hibernate;

public class HibernateDemo {

    public static void main(String[] args) {
        CrudService crudService = new CrudService();
        crudService.save();
        crudService.fetchWithHql();
        crudService.fetchWithId();
    }

}