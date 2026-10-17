package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class rh1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final oh1 f32739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f32740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f32741c;
    private final e4m.e d;

    private rh1(oh1 oh1Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        this.f32739a = oh1Var;
        this.f32740b = eVar;
        this.f32741c = eVar2;
        this.d = eVar3;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public lz get() {
        return a(this.f32739a, (mb.d) this.f32740b.get(), this.f32741c, this.d);
    }

    public static rh1 a(oh1 oh1Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        return new rh1(oh1Var, eVar, eVar2, eVar3);
    }

    public static lz a(oh1 oh1Var, mb.d dVar, phm.a aVar, phm.a aVar2) {
        lz lzVarA = oh1Var.a(dVar, aVar, aVar2);
        vc.s.k(lzVarA);
        return lzVarA;
    }
}
