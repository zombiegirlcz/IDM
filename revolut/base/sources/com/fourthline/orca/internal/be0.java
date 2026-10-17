package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class be0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pd0 f27104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f27105b;

    private be0(pd0 pd0Var, e4m.e eVar) {
        this.f27104a = pd0Var;
        this.f27105b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public af0 get() {
        return a(this.f27104a, (gj) this.f27105b.get());
    }

    public static be0 a(pd0 pd0Var, e4m.e eVar) {
        return new be0(pd0Var, eVar);
    }

    public static af0 a(pd0 pd0Var, gj gjVar) {
        af0 af0VarB = pd0Var.b(gjVar);
        vc.s.k(af0VarB);
        return af0VarB;
    }
}
