package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class jn0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hn0 f29972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f29973b;

    private jn0(hn0 hn0Var, e4m.e eVar) {
        this.f29972a = hn0Var;
        this.f29973b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public vo0 get() {
        return a(this.f29972a, (sg0) this.f29973b.get());
    }

    public static jn0 a(hn0 hn0Var, e4m.e eVar) {
        return new jn0(hn0Var, eVar);
    }

    public static vo0 a(hn0 hn0Var, sg0 sg0Var) {
        vo0 vo0VarB = hn0Var.b(sg0Var);
        vc.s.k(vo0VarB);
        return vo0VarB;
    }
}
