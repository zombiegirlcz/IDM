package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class ph1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final oh1 f31966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f31968c;
    private final e4m.e d;
    private final e4m.e e;

    private ph1(oh1 oh1Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        this.f31966a = oh1Var;
        this.f31967b = eVar;
        this.f31968c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public yg1 get() {
        return a(this.f31966a, (mb.d) this.f31967b.get(), (ib0) this.f31968c.get(), (dh1) this.d.get(), this.e);
    }

    public static ph1 a(oh1 oh1Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        return new ph1(oh1Var, eVar, eVar2, eVar3, eVar4);
    }

    public static yg1 a(oh1 oh1Var, mb.d dVar, ib0 ib0Var, dh1 dh1Var, phm.a aVar) {
        yg1 yg1VarA = oh1Var.a(dVar, ib0Var, dh1Var, aVar);
        vc.s.k(yg1VarA);
        return yg1VarA;
    }
}
