package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class p50 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l50 f31852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f31854c;

    private p50(l50 l50Var, e4m.e eVar, e4m.e eVar2) {
        this.f31852a = l50Var;
        this.f31853b = eVar;
        this.f31854c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public vc1 get() {
        return a(this.f31852a, (vc1) this.f31853b.get(), (vc1) this.f31854c.get());
    }

    public static p50 a(l50 l50Var, e4m.e eVar, e4m.e eVar2) {
        return new p50(l50Var, eVar, eVar2);
    }

    public static vc1 a(l50 l50Var, vc1 vc1Var, vc1 vc1Var2) {
        vc1 vc1VarA = l50Var.a(vc1Var, vc1Var2);
        vc.s.k(vc1VarA);
        return vc1VarA;
    }
}
