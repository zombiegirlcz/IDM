package com.fourthline.vision.internal;

import com.google.mlkit.vision.face.FaceDetector;

/* JADX INFO: loaded from: classes23.dex */
public final class m2 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k2 f36517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f36518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f36519c;

    private m2(k2 k2Var, e4m.e eVar, e4m.e eVar2) {
        this.f36517a = k2Var;
        this.f36518b = eVar;
        this.f36519c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public j6 get() {
        return a(this.f36517a, (FaceDetector) this.f36518b.get(), (v9) this.f36519c.get());
    }

    public static m2 a(k2 k2Var, e4m.e eVar, e4m.e eVar2) {
        return new m2(k2Var, eVar, eVar2);
    }

    public static j6 a(k2 k2Var, FaceDetector faceDetector, v9 v9Var) {
        j6 j6VarProvideFastFaceDetector = k2Var.provideFastFaceDetector(faceDetector, v9Var);
        vc.s.k(j6VarProvideFastFaceDetector);
        return j6VarProvideFastFaceDetector;
    }
}
