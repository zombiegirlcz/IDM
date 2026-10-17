package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class os0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ms0 f31758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31759b;

    private os0(ms0 ms0Var, e4m.e eVar) {
        this.f31758a = ms0Var;
        this.f31759b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ww get() {
        return a(this.f31758a, (fe1) this.f31759b.get());
    }

    public static os0 a(ms0 ms0Var, e4m.e eVar) {
        return new os0(ms0Var, eVar);
    }

    public static ww a(ms0 ms0Var, fe1 fe1Var) {
        ww wwVarA = ms0Var.a(fe1Var);
        vc.s.k(wwVarA);
        return wwVarA;
    }
}
