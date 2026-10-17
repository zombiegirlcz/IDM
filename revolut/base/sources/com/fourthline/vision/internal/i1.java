package com.fourthline.vision.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class i1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s0 f36344a;

    private i1(s0 s0Var) {
        this.f36344a = s0Var;
    }

    public static la b(s0 s0Var) {
        la laVarProvideScannerConfig = s0Var.provideScannerConfig();
        vc.s.k(laVarProvideScannerConfig);
        return laVarProvideScannerConfig;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public la get() {
        return b(this.f36344a);
    }

    public static i1 a(s0 s0Var) {
        return new i1(s0Var);
    }
}
