package com.jackiedeng.movies.service.serviceImpl;

import com.jackiedeng.movies.mapper.MovieInfoMapper;
import com.jackiedeng.movies.pojo.MovieInfo;
import com.jackiedeng.movies.service.MovieInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author jackie
 * @Email 15975403320@163.com
 * @Date 2020/2/12 09:29
 * @Description
 */
@Service
public class MovieInfoServiceImpl implements MovieInfoService {
    @Autowired
    MovieInfoMapper movieInfoMapper;
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MovieInfo queryById(String id) {
        return this.movieInfoMapper.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<MovieInfo> queryAllByLimit(int offset, int limit) {
        return this.movieInfoMapper.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param movieinfo 实例对象
     * @return 实例对象
     */
    @Override
    public MovieInfo insert(MovieInfo movieinfo) {
        this.movieInfoMapper.insert(movieinfo);
        return movieinfo;
    }

    /**
     * 修改数据
     *
     * @param movieinfo 实例对象
     * @return 实例对象
     */
    @Override
    public MovieInfo update(MovieInfo movieinfo) {
        this.movieInfoMapper.update(movieinfo);
        return this.queryById(movieinfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.movieInfoMapper.deleteById(id) > 0;
    }
}
