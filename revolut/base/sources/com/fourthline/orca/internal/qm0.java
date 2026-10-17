package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class qm0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pm0 f32489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f32490b;

    private qm0(pm0 pm0Var, e4m.e eVar) {
        this.f32489a = pm0Var;
        this.f32490b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public bp0 get() {
        return a(this.f32489a, (an0) this.f32490b.get());
    }

    public static qm0 a(pm0 pm0Var, e4m.e eVar) {
        return new qm0(pm0Var, eVar);
    }

    public static bp0 a(pm0 pm0Var, an0 an0Var) {
        bp0 bp0VarA = pm0Var.a(an0Var);
        vc.s.k(bp0VarA);
        return bp0VarA;
    }
}
