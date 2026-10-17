package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class t0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p0 f33166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f33167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f33168c;
    private final e4m.e d;

    private t0(p0 p0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        this.f33166a = p0Var;
        this.f33167b = eVar;
        this.f33168c = eVar2;
        this.d = eVar3;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public o0 get() {
        return a(this.f33166a, (o80) this.f33167b.get(), (bq0) this.f33168c.get(), (v10) this.d.get());
    }

    public static t0 a(p0 p0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        return new t0(p0Var, eVar, eVar2, eVar3);
    }

    public static o0 a(p0 p0Var, o80 o80Var, bq0 bq0Var, v10 v10Var) {
        o0 o0VarA = p0Var.a(o80Var, bq0Var, v10Var);
        vc.s.k(o0VarA);
        return o0VarA;
    }
}
