package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class ja1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r91 f29846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f29847b;

    private ja1(r91 r91Var, e4m.e eVar) {
        this.f29846a = r91Var;
        this.f29847b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public p81 get() {
        return a(this.f29846a, (sg0) this.f29847b.get());
    }

    public static ja1 a(r91 r91Var, e4m.e eVar) {
        return new ja1(r91Var, eVar);
    }

    public static p81 a(r91 r91Var, sg0 sg0Var) {
        p81 p81VarA = r91Var.a(sg0Var);
        vc.s.k(p81VarA);
        return p81VarA;
    }
}
