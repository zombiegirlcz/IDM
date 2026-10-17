package com.fourthline.vision.internal;

import android.view.View;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class bh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f36030b;

    public /* synthetic */ bh(View view, int i) {
        this.f36029a = i;
        this.f36030b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f36029a) {
            case 0:
                n0.tryNotifySurfaceCreated$lambda$0$0((z) this.f36030b);
                break;
            case 1:
                z.resetVideoEncoder$lambda$0((z) this.f36030b);
                break;
            default:
                ((f2) this.f36030b).invalidate();
                break;
        }
    }
}
