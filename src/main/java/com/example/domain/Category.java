package com.example.domain;

/**
 * categoryのドメイン.
 * @author ashibe
 *
 */
public class Category {
	/**
	 * ID
	 */
	private Integer id; 
	/**
	 * 名前
	 */
	private String name; 
	/**
	 * 親のカテゴリ
	 */
	private Integer parent;
	
	/**
	 * 上の階層カテゴリの名前
	 */
	private String nameAll;

	public Integer getId() {
		return id;
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

	public Integer getParent() {
		return parent;
	}

	public void setParent(Integer parent) {
		this.parent = parent;
	}

	public String getNameAll() {
		return nameAll;
	}

	public void setNameAll(String nameAll) {
		this.nameAll = nameAll;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", parent=" + parent + ", nameAll=" + nameAll + "]";
	}
	
	
	
	

}
