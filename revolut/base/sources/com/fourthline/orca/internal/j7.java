package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class j7 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g7 f29819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f29820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f29821c;

    private j7(g7 g7Var, e4m.e eVar, e4m.e eVar2) {
        this.f29819a = g7Var;
        this.f29820b = eVar;
        this.f29821c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a6 get() {
        return a(this.f29819a, (z5) this.f29820b.get(), (sg0) this.f29821c.get());
    }

    public static j7 a(g7 g7Var, e4m.e eVar, e4m.e eVar2) {
        return new j7(g7Var, eVar, eVar2);
    }

    public static a6 a(g7 g7Var, z5 z5Var, sg0 sg0Var) {
        a6 a6VarA = g7Var.a(z5Var, sg0Var);
        vc.s.k(a6VarA);
        return a6VarA;
    }
}
