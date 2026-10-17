package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class r61 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l61 f32637a;

    private r61(l61 l61Var) {
        this.f32637a = l61Var;
    }

    public static qx0 b(l61 l61Var) {
        qx0 qx0VarE = l61Var.e();
        vc.s.k(qx0VarE);
        return qx0VarE;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public qx0 get() {
        return b(this.f32637a);
    }

    public static r61 a(l61 l61Var) {
        return new r61(l61Var);
    }
}
