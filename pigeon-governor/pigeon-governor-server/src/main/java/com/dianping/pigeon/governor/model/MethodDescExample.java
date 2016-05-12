package com.dianping.pigeon.governor.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MethodDescExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table method_desc
     *
     * @mbggenerated Thu May 12 14:38:04 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table method_desc
     *
     * @mbggenerated Thu May 12 14:38:04 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table method_desc
     *
     * @mbggenerated Thu May 12 14:38:04 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table method_desc
     *
     * @mbggenerated Thu May 12 14:38:04 CST 2016
     */
    public MethodDescExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table method_desc
     *
     * @mbggenerated Thu May 12 14:38:04 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table method_desc
     *
     * @mbggenerated Thu May 12 14:38:04 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table method_desc
     *
     * @mbggenerated Thu May 12 14:38:04 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table method_desc
     *
     * @mbggenerated Thu May 12 14:38:04 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table method_desc
     *
     * @mbggenerated Thu May 12 14:38:04 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table method_desc
     *
     * @mbggenerated Thu May 12 14:38:04 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table method_desc
     *
     * @mbggenerated Thu May 12 14:38:04 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table method_desc
     *
     * @mbggenerated Thu May 12 14:38:04 CST 2016
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table method_desc
     *
     * @mbggenerated Thu May 12 14:38:04 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table method_desc
     *
     * @mbggenerated Thu May 12 14:38:04 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table method_desc
     *
     * @mbggenerated Thu May 12 14:38:04 CST 2016
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andMethodIdIsNull() {
            addCriterion("method_id is null");
            return (Criteria) this;
        }

        public Criteria andMethodIdIsNotNull() {
            addCriterion("method_id is not null");
            return (Criteria) this;
        }

        public Criteria andMethodIdEqualTo(Integer value) {
            addCriterion("method_id =", value, "methodId");
            return (Criteria) this;
        }

        public Criteria andMethodIdNotEqualTo(Integer value) {
            addCriterion("method_id <>", value, "methodId");
            return (Criteria) this;
        }

        public Criteria andMethodIdGreaterThan(Integer value) {
            addCriterion("method_id >", value, "methodId");
            return (Criteria) this;
        }

        public Criteria andMethodIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("method_id >=", value, "methodId");
            return (Criteria) this;
        }

        public Criteria andMethodIdLessThan(Integer value) {
            addCriterion("method_id <", value, "methodId");
            return (Criteria) this;
        }

        public Criteria andMethodIdLessThanOrEqualTo(Integer value) {
            addCriterion("method_id <=", value, "methodId");
            return (Criteria) this;
        }

        public Criteria andMethodIdIn(List<Integer> values) {
            addCriterion("method_id in", values, "methodId");
            return (Criteria) this;
        }

        public Criteria andMethodIdNotIn(List<Integer> values) {
            addCriterion("method_id not in", values, "methodId");
            return (Criteria) this;
        }

        public Criteria andMethodIdBetween(Integer value1, Integer value2) {
            addCriterion("method_id between", value1, value2, "methodId");
            return (Criteria) this;
        }

        public Criteria andMethodIdNotBetween(Integer value1, Integer value2) {
            addCriterion("method_id not between", value1, value2, "methodId");
            return (Criteria) this;
        }

        public Criteria andServiceIdIsNull() {
            addCriterion("service_id is null");
            return (Criteria) this;
        }

        public Criteria andServiceIdIsNotNull() {
            addCriterion("service_id is not null");
            return (Criteria) this;
        }

        public Criteria andServiceIdEqualTo(Integer value) {
            addCriterion("service_id =", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotEqualTo(Integer value) {
            addCriterion("service_id <>", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdGreaterThan(Integer value) {
            addCriterion("service_id >", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_id >=", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLessThan(Integer value) {
            addCriterion("service_id <", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLessThanOrEqualTo(Integer value) {
            addCriterion("service_id <=", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdIn(List<Integer> values) {
            addCriterion("service_id in", values, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotIn(List<Integer> values) {
            addCriterion("service_id not in", values, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdBetween(Integer value1, Integer value2) {
            addCriterion("service_id between", value1, value2, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("service_id not between", value1, value2, "serviceId");
            return (Criteria) this;
        }

        public Criteria andMethodNameIsNull() {
            addCriterion("method_name is null");
            return (Criteria) this;
        }

        public Criteria andMethodNameIsNotNull() {
            addCriterion("method_name is not null");
            return (Criteria) this;
        }

        public Criteria andMethodNameEqualTo(String value) {
            addCriterion("method_name =", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameNotEqualTo(String value) {
            addCriterion("method_name <>", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameGreaterThan(String value) {
            addCriterion("method_name >", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameGreaterThanOrEqualTo(String value) {
            addCriterion("method_name >=", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameLessThan(String value) {
            addCriterion("method_name <", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameLessThanOrEqualTo(String value) {
            addCriterion("method_name <=", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameLike(String value) {
            addCriterion("method_name like", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameNotLike(String value) {
            addCriterion("method_name not like", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameIn(List<String> values) {
            addCriterion("method_name in", values, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameNotIn(List<String> values) {
            addCriterion("method_name not in", values, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameBetween(String value1, String value2) {
            addCriterion("method_name between", value1, value2, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameNotBetween(String value1, String value2) {
            addCriterion("method_name not between", value1, value2, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodFullnameIsNull() {
            addCriterion("method_fullname is null");
            return (Criteria) this;
        }

        public Criteria andMethodFullnameIsNotNull() {
            addCriterion("method_fullname is not null");
            return (Criteria) this;
        }

        public Criteria andMethodFullnameEqualTo(String value) {
            addCriterion("method_fullname =", value, "methodFullname");
            return (Criteria) this;
        }

        public Criteria andMethodFullnameNotEqualTo(String value) {
            addCriterion("method_fullname <>", value, "methodFullname");
            return (Criteria) this;
        }

        public Criteria andMethodFullnameGreaterThan(String value) {
            addCriterion("method_fullname >", value, "methodFullname");
            return (Criteria) this;
        }

        public Criteria andMethodFullnameGreaterThanOrEqualTo(String value) {
            addCriterion("method_fullname >=", value, "methodFullname");
            return (Criteria) this;
        }

        public Criteria andMethodFullnameLessThan(String value) {
            addCriterion("method_fullname <", value, "methodFullname");
            return (Criteria) this;
        }

        public Criteria andMethodFullnameLessThanOrEqualTo(String value) {
            addCriterion("method_fullname <=", value, "methodFullname");
            return (Criteria) this;
        }

        public Criteria andMethodFullnameLike(String value) {
            addCriterion("method_fullname like", value, "methodFullname");
            return (Criteria) this;
        }

        public Criteria andMethodFullnameNotLike(String value) {
            addCriterion("method_fullname not like", value, "methodFullname");
            return (Criteria) this;
        }

        public Criteria andMethodFullnameIn(List<String> values) {
            addCriterion("method_fullname in", values, "methodFullname");
            return (Criteria) this;
        }

        public Criteria andMethodFullnameNotIn(List<String> values) {
            addCriterion("method_fullname not in", values, "methodFullname");
            return (Criteria) this;
        }

        public Criteria andMethodFullnameBetween(String value1, String value2) {
            addCriterion("method_fullname between", value1, value2, "methodFullname");
            return (Criteria) this;
        }

        public Criteria andMethodFullnameNotBetween(String value1, String value2) {
            addCriterion("method_fullname not between", value1, value2, "methodFullname");
            return (Criteria) this;
        }

        public Criteria andMethodReturnTypeIsNull() {
            addCriterion("method_return_type is null");
            return (Criteria) this;
        }

        public Criteria andMethodReturnTypeIsNotNull() {
            addCriterion("method_return_type is not null");
            return (Criteria) this;
        }

        public Criteria andMethodReturnTypeEqualTo(String value) {
            addCriterion("method_return_type =", value, "methodReturnType");
            return (Criteria) this;
        }

        public Criteria andMethodReturnTypeNotEqualTo(String value) {
            addCriterion("method_return_type <>", value, "methodReturnType");
            return (Criteria) this;
        }

        public Criteria andMethodReturnTypeGreaterThan(String value) {
            addCriterion("method_return_type >", value, "methodReturnType");
            return (Criteria) this;
        }

        public Criteria andMethodReturnTypeGreaterThanOrEqualTo(String value) {
            addCriterion("method_return_type >=", value, "methodReturnType");
            return (Criteria) this;
        }

        public Criteria andMethodReturnTypeLessThan(String value) {
            addCriterion("method_return_type <", value, "methodReturnType");
            return (Criteria) this;
        }

        public Criteria andMethodReturnTypeLessThanOrEqualTo(String value) {
            addCriterion("method_return_type <=", value, "methodReturnType");
            return (Criteria) this;
        }

        public Criteria andMethodReturnTypeLike(String value) {
            addCriterion("method_return_type like", value, "methodReturnType");
            return (Criteria) this;
        }

        public Criteria andMethodReturnTypeNotLike(String value) {
            addCriterion("method_return_type not like", value, "methodReturnType");
            return (Criteria) this;
        }

        public Criteria andMethodReturnTypeIn(List<String> values) {
            addCriterion("method_return_type in", values, "methodReturnType");
            return (Criteria) this;
        }

        public Criteria andMethodReturnTypeNotIn(List<String> values) {
            addCriterion("method_return_type not in", values, "methodReturnType");
            return (Criteria) this;
        }

        public Criteria andMethodReturnTypeBetween(String value1, String value2) {
            addCriterion("method_return_type between", value1, value2, "methodReturnType");
            return (Criteria) this;
        }

        public Criteria andMethodReturnTypeNotBetween(String value1, String value2) {
            addCriterion("method_return_type not between", value1, value2, "methodReturnType");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table method_desc
     *
     * @mbggenerated do_not_delete_during_merge Thu May 12 14:38:04 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table method_desc
     *
     * @mbggenerated Thu May 12 14:38:04 CST 2016
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}