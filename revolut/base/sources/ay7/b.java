package ay7;

import com.google.common.collect.ImmutableSet;
import com.google.firebase.messaging.t;
import hn.h;
import iri.j;
import java.util.Collection;
import l70.e;
import mp.r;
import t70.g;
import vc.s;
import ym.d;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements hri.a, fri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hri.b f11091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f11092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ex7.a f11093c;
    public final b d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f11094g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f11095h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f11096j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f11097l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f11098m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f11099n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f11100p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f11101q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f11102r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f11103s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f11104t;
    public final e4m.e u;
    public final e4m.e v;

    public b(hri.b bVar, e eVar, ex7.a aVar) {
        this.f11091a = bVar;
        this.f11092b = eVar;
        this.f11093c = aVar;
        int i = 3;
        this.e = e4m.b.b(new aq1.e(this, 0, i));
        this.f = e4m.b.b(new aq1.e(this, 1, i));
        this.f11094g = e4m.b.b(new aq1.e(this, 2, i));
        this.f11095h = e4m.b.b(new aq1.e(this, 3, i));
        this.i = e4m.b.b(new aq1.e(this, 4, i));
        this.f11096j = e4m.b.b(new aq1.e(this, 5, i));
        this.k = e4m.b.b(new aq1.e(this, 6, i));
        this.f11097l = e4m.b.b(new aq1.e(this, 7, i));
        this.f11098m = e4m.b.b(new aq1.e(this, 8, i));
        this.f11099n = e4m.b.b(new aq1.e(this, 9, i));
        this.o = e4m.b.b(new aq1.e(this, 11, i));
        this.f11100p = e4m.b.b(new aq1.e(this, 10, i));
        this.f11101q = e4m.b.b(new aq1.e(this, 12, i));
        this.f11102r = e4m.b.b(new aq1.e(this, 14, i));
        this.f11103s = e4m.b.b(new aq1.e(this, 13, i));
        this.f11104t = e4m.b.b(new aq1.e(this, 15, i));
        this.u = e4m.b.b(new aq1.e(this, 16, i));
        this.v = e4m.b.b(new aq1.e(this, 17, i));
    }

    public final t a() {
        return new t((cn.e) this.i.get(), (d) this.f11098m.get(), (um.c) this.f11096j.get(), (ifm.b) this.e.get());
    }

    public final qm.e d() {
        return new qm.e((um.c) this.f11096j.get());
    }

    @Override // hri.a
    public final j e() {
        return (j) this.f.get();
    }

    @Override // hri.a
    public final ifm.b f() {
        return (ifm.b) this.e.get();
    }

    public final jn.e h() {
        ln.a aVar = (ln.a) this.f11097l.get();
        h hVar = (h) this.k.get();
        g gVarO = this.f11092b.o();
        s.j(gVarO);
        return new jn.e(aVar, hVar, new r(gVarO), ImmutableSet.copyOf((Collection) jn.c.a()));
    }
}
