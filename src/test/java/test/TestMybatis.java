package test;

import com.shinowit.dao.mapper.UserinfoMapper;
import com.shinowit.entity.Userinfo;
import com.shinowit.entity.UserinfoCriteria;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2014/12/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:application-context.xml" })
public class TestMybatis extends AbstractJUnit4SpringContextTests {

    @Resource
    private UserinfoMapper userDao;

    @Test
    public void test(){
//        插入数据
//        Userinfo user = new Userinfo();
//        user.setUserId(1);
//        user.setUserName("张三");
//        user.setUserPass("123456");
//        int i =userDao.insert(user);
//        Assert.assertTrue(i==1);


//        修改数据
//        Userinfo user = userDao.selectByPrimaryKey(2);
//        user.setUserName("zhangsan");
//        int i = userDao.updateByPrimaryKey(user);
//        System.out.println(i);
//        Assert.assertTrue(i==1);


//        删除数据
//        int i = userDao.deleteByPrimaryKey(1);
//        Assert.assertTrue(i==1);


//        查询
//        UserinfoCriteria criteria = new UserinfoCriteria();
//        UserinfoCriteria.Criteria tiaojian = criteria.createCriteria();
//        tiaojian.andUserIdGreaterThanOrEqualTo(2);
//        List<Userinfo> userList = userDao.selectByExample(criteria);
//        for(int i = 0; i <userList.size();i++){
//            System.out.println(userList.get(i).getUserName());
//        }

//        分页查询
//        List<Userinfo> userlist = userDao.selectPage1(1,1);
//        for(int i = 0; i< userlist.size();i++){
//            System.out.println(userlist.get(i).getUserName());
//        }

//        分页查询插件查询
        UserinfoCriteria criteria = new UserinfoCriteria();
        criteria.setPageSize(1);
        criteria.setPageIndex(2);
        List<Userinfo> userList = userDao.selectPage(criteria);
        for(int i = 0;i<userList.size();i++){
            System.out.println(userList.get(0).getUserName());
        }
    }
}
