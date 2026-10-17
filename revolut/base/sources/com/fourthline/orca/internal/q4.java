package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class q4 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e4 f32188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f32189b;

    private q4(e4 e4Var, e4m.e eVar) {
        this.f32188a = e4Var;
        this.f32189b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public i6 get() {
        return a(this.f32188a, (sg0) this.f32189b.get());
    }

    public static q4 a(e4 e4Var, e4m.e eVar) {
        return new q4(e4Var, eVar);
    }

    public static i6 a(e4 e4Var, sg0 sg0Var) {
        i6 i6VarC = e4Var.c(sg0Var);
        vc.s.k(i6VarC);
        return i6VarC;
    }
}
