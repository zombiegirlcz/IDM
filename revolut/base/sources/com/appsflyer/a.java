package com.appsflyer;

import com.appsflyer.internal.AFg1cSDK;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AFg1cSDK[] f26015b;

    public /* synthetic */ a(AFg1cSDK[] aFg1cSDKArr, int i) {
        this.f26014a = i;
        this.f26015b = aFg1cSDKArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26014a) {
            case 0:
                AFLogger.valueOf(this.f26015b);
                break;
            default:
                AFLogger.AFKeystoreWrapper(this.f26015b);
                break;
        }
    }
}
