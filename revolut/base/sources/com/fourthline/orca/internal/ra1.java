package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class ra1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r91 f32667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f32668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f32669c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    private ra1(r91 r91Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        this.f32667a = r91Var;
        this.f32668b = eVar;
        this.f32669c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public k91 get() {
        return a(this.f32667a, (o80) this.f32668b.get(), (rb1) this.f32669c.get(), (a31) this.d.get(), (bq0) this.e.get(), (v10) this.f.get());
    }

    public static ra1 a(r91 r91Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        return new ra1(r91Var, eVar, eVar2, eVar3, eVar4, eVar5);
    }

    public static k91 a(r91 r91Var, o80 o80Var, rb1 rb1Var, a31 a31Var, bq0 bq0Var, v10 v10Var) {
        k91 k91VarA = r91Var.a(o80Var, rb1Var, a31Var, bq0Var, v10Var);
        vc.s.k(k91VarA);
        return k91VarA;
    }
}
