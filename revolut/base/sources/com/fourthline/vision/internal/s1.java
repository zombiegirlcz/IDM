package com.fourthline.vision.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class s1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s0 f36859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f36860b;

    private s1(s0 s0Var, e4m.e eVar) {
        this.f36859a = s0Var;
        this.f36860b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public x9 get() {
        return a(this.f36859a, (df) this.f36860b.get());
    }

    public static s1 a(s0 s0Var, e4m.e eVar) {
        return new s1(s0Var, eVar);
    }

    public static x9 a(s0 s0Var, df dfVar) {
        x9 x9VarProvidesPreviewCalculator = s0Var.providesPreviewCalculator(dfVar);
        vc.s.k(x9VarProvidesPreviewCalculator);
        return x9VarProvidesPreviewCalculator;
    }
}
