package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class k71 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i71 f30176a;

    private k71(i71 i71Var) {
        this.f30176a = i71Var;
    }

    public static h71 b(i71 i71Var) {
        h71 h71VarB = i71Var.b();
        vc.s.k(h71VarB);
        return h71VarB;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public h71 get() {
        return b(this.f30176a);
    }

    public static k71 a(i71 i71Var) {
        return new k71(i71Var);
    }
}
