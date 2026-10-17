package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class ic0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zb0 f29556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f29557b;

    private ic0(zb0 zb0Var, e4m.e eVar) {
        this.f29556a = zb0Var;
        this.f29557b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ke0 get() {
        return a(this.f29556a, (sg0) this.f29557b.get());
    }

    public static ic0 a(zb0 zb0Var, e4m.e eVar) {
        return new ic0(zb0Var, eVar);
    }

    public static ke0 a(zb0 zb0Var, sg0 sg0Var) {
        ke0 ke0VarB = zb0Var.b(sg0Var);
        vc.s.k(ke0VarB);
        return ke0VarB;
    }
}
