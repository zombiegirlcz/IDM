package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class b41 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a41 f26983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f26984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f26985c;
    private final e4m.e d;

    private b41(a41 a41Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        this.f26983a = a41Var;
        this.f26984b = eVar;
        this.f26985c = eVar2;
        this.d = eVar3;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public c6 get() {
        return a(this.f26983a, (mb.d) this.f26984b.get(), (ib0) this.f26985c.get(), this.d);
    }

    public static b41 a(a41 a41Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        return new b41(a41Var, eVar, eVar2, eVar3);
    }

    public static c6 a(a41 a41Var, mb.d dVar, ib0 ib0Var, phm.a aVar) {
        c6 c6VarA = a41Var.a(dVar, ib0Var, aVar);
        vc.s.k(c6VarA);
        return c6VarA;
    }
}
