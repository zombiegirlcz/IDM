package zz7;

import com.google.common.collect.ImmutableSet;
import com.google.firebase.messaging.t;
import h08.k;
import hn.h;
import iri.j;
import java.util.Collection;
import t70.g;
import uz7.r;
import vc.s;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements hri.a, jy7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hri.b f326543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l70.e f326544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ex7.a f326545c;
    public final shi.a d;
    public final nf0.a e;
    public final c f = this;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f326546g = e4m.b.b(new ztg.e(this, 0, 5));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f326547h = e4m.b.b(new ztg.e(this, 1, 5));
    public final e4m.e i = e4m.b.b(new ztg.e(this, 2, 5));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f326548j = e4m.b.b(new ztg.e(this, 3, 5));
    public final e4m.e k = e4m.b.b(new ztg.e(this, 4, 5));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f326549l = e4m.b.b(new ztg.e(this, 5, 5));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f326550m = e4m.b.b(new ztg.e(this, 6, 5));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f326551n = e4m.b.b(new ztg.e(this, 8, 5));
    public final e4m.e o = e4m.b.b(new ztg.e(this, 9, 5));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f326552p = e4m.b.b(new ztg.e(this, 10, 5));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f326553q = e4m.b.b(new ztg.e(this, 11, 5));

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f326554r = e4m.b.b(new ztg.e(this, 7, 5));

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f326555s = e4m.b.b(new ztg.e(this, 13, 5));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f326556t = e4m.b.b(new ztg.e(this, 15, 5));
    public final e4m.e u = e4m.b.b(new ztg.e(this, 16, 5));
    public final e4m.e v = e4m.b.b(new ztg.e(this, 14, 5));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f326557w = e4m.b.b(new ztg.e(this, 17, 5));

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f326558x = e4m.b.b(new ztg.e(this, 12, 5));

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f326559y = e4m.b.b(new ztg.e(this, 18, 5));
    public final e4m.e z = e4m.b.b(new ztg.e(this, 19, 5));
    public final e4m.e A = e4m.b.b(new ztg.e(this, 20, 5));
    public final e4m.e B = e4m.b.b(new ztg.e(this, 21, 5));
    public final e4m.e C = e4m.b.b(new ztg.e(this, 22, 5));
    public final e4m.e D = e4m.b.b(new ztg.e(this, 23, 5));
    public final e4m.e E = e4m.b.b(new ztg.e(this, 24, 5));

    public c(hri.b bVar, l70.e eVar, nf0.a aVar, ex7.a aVar2, shi.a aVar3) {
        this.f326543a = bVar;
        this.f326544b = eVar;
        this.f326545c = aVar2;
        this.d = aVar3;
        this.e = aVar;
    }

    public final t a() {
        return new t((cn.e) this.o.get(), (ym.d) this.f326552p.get(), (um.c) this.f326553q.get(), (ifm.b) this.f326546g.get());
    }

    public final r b() {
        return new r((fy7.e) this.f326550m.get());
    }

    public final qm.e c() {
        return new qm.e((um.c) this.f326553q.get());
    }

    @Override // jy7.a
    public final k d() {
        return new k(this.f, 2);
    }

    @Override // hri.a
    public final j e() {
        return (j) this.f326547h.get();
    }

    @Override // hri.a
    public final ifm.b f() {
        return (ifm.b) this.f326546g.get();
    }

    public final jn.e h() {
        ln.a aVar = (ln.a) this.f326548j.get();
        h hVar = (h) this.f326559y.get();
        g gVarO = this.f326544b.o();
        s.j(gVarO);
        return new jn.e(aVar, hVar, new mp.r(gVarO), ImmutableSet.copyOf((Collection) jn.c.a()));
    }
}
