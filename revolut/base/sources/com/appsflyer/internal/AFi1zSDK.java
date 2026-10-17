package com.appsflyer.internal;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1zSDK {
    public final String AFInAppEventParameterName;
    public final long AFInAppEventType;

    @NonNull
    public final String AFKeystoreWrapper;
    public final Throwable e;
    public final AFh1cSDK registerClient;
    public final String unregisterClient;
    public final int valueOf;
    public final long values;

    public AFi1zSDK(String str, @NonNull String str2, long j2, long j3, int i, AFh1cSDK aFh1cSDK, String str3, Throwable th10) {
        this.AFInAppEventParameterName = str;
        this.AFKeystoreWrapper = str2;
        this.values = j2;
        this.AFInAppEventType = j3;
        this.valueOf = i;
        this.registerClient = aFh1cSDK;
        this.unregisterClient = str3;
        this.e = th10;
    }
}
