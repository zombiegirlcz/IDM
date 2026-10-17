package com.fourthline.vision.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class p1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s0 f36676a;

    private p1(s0 s0Var) {
        this.f36676a = s0Var;
    }

    public static VisionDocumentScannerFeatureConfig b(s0 s0Var) {
        VisionDocumentScannerFeatureConfig visionDocumentScannerFeatureConfigProvidesFeatureConfig$fourthline_vision_release = s0Var.providesFeatureConfig$fourthline_vision_release();
        vc.s.k(visionDocumentScannerFeatureConfigProvidesFeatureConfig$fourthline_vision_release);
        return visionDocumentScannerFeatureConfigProvidesFeatureConfig$fourthline_vision_release;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public VisionDocumentScannerFeatureConfig get() {
        return b(this.f36676a);
    }

    public static p1 a(s0 s0Var) {
        return new p1(s0Var);
    }
}
