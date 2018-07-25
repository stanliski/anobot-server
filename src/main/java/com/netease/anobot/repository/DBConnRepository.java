package com.netease.anobot.repository;

import com.netease.anobot.model.DBConn;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DBConnRepository extends CrudRepository<DBConn, Long> {
}
