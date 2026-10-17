package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class qa1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r91 f32368a;

    private qa1(r91 r91Var) {
        this.f32368a = r91Var;
    }

    public static g91 b(r91 r91Var) {
        g91 g91VarC = r91Var.c();
        vc.s.k(g91VarC);
        return g91VarC;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public g91 get() {
        return b(this.f32368a);
    }

    public static qa1 a(r91 r91Var) {
        return new qa1(r91Var);
    }
}
