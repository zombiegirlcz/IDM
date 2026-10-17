package com.appsflyer.internal;

import com.appsflyer.AppsFlyerConsent;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1oSDK {
    public AFd1vSDK AFInAppEventParameterName;
    public String AFInAppEventType;
    public AFc1cSDK AFKeystoreWrapper;
    public AFh1tSDK AFLogger;
    public boolean d;
    public AppsFlyerConsent e;
    public AFe1mSDK unregisterClient;
    public String valueOf;
    public String values;

    public final boolean AFKeystoreWrapper() {
        return this.d;
    }

    public final synchronized void values(AFe1mSDK aFe1mSDK) {
        this.unregisterClient = aFe1mSDK;
    }
}
