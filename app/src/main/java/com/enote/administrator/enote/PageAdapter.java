package com.enote.administrator.enote;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Administrator on 2018/7/1 0001.
 * powered by Cpf.com.
 */
public class PageAdapter extends FragmentPagerAdapter {
    private Fragment[] mFragments;
    private String[] mTitles;

    public PageAdapter(FragmentManager fm,Fragment[] fragments,String[] titles) {
        super(fm);
        this.mFragments = fragments;
        this.mTitles = titles;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments[position];
    }

    @Override
    public int getCount() {
        return mFragments.length;
    }

    //联合使用viewpager和PagerSlidingTapStrip时必须复写此方法
    @Override
    public CharSequence getPageTitle(int position){
        return mTitles[position];
    }
}
