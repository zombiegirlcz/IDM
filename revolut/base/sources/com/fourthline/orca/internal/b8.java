package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class b8 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y7 f27033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f27034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f27035c;

    private b8(y7 y7Var, e4m.e eVar, e4m.e eVar2) {
        this.f27033a = y7Var;
        this.f27034b = eVar;
        this.f27035c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public l21 get() {
        return a(this.f27033a, (l70) this.f27034b.get(), (v10) this.f27035c.get());
    }

    public static b8 a(y7 y7Var, e4m.e eVar, e4m.e eVar2) {
        return new b8(y7Var, eVar, eVar2);
    }

    public static l21 a(y7 y7Var, l70 l70Var, v10 v10Var) {
        l21 l21VarA = y7Var.a(l70Var, v10Var);
        vc.s.k(l21VarA);
        return l21VarA;
    }
}
