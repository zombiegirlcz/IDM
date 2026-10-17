package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class n50 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l50 f31330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31331b;

    private n50(l50 l50Var, e4m.e eVar) {
        this.f31330a = l50Var;
        this.f31331b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public vc1 get() {
        return a(this.f31330a, (yj0) this.f31331b.get());
    }

    public static n50 a(l50 l50Var, e4m.e eVar) {
        return new n50(l50Var, eVar);
    }

    public static vc1 a(l50 l50Var, yj0 yj0Var) {
        vc1 vc1VarA = l50Var.a(yj0Var);
        vc.s.k(vc1VarA);
        return vc1VarA;
    }
}
