package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class q8 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m8 f32228a;

    private q8(m8 m8Var) {
        this.f32228a = m8Var;
    }

    public static gh b(m8 m8Var) {
        gh ghVarD = m8Var.d();
        vc.s.k(ghVarD);
        return ghVarD;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gh get() {
        return b(this.f32228a);
    }

    public static q8 a(m8 m8Var) {
        return new q8(m8Var);
    }
}
