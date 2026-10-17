package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class q0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p0 f32154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f32155b;

    private q0(p0 p0Var, e4m.e eVar) {
        this.f32154a = p0Var;
        this.f32155b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a0 get() {
        return a(this.f32154a, (sg0) this.f32155b.get());
    }

    public static q0 a(p0 p0Var, e4m.e eVar) {
        return new q0(p0Var, eVar);
    }

    public static a0 a(p0 p0Var, sg0 sg0Var) {
        a0 a0VarA = p0Var.a(sg0Var);
        vc.s.k(a0VarA);
        return a0VarA;
    }
}
