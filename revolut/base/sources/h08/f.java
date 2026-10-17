package h08;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements gsi.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xoi.d f148253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f148254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f148255c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f148256g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f148257h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f148258j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f148259l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f148260m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f148261n;
    public final e4m.e o;

    public f(h hVar, xoi.d dVar) {
        xpi.e eVar = xpi.f.Companion;
        this.f148254b = hVar;
        this.f148253a = dVar;
        this.f148255c = e4m.b.b(new e(hVar, this, 0, 0));
        this.d = e4m.b.b(new e(hVar, this, 1, 0));
        this.e = e4m.b.b(new e(hVar, this, 3, 0));
        this.f = e4m.b.b(new e(hVar, this, 2, 0));
        this.f148256g = e4m.b.b(new e(hVar, this, 4, 0));
        this.f148257h = e4m.b.b(new e(hVar, this, 5, 0));
        this.i = e4m.b.b(new e(hVar, this, 7, 0));
        this.f148258j = e4m.b.b(new e(hVar, this, 6, 0));
        this.k = e4m.b.b(new e(hVar, this, 8, 0));
        this.f148259l = e4m.b.b(new e(hVar, this, 9, 0));
        this.f148260m = e4m.b.b(new e(hVar, this, 10, 0));
        this.f148261n = e4m.b.b(new e(hVar, this, 12, 0));
        this.o = e4m.b.b(new e(hVar, this, 11, 0));
    }

    @Override // gsi.a
    public final yy0.f Q() {
        return bq.i.j(this.f148253a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return bq.i.p(this.f148253a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f148253a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f148253a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f148253a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return bq.i.n(this.f148253a);
    }

    @Override // gsi.h
    public final fsi.g a() {
        return this.f148253a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f148253a);
    }

    @Override // gsi.a
    public final ty0.c b0() {
        return bq.i.g(this.f148253a);
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f148253a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f148253a);
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f148253a);
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(10);
        builderBuilderWithExpectedSize.addAll((Iterable) bq.i.k(this.f148253a));
        builderBuilderWithExpectedSize.add(this.f148255c.get());
        builderBuilderWithExpectedSize.add(this.d.get());
        builderBuilderWithExpectedSize.add(this.f.get());
        builderBuilderWithExpectedSize.add(this.f148256g.get());
        builderBuilderWithExpectedSize.add(this.f148257h.get());
        builderBuilderWithExpectedSize.add(this.f148258j.get());
        builderBuilderWithExpectedSize.add(this.k.get());
        builderBuilderWithExpectedSize.add(this.f148259l.get());
        return j6.a.g(this.f148260m, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f148253a);
    }
}
