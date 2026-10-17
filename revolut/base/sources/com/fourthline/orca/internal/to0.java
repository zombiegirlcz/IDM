package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class to0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ho0 f33815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f33816b;

    private to0(ho0 ho0Var, e4m.e eVar) {
        this.f33815a = ho0Var;
        this.f33816b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public no get() {
        return a(this.f33815a, (v10) this.f33816b.get());
    }

    public static to0 a(ho0 ho0Var, e4m.e eVar) {
        return new to0(ho0Var, eVar);
    }

    public static no a(ho0 ho0Var, v10 v10Var) {
        no noVarB = ho0Var.b(v10Var);
        vc.s.k(noVarB);
        return noVarB;
    }
}
