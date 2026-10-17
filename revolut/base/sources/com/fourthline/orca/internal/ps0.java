package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class ps0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ms0 f32035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f32036b;

    private ps0(ms0 ms0Var, e4m.e eVar) {
        this.f32035a = ms0Var;
        this.f32036b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public f21 get() {
        return a(this.f32035a, (v10) this.f32036b.get());
    }

    public static ps0 a(ms0 ms0Var, e4m.e eVar) {
        return new ps0(ms0Var, eVar);
    }

    public static f21 a(ms0 ms0Var, v10 v10Var) {
        f21 f21VarA = ms0Var.a(v10Var);
        vc.s.k(f21VarA);
        return f21VarA;
    }
}
