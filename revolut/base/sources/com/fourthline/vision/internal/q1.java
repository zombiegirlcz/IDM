package com.fourthline.vision.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class q1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s0 f36724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f36725b;

    private q1(s0 s0Var, e4m.e eVar) {
        this.f36724a = s0Var;
        this.f36725b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z7 get() {
        return a(this.f36724a, (df) this.f36725b.get());
    }

    public static q1 a(s0 s0Var, e4m.e eVar) {
        return new q1(s0Var, eVar);
    }

    public static z7 a(s0 s0Var, df dfVar) {
        z7 z7VarProvidesLegacyPreviewCalculator = s0Var.providesLegacyPreviewCalculator(dfVar);
        vc.s.k(z7VarProvidesLegacyPreviewCalculator);
        return z7VarProvidesLegacyPreviewCalculator;
    }
}
