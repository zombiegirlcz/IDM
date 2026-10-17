package com.fourthline.vision.internal;

import com.google.mlkit.vision.face.FaceDetector;

/* JADX INFO: loaded from: classes23.dex */
public final class n2 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k2 f36592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f36593b;

    private n2(k2 k2Var, e4m.e eVar) {
        this.f36592a = k2Var;
        this.f36593b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public FaceDetector get() {
        return a(this.f36592a, (la) this.f36593b.get());
    }

    public static n2 a(k2 k2Var, e4m.e eVar) {
        return new n2(k2Var, eVar);
    }

    public static FaceDetector a(k2 k2Var, la laVar) {
        FaceDetector faceDetectorProvideMlKitFastFaceDetector = k2Var.provideMlKitFastFaceDetector(laVar);
        vc.s.k(faceDetectorProvideMlKitFastFaceDetector);
        return faceDetectorProvideMlKitFastFaceDetector;
    }
}
