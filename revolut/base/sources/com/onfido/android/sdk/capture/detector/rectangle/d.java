package com.onfido.android.sdk.capture.detector.rectangle;

import com.onfido.android.sdk.capture.detector.rectangle.RectangleDetectorGoogle;
import igm.o;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class d implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49917a;

    public /* synthetic */ d(int i) {
        this.f49917a = i;
    }

    @Override // igm.o
    public final Object apply(Object obj2) {
        Throwable th10 = (Throwable) obj2;
        switch (this.f49917a) {
            case 0:
                return RectangleDetectorGoogle.C20062.apply$lambda$0(th10);
            default:
                return RectangleDetectorGoogle.process$lambda$1$lambda$0(th10);
        }
    }
}
