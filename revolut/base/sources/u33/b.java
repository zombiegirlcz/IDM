package u33;

import ai3.c;
import bi3.d;
import com.google.common.collect.ImmutableSet;
import com.google.firebase.messaging.t;
import da3.j;
import hn.h;
import java.util.Collection;
import l70.e;
import mp.r;
import t70.g;
import ta9.m;
import vc.s;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements hri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hri.b f276758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f276759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f276760c;
    public final d d;
    public final j e;
    public final m f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final th0.a f276761g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jq8.a f276762h;
    public final nf0.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final co0.a f276763j;
    public final b k = this;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f276764l = e4m.b.b(new tn3.a(this, 0, 9));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f276765m = e4m.b.b(new tn3.a(this, 1, 9));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f276766n = e4m.b.b(new tn3.a(this, 2, 9));
    public final e4m.e o = e4m.b.b(new tn3.a(this, 3, 9));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f276767p = e4m.b.b(new tn3.a(this, 4, 9));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f276768q = e4m.b.b(new tn3.a(this, 5, 9));

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f276769r = e4m.b.b(new tn3.a(this, 6, 9));

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f276770s = e4m.b.b(new tn3.a(this, 7, 9));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f276771t = e4m.b.b(new tn3.a(this, 8, 9));
    public final e4m.e u = e4m.b.b(new tn3.a(this, 9, 9));
    public final e4m.e v = e4m.b.b(new tn3.a(this, 11, 9));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f276772w = e4m.b.b(new tn3.a(this, 12, 9));

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f276773x = e4m.b.b(new tn3.a(this, 10, 9));

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f276774y = e4m.b.b(new tn3.a(this, 13, 9));
    public final e4m.e z = e4m.b.b(new tn3.a(this, 14, 9));
    public final e4m.e A = e4m.b.b(new tn3.a(this, 15, 9));
    public final e4m.e B = e4m.b.b(new tn3.a(this, 17, 9));
    public final e4m.e C = e4m.b.b(new tn3.a(this, 16, 9));
    public final e4m.e D = e4m.b.b(new tn3.a(this, 18, 9));
    public final e4m.e E = e4m.b.b(new tn3.a(this, 19, 9));

    public b(hri.b bVar, e eVar, th0.a aVar, d dVar, c cVar, m mVar, j jVar, nf0.a aVar2, jq8.a aVar3, co0.a aVar4) {
        this.f276758a = bVar;
        this.f276759b = eVar;
        this.f276760c = cVar;
        this.d = dVar;
        this.e = jVar;
        this.f = mVar;
        this.f276761g = aVar;
        this.f276762h = aVar3;
        this.i = aVar2;
        this.f276763j = aVar4;
    }

    public final t a() {
        return new t((cn.e) this.f276766n.get(), (ym.d) this.f276769r.get(), (um.c) this.o.get(), (ifm.b) this.f276764l.get());
    }

    public final qm.e b() {
        return new qm.e((um.c) this.o.get());
    }

    public final jn.e c() {
        ln.a aVar = (ln.a) this.f276768q.get();
        h hVar = (h) this.f276767p.get();
        g gVarO = this.f276759b.o();
        s.j(gVarO);
        return new jn.e(aVar, hVar, new r(gVarO), ImmutableSet.copyOf((Collection) jn.c.a()));
    }

    @Override // hri.a
    public final iri.j e() {
        return (iri.j) this.f276765m.get();
    }

    @Override // hri.a
    public final ifm.b f() {
        return (ifm.b) this.f276764l.get();
    }
}
