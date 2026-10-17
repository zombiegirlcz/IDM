package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AFd1wSDK f26052b;

    public /* synthetic */ h(AFd1wSDK aFd1wSDK, int i) {
        this.f26051a = i;
        this.f26052b = aFd1wSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26051a) {
            case 0:
                AFd1wSDK.AFKeystoreWrapper(this.f26052b);
                break;
            default:
                AFd1wSDK.AFInAppEventType(this.f26052b);
                break;
        }
    }
}
