package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class hk0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fk0 f29311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f29312b;

    private hk0(fk0 fk0Var, e4m.e eVar) {
        this.f29311a = fk0Var;
        this.f29312b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ak0 get() {
        return a(this.f29311a, (r70) this.f29312b.get());
    }

    public static hk0 a(fk0 fk0Var, e4m.e eVar) {
        return new hk0(fk0Var, eVar);
    }

    public static ak0 a(fk0 fk0Var, r70 r70Var) {
        ak0 ak0VarA = fk0Var.a(r70Var);
        vc.s.k(ak0VarA);
        return ak0VarA;
    }
}
