package h08;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends jy7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fsi.g f148319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xpi.f f148320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f148321c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f148322g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f148323h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f148324j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f148325l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f148326m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f148327n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f148328p;

    public l(h hVar, xoi.d dVar, xpi.f fVar) {
        this.f148321c = hVar;
        this.f148319a = dVar;
        this.f148320b = fVar;
        int i = 3;
        this.d = e4m.b.b(new e(hVar, this, 0, i));
        this.e = e4m.b.b(new e(hVar, this, 1, i));
        this.f = e4m.b.b(new e(hVar, this, 3, i));
        this.f148322g = e4m.b.b(new e(hVar, this, 2, i));
        this.f148323h = e4m.b.b(new e(hVar, this, 4, i));
        this.i = e4m.b.b(new e(hVar, this, 5, i));
        this.f148324j = e4m.b.b(new e(hVar, this, 7, i));
        this.k = e4m.b.b(new e(hVar, this, 6, i));
        this.f148325l = e4m.b.b(new e(hVar, this, 8, i));
        this.f148326m = e4m.b.b(new e(hVar, this, 9, i));
        this.f148327n = e4m.b.b(new e(hVar, this, 10, i));
        this.o = e4m.b.b(new e(hVar, this, 12, i));
        this.f148328p = e4m.b.b(new e(hVar, this, 11, i));
    }

    @Override // gsi.a
    public final yy0.f Q() {
        return bq.i.j(this.f148319a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return bq.i.p(this.f148319a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f148319a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f148319a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f148319a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return bq.i.n(this.f148319a);
    }

    @Override // gsi.h
    public final fsi.g a() {
        return this.f148319a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f148319a);
    }

    @Override // gsi.a
    public final ty0.c b0() {
        return bq.i.g(this.f148319a);
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f148319a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f148319a);
    }

    @Override // jy7.b
    public final hy7.i e() {
        return (hy7.i) this.f148328p.get();
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f148319a);
    }

    @Override // jy7.b
    public final hy7.c f() {
        return (hy7.c) this.f148321c.k.get();
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(10);
        builderBuilderWithExpectedSize.addAll((Iterable) bq.i.k(this.f148319a));
        builderBuilderWithExpectedSize.add(this.d.get());
        builderBuilderWithExpectedSize.add(this.e.get());
        builderBuilderWithExpectedSize.add(this.f148322g.get());
        builderBuilderWithExpectedSize.add(this.f148323h.get());
        builderBuilderWithExpectedSize.add(this.i.get());
        builderBuilderWithExpectedSize.add(this.k.get());
        builderBuilderWithExpectedSize.add(this.f148325l.get());
        builderBuilderWithExpectedSize.add(this.f148326m.get());
        return j6.a.g(this.f148327n, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f148319a);
    }
}
