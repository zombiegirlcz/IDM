package oad;

import hn0.n;
import java.util.Optional;
import mp.o;
import vc.s;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements gmi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final an0.c f223577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jm0.a f223578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f223579c;
    public final y60.c d;
    public final nf0.a e;
    public final ymg.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f223580g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f223581h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f223582j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f223583l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f223584m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f223585n;

    public a(y60.c cVar, nf0.a aVar, jm0.a aVar2, an0.c cVar2, ymg.a aVar3, o oVar) {
        this.f223577a = cVar2;
        this.f223578b = aVar2;
        this.f223579c = oVar;
        this.d = cVar;
        this.e = aVar;
        this.f = aVar3;
        int i = 28;
        this.f223580g = e4m.g.a(new nk7.e(this, 0, i));
        this.f223581h = e4m.b.b(new nk7.e(this, 3, i));
        this.i = e4m.b.b(new nk7.e(this, 2, i));
        this.f223582j = e4m.g.a(new nk7.e(this, 1, i));
        this.k = e4m.b.b(new nk7.e(this, 6, i));
        this.f223583l = e4m.b.b(new nk7.e(this, 7, i));
        this.f223584m = e4m.b.b(new nk7.e(this, 5, i));
        this.f223585n = e4m.b.b(new nk7.e(this, 4, i));
    }

    public final Optional a() {
        cng.b bVarA = this.f.a();
        s.j(bVarA);
        return Optional.of(new qad.a(bVarA));
    }

    public final ulm.d b() {
        return (ulm.d) this.f223585n.get();
    }

    public final Optional c() {
        return Optional.empty();
    }

    public final jj0.a d() {
        an0.c cVar = this.f223577a;
        zm0.c cVarJ = cVar.j();
        s.j(cVarJ);
        yf.c cVar2 = new yf.c(this.f223578b.c());
        vi0.b bVar = (vi0.b) this.f223580g.get();
        n nVarH = cVar.h();
        s.j(nVarH);
        return new jj0.a(cVarJ, cVar2, bVar, nVarH);
    }

    public final jj0.g e() {
        return (jj0.g) this.f223582j.get();
    }
}
