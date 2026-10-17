package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class pn0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hn0 f32003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f32004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f32005c;
    private final e4m.e d;

    private pn0(hn0 hn0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        this.f32003a = hn0Var;
        this.f32004b = eVar;
        this.f32005c = eVar2;
        this.d = eVar3;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e40 get() {
        return a(this.f32003a, (j30) this.f32004b.get(), (bn0) this.f32005c.get(), (gn0) this.d.get());
    }

    public static pn0 a(hn0 hn0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        return new pn0(hn0Var, eVar, eVar2, eVar3);
    }

    public static e40 a(hn0 hn0Var, j30 j30Var, bn0 bn0Var, gn0 gn0Var) {
        e40 e40VarA = hn0Var.a(j30Var, bn0Var, gn0Var);
        vc.s.k(e40VarA);
        return e40VarA;
    }
}
