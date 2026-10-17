package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AFd1bSDK f26046b;

    public /* synthetic */ d(AFd1bSDK aFd1bSDK, int i) {
        this.f26045a = i;
        this.f26046b = aFd1bSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26045a) {
            case 0:
                AFd1bSDK.values(this.f26046b);
                break;
            default:
                AFd1bSDK.AFKeystoreWrapper(this.f26046b);
                break;
        }
    }
}
