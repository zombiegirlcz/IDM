package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class w01 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s01 f34485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34486b;

    private w01(s01 s01Var, e4m.e eVar) {
        this.f34485a = s01Var;
        this.f34486b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public f11 get() {
        return a(this.f34485a, (sg0) this.f34486b.get());
    }

    public static w01 a(s01 s01Var, e4m.e eVar) {
        return new w01(s01Var, eVar);
    }

    public static f11 a(s01 s01Var, sg0 sg0Var) {
        f11 f11VarA = s01Var.a(sg0Var);
        vc.s.k(f11VarA);
        return f11VarA;
    }
}
