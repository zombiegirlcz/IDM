package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class qk implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rj f32465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f32466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f32467c;

    private qk(rj rjVar, e4m.e eVar, e4m.e eVar2) {
        this.f32465a = rjVar;
        this.f32466b = eVar;
        this.f32467c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public q21 get() {
        return a(this.f32465a, (gj) this.f32466b.get(), (dx) this.f32467c.get());
    }

    public static qk a(rj rjVar, e4m.e eVar, e4m.e eVar2) {
        return new qk(rjVar, eVar, eVar2);
    }

    public static q21 a(rj rjVar, gj gjVar, dx dxVar) {
        q21 q21VarA = rjVar.a(gjVar, dxVar);
        vc.s.k(q21VarA);
        return q21VarA;
    }
}
