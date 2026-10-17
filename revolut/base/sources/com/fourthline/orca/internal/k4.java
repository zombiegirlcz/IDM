package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class k4 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e4 f30123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f30124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f30125c;
    private final e4m.e d;

    private k4(e4 e4Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        this.f30123a = e4Var;
        this.f30124b = eVar;
        this.f30125c = eVar2;
        this.d = eVar3;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public d4 get() {
        return a(this.f30123a, (o80) this.f30124b.get(), (bq0) this.f30125c.get(), (v10) this.d.get());
    }

    public static k4 a(e4 e4Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        return new k4(e4Var, eVar, eVar2, eVar3);
    }

    public static d4 a(e4 e4Var, o80 o80Var, bq0 bq0Var, v10 v10Var) {
        d4 d4VarA = e4Var.a(o80Var, bq0Var, v10Var);
        vc.s.k(d4VarA);
        return d4VarA;
    }
}
