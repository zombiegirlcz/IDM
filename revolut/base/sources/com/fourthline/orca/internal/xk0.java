package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class xk0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fk0 f35014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f35015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f35016c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    private xk0(fk0 fk0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        this.f35014a = fk0Var;
        this.f35015b = eVar;
        this.f35016c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wl0 get() {
        return a(this.f35014a, (sg0) this.f35015b.get(), (tl0) this.f35016c.get(), (v10) this.d.get(), (vc1) this.e.get(), (jy) this.f.get());
    }

    public static xk0 a(fk0 fk0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        return new xk0(fk0Var, eVar, eVar2, eVar3, eVar4, eVar5);
    }

    public static wl0 a(fk0 fk0Var, sg0 sg0Var, tl0 tl0Var, v10 v10Var, vc1 vc1Var, jy jyVar) {
        wl0 wl0VarA = fk0Var.a(sg0Var, tl0Var, v10Var, vc1Var, jyVar);
        vc.s.k(wl0VarA);
        return wl0VarA;
    }
}
