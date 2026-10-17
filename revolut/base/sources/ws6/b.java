package ws6;

import nyj.f;

/* JADX INFO: loaded from: classes13.dex */
public final class b extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a31.a f299672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f299673c;
    public final a31.a d;
    public final a31.a e;

    public b(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4) {
        this.f299672b = aVar;
        this.f299673c = aVar2;
        this.d = aVar3;
        this.e = aVar4;
    }

    @Override // b60.a
    public final Object a() {
        ite.a aVar = (ite.a) ((phm.a) this.f299672b.f955b).get();
        bpj.a aVar2 = (bpj.a) ((phm.a) this.f299673c.f955b).get();
        ila.b bVar = (ila.b) ((phm.a) this.d.f955b).get();
        f fVar = (f) ((phm.a) this.e.f955b).get();
        aVar.getClass();
        aVar2.getClass();
        bVar.getClass();
        fVar.getClass();
        return new a(aVar, aVar2, bVar, fVar);
    }
}
