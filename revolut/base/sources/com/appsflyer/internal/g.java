package com.appsflyer.internal;

import android.content.Context;
import android.hardware.SensorEvent;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26050c;

    public /* synthetic */ g(Object obj2, Object obj3, int i) {
        this.f26048a = i;
        this.f26049b = obj2;
        this.f26050c = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26048a) {
            case 0:
                AFd1wSDK.AFInAppEventType((AFd1wSDK) this.f26049b, (AFh1pSDK) this.f26050c);
                break;
            case 1:
                ((AFi1hSDK) this.f26049b).AFInAppEventType((Context) this.f26050c);
                break;
            case 2:
                AFi1iSDK.AFInAppEventParameterName((AFi1iSDK) this.f26049b, (Context) this.f26050c);
                break;
            default:
                ((AFj1wSDK) this.f26049b).AFInAppEventType((SensorEvent) this.f26050c);
                break;
        }
    }
}
