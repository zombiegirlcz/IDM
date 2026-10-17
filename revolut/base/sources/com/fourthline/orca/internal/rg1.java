package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class rg1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mg1 f32723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f32724b;

    private rg1(mg1 mg1Var, e4m.e eVar) {
        this.f32723a = mg1Var;
        this.f32724b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ib0 get() {
        return a(this.f32723a, (mb.d) this.f32724b.get());
    }

    public static rg1 a(mg1 mg1Var, e4m.e eVar) {
        return new rg1(mg1Var, eVar);
    }

    public static ib0 a(mg1 mg1Var, mb.d dVar) {
        ib0 ib0VarB = mg1Var.b(dVar);
        vc.s.k(ib0VarB);
        return ib0VarB;
    }
}
