package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class jy0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wx0 f30075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f30076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f30077c;
    private final e4m.e d;
    private final e4m.e e;

    private jy0(wx0 wx0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        this.f30075a = wx0Var;
        this.f30076b = eVar;
        this.f30077c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public nx0 get() {
        return a(this.f30075a, (ls0) this.f30076b.get(), (ib0) this.f30077c.get(), (yv0) this.d.get(), (sg0) this.e.get());
    }

    public static jy0 a(wx0 wx0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        return new jy0(wx0Var, eVar, eVar2, eVar3, eVar4);
    }

    public static nx0 a(wx0 wx0Var, ls0 ls0Var, ib0 ib0Var, yv0 yv0Var, sg0 sg0Var) {
        nx0 nx0VarA = wx0Var.a(ls0Var, ib0Var, yv0Var, sg0Var);
        vc.s.k(nx0VarA);
        return nx0VarA;
    }
}
