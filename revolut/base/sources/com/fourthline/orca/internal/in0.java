package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class in0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hn0 f29645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f29646b;

    private in0(hn0 hn0Var, e4m.e eVar) {
        this.f29645a = hn0Var;
        this.f29646b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public fm0 get() {
        return a(this.f29645a, (sg0) this.f29646b.get());
    }

    public static in0 a(hn0 hn0Var, e4m.e eVar) {
        return new in0(hn0Var, eVar);
    }

    public static fm0 a(hn0 hn0Var, sg0 sg0Var) {
        fm0 fm0VarA = hn0Var.a(sg0Var);
        vc.s.k(fm0VarA);
        return fm0VarA;
    }
}
