package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class gk implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rj f28918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f28919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f28920c;

    private gk(rj rjVar, e4m.e eVar, e4m.e eVar2) {
        this.f28918a = rjVar;
        this.f28919b = eVar;
        this.f28920c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public hn get() {
        return a(this.f28918a, (l70) this.f28919b.get(), (v10) this.f28920c.get());
    }

    public static gk a(rj rjVar, e4m.e eVar, e4m.e eVar2) {
        return new gk(rjVar, eVar, eVar2);
    }

    public static hn a(rj rjVar, l70 l70Var, v10 v10Var) {
        hn hnVarA = rjVar.a(l70Var, v10Var);
        vc.s.k(hnVarA);
        return hnVarA;
    }
}
