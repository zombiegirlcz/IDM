package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class a71 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u61 f26721a;

    private a71(u61 u61Var) {
        this.f26721a = u61Var;
    }

    public static t61 b(u61 u61Var) {
        t61 t61VarE = u61Var.e();
        vc.s.k(t61VarE);
        return t61VarE;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public t61 get() {
        return b(this.f26721a);
    }

    public static a71 a(u61 u61Var) {
        return new a71(u61Var);
    }
}
