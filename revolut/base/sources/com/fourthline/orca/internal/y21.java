package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class y21 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v21 f35148a;

    private y21(v21 v21Var) {
        this.f35148a = v21Var;
    }

    public static u21 b(v21 v21Var) {
        u21 u21VarA = v21Var.a();
        vc.s.k(u21VarA);
        return u21VarA;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public u21 get() {
        return b(this.f35148a);
    }

    public static y21 a(v21 v21Var) {
        return new y21(v21Var);
    }
}
