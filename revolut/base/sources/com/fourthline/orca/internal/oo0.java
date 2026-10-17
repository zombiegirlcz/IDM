package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class oo0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ho0 f31703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31704b;

    private oo0(ho0 ho0Var, e4m.e eVar) {
        this.f31703a = ho0Var;
        this.f31704b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z40 get() {
        return a(this.f31703a, (gm0) this.f31704b.get());
    }

    public static oo0 a(ho0 ho0Var, e4m.e eVar) {
        return new oo0(ho0Var, eVar);
    }

    public static z40 a(ho0 ho0Var, gm0 gm0Var) {
        z40 z40VarB = ho0Var.b(gm0Var);
        vc.s.k(z40VarB);
        return z40VarB;
    }
}
