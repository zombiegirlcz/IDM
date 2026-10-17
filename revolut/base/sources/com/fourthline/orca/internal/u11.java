package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class u11 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s11 f33924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f33925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f33926c;
    private final e4m.e d;
    private final e4m.e e;

    private u11(s11 s11Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        this.f33924a = s11Var;
        this.f33925b = eVar;
        this.f33926c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public i21 get() {
        return a(this.f33924a, (q11) this.f33925b.get(), (ef) this.f33926c.get(), (sg0) this.d.get(), ((Boolean) this.e.get()).booleanValue());
    }

    public static u11 a(s11 s11Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        return new u11(s11Var, eVar, eVar2, eVar3, eVar4);
    }

    public static i21 a(s11 s11Var, q11 q11Var, ef efVar, sg0 sg0Var, boolean z) {
        i21 i21VarA = s11Var.a(q11Var, efVar, sg0Var, z);
        vc.s.k(i21VarA);
        return i21VarA;
    }
}
