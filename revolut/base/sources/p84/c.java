package p84;

import com.google.common.collect.ImmutableSet;
import hn.h;
import iri.j;
import java.util.Collection;
import l70.e;
import mp.r;
import p12.s0;
import t70.g;
import vc.s;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements hri.a, fri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hri.b f233845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f233846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uq3.b f233847c;
    public final dw3.e d;
    public final pqi.a e;
    public final nj0.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f233848g = this;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f233849h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f233850j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f233851l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f233852m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f233853n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f233854p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f233855q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f233856r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f233857s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f233858t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f233859w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f233860x;

    public c(hri.b bVar, e eVar, nj0.a aVar, pqi.a aVar2, uq3.b bVar2, dw3.e eVar2) {
        this.f233845a = bVar;
        this.f233846b = eVar;
        this.f233847c = bVar2;
        this.d = eVar2;
        this.e = aVar2;
        this.f = aVar;
        int i = 15;
        this.f233849h = e4m.b.b(new s0(this, 0, i));
        this.i = e4m.b.b(new s0(this, 1, i));
        this.f233850j = e4m.b.b(new s0(this, 2, i));
        this.k = e4m.b.b(new s0(this, 3, i));
        this.f233851l = e4m.b.b(new s0(this, 4, i));
        this.f233852m = e4m.b.b(new s0(this, 5, i));
        this.f233853n = e4m.b.b(new s0(this, 6, i));
        this.o = e4m.b.b(new s0(this, 7, i));
        this.f233854p = e4m.b.b(new s0(this, 8, i));
        this.f233855q = e4m.b.b(new s0(this, 9, i));
        this.f233856r = e4m.b.b(new s0(this, 10, i));
        this.f233857s = e4m.b.b(new s0(this, 11, i));
        this.f233858t = e4m.b.b(new s0(this, 12, i));
        this.u = e4m.b.b(new s0(this, 14, i));
        this.v = e4m.b.b(new s0(this, 13, i));
        this.f233859w = e4m.b.b(new s0(this, 15, i));
        this.f233860x = e4m.b.b(new s0(this, 16, i));
    }

    public final qm.e a() {
        return new qm.e((um.c) this.k.get());
    }

    public final jn.e d() {
        ln.a aVar = (ln.a) this.f233852m.get();
        h hVar = (h) this.f233851l.get();
        g gVarO = this.f233846b.o();
        s.j(gVarO);
        return new jn.e(aVar, hVar, new r(gVarO), ImmutableSet.copyOf((Collection) jn.c.a()));
    }

    @Override // hri.a
    public final j e() {
        return (j) this.i.get();
    }

    @Override // hri.a
    public final ifm.b f() {
        return (ifm.b) this.f233849h.get();
    }
}
