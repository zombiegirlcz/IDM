package rza;

import com.google.common.collect.ImmutableSet;
import hn.h;
import iri.j;
import java.util.Collection;
import mp.r;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hri.b f258543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l70.e f258544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cri.b f258545c;
    public final jza.f d;
    public final lqi.a e;
    public final w3e.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final poi.b f258546g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f258547h = this;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f258548j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f258549l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f258550m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f258551n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f258552p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f258553q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f258554r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f258555s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f258556t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f258557w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f258558x;

    public b(hri.b bVar, poi.b bVar2, lqi.a aVar, cri.b bVar3, l70.e eVar, w3e.b bVar4, jza.f fVar) {
        this.f258543a = bVar;
        this.f258544b = eVar;
        this.f258545c = bVar3;
        this.d = fVar;
        this.e = aVar;
        this.f = bVar4;
        this.f258546g = bVar2;
        int i = 16;
        this.i = e4m.b.b(new r5a.b(this, 0, i));
        this.f258548j = e4m.b.b(new r5a.b(this, 1, i));
        this.k = e4m.b.b(new r5a.b(this, 2, i));
        this.f258549l = e4m.b.b(new r5a.b(this, 3, i));
        this.f258550m = e4m.b.b(new r5a.b(this, 4, i));
        this.f258551n = e4m.b.b(new r5a.b(this, 5, i));
        this.o = e4m.b.b(new r5a.b(this, 6, i));
        this.f258552p = e4m.b.b(new r5a.b(this, 7, i));
        this.f258553q = e4m.b.b(new r5a.b(this, 8, i));
        this.f258554r = e4m.b.b(new r5a.b(this, 9, i));
        this.f258555s = e4m.b.b(new r5a.b(this, 10, i));
        this.f258556t = e4m.b.b(new r5a.b(this, 11, i));
        this.u = e4m.b.b(new r5a.b(this, 12, i));
        this.v = e4m.b.b(new r5a.b(this, 14, i));
        this.f258557w = e4m.b.b(new r5a.b(this, 13, i));
        this.f258558x = e4m.b.b(new r5a.b(this, 15, i));
    }

    @Override // c4e.e
    public final c4e.d a() {
        return new c(this.f258547h);
    }

    @Override // rza.f
    public final jpf.a b() {
        jpf.a aVar = new jpf.a();
        aVar.f177267a = this.f258547h;
        return aVar;
    }

    public final qm.e c() {
        return new qm.e((um.c) this.f258549l.get());
    }

    public final jn.e d() {
        ln.a aVar = (ln.a) this.f258552p.get();
        h hVar = (h) this.o.get();
        t70.g gVarO = this.f258544b.o();
        s.j(gVarO);
        return new jn.e(aVar, hVar, new r(gVarO), ImmutableSet.copyOf((Collection) jn.c.a()));
    }

    @Override // hri.a
    public final j e() {
        return (j) this.f258548j.get();
    }

    @Override // hri.a
    public final ifm.b f() {
        return (ifm.b) this.i.get();
    }
}
