package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class ia1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r91 f29546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f29547b;

    private ia1(r91 r91Var, e4m.e eVar) {
        this.f29546a = r91Var;
        this.f29547b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public q21 get() {
        return a(this.f29546a, (dx) this.f29547b.get());
    }

    public static ia1 a(r91 r91Var, e4m.e eVar) {
        return new ia1(r91Var, eVar);
    }

    public static q21 a(r91 r91Var, dx dxVar) {
        q21 q21VarA = r91Var.a(dxVar);
        vc.s.k(q21VarA);
        return q21VarA;
    }
}
