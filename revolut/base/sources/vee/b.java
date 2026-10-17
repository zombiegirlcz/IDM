package vee;

import bq.i;
import com.google.common.collect.ImmutableSet;
import e4m.e;
import fsi.g;
import java.util.Set;
import us6.r2;
import xoi.d;
import xpi.f;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements pee.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f288293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f288294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uce.c f288295c;
    public final c d;
    public final e e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f288296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f288297h;
    public final e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f288298j;
    public final e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f288299l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e f288300m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e f288301n;
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f288302p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f288303q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f288304r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f288305s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f288306t;
    public final e u;
    public final e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e f288307w;

    public b(c cVar, d dVar, f fVar, uce.c cVar2) {
        this.d = cVar;
        this.f288293a = dVar;
        this.f288294b = fVar;
        this.f288295c = cVar2;
        int i = 13;
        this.e = e4m.b.b(new r2(cVar, this, 0, i));
        this.f = e4m.b.b(new r2(cVar, this, 1, i));
        this.f288296g = e4m.b.b(new r2(cVar, this, 3, i));
        this.f288297h = e4m.b.b(new r2(cVar, this, 2, i));
        this.i = e4m.b.b(new r2(cVar, this, 4, i));
        this.f288298j = e4m.b.b(new r2(cVar, this, 5, i));
        this.k = e4m.b.b(new r2(cVar, this, 7, i));
        this.f288299l = e4m.b.b(new r2(cVar, this, 6, i));
        this.f288300m = e4m.b.b(new r2(cVar, this, 8, i));
        this.f288301n = e4m.b.b(new r2(cVar, this, 9, i));
        this.o = e4m.b.b(new r2(cVar, this, 11, i));
        this.f288302p = e4m.b.b(new r2(cVar, this, 10, i));
        this.f288303q = e4m.b.b(new r2(cVar, this, 13, i));
        this.f288304r = e4m.b.b(new r2(cVar, this, 12, i));
        this.f288305s = e4m.b.b(new r2(cVar, this, 14, i));
        this.f288306t = e4m.b.b(new r2(cVar, this, 17, i));
        this.u = e4m.b.b(new r2(cVar, this, 16, i));
        this.v = e4m.b.b(new r2(cVar, this, 18, i));
        this.f288307w = e4m.b.b(new r2(cVar, this, 15, i));
    }

    @Override // gsi.a
    public final yy0.f Q() {
        return i.j(this.f288293a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return i.p(this.f288293a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f288293a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f288293a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f288293a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return i.n(this.f288293a);
    }

    @Override // gsi.h
    public final g a() {
        return this.f288293a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f288293a);
    }

    @Override // gsi.a
    public final ty0.c b0() {
        return i.g(this.f288293a);
    }

    @Override // pee.a
    public final opi.b c() {
        return (opi.b) this.f288300m.get();
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f288293a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f288293a);
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f288293a);
    }

    @Override // pee.a
    public final oee.i f0() {
        return (oee.i) this.f288307w.get();
    }

    @Override // pee.a
    public final nee.b l() {
        return (nee.b) this.f288305s.get();
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(13);
        builderBuilderWithExpectedSize.addAll((Iterable) i.k(this.f288293a));
        builderBuilderWithExpectedSize.add(this.e.get());
        builderBuilderWithExpectedSize.add(this.f.get());
        builderBuilderWithExpectedSize.add(this.f288297h.get());
        builderBuilderWithExpectedSize.add(this.i.get());
        builderBuilderWithExpectedSize.add(this.f288298j.get());
        builderBuilderWithExpectedSize.add(this.f288299l.get());
        builderBuilderWithExpectedSize.add(this.f288300m.get());
        builderBuilderWithExpectedSize.add(this.f288301n.get());
        builderBuilderWithExpectedSize.add(this.f288302p.get());
        builderBuilderWithExpectedSize.add(this.o.get());
        builderBuilderWithExpectedSize.add(this.f288304r.get());
        return j6.a.g(this.f288303q, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f288293a);
    }

    @Override // pee.a
    public final nee.d state() {
        return (nee.d) this.f288306t.get();
    }
}
