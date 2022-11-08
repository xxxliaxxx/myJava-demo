package com.lia.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public abstract class SqlSessionFactoryUtil {

    private static SqlSessionFactory sqlSessionFactory;

    static {
        //静态资源mybatis-config.xml
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
           inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }

        sqlSessionFactory =new SqlSessionFactoryBuilder().build(inputStream);
    }

    public static SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }
}
