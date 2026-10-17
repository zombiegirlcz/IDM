package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class v implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f34225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34226b;

    private v(d dVar, e4m.e eVar) {
        this.f34225a = dVar;
        this.f34226b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ij0 get() {
        return a(this.f34225a, (r70) this.f34226b.get());
    }

    public static v a(d dVar, e4m.e eVar) {
        return new v(dVar, eVar);
    }

    public static ij0 a(d dVar, r70 r70Var) {
        ij0 ij0VarA = dVar.a(r70Var);
        vc.s.k(ij0VarA);
        return ij0VarA;
    }
}
