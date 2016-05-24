package com.competition.db.pojo;


import java.sql.Blob;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * 用户基本信息
 * @author One
 *
 */
@Entity
@Table(name="user")
public class User{
	
	//主键
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id",nullable=false)
	private int m_iUserId;
	
	//用户名
	@Column(name="user_name",nullable=false)
	private String m_sUserName;
	
	//密码
	@Column(name="user_pass",nullable=false)
	private String m_sUserPass;
	
	//性别
	@Column(name="user_sex",nullable=true)
	private char m_cUserSex;
	
	//生日
	@Column(name="user_birth",nullable=true)
	private Date m_DUserBirth;
	
	//地址	
	@Column(name="user_addr",nullable=true)
	private String m_sUserAddr;
	
	//个性签名
	@Column(name="user_signature",nullable=true)
	private String m_sUserSignature;
	
	//用户相册集
	@OneToMany(targetEntity=UserAlbum.class,mappedBy="m_UAlbum_User")
	private Set<UserAlbum> m_UAAlbums = new HashSet<>();
	
	//背景图片
	@OneToMany(targetEntity=UserBackground.class,mappedBy="m_UIUserInfos")
	private Set<UserBackground> m_UBUserBackgrounds=new HashSet<>();
	
	//收藏内容
	@OneToMany(targetEntity=UserCollection.class,mappedBy="m_UIUserInfos")
	private Set<UserCollection> m_UCUserCollection = new HashSet<>();
	
	//关注用户
//	private UserInfos m_UIUserFollow;
	
	//用户头像
	@Lob
	private byte[] m_BUesrIcon;

	public User(){
		
	}
	
	public User(String name, String pass){
		m_sUserName=name;
		m_sUserPass = pass;
	}
	
	public String getM_sUserName() {
		return m_sUserName;
	}

	public void setM_sUserName(String m_sUserName) {
		this.m_sUserName = m_sUserName;
	}

	public String getM_sUserPass() {
		return m_sUserPass;
	}

	public void setM_sUserPass(String m_sUserPass) {
		this.m_sUserPass = m_sUserPass;
	}

	public char getM_cUserSex() {
		return m_cUserSex;
	}

	public void setM_cUserSex(char m_cUserSex) {
		this.m_cUserSex = m_cUserSex;
	}

	public Date getM_DUserBirth() {
		return m_DUserBirth;
	}

	public void setM_DUserBirth(Date m_DUserBirth) {
		this.m_DUserBirth = m_DUserBirth;
	}

	public String getM_sUserAddr() {
		return m_sUserAddr;
	}

	public void setM_sUserAddr(String m_sUserAddr) {
		this.m_sUserAddr = m_sUserAddr;
	}

	public String getM_sUserSignature() {
		return m_sUserSignature;
	}

	public void setM_sUserSignature(String m_sUserSignature) {
		this.m_sUserSignature = m_sUserSignature;
	}

	public Set<UserAlbum> getM_UAAlbums() {
		return m_UAAlbums;
	}

	public void setM_UAAlbums(Set<UserAlbum> m_UAAlbums) {
		this.m_UAAlbums = m_UAAlbums;
	}

	public Set<UserBackground> getM_UBUserBackgrounds() {
		return m_UBUserBackgrounds;
	}

	public void setM_UBUserBackgrounds(Set<UserBackground> m_UBUserBackgrounds) {
		this.m_UBUserBackgrounds = m_UBUserBackgrounds;
	}

	public Set<UserCollection> getM_UCUserCollection() {
		return m_UCUserCollection;
	}

	public void setM_UCUserCollection(Set<UserCollection> m_UCUserCollection) {
		this.m_UCUserCollection = m_UCUserCollection;
	}

	public byte[] getM_BUesrIcon() {
		return m_BUesrIcon;
	}

	public void setM_BUesrIcon(byte[] m_BUesrIcon) {
		this.m_BUesrIcon = m_BUesrIcon;
	}

}