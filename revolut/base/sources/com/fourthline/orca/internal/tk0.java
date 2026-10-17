package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class tk0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fk0 f33790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f33791b;

    private tk0(fk0 fk0Var, e4m.e eVar) {
        this.f33790a = fk0Var;
        this.f33791b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public zl get() {
        return a(this.f33790a, (sg0) this.f33791b.get());
    }

    public static tk0 a(fk0 fk0Var, e4m.e eVar) {
        return new tk0(fk0Var, eVar);
    }

    public static zl a(fk0 fk0Var, sg0 sg0Var) {
        zl zlVarA = fk0Var.a(sg0Var);
        vc.s.k(zlVarA);
        return zlVarA;
    }
}
