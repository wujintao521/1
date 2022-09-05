package com.intelligent.controller;

import com.commos.utils.Result;
import com.intelligent.request.PersonRequest;
import com.intelligent.service.IUserInfoService;
import com.intelligent.vo.UserInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("user")
@RestController
public class UserInfoController {

    @Autowired
    private IUserInfoService iUserInfoService;

    @PostMapping("/browsUserInfo")
    public Result<List<UserInfoVO>> browsUserInfo(@RequestBody PersonRequest request){
        return Result.buildResult(Result.Status.OK, iUserInfoService.browsUserInfo(request));
    }

    @PostMapping("/updateUserInfo")
    public Result<Boolean> updateUserInfo(@RequestBody PersonRequest request){
        return Result.buildResult(Result.Status.OK,iUserInfoService.updateUserInfo(request));
    }

    @PostMapping("/insertUserInfo")
    public Result<Boolean> insertUserInfo(@RequestBody PersonRequest request){
        return Result.buildResult(Result.Status.OK,iUserInfoService.insertUserInfo(request));
    }

}