package es8;

import e4m.e;
import g6e.d;
import r6e.a0;
import te8.v;
import vc.s;
import wsg.n;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f128902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nj0.a f128903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final usg.a f128904c;
    public final mj8.b d;
    public final a0 e;
    public final se8.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ila.b f128905g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f128906h;
    public final e i;

    public a(c cVar, nj0.a aVar, usg.a aVar2, se8.a aVar3, mj8.b bVar, a0 a0Var, ila.b bVar2) {
        this.f128902a = cVar;
        this.f128903b = aVar;
        this.f128904c = aVar2;
        this.d = bVar;
        this.e = a0Var;
        this.f = aVar3;
        this.f128905g = bVar2;
        int i = 9;
        this.f128906h = e4m.b.b(new ede.a(this, 1, i));
        this.i = e4m.b.b(new ede.a(this, 0, i));
    }

    public final twg.c a() {
        n nVarB = this.f128904c.b();
        hj8.a aVarA = this.d.a();
        s.j(aVarA);
        d dVarB = this.e.b();
        s.j(dVarB);
        v vVarD = this.f.d();
        s.j(vVarD);
        return new twg.c(nVarB, aVarA, new zq.a(dVarB, vVarD), new gs8.c(), this.f128905g.a());
    }
}
