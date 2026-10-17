package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class aa1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r91 f26747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f26748b;

    private aa1(r91 r91Var, e4m.e eVar) {
        this.f26747a = r91Var;
        this.f26748b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a50 get() {
        return a(this.f26747a, (l91) this.f26748b.get());
    }

    public static aa1 a(r91 r91Var, e4m.e eVar) {
        return new aa1(r91Var, eVar);
    }

    public static a50 a(r91 r91Var, l91 l91Var) {
        a50 a50VarC = r91Var.c(l91Var);
        vc.s.k(a50VarC);
        return a50VarC;
    }
}
