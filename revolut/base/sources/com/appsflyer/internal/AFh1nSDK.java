package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1nSDK extends AFa1pSDK {
    @Override // com.appsflyer.internal.AFa1pSDK
    public final boolean AFLogger() {
        return true;
    }

    @Override // com.appsflyer.internal.AFa1pSDK
    public final AFf1ySDK values() {
        return this.registerClient == 1 ? AFf1ySDK.CONVERSION : AFf1ySDK.LAUNCH;
    }
}
