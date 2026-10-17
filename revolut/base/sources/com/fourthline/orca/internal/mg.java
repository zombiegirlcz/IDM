package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class mg implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final eg f31182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f31184c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e4m.e f31185g;

    private mg(eg egVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6) {
        this.f31182a = egVar;
        this.f31183b = eVar;
        this.f31184c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
        this.f31185g = eVar6;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public aq0 get() {
        return a(this.f31182a, (bq0) this.f31183b.get(), (jq0) this.f31184c.get(), (to) this.d.get(), (fe1) this.e.get(), (v10) this.f.get(), (bg) this.f31185g.get());
    }

    public static mg a(eg egVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6) {
        return new mg(egVar, eVar, eVar2, eVar3, eVar4, eVar5, eVar6);
    }

    public static aq0 a(eg egVar, bq0 bq0Var, jq0 jq0Var, to toVar, fe1 fe1Var, v10 v10Var, bg bgVar) {
        aq0 aq0VarA = egVar.a(bq0Var, jq0Var, toVar, fe1Var, v10Var, bgVar);
        vc.s.k(aq0VarA);
        return aq0VarA;
    }
}
