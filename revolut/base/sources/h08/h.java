package h08;

import com.google.common.collect.ImmutableSet;
import com.google.firebase.messaging.t;
import java.util.Collection;
import mp.r;
import vc.s;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements hri.a, jy7.a, jz7.a {
    public final e4m.e A;
    public final e4m.e B;
    public final e4m.e C;
    public final e4m.e D;
    public final e4m.e E;
    public final e4m.e F;
    public final e4m.e G;
    public final e4m.e H;
    public final e4m.e I;
    public final e4m.e J;
    public final e4m.e K;
    public final e4m.e L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hri.b f148279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l70.e f148280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ex7.a f148281c;
    public final xmg.a d;
    public final q8b.a e;
    public final pqi.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final shi.a f148282g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f148283h = this;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f148284j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f148285l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f148286m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f148287n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f148288p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f148289q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f148290r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f148291s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f148292t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f148293w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f148294x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f148295y;
    public final e4m.e z;

    public h(hri.b bVar, l70.e eVar, ex7.a aVar, xmg.a aVar2, q8b.a aVar3, pqi.a aVar4, shi.a aVar5) {
        this.f148279a = bVar;
        this.f148280b = eVar;
        this.f148281c = aVar;
        this.d = aVar2;
        this.e = aVar3;
        this.f = aVar4;
        this.f148282g = aVar5;
        int i = 6;
        this.i = e4m.b.b(new gff.a(this, 0, i));
        this.f148284j = e4m.b.b(new gff.a(this, 1, i));
        this.k = e4m.b.b(new gff.a(this, 2, i));
        this.f148285l = e4m.b.b(new gff.a(this, 3, i));
        this.f148286m = e4m.b.b(new gff.a(this, 4, i));
        this.f148287n = e4m.b.b(new gff.a(this, 5, i));
        this.o = e4m.b.b(new gff.a(this, 6, i));
        this.f148288p = e4m.b.b(new gff.a(this, 7, i));
        this.f148289q = e4m.b.b(new gff.a(this, 8, i));
        this.f148290r = e4m.b.b(new gff.a(this, 10, i));
        this.f148291s = e4m.b.b(new gff.a(this, 11, i));
        this.f148292t = e4m.b.b(new gff.a(this, 9, i));
        this.u = e4m.b.b(new gff.a(this, 12, i));
        this.v = e4m.b.b(new gff.a(this, 13, i));
        this.f148293w = e4m.b.b(new gff.a(this, 14, i));
        this.f148294x = e4m.b.b(new gff.a(this, 16, i));
        this.f148295y = e4m.b.b(new gff.a(this, 15, i));
        this.z = e4m.b.b(new gff.a(this, 18, i));
        this.A = e4m.b.b(new gff.a(this, 20, i));
        this.B = e4m.b.b(new gff.a(this, 19, i));
        this.C = e4m.b.b(new gff.a(this, 17, i));
        this.D = e4m.b.b(new gff.a(this, 21, i));
        this.E = e4m.b.b(new gff.a(this, 22, i));
        this.F = e4m.b.b(new gff.a(this, 23, i));
        this.G = e4m.b.b(new gff.a(this, 24, i));
        this.H = e4m.b.b(new gff.a(this, 25, i));
        this.I = e4m.b.b(new gff.a(this, 26, i));
        this.J = e4m.b.b(new gff.a(this, 27, i));
        this.K = e4m.b.b(new gff.a(this, 28, i));
        this.L = e4m.b.b(new gff.a(this, 29, i));
    }

    @Override // jz7.a
    public final i a() {
        return new i(this.f148283h, 0);
    }

    public final t b() {
        return new t((cn.e) this.o.get(), (ym.d) this.f148291s.get(), (um.c) this.f148288p.get(), (ifm.b) this.i.get());
    }

    public final jn.a c() {
        hn.h hVar = (hn.h) this.f148289q.get();
        t70.g gVarO = this.f148280b.o();
        s.j(gVarO);
        return new jn.a(hVar, gVarO);
    }

    @Override // jy7.a
    public final k d() {
        return new k(this.f148283h, 0);
    }

    @Override // hri.a
    public final iri.j e() {
        return (iri.j) this.f148284j.get();
    }

    @Override // hri.a
    public final ifm.b f() {
        return (ifm.b) this.i.get();
    }

    public final qm.e h() {
        return new qm.e((um.c) this.f148288p.get());
    }

    public final jn.e i() {
        ln.a aVar = (ln.a) this.f148285l.get();
        hn.h hVar = (hn.h) this.f148289q.get();
        t70.g gVarO = this.f148280b.o();
        s.j(gVarO);
        return new jn.e(aVar, hVar, new r(gVarO), ImmutableSet.copyOf((Collection) jn.c.a()));
    }
}
