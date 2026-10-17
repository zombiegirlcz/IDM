package com.fourthline.vision.internal;

import com.fourthline.vision.selfie.SelfieScannerConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class ag implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelfieScannerConfig f35973b;

    public /* synthetic */ ag(SelfieScannerConfig selfieScannerConfig, int i) {
        this.f35972a = i;
        this.f35973b = selfieScannerConfig;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f35972a) {
            case 0:
                return a8.LegacySelfieScanner$lambda$2$0(this.f35973b);
            case 1:
                return za.stateMachine$lambda$0(this.f35973b);
            default:
                return Long.valueOf(za.mediaDurationIntervalDataSource$lambda$0(this.f35973b));
        }
    }
}
