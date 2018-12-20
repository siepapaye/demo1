package com.pinyougou.sellergoods.service;

import java.util.List;

import com.pinyougou.pojo.TbBrand;

import entity.PageResult;
/*
 * @author Administrator
 */
//品牌接口 
public interface BrandService {
	public List<TbBrand> findAll();
/*
 * 品牌分页
 * @return
 * @param pageNum当前页面
 * @param pageSize每页记录数
*/	
	public PageResult findPage(int pageNum,int pageSize);
}
