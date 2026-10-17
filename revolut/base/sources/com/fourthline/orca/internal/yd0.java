package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class yd0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pd0 f35267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f35268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f35269c;
    private final e4m.e d;

    private yd0(pd0 pd0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        this.f35267a = pd0Var;
        this.f35268b = eVar;
        this.f35269c = eVar2;
        this.d = eVar3;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public j20 get() {
        return a(this.f35267a, (se0) this.f35268b.get(), (l70) this.f35269c.get(), (v10) this.d.get());
    }

    public static yd0 a(pd0 pd0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        return new yd0(pd0Var, eVar, eVar2, eVar3);
    }

    public static j20 a(pd0 pd0Var, se0 se0Var, l70 l70Var, v10 v10Var) {
        j20 j20VarA = pd0Var.a(se0Var, l70Var, v10Var);
        vc.s.k(j20VarA);
        return j20VarA;
    }
}
