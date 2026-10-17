package zma;

import com.google.common.collect.ImmutableSet;
import hn.h;
import iri.j;
import java.util.Collection;
import l70.e;
import mp.r;
import t70.g;
import vc.s;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hri.b f323417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f323418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xmg.a f323419c;
    public final nf0.a d;
    public final osb.a e;
    public final co0.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final lqi.a f323420g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f323421h = this;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f323422j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f323423l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f323424m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f323425n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f323426p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f323427q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f323428r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f323429s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f323430t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f323431w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f323432x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f323433y;

    public b(hri.b bVar, xmg.a aVar, co0.a aVar2, e eVar, osb.a aVar3, lqi.a aVar4, nf0.a aVar5) {
        this.f323417a = bVar;
        this.f323418b = eVar;
        this.f323419c = aVar;
        this.d = aVar5;
        this.e = aVar3;
        this.f = aVar2;
        this.f323420g = aVar4;
        int i = 25;
        this.i = e4m.b.b(new yxj.c(this, 0, i));
        this.f323422j = e4m.b.b(new yxj.c(this, 1, i));
        this.k = e4m.b.b(new yxj.c(this, 2, i));
        this.f323423l = e4m.b.b(new yxj.c(this, 3, i));
        this.f323424m = e4m.b.b(new yxj.c(this, 4, i));
        this.f323425n = e4m.b.b(new yxj.c(this, 5, i));
        this.o = e4m.b.b(new yxj.c(this, 6, i));
        this.f323426p = e4m.b.b(new yxj.c(this, 7, i));
        this.f323427q = e4m.b.b(new yxj.c(this, 8, i));
        this.f323428r = e4m.b.b(new yxj.c(this, 9, i));
        this.f323429s = e4m.b.b(new yxj.c(this, 13, i));
        this.f323430t = e4m.b.b(new yxj.c(this, 12, i));
        this.u = e4m.b.b(new yxj.c(this, 14, i));
        this.v = e4m.b.b(new yxj.c(this, 11, i));
        this.f323431w = e4m.b.b(new yxj.c(this, 15, i));
        this.f323432x = e4m.b.b(new yxj.c(this, 16, i));
        this.f323433y = e4m.b.b(new yxj.c(this, 10, i));
    }

    @Override // zma.d
    public final ou5.b a() {
        return new ou5.b(this.f323421h);
    }

    public final qm.e d() {
        return new qm.e((um.c) this.f323423l.get());
    }

    @Override // hri.a
    public final j e() {
        return (j) this.f323422j.get();
    }

    @Override // hri.a
    public final ifm.b f() {
        return (ifm.b) this.i.get();
    }

    public final jn.e h() {
        ln.a aVar = (ln.a) this.f323425n.get();
        h hVar = (h) this.f323424m.get();
        g gVarO = this.f323418b.o();
        s.j(gVarO);
        return new jn.e(aVar, hVar, new r(gVarO), ImmutableSet.copyOf((Collection) jn.c.a()));
    }
}
