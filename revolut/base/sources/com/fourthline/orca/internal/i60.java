package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class i60 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g60 f29513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f29514b;

    private i60(g60 g60Var, e4m.e eVar) {
        this.f29513a = g60Var;
        this.f29514b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public d60 get() {
        return a(this.f29513a, (r70) this.f29514b.get());
    }

    public static i60 a(g60 g60Var, e4m.e eVar) {
        return new i60(g60Var, eVar);
    }

    public static d60 a(g60 g60Var, r70 r70Var) {
        d60 d60VarA = g60Var.a(r70Var);
        vc.s.k(d60VarA);
        return d60VarA;
    }
}
