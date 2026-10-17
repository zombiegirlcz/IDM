package com.fourthline.vision.internal;

import com.google.mlkit.vision.text.TextRecognizer;

/* JADX INFO: loaded from: classes23.dex */
public final class q2 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k2 f36726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f36727b;

    private q2(k2 k2Var, e4m.e eVar) {
        this.f36726a = k2Var;
        this.f36727b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public TextRecognizer get() {
        return a(this.f36726a, (VisionDocumentScannerFeatureConfig) this.f36727b.get());
    }

    public static q2 a(k2 k2Var, e4m.e eVar) {
        return new q2(k2Var, eVar);
    }

    public static TextRecognizer a(k2 k2Var, VisionDocumentScannerFeatureConfig visionDocumentScannerFeatureConfig) {
        TextRecognizer textRecognizerProvideTextRecognizer = k2Var.provideTextRecognizer(visionDocumentScannerFeatureConfig);
        vc.s.k(textRecognizerProvideTextRecognizer);
        return textRecognizerProvideTextRecognizer;
    }
}
