package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class es implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ds f28254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f28255b;

    private es(ds dsVar, e4m.e eVar) {
        this.f28254a = dsVar;
        this.f28255b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public l9 get() {
        return a(this.f28254a, (bs) this.f28255b.get());
    }

    public static es a(ds dsVar, e4m.e eVar) {
        return new es(dsVar, eVar);
    }

    public static l9 a(ds dsVar, bs bsVar) {
        l9 l9VarA = dsVar.a(bsVar);
        vc.s.k(l9VarA);
        return l9VarA;
    }
}
