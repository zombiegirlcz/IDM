package h08;

import com.google.common.collect.ImmutableSet;
import g9g.e0;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements gsi.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xoi.d f148212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f148213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f148214c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f148215g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f148216h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f148217j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f148218l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f148219m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f148220n;
    public final e4m.e o;

    public b(h hVar, xoi.d dVar) {
        xpi.e eVar = xpi.f.Companion;
        this.f148213b = hVar;
        this.f148212a = dVar;
        this.f148214c = e4m.b.b(new e0(hVar, this, 0, 27));
        this.d = e4m.b.b(new e0(hVar, this, 1, 27));
        this.e = e4m.b.b(new e0(hVar, this, 3, 27));
        this.f = e4m.b.b(new e0(hVar, this, 2, 27));
        this.f148215g = e4m.b.b(new e0(hVar, this, 4, 27));
        this.f148216h = e4m.b.b(new e0(hVar, this, 5, 27));
        this.i = e4m.b.b(new e0(hVar, this, 7, 27));
        this.f148217j = e4m.b.b(new e0(hVar, this, 6, 27));
        this.k = e4m.b.b(new e0(hVar, this, 8, 27));
        this.f148218l = e4m.b.b(new e0(hVar, this, 9, 27));
        this.f148219m = e4m.b.b(new e0(hVar, this, 10, 27));
        this.f148220n = e4m.b.b(new e0(hVar, this, 12, 27));
        this.o = e4m.b.b(new e0(hVar, this, 11, 27));
    }

    @Override // gsi.a
    public final yy0.f Q() {
        return bq.i.j(this.f148212a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return bq.i.p(this.f148212a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f148212a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f148212a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f148212a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return bq.i.n(this.f148212a);
    }

    @Override // gsi.h
    public final fsi.g a() {
        return this.f148212a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f148212a);
    }

    @Override // gsi.a
    public final ty0.c b0() {
        return bq.i.g(this.f148212a);
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f148212a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f148212a);
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f148212a);
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(10);
        builderBuilderWithExpectedSize.addAll((Iterable) bq.i.k(this.f148212a));
        builderBuilderWithExpectedSize.add(this.f148214c.get());
        builderBuilderWithExpectedSize.add(this.d.get());
        builderBuilderWithExpectedSize.add(this.f.get());
        builderBuilderWithExpectedSize.add(this.f148215g.get());
        builderBuilderWithExpectedSize.add(this.f148216h.get());
        builderBuilderWithExpectedSize.add(this.f148217j.get());
        builderBuilderWithExpectedSize.add(this.k.get());
        builderBuilderWithExpectedSize.add(this.f148218l.get());
        return j6.a.g(this.f148219m, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f148212a);
    }
}
