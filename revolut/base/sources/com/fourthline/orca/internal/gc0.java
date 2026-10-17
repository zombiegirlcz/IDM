package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class gc0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zb0 f28846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f28847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f28848c;
    private final e4m.e d;

    private gc0(zb0 zb0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        this.f28846a = zb0Var;
        this.f28847b = eVar;
        this.f28848c = eVar2;
        this.d = eVar3;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public xc0 get() {
        return a(this.f28846a, (l9) this.f28847b.get(), (sg0) this.f28848c.get(), (v10) this.d.get());
    }

    public static gc0 a(zb0 zb0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        return new gc0(zb0Var, eVar, eVar2, eVar3);
    }

    public static xc0 a(zb0 zb0Var, l9 l9Var, sg0 sg0Var, v10 v10Var) {
        xc0 xc0VarA = zb0Var.a(l9Var, sg0Var, v10Var);
        vc.s.k(xc0VarA);
        return xc0VarA;
    }
}
