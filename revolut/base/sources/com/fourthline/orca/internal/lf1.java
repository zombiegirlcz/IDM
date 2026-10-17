package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class lf1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hf1 f30612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f30613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f30614c;

    private lf1(hf1 hf1Var, e4m.e eVar, e4m.e eVar2) {
        this.f30612a = hf1Var;
        this.f30613b = eVar;
        this.f30614c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public aq0 get() {
        return a(this.f30612a, (bq0) this.f30613b.get(), (ff1) this.f30614c.get());
    }

    public static lf1 a(hf1 hf1Var, e4m.e eVar, e4m.e eVar2) {
        return new lf1(hf1Var, eVar, eVar2);
    }

    public static aq0 a(hf1 hf1Var, bq0 bq0Var, ff1 ff1Var) {
        aq0 aq0VarA = hf1Var.a(bq0Var, ff1Var);
        vc.s.k(aq0VarA);
        return aq0VarA;
    }
}
