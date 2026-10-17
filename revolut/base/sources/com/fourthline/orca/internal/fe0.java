package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class fe0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pd0 f28429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f28430b;

    private fe0(pd0 pd0Var, e4m.e eVar) {
        this.f28429a = pd0Var;
        this.f28430b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public fe1 get() {
        return a(this.f28429a, (od0) this.f28430b.get());
    }

    public static fe0 a(pd0 pd0Var, e4m.e eVar) {
        return new fe0(pd0Var, eVar);
    }

    public static fe1 a(pd0 pd0Var, od0 od0Var) {
        fe1 fe1VarA = pd0Var.a(od0Var);
        vc.s.k(fe1VarA);
        return fe1VarA;
    }
}
