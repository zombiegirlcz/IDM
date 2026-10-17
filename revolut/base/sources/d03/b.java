package d03;

import com.google.common.collect.ImmutableSet;
import da3.j;
import hn.h;
import java.util.Collection;
import l70.e;
import mp.r;
import t70.g;
import um.c;
import vc.s;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements hri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hri.b f110302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f110303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f110304c;
    public final b d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f110305g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f110306h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f110307j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f110308l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f110309m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f110310n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f110311p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f110312q;

    public b(hri.b bVar, e eVar, j jVar) {
        this.f110302a = bVar;
        this.f110303b = eVar;
        this.f110304c = jVar;
        int i = 9;
        this.e = e4m.b.b(new cbb.b(this, 0, i));
        this.f = e4m.b.b(new cbb.b(this, 1, i));
        this.f110305g = e4m.b.b(new cbb.b(this, 2, i));
        this.f110306h = e4m.b.b(new cbb.b(this, 3, i));
        this.i = e4m.b.b(new cbb.b(this, 4, i));
        this.f110307j = e4m.b.b(new cbb.b(this, 5, i));
        this.k = e4m.b.b(new cbb.b(this, 6, i));
        this.f110308l = e4m.b.b(new cbb.b(this, 7, i));
        this.f110309m = e4m.b.b(new cbb.b(this, 8, i));
        this.f110310n = e4m.b.b(new cbb.b(this, 9, i));
        this.o = e4m.b.b(new cbb.b(this, 10, i));
        this.f110311p = e4m.b.b(new cbb.b(this, 11, i));
        this.f110312q = e4m.b.b(new cbb.b(this, 12, i));
    }

    public final qm.e a() {
        return new qm.e((c) this.f110307j.get());
    }

    public final jn.e b() {
        ln.a aVar = (ln.a) this.i.get();
        h hVar = (h) this.f110308l.get();
        g gVarO = this.f110303b.o();
        s.j(gVarO);
        return new jn.e(aVar, hVar, new r(gVarO), ImmutableSet.copyOf((Collection) jn.c.a()));
    }

    @Override // hri.a
    public final iri.j e() {
        return (iri.j) this.f.get();
    }

    @Override // hri.a
    public final ifm.b f() {
        return (ifm.b) this.e.get();
    }
}
