package com.fourthline.vision.internal;

import androidx.camera.core.ImageAnalysis;
import androidx.camera.mlkit.vision.MlKitAnalyzer;
import androidx.core.util.Consumer;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class pg implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageAnalysis.Analyzer f36715b;

    public /* synthetic */ pg(ImageAnalysis.Analyzer analyzer, int i) {
        this.f36714a = i;
        this.f36715b = analyzer;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj2) {
        switch (this.f36714a) {
            case 0:
                f6.mlKitAnalyzer$lambda$0((f6) this.f36715b, (MlKitAnalyzer.Result) obj2);
                break;
            default:
                v2.mlKitAnalyzer$lambda$0((v2) this.f36715b, (MlKitAnalyzer.Result) obj2);
                break;
        }
    }
}
