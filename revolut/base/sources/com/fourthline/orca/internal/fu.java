package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class fu implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final cu f28665a;

    private fu(cu cuVar) {
        this.f28665a = cuVar;
    }

    public static lu b(cu cuVar) {
        lu luVarA = cuVar.a();
        vc.s.k(luVarA);
        return luVarA;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public lu get() {
        return b(this.f28665a);
    }

    public static fu a(cu cuVar) {
        return new fu(cuVar);
    }
}
