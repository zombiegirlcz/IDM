package hjg;

import com.google.common.collect.ImmutableSet;
import hn.h;
import iri.j;
import java.util.Collection;
import l70.e;
import mp.r;
import t70.g;
import vc.s;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements hri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hri.b f152805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f152806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ejg.b f152807c;
    public final osb.a d;
    public final djf.c e;
    public final d f = this;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f152808g = e4m.b.b(new gff.a(this, 0, 19));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f152809h = e4m.b.b(new gff.a(this, 1, 19));
    public final e4m.e i = e4m.b.b(new gff.a(this, 2, 19));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f152810j = e4m.b.b(new gff.a(this, 3, 19));
    public final e4m.e k = e4m.b.b(new gff.a(this, 4, 19));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f152811l = e4m.b.b(new gff.a(this, 5, 19));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f152812m = e4m.b.b(new gff.a(this, 6, 19));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f152813n = e4m.b.b(new gff.a(this, 7, 19));
    public final e4m.e o = e4m.b.b(new gff.a(this, 8, 19));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f152814p = e4m.b.b(new gff.a(this, 9, 19));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f152815q = e4m.b.b(new gff.a(this, 10, 19));

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f152816r = e4m.b.b(new gff.a(this, 11, 19));

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f152817s = e4m.b.b(new gff.a(this, 12, 19));

    public d(hri.b bVar, ejg.b bVar2, osb.a aVar, e eVar, djf.c cVar) {
        this.f152805a = bVar;
        this.f152806b = eVar;
        this.f152807c = bVar2;
        this.d = aVar;
        this.e = cVar;
    }

    public final qm.e a() {
        return new qm.e((um.c) this.f152810j.get());
    }

    public final jn.e b() {
        ln.a aVar = (ln.a) this.f152811l.get();
        h hVar = (h) this.k.get();
        g gVarO = this.f152806b.o();
        s.j(gVarO);
        return new jn.e(aVar, hVar, new r(gVarO), ImmutableSet.copyOf((Collection) jn.c.a()));
    }

    @Override // hri.a
    public final j e() {
        return (j) this.f152809h.get();
    }

    @Override // hri.a
    public final ifm.b f() {
        return (ifm.b) this.f152808g.get();
    }
}
