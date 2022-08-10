package com.example.ngochithanhdat.repository;

import com.example.ngochithanhdat.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Integer> {

}