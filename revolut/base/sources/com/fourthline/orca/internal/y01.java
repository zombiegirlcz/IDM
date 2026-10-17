package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class y01 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s01 f35126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f35127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f35128c;

    private y01(s01 s01Var, e4m.e eVar, e4m.e eVar2) {
        this.f35126a = s01Var;
        this.f35127b = eVar;
        this.f35128c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public l11 get() {
        return a(this.f35126a, (l70) this.f35127b.get(), (v10) this.f35128c.get());
    }

    public static y01 a(s01 s01Var, e4m.e eVar, e4m.e eVar2) {
        return new y01(s01Var, eVar, eVar2);
    }

    public static l11 a(s01 s01Var, l70 l70Var, v10 v10Var) {
        l11 l11VarA = s01Var.a(l70Var, v10Var);
        vc.s.k(l11VarA);
        return l11VarA;
    }
}
