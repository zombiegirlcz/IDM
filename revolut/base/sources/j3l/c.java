package j3l;

import com.google.common.collect.ImmutableSet;
import hn.h;
import iri.j;
import java.util.Collection;
import mp.r;
import t70.g;
import vc.s;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements hri.a, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hri.b f171240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l70.e f171241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final poi.b f171242c;
    public final c d = this;
    public final e4m.e e = e4m.b.b(new ix5.b(this, 0, 7));
    public final e4m.e f = e4m.b.b(new ix5.b(this, 1, 7));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f171243g = e4m.b.b(new ix5.b(this, 2, 7));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f171244h = e4m.b.b(new ix5.b(this, 3, 7));
    public final e4m.e i = e4m.b.b(new ix5.b(this, 4, 7));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f171245j = e4m.b.b(new ix5.b(this, 5, 7));
    public final e4m.e k = e4m.b.b(new ix5.b(this, 6, 7));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f171246l = e4m.b.b(new ix5.b(this, 7, 7));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f171247m = e4m.b.b(new ix5.b(this, 9, 7));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f171248n = e4m.b.b(new ix5.b(this, 8, 7));
    public final e4m.e o = e4m.b.b(new ix5.b(this, 10, 7));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f171249p = e4m.b.b(new ix5.b(this, 11, 7));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f171250q = e4m.b.b(new ix5.b(this, 12, 7));

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f171251r = e4m.b.b(new ix5.b(this, 13, 7));

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f171252s = e4m.b.b(new ix5.b(this, 14, 7));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f171253t = e4m.b.b(new ix5.b(this, 15, 7));

    public c(hri.b bVar, l70.e eVar, poi.b bVar2) {
        this.f171240a = bVar;
        this.f171241b = eVar;
        this.f171242c = bVar2;
    }

    public final qm.e a() {
        return new qm.e((um.c) this.f171244h.get());
    }

    public final jn.e b() {
        ln.a aVar = (ln.a) this.f171245j.get();
        h hVar = (h) this.i.get();
        g gVarO = this.f171241b.o();
        s.j(gVarO);
        return new jn.e(aVar, hVar, new r(gVarO), ImmutableSet.copyOf((Collection) jn.c.a()));
    }

    @Override // j3l.d
    public final a d() {
        return new a(this.d, 0);
    }

    @Override // hri.a
    public final j e() {
        return (j) this.f.get();
    }

    @Override // hri.a
    public final ifm.b f() {
        return (ifm.b) this.e.get();
    }
}
