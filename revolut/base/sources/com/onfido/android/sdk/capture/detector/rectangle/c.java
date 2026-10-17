package com.onfido.android.sdk.capture.detector.rectangle;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class c implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RectangleDetectorGoogle f49916b;

    public /* synthetic */ c(RectangleDetectorGoogle rectangleDetectorGoogle, int i) {
        this.f49915a = i;
        this.f49916b = rectangleDetectorGoogle;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f49915a) {
            case 0:
                this.f49916b.computationThread(runnable);
                break;
            default:
                this.f49916b.computationThread(runnable);
                break;
        }
    }
}
