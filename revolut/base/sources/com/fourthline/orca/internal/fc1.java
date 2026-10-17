package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class fc1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final cc1 f28413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f28414b;

    private fc1(cc1 cc1Var, e4m.e eVar) {
        this.f28413a = cc1Var;
        this.f28414b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public kc1 get() {
        return a(this.f28413a, (l70) this.f28414b.get());
    }

    public static fc1 a(cc1 cc1Var, e4m.e eVar) {
        return new fc1(cc1Var, eVar);
    }

    public static kc1 a(cc1 cc1Var, l70 l70Var) {
        kc1 kc1VarA = cc1Var.a(l70Var);
        vc.s.k(kc1VarA);
        return kc1VarA;
    }
}
