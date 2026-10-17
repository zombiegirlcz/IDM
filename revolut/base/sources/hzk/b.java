package hzk;

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
import um.c;
import vc.s;
import ybl.k;
import ym.d;
import zdl.f;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements hri.a, fri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hri.b f157235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f157236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nf0.a f157237c;
    public final co0.a d;
    public final y e;
    public final f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ite.a f157238g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f157239h = this;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f157240j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f157241l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f157242m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f157243n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f157244p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f157245q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f157246r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f157247s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f157248t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f157249w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f157250x;

    public b(hri.b bVar, e eVar, y yVar, co0.a aVar, nf0.a aVar2, ite.a aVar3, f fVar) {
        this.f157235a = bVar;
        this.f157236b = eVar;
        this.f157237c = aVar2;
        this.d = aVar;
        this.e = yVar;
        this.f = fVar;
        this.f157238g = aVar3;
        int i = 26;
        this.i = e4m.b.b(new gff.a(this, 0, i));
        this.f157240j = e4m.b.b(new gff.a(this, 1, i));
        this.k = e4m.b.b(new gff.a(this, 2, i));
        this.f157241l = e4m.b.b(new gff.a(this, 3, i));
        this.f157242m = e4m.b.b(new gff.a(this, 4, i));
        this.f157243n = e4m.b.b(new gff.a(this, 5, i));
        this.o = e4m.b.b(new gff.a(this, 6, i));
        this.f157244p = e4m.b.b(new gff.a(this, 8, i));
        this.f157245q = e4m.b.b(new gff.a(this, 7, i));
        this.f157246r = e4m.b.b(new gff.a(this, 9, i));
        this.f157247s = e4m.b.b(new gff.a(this, 10, i));
        this.f157248t = e4m.b.b(new gff.a(this, 11, i));
        this.u = e4m.b.b(new gff.a(this, 12, i));
        this.v = e4m.b.b(new gff.a(this, 13, i));
        this.f157249w = e4m.b.b(new gff.a(this, 14, i));
        this.f157250x = e4m.b.b(new gff.a(this, 15, i));
    }

    public final t a() {
        return new t((cn.e) this.f157242m.get(), (d) this.f157246r.get(), (c) this.f157243n.get(), (ifm.b) this.i.get());
    }

    public final qm.e d() {
        return new qm.e((c) this.f157243n.get());
    }

    @Override // hri.a
    public final j e() {
        return (j) this.f157240j.get();
    }

    @Override // hri.a
    public final ifm.b f() {
        return (ifm.b) this.i.get();
    }

    public final g h() {
        t1 t1VarB = ((v) this.e).b();
        k kVarD = this.f.d();
        s.j(kVarD);
        ite.a aVar = this.f157238g;
        gte.a aVarB = aVar.b();
        s.j(aVarB);
        gte.a aVarB2 = aVar.b();
        s.j(aVarB2);
        return new g(t1VarB, kVarD, new myk.b(aVarB, new dkf.a(aVarB2, 2)));
    }

    public final jn.e k() {
        ln.a aVar = (ln.a) this.f157241l.get();
        h hVar = (h) this.o.get();
        t70.g gVarO = this.f157236b.o();
        s.j(gVarO);
        return new jn.e(aVar, hVar, new r(gVarO), ImmutableSet.copyOf((Collection) jn.c.a()));
    }
}
