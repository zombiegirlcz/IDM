package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class mf1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hf1 f31180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31181b;

    private mf1(hf1 hf1Var, e4m.e eVar) {
        this.f31180a = hf1Var;
        this.f31181b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ff1 get() {
        return a(this.f31180a, (o80) this.f31181b.get());
    }

    public static mf1 a(hf1 hf1Var, e4m.e eVar) {
        return new mf1(hf1Var, eVar);
    }

    public static ff1 a(hf1 hf1Var, o80 o80Var) {
        ff1 ff1VarA = hf1Var.a(o80Var);
        vc.s.k(ff1VarA);
        return ff1VarA;
    }
}
