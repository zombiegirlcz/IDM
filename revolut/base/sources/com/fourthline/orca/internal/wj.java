package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class wj implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rj f34711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34712b;

    private wj(rj rjVar, e4m.e eVar) {
        this.f34711a = rjVar;
        this.f34712b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ei get() {
        return a(this.f34711a, (sg0) this.f34712b.get());
    }

    public static wj a(rj rjVar, e4m.e eVar) {
        return new wj(rjVar, eVar);
    }

    public static ei a(rj rjVar, sg0 sg0Var) {
        ei eiVarA = rjVar.a(sg0Var);
        vc.s.k(eiVarA);
        return eiVarA;
    }
}
