package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class ey0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wx0 f28293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f28294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f28295c;

    private ey0(wx0 wx0Var, e4m.e eVar, e4m.e eVar2) {
        this.f28293a = wx0Var;
        this.f28294b = eVar;
        this.f28295c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public cw0 get() {
        return a(this.f28293a, (ls0) this.f28294b.get(), (ib0) this.f28295c.get());
    }

    public static ey0 a(wx0 wx0Var, e4m.e eVar, e4m.e eVar2) {
        return new ey0(wx0Var, eVar, eVar2);
    }

    public static cw0 a(wx0 wx0Var, ls0 ls0Var, ib0 ib0Var) {
        cw0 cw0VarB = wx0Var.b(ls0Var, ib0Var);
        vc.s.k(cw0VarB);
        return cw0VarB;
    }
}
