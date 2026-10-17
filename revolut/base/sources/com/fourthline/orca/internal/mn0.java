package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class mn0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hn0 f31230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f31232c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    private mn0(hn0 hn0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        this.f31230a = hn0Var;
        this.f31231b = eVar;
        this.f31232c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public bn0 get() {
        return a(this.f31230a, (o80) this.f31231b.get(), (bq0) this.f31232c.get(), (sj0) this.d.get(), (l70) this.e.get(), (v10) this.f.get());
    }

    public static mn0 a(hn0 hn0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        return new mn0(hn0Var, eVar, eVar2, eVar3, eVar4, eVar5);
    }

    public static bn0 a(hn0 hn0Var, o80 o80Var, bq0 bq0Var, sj0 sj0Var, l70 l70Var, v10 v10Var) {
        bn0 bn0VarA = hn0Var.a(o80Var, bq0Var, sj0Var, l70Var, v10Var);
        vc.s.k(bn0VarA);
        return bn0VarA;
    }
}
