package vzc;

import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import mp.r;
import vc.s;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements hri.a, ui3.a {
    public final e4m.e A;
    public final e4m.e B;
    public final e4m.e C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hri.b f293449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l70.e f293450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sd0.c f293451c;
    public final fzc.a d;
    public final jza.a e;
    public final jxc.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final nf0.a f293452g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final co0.a f293453h;
    public final b i = this;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f293454j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f293455l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f293456m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f293457n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f293458p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f293459q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f293460r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f293461s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f293462t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f293463w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f293464x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f293465y;
    public final e4m.e z;

    public b(hri.b bVar, sd0.c cVar, jxc.a aVar, l70.e eVar, fzc.a aVar2, jza.a aVar3, nf0.a aVar4, co0.a aVar5) {
        this.f293449a = bVar;
        this.f293450b = eVar;
        this.f293451c = cVar;
        this.d = aVar2;
        this.e = aVar3;
        this.f = aVar;
        this.f293452g = aVar4;
        this.f293453h = aVar5;
        int i = 1;
        this.f293454j = e4m.b.b(new vy9.a(this, 0, i));
        this.k = e4m.b.b(new vy9.a(this, 1, i));
        this.f293455l = e4m.b.b(new vy9.a(this, 2, i));
        this.f293456m = e4m.b.b(new vy9.a(this, 5, i));
        this.f293457n = e4m.b.b(new vy9.a(this, 4, i));
        this.o = e4m.b.b(new vy9.a(this, 3, i));
        this.f293458p = e4m.b.b(new vy9.a(this, 6, i));
        this.f293459q = e4m.b.b(new vy9.a(this, 7, i));
        this.f293460r = e4m.b.b(new vy9.a(this, 8, i));
        this.f293461s = e4m.b.b(new vy9.a(this, 9, i));
        this.f293462t = e4m.b.b(new vy9.a(this, 10, i));
        this.u = e4m.b.b(new vy9.a(this, 11, i));
        this.v = e4m.b.b(new vy9.a(this, 12, i));
        this.f293463w = e4m.b.b(new vy9.a(this, 13, i));
        this.f293464x = e4m.b.b(new vy9.a(this, 14, i));
        this.f293465y = e4m.b.b(new vy9.a(this, 15, i));
        this.z = e4m.b.b(new vy9.a(this, 16, i));
        this.A = e4m.b.b(new vy9.a(this, 17, i));
        this.B = e4m.b.b(new vy9.a(this, 19, i));
        this.C = e4m.b.b(new vy9.a(this, 18, i));
    }

    @Override // ui3.a
    public final b05.a G() {
        return new b05.a(this.i, 8);
    }

    public final qm.e a() {
        return new qm.e((um.c) this.f293460r.get());
    }

    public final jn.e d() {
        ln.a aVar = (ln.a) this.f293462t.get();
        hn.h hVar = (hn.h) this.f293461s.get();
        t70.g gVarO = this.f293450b.o();
        s.j(gVarO);
        return new jn.e(aVar, hVar, new r(gVarO), ImmutableSet.copyOf((Collection) jn.c.a()));
    }

    @Override // hri.a
    public final iri.j e() {
        return (iri.j) this.k.get();
    }

    @Override // hri.a
    public final ifm.b f() {
        return (ifm.b) this.f293454j.get();
    }
}
