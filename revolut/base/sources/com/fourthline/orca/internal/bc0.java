package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class bc0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zb0 f27093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f27094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f27095c;
    private final e4m.e d;

    private bc0(zb0 zb0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        this.f27093a = zb0Var;
        this.f27094b = eVar;
        this.f27095c = eVar2;
        this.d = eVar3;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public j20 get() {
        return a(this.f27093a, (se0) this.f27094b.get(), (l70) this.f27095c.get(), (v10) this.d.get());
    }

    public static bc0 a(zb0 zb0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        return new bc0(zb0Var, eVar, eVar2, eVar3);
    }

    public static j20 a(zb0 zb0Var, se0 se0Var, l70 l70Var, v10 v10Var) {
        j20 j20VarA = zb0Var.a(se0Var, l70Var, v10Var);
        vc.s.k(j20VarA);
        return j20VarA;
    }
}
