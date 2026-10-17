package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class du implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final cu f27918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f27919b;

    private du(cu cuVar, e4m.e eVar) {
        this.f27918a = cuVar;
        this.f27919b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public yt get() {
        return a(this.f27918a, (sg0) this.f27919b.get());
    }

    public static du a(cu cuVar, e4m.e eVar) {
        return new du(cuVar, eVar);
    }

    public static yt a(cu cuVar, sg0 sg0Var) {
        yt ytVarA = cuVar.a(sg0Var);
        vc.s.k(ytVarA);
        return ytVarA;
    }
}
