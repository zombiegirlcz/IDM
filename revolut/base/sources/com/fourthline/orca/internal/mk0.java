package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class mk0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fk0 f31207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31208b;

    private mk0(fk0 fk0Var, e4m.e eVar) {
        this.f31207a = fk0Var;
        this.f31208b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public il0 get() {
        return a(this.f31207a, (yj0) this.f31208b.get());
    }

    public static mk0 a(fk0 fk0Var, e4m.e eVar) {
        return new mk0(fk0Var, eVar);
    }

    public static il0 a(fk0 fk0Var, yj0 yj0Var) {
        il0 il0VarA = fk0Var.a(yj0Var);
        vc.s.k(il0VarA);
        return il0VarA;
    }
}
