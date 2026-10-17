package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class rk0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fk0 f32761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f32762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f32763c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    private rk0(fk0 fk0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        this.f32761a = fk0Var;
        this.f32762b = eVar;
        this.f32763c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ek0 get() {
        return a(this.f32761a, (o80) this.f32762b.get(), (vc1) this.f32763c.get(), (vc1) this.d.get(), (bq0) this.e.get(), (v10) this.f.get());
    }

    public static rk0 a(fk0 fk0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        return new rk0(fk0Var, eVar, eVar2, eVar3, eVar4, eVar5);
    }

    public static ek0 a(fk0 fk0Var, o80 o80Var, vc1 vc1Var, vc1 vc1Var2, bq0 bq0Var, v10 v10Var) {
        ek0 ek0VarA = fk0Var.a(o80Var, vc1Var, vc1Var2, bq0Var, v10Var);
        vc.s.k(ek0VarA);
        return ek0VarA;
    }
}
