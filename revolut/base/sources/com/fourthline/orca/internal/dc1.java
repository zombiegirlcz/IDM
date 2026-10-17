package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class dc1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final cc1 f27702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f27703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f27704c;
    private final e4m.e d;

    private dc1(cc1 cc1Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        this.f27702a = cc1Var;
        this.f27703b = eVar;
        this.f27704c = eVar2;
        this.d = eVar3;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public bc1 get() {
        return a(this.f27702a, (o80) this.f27703b.get(), (bq0) this.f27704c.get(), (v10) this.d.get());
    }

    public static dc1 a(cc1 cc1Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        return new dc1(cc1Var, eVar, eVar2, eVar3);
    }

    public static bc1 a(cc1 cc1Var, o80 o80Var, bq0 bq0Var, v10 v10Var) {
        bc1 bc1VarA = cc1Var.a(o80Var, bq0Var, v10Var);
        vc.s.k(bc1VarA);
        return bc1VarA;
    }
}
