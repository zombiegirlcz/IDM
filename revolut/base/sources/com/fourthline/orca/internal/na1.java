package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class na1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r91 f31367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f31369c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e4m.e f31370g;

    private na1(r91 r91Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6) {
        this.f31367a = r91Var;
        this.f31368b = eVar;
        this.f31369c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
        this.f31370g = eVar6;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public d91 get() {
        return a(this.f31367a, (a31) this.f31368b.get(), (x81) this.f31369c.get(), (ab1) this.d.get(), (w81) this.e.get(), (v10) this.f.get(), (sg0) this.f31370g.get());
    }

    public static na1 a(r91 r91Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6) {
        return new na1(r91Var, eVar, eVar2, eVar3, eVar4, eVar5, eVar6);
    }

    public static d91 a(r91 r91Var, a31 a31Var, x81 x81Var, ab1 ab1Var, w81 w81Var, v10 v10Var, sg0 sg0Var) {
        d91 d91VarA = r91Var.a(a31Var, x81Var, ab1Var, w81Var, v10Var, sg0Var);
        vc.s.k(d91VarA);
        return d91VarA;
    }
}
