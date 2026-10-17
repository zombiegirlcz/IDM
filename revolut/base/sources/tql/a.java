package tql;

import e4m.e;
import ei3.o;
import sf0.h;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nql.a f273616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ij0.a f273617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y60.c f273618c;
    public final nf0.a d;
    public final e e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f273619g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f273620h;

    public a(y60.c cVar, nf0.a aVar, nql.a aVar2, ij0.a aVar3) {
        this.f273616a = aVar2;
        this.f273617b = aVar3;
        this.f273618c = cVar;
        this.d = aVar;
        int i = 13;
        this.e = e4m.b.b(new sse.a(this, 0, i));
        this.f = e4m.b.b(new sse.a(this, 1, i));
        this.f273619g = e4m.b.b(new sse.a(this, 2, i));
        this.f273620h = e4m.b.b(new sse.a(this, 3, i));
    }

    public final qql.b a() {
        rql.a aVar = (rql.a) this.e.get();
        rql.b bVar = (rql.b) this.f.get();
        ij0.c cVar = (ij0.c) this.f273619g.get();
        h hVarB = this.d.b();
        s.j(hVarB);
        return new qql.b(aVar, bVar, this.f273616a, cVar, hVarB, new o((kg.o) this.f273620h.get(), 1));
    }

    public final rql.a b() {
        return (rql.a) this.e.get();
    }
}
