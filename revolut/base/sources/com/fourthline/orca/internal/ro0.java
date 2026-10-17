package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class ro0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ho0 f32788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f32789b;

    private ro0(ho0 ho0Var, e4m.e eVar) {
        this.f32788a = ho0Var;
        this.f32789b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public tm get() {
        return a(this.f32788a, (v10) this.f32789b.get());
    }

    public static ro0 a(ho0 ho0Var, e4m.e eVar) {
        return new ro0(ho0Var, eVar);
    }

    public static tm a(ho0 ho0Var, v10 v10Var) {
        tm tmVarA = ho0Var.a(v10Var);
        vc.s.k(tmVarA);
        return tmVarA;
    }
}
