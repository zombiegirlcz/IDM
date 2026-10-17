package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26041b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f26040a = i;
        this.f26041b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26040a) {
            case 0:
                AFb1rSDK.AFInAppEventType((AFd1fSDK) this.f26041b);
                break;
            default:
                ((AFb1rSDK) this.f26041b).registerClient();
                break;
        }
    }
}
