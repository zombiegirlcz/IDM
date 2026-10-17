package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class x61 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u61 f34905a;

    private x61(u61 u61Var) {
        this.f34905a = u61Var;
    }

    public static g71 b(u61 u61Var) {
        g71 g71VarB = u61Var.b();
        vc.s.k(g71VarB);
        return g71VarB;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public g71 get() {
        return b(this.f34905a);
    }

    public static x61 a(u61 u61Var) {
        return new x61(u61Var);
    }
}
