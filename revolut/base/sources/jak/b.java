package jak;

import com.google.common.collect.ImmutableSet;
import hn.h;
import iri.j;
import java.util.Collection;
import l70.e;
import mp.r;
import t70.g;
import um.c;
import vc.s;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements hri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hri.b f172513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f172514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hak.a f172515c;
    public final xmg.a d;
    public final t2j.a e;
    public final b f = this;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f172516g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f172517h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f172518j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f172519l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f172520m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f172521n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f172522p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f172523q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f172524r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f172525s;

    public b(hri.b bVar, e eVar, t2j.a aVar, hak.a aVar2, xmg.a aVar3) {
        this.f172513a = bVar;
        this.f172514b = eVar;
        this.f172515c = aVar2;
        this.d = aVar3;
        this.e = aVar;
        int i = 12;
        this.f172516g = e4m.b.b(new ix5.b(this, 0, i));
        this.f172517h = e4m.b.b(new ix5.b(this, 1, i));
        this.i = e4m.b.b(new ix5.b(this, 2, i));
        this.f172518j = e4m.b.b(new ix5.b(this, 5, i));
        this.k = e4m.b.b(new ix5.b(this, 6, i));
        this.f172519l = e4m.b.b(new ix5.b(this, 7, i));
        this.f172520m = e4m.b.b(new ix5.b(this, 4, i));
        this.f172521n = e4m.b.b(new ix5.b(this, 3, i));
        this.o = e4m.b.b(new ix5.b(this, 8, i));
        this.f172522p = e4m.b.b(new ix5.b(this, 9, i));
        this.f172523q = e4m.b.b(new ix5.b(this, 10, i));
        this.f172524r = e4m.b.b(new ix5.b(this, 11, i));
        this.f172525s = e4m.b.b(new ix5.b(this, 12, i));
    }

    public final qm.e a() {
        return new qm.e((c) this.f172519l.get());
    }

    public final jn.e b() {
        ln.a aVar = (ln.a) this.o.get();
        h hVar = (h) this.f172522p.get();
        g gVarO = this.f172514b.o();
        s.j(gVarO);
        return new jn.e(aVar, hVar, new r(gVarO), ImmutableSet.copyOf((Collection) jn.c.a()));
    }

    @Override // hri.a
    public final j e() {
        return (j) this.f172517h.get();
    }

    @Override // hri.a
    public final ifm.b f() {
        return (ifm.b) this.f172516g.get();
    }
}
