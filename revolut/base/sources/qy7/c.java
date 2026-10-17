package qy7;

import com.google.common.collect.ImmutableSet;
import com.google.firebase.messaging.t;
import h08.k;
import hn.h;
import iri.j;
import java.util.Collection;
import mp.r;
import ql7.d2;
import vc.s;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements hri.a, ui3.a, jy7.a {
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
    public final e4m.e M;
    public final e4m.e N;
    public final e4m.e O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hri.b f250187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l70.e f250188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ex7.a f250189c;
    public final xmg.a d;
    public final pqi.a e;
    public final nf0.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f250190g = this;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f250191h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f250192j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f250193l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f250194m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f250195n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f250196p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f250197q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f250198r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f250199s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f250200t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f250201w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f250202x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f250203y;
    public final e4m.e z;

    public c(hri.b bVar, l70.e eVar, nf0.a aVar, ex7.a aVar2, xmg.a aVar3, pqi.a aVar4) {
        this.f250187a = bVar;
        this.f250188b = eVar;
        this.f250189c = aVar2;
        this.d = aVar3;
        this.e = aVar4;
        this.f = aVar;
        int i = 10;
        this.f250191h = e4m.b.b(new d2(this, 0, i));
        this.i = e4m.b.b(new d2(this, 1, i));
        this.f250192j = e4m.b.b(new d2(this, 2, i));
        this.k = e4m.b.b(new d2(this, 5, i));
        this.f250193l = e4m.b.b(new d2(this, 4, i));
        this.f250194m = e4m.b.b(new d2(this, 7, i));
        this.f250195n = e4m.b.b(new d2(this, 6, i));
        this.o = e4m.b.b(new d2(this, 3, i));
        this.f250196p = e4m.b.b(new d2(this, 8, i));
        this.f250197q = e4m.b.b(new d2(this, 9, i));
        this.f250198r = e4m.b.b(new d2(this, 10, i));
        this.f250199s = e4m.b.b(new d2(this, 11, i));
        this.f250200t = e4m.b.b(new d2(this, 12, i));
        this.u = e4m.b.b(new d2(this, 13, i));
        this.v = e4m.b.b(new d2(this, 14, i));
        this.f250201w = e4m.b.b(new d2(this, 16, i));
        this.f250202x = e4m.b.b(new d2(this, 17, i));
        this.f250203y = e4m.b.b(new d2(this, 18, i));
        this.z = e4m.b.b(new d2(this, 15, i));
        this.A = e4m.b.b(new d2(this, 19, i));
        this.B = e4m.b.b(new d2(this, 20, i));
        this.C = e4m.b.b(new d2(this, 21, i));
        this.D = e4m.b.b(new d2(this, 22, i));
        this.E = e4m.b.b(new d2(this, 23, i));
        this.F = e4m.b.b(new d2(this, 24, i));
        this.G = e4m.b.b(new d2(this, 26, i));
        this.H = e4m.b.b(new d2(this, 27, i));
        this.I = e4m.b.b(new d2(this, 28, i));
        this.J = e4m.b.b(new d2(this, 29, i));
        this.K = e4m.b.b(new d2(this, 30, i));
        this.L = e4m.b.b(new d2(this, 31, i));
        this.M = e4m.b.b(new d2(this, 32, i));
        this.N = e4m.b.b(new d2(this, 25, i));
        this.O = e4m.b.b(new d2(this, 33, i));
    }

    @Override // ui3.a
    public final b05.a G() {
        return new b05.a(this.f250190g, 5);
    }

    public final t a() {
        return new t((cn.e) this.u.get(), (ym.d) this.f250203y.get(), (um.c) this.v.get(), (ifm.b) this.f250191h.get());
    }

    @Override // jy7.a
    public final k d() {
        return new k(this.f250190g, 1);
    }

    @Override // hri.a
    public final j e() {
        return (j) this.i.get();
    }

    @Override // hri.a
    public final ifm.b f() {
        return (ifm.b) this.f250191h.get();
    }

    public final qm.e h() {
        return new qm.e((um.c) this.v.get());
    }

    public final jn.e k() {
        ln.a aVar = (ln.a) this.f250198r.get();
        h hVar = (h) this.B.get();
        t70.g gVarO = this.f250188b.o();
        s.j(gVarO);
        return new jn.e(aVar, hVar, new r(gVarO), ImmutableSet.copyOf((Collection) jn.c.a()));
    }
}
