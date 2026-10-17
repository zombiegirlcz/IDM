package wy7;

import com.google.common.collect.ImmutableSet;
import com.google.firebase.messaging.t;
import iri.j;
import java.util.Collection;
import mp.r;
import vc.s;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements hri.a, jz7.a {
    public final e4m.e A;
    public final e4m.e B;
    public final e4m.e C;
    public final e4m.e D;
    public final e4m.e E;
    public final e4m.e F;
    public final e4m.e G;
    public final e4m.e H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hri.b f301144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l70.e f301145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ex7.a f301146c;
    public final f d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f301147g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f301148h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f301149j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f301150l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f301151m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f301152n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f301153p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f301154q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f301155r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f301156s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f301157t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f301158w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f301159x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f301160y;
    public final e4m.e z;

    public f(hri.b bVar, l70.e eVar, ex7.a aVar) {
        this.f301144a = bVar;
        this.f301145b = eVar;
        this.f301146c = aVar;
        int i = 14;
        this.e = e4m.b.b(new vy9.a(this, 0, i));
        this.f = e4m.b.b(new vy9.a(this, 1, i));
        this.f301147g = e4m.b.b(new vy9.a(this, 2, i));
        this.f301148h = e4m.b.b(new vy9.a(this, 3, i));
        this.i = e4m.b.b(new vy9.a(this, 4, i));
        this.f301149j = e4m.b.b(new vy9.a(this, 5, i));
        this.k = e4m.b.b(new vy9.a(this, 6, i));
        this.f301150l = e4m.b.b(new vy9.a(this, 7, i));
        this.f301151m = e4m.b.b(new vy9.a(this, 8, i));
        this.f301152n = e4m.b.b(new vy9.a(this, 9, i));
        this.o = e4m.b.b(new vy9.a(this, 10, i));
        this.f301153p = e4m.b.b(new vy9.a(this, 11, i));
        this.f301154q = e4m.b.b(new vy9.a(this, 12, i));
        this.f301155r = e4m.b.b(new vy9.a(this, 13, i));
        this.f301156s = e4m.b.b(new vy9.a(this, 14, i));
        this.f301157t = e4m.b.b(new vy9.a(this, 15, i));
        this.u = e4m.b.b(new vy9.a(this, 16, i));
        this.v = e4m.b.b(new vy9.a(this, 18, i));
        this.f301158w = e4m.b.b(new vy9.a(this, 17, i));
        this.f301159x = e4m.b.b(new vy9.a(this, 19, i));
        this.f301160y = e4m.b.b(new vy9.a(this, 21, i));
        this.z = e4m.b.b(new vy9.a(this, 20, i));
        this.A = e4m.b.b(new vy9.a(this, 22, i));
        this.B = e4m.b.b(new vy9.a(this, 23, i));
        this.C = e4m.b.b(new vy9.a(this, 24, i));
        this.D = e4m.b.b(new vy9.a(this, 25, i));
        this.E = e4m.b.b(new vy9.a(this, 26, i));
        this.F = e4m.b.b(new vy9.a(this, 27, i));
        this.G = e4m.b.b(new vy9.a(this, 29, i));
        this.H = e4m.b.b(new vy9.a(this, 28, i));
    }

    @Override // jz7.a
    public final h08.i a() {
        return new h08.i(this.d, 1);
    }

    public final t b() {
        return new t((cn.e) this.f301154q.get(), (ym.d) this.f301157t.get(), (um.c) this.f301155r.get(), (ifm.b) this.e.get());
    }

    public final qm.e c() {
        return new qm.e((um.c) this.f301155r.get());
    }

    public final jn.e d() {
        ln.a aVar = (ln.a) this.f301148h.get();
        hn.h hVar = (hn.h) this.f301156s.get();
        t70.g gVarO = this.f301145b.o();
        s.j(gVarO);
        return new jn.e(aVar, hVar, new r(gVarO), ImmutableSet.copyOf((Collection) jn.c.a()));
    }

    @Override // hri.a
    public final j e() {
        return (j) this.f.get();
    }

    @Override // hri.a
    public final ifm.b f() {
        return (ifm.b) this.e.get();
    }
}
