package abb;

import com.google.common.collect.ImmutableSet;
import hn.h;
import iri.j;
import java.util.Collection;
import mp.r;
import vc.s;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements hri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hri.b f2893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l70.e f2894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jk3.c f2895c;
    public final jm0.a d;
    public final osb.a e;
    public final nj0.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c21.e f2896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final xmg.a f2897h;
    public final wk3.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final an0.c f2898j;
    public final a k = this;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f2899l = e4m.b.b(new a1e.a(this, 0, 4));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f2900m = e4m.b.b(new a1e.a(this, 1, 4));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f2901n = e4m.b.b(new a1e.a(this, 2, 4));
    public final e4m.e o = e4m.b.b(new a1e.a(this, 3, 4));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f2902p = e4m.b.b(new a1e.a(this, 4, 4));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f2903q = e4m.b.b(new a1e.a(this, 5, 4));

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f2904r = e4m.b.b(new a1e.a(this, 6, 4));

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f2905s = e4m.b.b(new a1e.a(this, 7, 4));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f2906t = e4m.b.b(new a1e.a(this, 8, 4));
    public final e4m.e u = e4m.b.b(new a1e.a(this, 9, 4));
    public final e4m.e v = e4m.b.b(new a1e.a(this, 10, 4));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f2907w = e4m.b.b(new a1e.a(this, 12, 4));

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f2908x = e4m.b.b(new a1e.a(this, 11, 4));

    public a(hri.b bVar, xmg.a aVar, wk3.a aVar2, l70.e eVar, c21.e eVar2, an0.c cVar, jm0.a aVar3, jk3.c cVar2, nj0.a aVar4, osb.a aVar5) {
        this.f2893a = bVar;
        this.f2894b = eVar;
        this.f2895c = cVar2;
        this.d = aVar3;
        this.e = aVar5;
        this.f = aVar4;
        this.f2896g = eVar2;
        this.f2897h = aVar;
        this.i = aVar2;
        this.f2898j = cVar;
    }

    public final qm.e a() {
        return new qm.e((um.c) this.o.get());
    }

    public final jn.e b() {
        ln.a aVar = (ln.a) this.f2903q.get();
        h hVar = (h) this.f2902p.get();
        t70.g gVarO = this.f2894b.o();
        s.j(gVarO);
        return new jn.e(aVar, hVar, new r(gVarO), ImmutableSet.copyOf((Collection) jn.c.a()));
    }

    @Override // hri.a
    public final j e() {
        return (j) this.f2900m.get();
    }

    @Override // hri.a
    public final ifm.b f() {
        return (ifm.b) this.f2899l.get();
    }
}
