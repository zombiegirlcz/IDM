package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class x91 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r91 f34927a;

    private x91(r91 r91Var) {
        this.f34927a = r91Var;
    }

    public static f91 b(r91 r91Var) {
        f91 f91VarA = r91Var.a();
        vc.s.k(f91VarA);
        return f91VarA;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public f91 get() {
        return b(this.f34927a);
    }

    public static x91 a(r91 r91Var) {
        return new x91(r91Var);
    }
}
