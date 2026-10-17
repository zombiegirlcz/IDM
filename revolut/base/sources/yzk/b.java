package yzk;

import com.google.common.collect.ImmutableSet;
import com.google.firebase.messaging.t;
import e4m.g;
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
import zdl.f;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements hri.a, fri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hri.b f318133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f318134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nf0.a f318135c;
    public final co0.a d;
    public final y e;
    public final f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ite.a f318136g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f318137h = this;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f318138j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f318139l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f318140m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f318141n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f318142p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f318143q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f318144r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f318145s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f318146t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f318147w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f318148x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f318149y;
    public final e4m.e z;

    public b(hri.b bVar, e eVar, y yVar, co0.a aVar, nf0.a aVar2, ite.a aVar3, f fVar) {
        this.f318133a = bVar;
        this.f318134b = eVar;
        this.f318135c = aVar2;
        this.d = aVar;
        this.e = yVar;
        this.f = fVar;
        this.f318136g = aVar3;
        int i = 2;
        this.i = e4m.b.b(new yxj.c(this, 0, i));
        this.f318138j = e4m.b.b(new yxj.c(this, 1, i));
        this.k = e4m.b.b(new yxj.c(this, 2, i));
        this.f318139l = e4m.b.b(new yxj.c(this, 3, i));
        this.f318140m = e4m.b.b(new yxj.c(this, 4, i));
        this.f318141n = e4m.b.b(new yxj.c(this, 5, i));
        this.o = e4m.b.b(new yxj.c(this, 6, i));
        this.f318142p = e4m.b.b(new yxj.c(this, 8, i));
        this.f318143q = e4m.b.b(new yxj.c(this, 7, i));
        this.f318144r = e4m.b.b(new yxj.c(this, 9, i));
        this.f318145s = e4m.b.b(new yxj.c(this, 10, i));
        this.f318146t = e4m.b.b(new yxj.c(this, 11, i));
        this.u = e4m.b.b(new yxj.c(this, 12, i));
        this.v = e4m.b.b(new yxj.c(this, 13, i));
        this.f318147w = e4m.b.b(new yxj.c(this, 14, i));
        this.f318148x = g.a(new yxj.c(this, 16, i));
        this.f318149y = e4m.b.b(new yxj.c(this, 15, i));
        this.z = e4m.b.b(new yxj.c(this, 17, i));
    }

    public final t a() {
        return new t((cn.e) this.f318140m.get(), (ym.d) this.f318144r.get(), (um.c) this.f318141n.get(), (ifm.b) this.i.get());
    }

    public final qm.e d() {
        return new qm.e((um.c) this.f318141n.get());
    }

    @Override // hri.a
    public final j e() {
        return (j) this.f318138j.get();
    }

    @Override // hri.a
    public final ifm.b f() {
        return (ifm.b) this.i.get();
    }

    public final f1l.g h() {
        t1 t1VarB = ((v) this.e).b();
        k kVarD = this.f.d();
        s.j(kVarD);
        ite.a aVar = this.f318136g;
        gte.a aVarB = aVar.b();
        s.j(aVarB);
        gte.a aVarB2 = aVar.b();
        s.j(aVarB2);
        return new f1l.g(t1VarB, kVarD, new myk.b(aVarB, new dkf.a(aVarB2, 2)));
    }

    public final jn.e k() {
        ln.a aVar = (ln.a) this.f318139l.get();
        h hVar = (h) this.o.get();
        t70.g gVarO = this.f318134b.o();
        s.j(gVarO);
        return new jn.e(aVar, hVar, new r(gVarO), ImmutableSet.copyOf((Collection) jn.c.a()));
    }
}
