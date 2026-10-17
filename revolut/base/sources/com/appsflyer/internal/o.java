package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AFj1vSDK f26062b;

    public /* synthetic */ o(AFj1vSDK aFj1vSDK, int i) {
        this.f26061a = i;
        this.f26062b = aFj1vSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26061a) {
            case 0:
                this.f26062b.e();
                break;
            case 1:
                this.f26062b.registerClient();
                break;
            default:
                this.f26062b.d();
                break;
        }
    }
}
