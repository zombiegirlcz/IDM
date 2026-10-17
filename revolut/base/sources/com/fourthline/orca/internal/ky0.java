package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class ky0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wx0 f30442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f30443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f30444c;
    private final e4m.e d;
    private final e4m.e e;

    private ky0(wx0 wx0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        this.f30442a = wx0Var;
        this.f30443b = eVar;
        this.f30444c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public qx0 get() {
        return a(this.f30442a, (ls0) this.f30443b.get(), (ib0) this.f30444c.get(), (yv0) this.d.get(), (sg0) this.e.get());
    }

    public static ky0 a(wx0 wx0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        return new ky0(wx0Var, eVar, eVar2, eVar3, eVar4);
    }

    public static qx0 a(wx0 wx0Var, ls0 ls0Var, ib0 ib0Var, yv0 yv0Var, sg0 sg0Var) {
        qx0 qx0VarB = wx0Var.b(ls0Var, ib0Var, yv0Var, sg0Var);
        vc.s.k(qx0VarB);
        return qx0VarB;
    }
}
