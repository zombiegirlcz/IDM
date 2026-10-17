package tyk;

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
import zdl.c;
import zdl.f;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements hri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hri.b f275701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f275702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nf0.a f275703c;
    public final co0.a d;
    public final y e;
    public final f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ite.a f275704g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f275705h;
    public final dmc.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f275706j = this;
    public final e4m.e k = e4m.b.b(new tn3.a(this, 0, 4));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f275707l = e4m.b.b(new tn3.a(this, 1, 4));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f275708m = e4m.b.b(new tn3.a(this, 2, 4));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f275709n = e4m.b.b(new tn3.a(this, 4, 4));
    public final e4m.e o = e4m.b.b(new tn3.a(this, 3, 4));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f275710p = e4m.b.b(new tn3.a(this, 5, 4));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f275711q = e4m.b.b(new tn3.a(this, 6, 4));

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f275712r = e4m.b.b(new tn3.a(this, 7, 4));

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f275713s = e4m.b.b(new tn3.a(this, 8, 4));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f275714t = e4m.b.b(new tn3.a(this, 9, 4));
    public final e4m.e u = e4m.b.b(new tn3.a(this, 10, 4));
    public final e4m.e v = e4m.b.b(new tn3.a(this, 11, 4));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f275715w = e4m.b.b(new tn3.a(this, 12, 4));

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f275716x = e4m.b.b(new tn3.a(this, 13, 4));

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f275717y = e4m.b.b(new tn3.a(this, 14, 4));
    public final e4m.e z = e4m.b.b(new tn3.a(this, 15, 4));

    public b(hri.b bVar, e eVar, y yVar, co0.a aVar, nf0.a aVar2, dmc.a aVar3, f fVar, c cVar, ite.a aVar4) {
        this.f275701a = bVar;
        this.f275702b = eVar;
        this.f275703c = aVar2;
        this.d = aVar;
        this.e = yVar;
        this.f = fVar;
        this.f275704g = aVar4;
        this.f275705h = cVar;
        this.i = aVar3;
    }

    public final t a() {
        return new t((cn.e) this.f275711q.get(), (d) this.f275713s.get(), (um.c) this.f275710p.get(), (ifm.b) this.k.get());
    }

    public final qm.e b() {
        return new qm.e((um.c) this.f275710p.get());
    }

    public final g c() {
        t1 t1VarB = ((v) this.e).b();
        k kVarD = this.f.d();
        s.j(kVarD);
        ite.a aVar = this.f275704g;
        gte.a aVarB = aVar.b();
        s.j(aVarB);
        gte.a aVarB2 = aVar.b();
        s.j(aVarB2);
        return new g(t1VarB, kVarD, new myk.b(aVarB, new dkf.a(aVarB2, 2)));
    }

    public final jn.e d() {
        ln.a aVar = (ln.a) this.f275708m.get();
        h hVar = (h) this.f275712r.get();
        t70.g gVarO = this.f275702b.o();
        s.j(gVarO);
        return new jn.e(aVar, hVar, new r(gVarO), ImmutableSet.copyOf((Collection) jn.c.a()));
    }

    @Override // hri.a
    public final j e() {
        return (j) this.f275707l.get();
    }

    @Override // hri.a
    public final ifm.b f() {
        return (ifm.b) this.k.get();
    }
}
