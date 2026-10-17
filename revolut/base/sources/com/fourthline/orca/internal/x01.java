package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class x01 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s01 f34826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f34828c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    private x01(s01 s01Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        this.f34826a = s01Var;
        this.f34827b = eVar;
        this.f34828c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public j11 get() {
        return a(this.f34826a, (o80) this.f34827b.get(), (sj0) this.f34828c.get(), (bq0) this.d.get(), (l70) this.e.get(), (v10) this.f.get());
    }

    public static x01 a(s01 s01Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        return new x01(s01Var, eVar, eVar2, eVar3, eVar4, eVar5);
    }

    public static j11 a(s01 s01Var, o80 o80Var, sj0 sj0Var, bq0 bq0Var, l70 l70Var, v10 v10Var) {
        j11 j11VarA = s01Var.a(o80Var, sj0Var, bq0Var, l70Var, v10Var);
        vc.s.k(j11VarA);
        return j11VarA;
    }
}
