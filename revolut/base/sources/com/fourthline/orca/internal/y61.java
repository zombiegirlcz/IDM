package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class y61 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u61 f35177a;

    private y61(u61 u61Var) {
        this.f35177a = u61Var;
    }

    public static v51 b(u61 u61Var) {
        v51 v51VarC = u61Var.c();
        vc.s.k(v51VarC);
        return v51VarC;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public v51 get() {
        return b(this.f35177a);
    }

    public static y61 a(u61 u61Var) {
        return new y61(u61Var);
    }
}
