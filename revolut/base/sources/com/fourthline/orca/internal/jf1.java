package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class jf1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hf1 f29890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f29891b;

    private jf1(hf1 hf1Var, e4m.e eVar) {
        this.f29890a = hf1Var;
        this.f29891b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public tf1 get() {
        return a(this.f29890a, (sg0) this.f29891b.get());
    }

    public static jf1 a(hf1 hf1Var, e4m.e eVar) {
        return new jf1(hf1Var, eVar);
    }

    public static tf1 a(hf1 hf1Var, sg0 sg0Var) {
        tf1 tf1VarA = hf1Var.a(sg0Var);
        vc.s.k(tf1VarA);
        return tf1VarA;
    }
}
