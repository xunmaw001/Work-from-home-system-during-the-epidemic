package com.dao;

import com.entity.WangfanYuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.WangfanYuyueView;

/**
 * 外出报备 Dao 接口
 *
 * @author 
 */
public interface WangfanYuyueDao extends BaseMapper<WangfanYuyueEntity> {

   List<WangfanYuyueView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
