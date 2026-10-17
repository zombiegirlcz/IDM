package com.fourthline.vision.internal;

import com.google.mlkit.vision.text.TextRecognizer;

/* JADX INFO: loaded from: classes23.dex */
public final class o2 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k2 f36613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f36614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f36615c;
    private final e4m.e d;

    private o2(k2 k2Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        this.f36613a = k2Var;
        this.f36614b = eVar;
        this.f36615c = eVar2;
        this.d = eVar3;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public r9 get() {
        return a(this.f36613a, (TextRecognizer) this.f36614b.get(), (v9) this.f36615c.get(), (VisionDocumentScannerFeatureConfig) this.d.get());
    }

    public static o2 a(k2 k2Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        return new o2(k2Var, eVar, eVar2, eVar3);
    }

    public static r9 a(k2 k2Var, TextRecognizer textRecognizer, v9 v9Var, VisionDocumentScannerFeatureConfig visionDocumentScannerFeatureConfig) {
        r9 r9VarProvideOcrTextDetector = k2Var.provideOcrTextDetector(textRecognizer, v9Var, visionDocumentScannerFeatureConfig);
        vc.s.k(r9VarProvideOcrTextDetector);
        return r9VarProvideOcrTextDetector;
    }
}
