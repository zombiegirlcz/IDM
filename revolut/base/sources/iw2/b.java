package iw2;

import android.content.Context;
import com.google.common.collect.ImmutableSet;
import da3.j;
import ew2.f;
import ew2.x0;
import fw2.d;
import hn.h;
import java.util.Collection;
import jk3.c;
import jm4.r;
import l70.e;
import t70.g;
import vc.s;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements hri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hri.b f168918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f168919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final th0.a f168920c;
    public final j d;
    public final osb.a e;
    public final xmg.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f168921g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final hcb.a f168922h;
    public final r i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final usg.a f168923j;
    public final d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ite.a f168924l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Context f168925m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b f168926n = this;
    public final e4m.e o = e4m.b.b(new i72.j(this, 0, 25));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f168927p = e4m.b.b(new i72.j(this, 1, 25));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f168928q = e4m.b.b(new i72.j(this, 2, 25));

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f168929r = e4m.b.b(new i72.j(this, 3, 25));

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f168930s = e4m.b.b(new i72.j(this, 4, 25));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f168931t = e4m.b.b(new i72.j(this, 5, 25));
    public final e4m.e u = e4m.b.b(new i72.j(this, 6, 25));
    public final e4m.e v = e4m.b.b(new i72.j(this, 7, 25));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f168932w = e4m.b.b(new i72.j(this, 8, 25));

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f168933x = e4m.b.b(new i72.j(this, 9, 25));

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f168934y = e4m.b.b(new i72.j(this, 10, 25));
    public final e4m.e z = e4m.b.b(new i72.j(this, 11, 25));
    public final e4m.e A = e4m.b.b(new i72.j(this, 12, 25));

    public b(hri.b bVar, osb.a aVar, e eVar, xmg.a aVar2, j jVar, th0.a aVar3, c cVar, d dVar, usg.a aVar4, ite.a aVar5, hcb.a aVar6, r rVar, Context context) {
        this.f168918a = bVar;
        this.f168919b = eVar;
        this.f168920c = aVar3;
        this.d = jVar;
        this.e = aVar;
        this.f = aVar2;
        this.f168921g = cVar;
        this.f168922h = aVar6;
        this.i = rVar;
        this.f168923j = aVar4;
        this.k = dVar;
        this.f168924l = aVar5;
        this.f168925m = context;
    }

    public final x0 a() {
        ln.a aVar = (ln.a) this.u.get();
        g3l.a aVar2 = (g3l.a) this.f168933x.get();
        f fVar = (f) this.f168928q.get();
        l93.f fVarJ = this.d.j();
        s.j(fVarJ);
        return new x0(aVar, aVar2, fVar, fVarJ);
    }

    public final qm.e b() {
        return new qm.e((um.c) this.f168930s.get());
    }

    public final jn.e c() {
        ln.a aVar = (ln.a) this.u.get();
        h hVar = (h) this.f168931t.get();
        g gVarO = this.f168919b.o();
        s.j(gVarO);
        return new jn.e(aVar, hVar, new mp.r(gVarO), ImmutableSet.copyOf((Collection) jn.c.a()));
    }

    @Override // hri.a
    public final iri.j e() {
        return (iri.j) this.f168927p.get();
    }

    @Override // hri.a
    public final ifm.b f() {
        return (ifm.b) this.o.get();
    }
}
