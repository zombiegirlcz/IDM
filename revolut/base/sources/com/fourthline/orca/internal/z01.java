package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class z01 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s01 f35475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f35476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f35477c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    private z01(s01 s01Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        this.f35475a = s01Var;
        this.f35476b = eVar;
        this.f35477c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public m11 get() {
        return a(this.f35475a, (q01) this.f35476b.get(), (f11) this.f35477c.get(), (l11) this.d.get(), (bq0) this.e.get(), (v10) this.f.get());
    }

    public static z01 a(s01 s01Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        return new z01(s01Var, eVar, eVar2, eVar3, eVar4, eVar5);
    }

    public static m11 a(s01 s01Var, q01 q01Var, f11 f11Var, l11 l11Var, bq0 bq0Var, v10 v10Var) {
        m11 m11VarA = s01Var.a(q01Var, f11Var, l11Var, bq0Var, v10Var);
        vc.s.k(m11VarA);
        return m11VarA;
    }
}
