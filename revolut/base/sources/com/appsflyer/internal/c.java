package com.appsflyer.internal;

import com.appsflyer.internal.AFd1aSDK;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements AFd1aSDK.AFa1zSDK, AFf1aSDK {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AFb1rSDK f26044a;

    public /* synthetic */ c(AFb1rSDK aFb1rSDK) {
        this.f26044a = aFb1rSDK;
    }

    @Override // com.appsflyer.internal.AFd1aSDK.AFa1zSDK
    public void onConfigurationChanged(boolean z) {
        this.f26044a.AFInAppEventType(z);
    }

    @Override // com.appsflyer.internal.AFf1aSDK
    public void onRemoteConfigUpdateFinished(AFg1zSDK aFg1zSDK) {
        this.f26044a.AFInAppEventParameterName(aFg1zSDK);
    }
}
