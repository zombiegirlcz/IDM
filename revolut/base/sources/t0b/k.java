package t0b;

import tb4.t;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nj0.a f266970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l70.e f266971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ee0.a f266972c;
    public final an0.c d;
    public final jp.a e;
    public final k f = this;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f266973g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f266974h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f266975j;

    public k(l70.e eVar, nj0.a aVar, ee0.a aVar2, jp.a aVar3, an0.c cVar) {
        this.f266970a = aVar;
        this.f266971b = eVar;
        this.f266972c = aVar2;
        this.d = cVar;
        this.e = aVar3;
        int i = 4;
        this.f266973g = e4m.b.b(new sse.a(this, 0, i));
        this.f266974h = e4m.b.b(new sse.a(this, 1, i));
        this.i = e4m.b.b(new sse.a(this, 4, i));
        this.f266975j = e4m.b.b(new sse.a(this, 3, i));
        e4m.b.b(new sse.a(this, 2, i));
        e4m.b.b(new sse.a(this, 5, i));
    }

    public final t a() {
        u0b.a aVar = (u0b.a) this.f266975j.get();
        l80.e eVarH = this.f266971b.h();
        s.j(eVarH);
        je0.d dVarD = this.f266972c.d();
        s.j(dVarD);
        return new t(aVar, eVarH, dVarD);
    }

    public final v0b.d b() {
        yk0.a aVarB = this.d.b();
        s.j(aVarB);
        ee0.a aVar = this.f266972c;
        je0.d dVarB = aVar.b();
        s.j(dVarB);
        xe0.f fVarF = aVar.f();
        s.j(fVarF);
        return new v0b.d(sg8.j.n(dVarB, fVarF, aVarB));
    }
}
