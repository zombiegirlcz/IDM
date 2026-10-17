package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class ga1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r91 f28817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f28818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f28819c;

    private ga1(r91 r91Var, e4m.e eVar, e4m.e eVar2) {
        this.f28817a = r91Var;
        this.f28818b = eVar;
        this.f28819c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a31 get() {
        return a(this.f28817a, (gj) this.f28818b.get(), (b31) this.f28819c.get());
    }

    public static ga1 a(r91 r91Var, e4m.e eVar, e4m.e eVar2) {
        return new ga1(r91Var, eVar, eVar2);
    }

    public static a31 a(r91 r91Var, gj gjVar, b31 b31Var) {
        a31 a31VarA = r91Var.a(gjVar, b31Var);
        vc.s.k(a31VarA);
        return a31VarA;
    }
}
