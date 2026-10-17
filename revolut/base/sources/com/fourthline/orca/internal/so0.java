package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class so0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ho0 f33075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f33076b;

    private so0(ho0 ho0Var, e4m.e eVar) {
        this.f33075a = ho0Var;
        this.f33076b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gm0 get() {
        return a(this.f33075a, (o80) this.f33076b.get());
    }

    public static so0 a(ho0 ho0Var, e4m.e eVar) {
        return new so0(ho0Var, eVar);
    }

    public static gm0 a(ho0 ho0Var, o80 o80Var) {
        gm0 gm0VarA = ho0Var.a(o80Var);
        vc.s.k(gm0VarA);
        return gm0VarA;
    }
}
