package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class hy0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wx0 f29438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f29439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f29440c;
    private final e4m.e d;

    private hy0(wx0 wx0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        this.f29438a = wx0Var;
        this.f29439b = eVar;
        this.f29440c = eVar2;
        this.d = eVar3;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public fx0 get() {
        return a(this.f29438a, (ex0) this.f29439b.get(), (yv0) this.f29440c.get(), (sg0) this.d.get());
    }

    public static hy0 a(wx0 wx0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        return new hy0(wx0Var, eVar, eVar2, eVar3);
    }

    public static fx0 a(wx0 wx0Var, ex0 ex0Var, yv0 yv0Var, sg0 sg0Var) {
        fx0 fx0VarA = wx0Var.a(ex0Var, yv0Var, sg0Var);
        vc.s.k(fx0VarA);
        return fx0VarA;
    }
}
