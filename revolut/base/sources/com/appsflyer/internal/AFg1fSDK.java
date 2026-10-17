package com.appsflyer.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1fSDK {
    public static boolean AFKeystoreWrapper(Context context) {
        return context.getPackageManager().isInstantApp();
    }
}
