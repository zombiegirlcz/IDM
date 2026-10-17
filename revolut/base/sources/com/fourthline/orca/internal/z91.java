package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class z91 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r91 f35549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f35550b;

    private z91(r91 r91Var, e4m.e eVar) {
        this.f35549a = r91Var;
        this.f35550b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z40 get() {
        return a(this.f35549a, (l91) this.f35550b.get());
    }

    public static z91 a(r91 r91Var, e4m.e eVar) {
        return new z91(r91Var, eVar);
    }

    public static z40 a(r91 r91Var, l91 l91Var) {
        z40 z40VarB = r91Var.b(l91Var);
        vc.s.k(z40VarB);
        return z40VarB;
    }
}
