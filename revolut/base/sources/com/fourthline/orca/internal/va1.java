package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class va1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r91 f34286a;

    private va1(r91 r91Var) {
        this.f34286a = r91Var;
    }

    public static ab1 b(r91 r91Var) {
        ab1 ab1VarD = r91Var.d();
        vc.s.k(ab1VarD);
        return ab1VarD;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ab1 get() {
        return b(this.f34286a);
    }

    public static va1 a(r91 r91Var) {
        return new va1(r91Var);
    }
}
