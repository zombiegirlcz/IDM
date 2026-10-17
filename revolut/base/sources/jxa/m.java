package jxa;

import vl3.n;

/* JADX INFO: loaded from: classes5.dex */
public final class m extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a31.a f179104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f179105c;
    public final a31.a d;

    public m(a31.a aVar, a31.a aVar2, a31.a aVar3) {
        this.f179104b = aVar;
        this.f179105c = aVar2;
        this.d = aVar3;
    }

    @Override // b60.a
    public final Object a() {
        n nVar = (n) ((phm.a) this.f179104b.f955b).get();
        pz9.a aVar = (pz9.a) ((phm.a) this.f179105c.f955b).get();
        jhf.a aVar2 = (jhf.a) ((phm.a) this.d.f955b).get();
        nVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        return new a(nVar, aVar, aVar2);
    }
}
