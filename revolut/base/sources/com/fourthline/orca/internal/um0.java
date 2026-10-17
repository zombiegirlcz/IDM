package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class um0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pm0 f34129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34130b;

    private um0(pm0 pm0Var, e4m.e eVar) {
        this.f34129a = pm0Var;
        this.f34130b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ep0 get() {
        return a(this.f34129a, (bp0) this.f34130b.get());
    }

    public static um0 a(pm0 pm0Var, e4m.e eVar) {
        return new um0(pm0Var, eVar);
    }

    public static ep0 a(pm0 pm0Var, bp0 bp0Var) {
        ep0 ep0VarA = pm0Var.a(bp0Var);
        vc.s.k(ep0VarA);
        return ep0VarA;
    }
}
