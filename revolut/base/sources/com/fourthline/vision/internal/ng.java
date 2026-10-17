package com.fourthline.vision.internal;

import com.fourthline.vision.document.DocumentScannerConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class ng implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DocumentScannerConfig f36608b;

    public /* synthetic */ ng(DocumentScannerConfig documentScannerConfig, int i) {
        this.f36607a = i;
        this.f36608b = documentScannerConfig;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f36607a) {
            case 0:
                return Long.valueOf(d3.mediaDurationIntervalDataSource$lambda$0(this.f36608b));
            default:
                return this.f36608b.getVideoDuration();
        }
    }
}
