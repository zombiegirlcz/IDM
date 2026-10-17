package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AppsFlyerLib;

/* JADX INFO: loaded from: classes16.dex */
public final class AFg1kSDK extends AFa1pSDK {
    public AFg1kSDK(Context context) {
        StringBuilder sb6 = new StringBuilder();
        sb6.append(String.format(AFg1lSDK.AFInAppEventType, AppsFlyerLib.getInstance().getHostPrefix(), AFb1rSDK.AFInAppEventParameterName().getHostName()));
        sb6.append(context.getPackageName());
        super("Register", sb6.toString(), Boolean.FALSE);
    }

    @Override // com.appsflyer.internal.AFa1pSDK
    public final boolean registerClient() {
        return false;
    }

    @Override // com.appsflyer.internal.AFa1pSDK
    public final AFf1ySDK values() {
        return AFf1ySDK.REGISTER;
    }
}
