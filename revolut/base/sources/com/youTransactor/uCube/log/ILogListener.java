package com.youTransactor.uCube.log;

/* JADX INFO: loaded from: classes17.dex */
public interface ILogListener {
    void onDebugLogged(String str, String str2);

    void onErrorLogged(String str, String str2);

    void onWarningLogged(String str, String str2);
}
