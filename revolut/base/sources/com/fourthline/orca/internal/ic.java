package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class ic implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ec f29553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f29554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f29555c;
    private final e4m.e d;

    private ic(ec ecVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        this.f29553a = ecVar;
        this.f29554b = eVar;
        this.f29555c = eVar2;
        this.d = eVar3;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public dc get() {
        return a(this.f29553a, (o80) this.f29554b.get(), (bq0) this.f29555c.get(), (v10) this.d.get());
    }

    public static ic a(ec ecVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        return new ic(ecVar, eVar, eVar2, eVar3);
    }

    public static dc a(ec ecVar, o80 o80Var, bq0 bq0Var, v10 v10Var) {
        dc dcVarA = ecVar.a(o80Var, bq0Var, v10Var);
        vc.s.k(dcVarA);
        return dcVarA;
    }
}
