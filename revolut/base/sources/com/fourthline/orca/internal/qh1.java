package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class qh1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final oh1 f32434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f32435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f32436c;
    private final e4m.e d;

    private qh1(oh1 oh1Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        this.f32434a = oh1Var;
        this.f32435b = eVar;
        this.f32436c = eVar2;
        this.d = eVar3;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public kh1 get() {
        return a(this.f32434a, (mb.d) this.f32435b.get(), (ib0) this.f32436c.get(), this.d);
    }

    public static qh1 a(oh1 oh1Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        return new qh1(oh1Var, eVar, eVar2, eVar3);
    }

    public static kh1 a(oh1 oh1Var, mb.d dVar, ib0 ib0Var, phm.a aVar) {
        kh1 kh1VarA = oh1Var.a(dVar, ib0Var, aVar);
        vc.s.k(kh1VarA);
        return kh1VarA;
    }
}
