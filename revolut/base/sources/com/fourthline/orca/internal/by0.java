package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class by0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wx0 f27273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f27274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f27275c;
    private final e4m.e d;

    private by0(wx0 wx0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        this.f27273a = wx0Var;
        this.f27274b = eVar;
        this.f27275c = eVar2;
        this.d = eVar3;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public js0 get() {
        return a(this.f27273a, (ls0) this.f27274b.get(), (ib0) this.f27275c.get(), (px) this.d.get());
    }

    public static by0 a(wx0 wx0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        return new by0(wx0Var, eVar, eVar2, eVar3);
    }

    public static js0 a(wx0 wx0Var, ls0 ls0Var, ib0 ib0Var, px pxVar) {
        js0 js0VarA = wx0Var.a(ls0Var, ib0Var, pxVar);
        vc.s.k(js0VarA);
        return js0VarA;
    }
}
