package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class o50 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l50 f31580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f31582c;

    private o50(l50 l50Var, e4m.e eVar, e4m.e eVar2) {
        this.f31580a = l50Var;
        this.f31581b = eVar;
        this.f31582c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public vc1 get() {
        return a(this.f31580a, (gj) this.f31581b.get(), (yj0) this.f31582c.get());
    }

    public static o50 a(l50 l50Var, e4m.e eVar, e4m.e eVar2) {
        return new o50(l50Var, eVar, eVar2);
    }

    public static vc1 a(l50 l50Var, gj gjVar, yj0 yj0Var) {
        vc1 vc1VarC = l50Var.c(gjVar, yj0Var);
        vc.s.k(vc1VarC);
        return vc1VarC;
    }
}
