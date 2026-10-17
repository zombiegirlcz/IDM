package b1l;

import com.google.common.collect.ImmutableSet;
import com.google.firebase.messaging.t;
import f1l.g;
import hn.h;
import iri.j;
import java.util.Collection;
import kl.t1;
import kyk.v;
import kyk.y;
import l70.e;
import mp.r;
import vc.s;
import ybl.k;
import ym.d;
import zdl.f;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements hri.a, fri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hri.b f11825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f11826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nf0.a f11827c;
    public final co0.a d;
    public final y e;
    public final f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ite.a f11828g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f11829h = this;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f11830j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f11831l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f11832m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f11833n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f11834p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f11835q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f11836r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f11837s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f11838t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f11839w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f11840x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f11841y;

    public b(hri.b bVar, e eVar, y yVar, co0.a aVar, nf0.a aVar2, ite.a aVar3, f fVar) {
        this.f11825a = bVar;
        this.f11826b = eVar;
        this.f11827c = aVar2;
        this.d = aVar;
        this.e = yVar;
        this.f = fVar;
        this.f11828g = aVar3;
        int i = 5;
        this.i = e4m.b.b(new aq1.e(this, 0, i));
        this.f11830j = e4m.b.b(new aq1.e(this, 1, i));
        this.k = e4m.b.b(new aq1.e(this, 2, i));
        this.f11831l = e4m.b.b(new aq1.e(this, 3, i));
        this.f11832m = e4m.b.b(new aq1.e(this, 4, i));
        this.f11833n = e4m.b.b(new aq1.e(this, 5, i));
        this.o = e4m.b.b(new aq1.e(this, 6, i));
        this.f11834p = e4m.b.b(new aq1.e(this, 8, i));
        this.f11835q = e4m.b.b(new aq1.e(this, 7, i));
        this.f11836r = e4m.b.b(new aq1.e(this, 9, i));
        this.f11837s = e4m.b.b(new aq1.e(this, 10, i));
        this.f11838t = e4m.b.b(new aq1.e(this, 11, i));
        this.u = e4m.b.b(new aq1.e(this, 12, i));
        this.v = e4m.b.b(new aq1.e(this, 13, i));
        this.f11839w = e4m.b.b(new aq1.e(this, 14, i));
        this.f11840x = e4m.b.b(new aq1.e(this, 15, i));
        this.f11841y = e4m.b.b(new aq1.e(this, 16, i));
    }

    public final t a() {
        return new t((cn.e) this.f11832m.get(), (d) this.f11836r.get(), (um.c) this.f11833n.get(), (ifm.b) this.i.get());
    }

    public final qm.e d() {
        return new qm.e((um.c) this.f11833n.get());
    }

    @Override // hri.a
    public final j e() {
        return (j) this.f11830j.get();
    }

    @Override // hri.a
    public final ifm.b f() {
        return (ifm.b) this.i.get();
    }

    public final g h() {
        t1 t1VarB = ((v) this.e).b();
        k kVarD = this.f.d();
        s.j(kVarD);
        ite.a aVar = this.f11828g;
        gte.a aVarB = aVar.b();
        s.j(aVarB);
        gte.a aVarB2 = aVar.b();
        s.j(aVarB2);
        return new g(t1VarB, kVarD, new myk.b(aVarB, new dkf.a(aVarB2, 2)));
    }

    public final jn.e k() {
        ln.a aVar = (ln.a) this.f11831l.get();
        h hVar = (h) this.o.get();
        t70.g gVarO = this.f11826b.o();
        s.j(gVarO);
        return new jn.e(aVar, hVar, new r(gVarO), ImmutableSet.copyOf((Collection) jn.c.a()));
    }
}
