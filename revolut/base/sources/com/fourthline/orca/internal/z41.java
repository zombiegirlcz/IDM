package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class z41 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v41 f35521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f35522b;

    private z41(v41 v41Var, e4m.e eVar) {
        this.f35521a = v41Var;
        this.f35522b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public fl get() {
        return a(this.f35521a, (bg) this.f35522b.get());
    }

    public static z41 a(v41 v41Var, e4m.e eVar) {
        return new z41(v41Var, eVar);
    }

    public static fl a(v41 v41Var, bg bgVar) {
        fl flVarA = v41Var.a(bgVar);
        vc.s.k(flVarA);
        return flVarA;
    }
}
