package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class k7 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g7 f30143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f30144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f30145c;

    private k7(g7 g7Var, e4m.e eVar, e4m.e eVar2) {
        this.f30143a = g7Var;
        this.f30144b = eVar;
        this.f30145c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public rp0 get() {
        return a(this.f30143a, (u6) this.f30144b.get(), (sg0) this.f30145c.get());
    }

    public static k7 a(g7 g7Var, e4m.e eVar, e4m.e eVar2) {
        return new k7(g7Var, eVar, eVar2);
    }

    public static rp0 a(g7 g7Var, u6 u6Var, sg0 sg0Var) {
        rp0 rp0VarA = g7Var.a(u6Var, sg0Var);
        vc.s.k(rp0VarA);
        return rp0VarA;
    }
}
