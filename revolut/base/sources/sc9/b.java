package sc9;

import com.google.common.collect.ImmutableSet;
import da3.j;
import hn.h;
import java.util.Collection;
import l70.e;
import mp.r;
import t70.g;
import vc.s;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements hri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hri.b f261679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f261680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f261681c;
    public final th0.a d;
    public final b e = this;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f261682g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f261683h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f261684j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f261685l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f261686m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f261687n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f261688p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f261689q;

    public b(hri.b bVar, e eVar, j jVar, th0.a aVar) {
        this.f261679a = bVar;
        this.f261680b = eVar;
        this.f261681c = jVar;
        this.d = aVar;
        int i = 1;
        this.f = e4m.b.b(new sac.a(this, 0, i));
        this.f261682g = e4m.b.b(new sac.a(this, 1, i));
        this.f261683h = e4m.b.b(new sac.a(this, 2, i));
        this.i = e4m.b.b(new sac.a(this, 3, i));
        this.f261684j = e4m.b.b(new sac.a(this, 4, i));
        this.k = e4m.b.b(new sac.a(this, 5, i));
        this.f261685l = e4m.b.b(new sac.a(this, 6, i));
        this.f261686m = e4m.b.b(new sac.a(this, 7, i));
        this.f261687n = e4m.b.b(new sac.a(this, 8, i));
        this.o = e4m.b.b(new sac.a(this, 9, i));
        this.f261688p = e4m.b.b(new sac.a(this, 10, i));
        this.f261689q = e4m.b.b(new sac.a(this, 11, i));
    }

    public final qm.e a() {
        return new qm.e((um.c) this.k.get());
    }

    public final jn.e b() {
        ln.a aVar = (ln.a) this.i.get();
        h hVar = (h) this.f261685l.get();
        g gVarO = this.f261680b.o();
        s.j(gVarO);
        return new jn.e(aVar, hVar, new r(gVarO), ImmutableSet.copyOf((Collection) jn.c.a()));
    }

    @Override // hri.a
    public final iri.j e() {
        return (iri.j) this.f261682g.get();
    }

    @Override // hri.a
    public final ifm.b f() {
        return (ifm.b) this.f.get();
    }
}
