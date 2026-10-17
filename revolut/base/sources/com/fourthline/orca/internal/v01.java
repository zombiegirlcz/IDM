package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class v01 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s01 f34229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f34231c;
    private final e4m.e d;
    private final e4m.e e;

    private v01(s01 s01Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        this.f34229a = s01Var;
        this.f34230b = eVar;
        this.f34231c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a11 get() {
        return a(this.f34229a, (r01) this.f34230b.get(), (ef) this.f34231c.get(), (sg0) this.d.get(), ((Boolean) this.e.get()).booleanValue());
    }

    public static v01 a(s01 s01Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        return new v01(s01Var, eVar, eVar2, eVar3, eVar4);
    }

    public static a11 a(s01 s01Var, r01 r01Var, ef efVar, sg0 sg0Var, boolean z) {
        a11 a11VarA = s01Var.a(r01Var, efVar, sg0Var, z);
        vc.s.k(a11VarA);
        return a11VarA;
    }
}
