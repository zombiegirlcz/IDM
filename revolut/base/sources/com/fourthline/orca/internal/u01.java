package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class u01 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s01 f33905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f33906b;

    private u01(s01 s01Var, e4m.e eVar) {
        this.f33905a = s01Var;
        this.f33906b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public m01 get() {
        return a(this.f33905a, (r70) this.f33906b.get());
    }

    public static u01 a(s01 s01Var, e4m.e eVar) {
        return new u01(s01Var, eVar);
    }

    public static m01 a(s01 s01Var, r70 r70Var) {
        m01 m01VarA = s01Var.a(r70Var);
        vc.s.k(m01VarA);
        return m01VarA;
    }
}
