package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class y0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p0 f35123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f35124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f35125c;
    private final e4m.e d;
    private final e4m.e e;

    private y0(p0 p0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        this.f35123a = p0Var;
        this.f35124b = eVar;
        this.f35125c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public g0 get() {
        return a(this.f35123a, (h0) this.f35124b.get(), (o40) this.f35125c.get(), (v10) this.d.get(), (sg0) this.e.get());
    }

    public static y0 a(p0 p0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        return new y0(p0Var, eVar, eVar2, eVar3, eVar4);
    }

    public static g0 a(p0 p0Var, h0 h0Var, o40 o40Var, v10 v10Var, sg0 sg0Var) {
        g0 g0VarA = p0Var.a(h0Var, o40Var, v10Var, sg0Var);
        vc.s.k(g0VarA);
        return g0VarA;
    }
}
