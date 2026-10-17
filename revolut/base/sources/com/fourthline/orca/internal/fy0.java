package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class fy0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wx0 f28695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f28696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f28697c;
    private final e4m.e d;
    private final e4m.e e;

    private fy0(wx0 wx0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        this.f28695a = wx0Var;
        this.f28696b = eVar;
        this.f28697c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public dw0 get() {
        return a(this.f28695a, (cw0) this.f28696b.get(), (is0) this.f28697c.get(), (js0) this.d.get(), (sg0) this.e.get());
    }

    public static fy0 a(wx0 wx0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        return new fy0(wx0Var, eVar, eVar2, eVar3, eVar4);
    }

    public static dw0 a(wx0 wx0Var, cw0 cw0Var, is0 is0Var, js0 js0Var, sg0 sg0Var) {
        dw0 dw0VarA = wx0Var.a(cw0Var, is0Var, js0Var, sg0Var);
        vc.s.k(dw0VarA);
        return dw0VarA;
    }
}
