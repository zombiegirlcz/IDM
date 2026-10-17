package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class zy0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vy0 f35751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f35752b;

    private zy0(vy0 vy0Var, e4m.e eVar) {
        this.f35751a = vy0Var;
        this.f35752b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public uy0 get() {
        return a(this.f35751a, (r70) this.f35752b.get());
    }

    public static zy0 a(vy0 vy0Var, e4m.e eVar) {
        return new zy0(vy0Var, eVar);
    }

    public static uy0 a(vy0 vy0Var, r70 r70Var) {
        uy0 uy0VarA = vy0Var.a(r70Var);
        vc.s.k(uy0VarA);
        return uy0VarA;
    }
}
