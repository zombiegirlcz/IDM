package ca9;

import com.google.common.collect.ImmutableSet;
import hn.h;
import ine.o;
import iri.j;
import java.util.Collection;
import mp.r;
import t70.g;
import vc.s;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements hri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hri.b f22559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l70.e f22560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jk3.c f22561c;
    public final o d;
    public final xmg.a e;
    public final osb.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f22562g = this;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f22563h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f22564j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f22565l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f22566m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f22567n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f22568p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f22569q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f22570r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f22571s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f22572t;
    public final e4m.e u;

    public d(hri.b bVar, l70.e eVar, xmg.a aVar, o oVar, jk3.c cVar, osb.a aVar2) {
        this.f22559a = bVar;
        this.f22560b = eVar;
        this.f22561c = cVar;
        this.d = oVar;
        this.e = aVar;
        this.f = aVar2;
        int i = 27;
        this.f22563h = e4m.b.b(new aq1.e(this, 0, i));
        this.i = e4m.b.b(new aq1.e(this, 1, i));
        this.f22564j = e4m.b.b(new aq1.e(this, 2, i));
        this.k = e4m.b.b(new aq1.e(this, 4, i));
        this.f22565l = e4m.b.b(new aq1.e(this, 3, i));
        this.f22566m = e4m.b.b(new aq1.e(this, 5, i));
        this.f22567n = e4m.b.b(new aq1.e(this, 6, i));
        this.o = e4m.b.b(new aq1.e(this, 7, i));
        this.f22568p = e4m.b.b(new aq1.e(this, 8, i));
        this.f22569q = e4m.b.b(new aq1.e(this, 9, i));
        this.f22570r = e4m.b.b(new aq1.e(this, 10, i));
        this.f22571s = e4m.b.b(new aq1.e(this, 11, i));
        this.f22572t = e4m.b.b(new aq1.e(this, 12, i));
        this.u = e4m.b.b(new aq1.e(this, 13, i));
    }

    public final qm.e a() {
        return new qm.e((um.c) this.o.get());
    }

    public final jn.e b() {
        ln.a aVar = (ln.a) this.f22566m.get();
        h hVar = (h) this.f22568p.get();
        g gVarO = this.f22560b.o();
        s.j(gVarO);
        return new jn.e(aVar, hVar, new r(gVarO), ImmutableSet.copyOf((Collection) jn.c.a()));
    }

    @Override // hri.a
    public final j e() {
        return (j) this.i.get();
    }

    @Override // hri.a
    public final ifm.b f() {
        return (ifm.b) this.f22563h.get();
    }
}
