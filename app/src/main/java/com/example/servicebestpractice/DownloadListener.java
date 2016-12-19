package com.example.servicebestpractice;

/**
 * Created by Administrator on 2016/12/11 0011.
 */

public interface DownloadListener {
    void onprogress(int progress);
    void onSuccess();
    void onFailed();
    void onPaused();
    void onCanceled();
}
