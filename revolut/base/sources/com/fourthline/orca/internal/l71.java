package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class l71 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i71 f30531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f30532b;

    private l71(i71 i71Var, e4m.e eVar) {
        this.f30531a = i71Var;
        this.f30532b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public b61 get() {
        return a(this.f30531a, (gf1) this.f30532b.get());
    }

    public static l71 a(i71 i71Var, e4m.e eVar) {
        return new l71(i71Var, eVar);
    }

    public static b61 a(i71 i71Var, gf1 gf1Var) {
        b61 b61VarA = i71Var.a(gf1Var);
        vc.s.k(b61VarA);
        return b61VarA;
    }
}
