package c4e;

import com.google.common.collect.ImmutableSet;
import hn.h;
import iri.j;
import java.util.Collection;
import mp.r;
import vc.s;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements hri.a, e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hri.b f21160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l70.e f21161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cri.b f21162c;
    public final w3e.b d;
    public final poi.b e;
    public final c f = this;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f21163g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f21164h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f21165j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f21166l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f21167m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f21168n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f21169p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f21170q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f21171r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f21172s;

    public c(hri.b bVar, poi.b bVar2, l70.e eVar, w3e.b bVar3, cri.b bVar4) {
        this.f21160a = bVar;
        this.f21161b = eVar;
        this.f21162c = bVar4;
        this.d = bVar3;
        this.e = bVar2;
        int i = 22;
        this.f21163g = e4m.b.b(new aq1.e(this, 0, i));
        this.f21164h = e4m.b.b(new aq1.e(this, 1, i));
        this.i = e4m.b.b(new aq1.e(this, 2, i));
        this.f21165j = e4m.b.b(new aq1.e(this, 3, i));
        this.k = e4m.b.b(new aq1.e(this, 4, i));
        this.f21166l = e4m.b.b(new aq1.e(this, 5, i));
        this.f21167m = e4m.b.b(new aq1.e(this, 6, i));
        this.f21168n = e4m.b.b(new aq1.e(this, 7, i));
        this.o = e4m.b.b(new aq1.e(this, 8, i));
        this.f21169p = e4m.b.b(new aq1.e(this, 9, i));
        this.f21170q = e4m.b.b(new aq1.e(this, 10, i));
        this.f21171r = e4m.b.b(new aq1.e(this, 11, i));
        this.f21172s = e4m.b.b(new aq1.e(this, 12, i));
    }

    @Override // c4e.e
    public final d a() {
        return new a(this.f);
    }

    public final qm.e b() {
        return new qm.e((um.c) this.i.get());
    }

    public final jn.e c() {
        ln.a aVar = (ln.a) this.f21167m.get();
        h hVar = (h) this.f21166l.get();
        t70.g gVarO = this.f21161b.o();
        s.j(gVarO);
        return new jn.e(aVar, hVar, new r(gVarO), ImmutableSet.copyOf((Collection) jn.c.a()));
    }

    @Override // hri.a
    public final j e() {
        return (j) this.f21164h.get();
    }

    @Override // hri.a
    public final ifm.b f() {
        return (ifm.b) this.f21163g.get();
    }
}
