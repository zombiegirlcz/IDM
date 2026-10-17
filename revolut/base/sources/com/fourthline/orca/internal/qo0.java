package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class qo0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ho0 f32502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f32503b;

    private qo0(ho0 ho0Var, e4m.e eVar) {
        this.f32502a = ho0Var;
        this.f32503b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a50 get() {
        return a(this.f32502a, (gm0) this.f32503b.get());
    }

    public static qo0 a(ho0 ho0Var, e4m.e eVar) {
        return new qo0(ho0Var, eVar);
    }

    public static a50 a(ho0 ho0Var, gm0 gm0Var) {
        a50 a50VarC = ho0Var.c(gm0Var);
        vc.s.k(a50VarC);
        return a50VarC;
    }
}
