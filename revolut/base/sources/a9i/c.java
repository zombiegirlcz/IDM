package a9i;

import e4m.e;
import iri.j;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements hri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pqi.a f2664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bpj.a f2665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m41.c f2666c;
    public final u06.c d;
    public final jk3.c e;
    public final c f = this;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f2667g = e4m.b.b(new b(this, 0, 0));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f2668h = e4m.b.b(new b(this, 1, 0));

    public c(hri.b bVar, pqi.a aVar, m41.c cVar, bpj.a aVar2, jk3.c cVar2, u06.c cVar3) {
        this.f2664a = aVar;
        this.f2665b = aVar2;
        this.f2666c = cVar;
        this.d = cVar3;
        this.e = cVar2;
    }

    @Override // hri.a
    public final j e() {
        return (j) this.f2668h.get();
    }

    @Override // hri.a
    public final ifm.b f() {
        return (ifm.b) this.f2667g.get();
    }
}
