package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AFi1cSDK f26056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f26057c;

    public /* synthetic */ l(AFi1cSDK aFi1cSDK, Runnable runnable, int i) {
        this.f26055a = i;
        this.f26056b = aFi1cSDK;
        this.f26057c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26055a) {
            case 0:
                this.f26056b.values(this.f26057c);
                break;
            case 1:
                this.f26056b.registerClient(this.f26057c);
                break;
            case 2:
                this.f26056b.AFKeystoreWrapper(this.f26057c);
                break;
            default:
                this.f26056b.AFInAppEventParameterName(this.f26057c);
                break;
        }
    }
}
