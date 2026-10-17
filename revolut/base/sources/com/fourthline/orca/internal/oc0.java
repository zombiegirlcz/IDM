package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class oc0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zb0 f31640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31641b;

    private oc0(zb0 zb0Var, e4m.e eVar) {
        this.f31640a = zb0Var;
        this.f31641b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public fe1 get() {
        return a(this.f31640a, (yb0) this.f31641b.get());
    }

    public static oc0 a(zb0 zb0Var, e4m.e eVar) {
        return new oc0(zb0Var, eVar);
    }

    public static fe1 a(zb0 zb0Var, yb0 yb0Var) {
        fe1 fe1VarA = zb0Var.a(yb0Var);
        vc.s.k(fe1VarA);
        return fe1VarA;
    }
}
