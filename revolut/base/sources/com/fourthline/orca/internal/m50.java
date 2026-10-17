package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class m50 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l50 f31002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f31004c;

    private m50(l50 l50Var, e4m.e eVar, e4m.e eVar2) {
        this.f31002a = l50Var;
        this.f31003b = eVar;
        this.f31004c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public vc1 get() {
        return a(this.f31002a, (gj) this.f31003b.get(), (yj0) this.f31004c.get());
    }

    public static m50 a(l50 l50Var, e4m.e eVar, e4m.e eVar2) {
        return new m50(l50Var, eVar, eVar2);
    }

    public static vc1 a(l50 l50Var, gj gjVar, yj0 yj0Var) {
        vc1 vc1VarA = l50Var.a(gjVar, yj0Var);
        vc.s.k(vc1VarA);
        return vc1VarA;
    }
}
