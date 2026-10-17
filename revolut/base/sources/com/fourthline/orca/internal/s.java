package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class s implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f32875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f32876b;

    private s(d dVar, e4m.e eVar) {
        this.f32875a = dVar;
        this.f32876b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public fh0 get() {
        return a(this.f32875a, (zq0) this.f32876b.get());
    }

    public static s a(d dVar, e4m.e eVar) {
        return new s(dVar, eVar);
    }

    public static fh0 a(d dVar, zq0 zq0Var) {
        fh0 fh0VarA = dVar.a(zq0Var);
        vc.s.k(fh0VarA);
        return fh0VarA;
    }
}
