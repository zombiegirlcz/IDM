package pma;

import com.google.common.collect.ImmutableSet;
import fma.h;
import iri.j;
import java.util.Collection;
import l70.e;
import mp.r;
import t70.g;
import vc.s;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hri.b f237508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f237509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ula.a f237510c;
    public final h d;
    public final xmg.a e;
    public final nt8.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f237511g = this;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f237512h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f237513j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f237514l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f237515m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f237516n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f237517p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f237518q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f237519r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f237520s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f237521t;
    public final e4m.e u;

    public b(hri.b bVar, e eVar, xmg.a aVar, h hVar, ula.a aVar2, nt8.a aVar3) {
        this.f237508a = bVar;
        this.f237509b = eVar;
        this.f237510c = aVar2;
        this.d = hVar;
        this.e = aVar;
        this.f = aVar3;
        int i = 3;
        this.f237512h = e4m.b.b(new pl1.h(this, 0, i));
        this.i = e4m.b.b(new pl1.h(this, 1, i));
        this.f237513j = e4m.b.b(new pl1.h(this, 2, i));
        this.k = e4m.b.b(new pl1.h(this, 3, i));
        this.f237514l = e4m.b.b(new pl1.h(this, 4, i));
        this.f237515m = e4m.b.b(new pl1.h(this, 5, i));
        this.f237516n = e4m.b.b(new pl1.h(this, 6, i));
        this.o = e4m.b.b(new pl1.h(this, 7, i));
        this.f237517p = e4m.b.b(new pl1.h(this, 8, i));
        this.f237518q = e4m.b.b(new pl1.h(this, 9, i));
        this.f237519r = e4m.b.b(new pl1.h(this, 10, i));
        this.f237520s = e4m.b.b(new pl1.h(this, 11, i));
        this.f237521t = e4m.b.b(new pl1.h(this, 12, i));
        this.u = e4m.b.b(new pl1.h(this, 13, i));
    }

    @Override // pma.d
    public final lal.a a() {
        return new lal.a(this.f237511g);
    }

    public final qm.e b() {
        return new qm.e((um.c) this.f237514l.get());
    }

    public final jn.e c() {
        ln.a aVar = (ln.a) this.f237516n.get();
        hn.h hVar = (hn.h) this.f237515m.get();
        g gVarO = this.f237509b.o();
        s.j(gVarO);
        return new jn.e(aVar, hVar, new r(gVarO), ImmutableSet.copyOf((Collection) jn.c.a()));
    }

    @Override // hri.a
    public final j e() {
        return (j) this.i.get();
    }

    @Override // hri.a
    public final ifm.b f() {
        return (ifm.b) this.f237512h.get();
    }
}
