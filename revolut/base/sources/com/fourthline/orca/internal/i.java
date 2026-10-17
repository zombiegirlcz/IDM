package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class i implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f29452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f29453b;

    private i(d dVar, e4m.e eVar) {
        this.f29452a = dVar;
        this.f29453b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public v9 get() {
        return a(this.f29452a, (w9) this.f29453b.get());
    }

    public static i a(d dVar, e4m.e eVar) {
        return new i(dVar, eVar);
    }

    public static v9 a(d dVar, w9 w9Var) {
        v9 v9VarA = dVar.a(w9Var);
        vc.s.k(v9VarA);
        return v9VarA;
    }
}
