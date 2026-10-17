package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class hk implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rj f29308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f29309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f29310c;
    private final e4m.e d;

    private hk(rj rjVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        this.f29308a = rjVar;
        this.f29309b = eVar;
        this.f29310c = eVar2;
        this.d = eVar3;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public in get() {
        return a(this.f29308a, (fj) this.f29309b.get(), (hn) this.f29310c.get(), (an) this.d.get());
    }

    public static hk a(rj rjVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        return new hk(rjVar, eVar, eVar2, eVar3);
    }

    public static in a(rj rjVar, fj fjVar, hn hnVar, an anVar) {
        in inVarA = rjVar.a(fjVar, hnVar, anVar);
        vc.s.k(inVarA);
        return inVarA;
    }
}
