package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class nn0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hn0 f31458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31459b;

    private nn0(hn0 hn0Var, e4m.e eVar) {
        this.f31458a = hn0Var;
        this.f31459b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public j30 get() {
        return a(this.f31458a, (sg0) this.f31459b.get());
    }

    public static nn0 a(hn0 hn0Var, e4m.e eVar) {
        return new nn0(hn0Var, eVar);
    }

    public static j30 a(hn0 hn0Var, sg0 sg0Var) {
        j30 j30VarC = hn0Var.c(sg0Var);
        vc.s.k(j30VarC);
        return j30VarC;
    }
}
