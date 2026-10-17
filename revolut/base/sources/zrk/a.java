package zrk;

import bq.i;
import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.stockdetails.impl.ui.activities.stats.DetailedStatsContract$Configuration;
import fsi.g;
import java.util.Set;
import zpc.m;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements isk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xoi.d f324743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DetailedStatsContract$Configuration f324744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final srk.a f324745c;
    public final c d;
    public final a e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f324746g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f324747h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f324748j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f324749l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f324750m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f324751n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f324752p;

    public a(c cVar, srk.a aVar, xoi.d dVar, DetailedStatsContract$Configuration detailedStatsContract$Configuration) {
        xpi.e eVar = xpi.f.Companion;
        this.e = this;
        this.d = cVar;
        this.f324743a = dVar;
        this.f324744b = detailedStatsContract$Configuration;
        this.f324745c = aVar;
        int i = 3;
        this.f = e4m.b.b(new m(cVar, this, 0, i));
        this.f324746g = e4m.b.b(new m(cVar, this, 1, i));
        this.f324747h = e4m.b.b(new m(cVar, this, i, i));
        this.i = e4m.b.b(new m(cVar, this, 2, i));
        this.f324748j = e4m.b.b(new m(cVar, this, 4, i));
        this.k = e4m.b.b(new m(cVar, this, 5, i));
        this.f324749l = e4m.b.b(new m(cVar, this, 7, i));
        this.f324750m = e4m.b.b(new m(cVar, this, 6, i));
        this.f324751n = e4m.b.b(new m(cVar, this, 8, i));
        this.o = e4m.b.b(new m(cVar, this, 9, i));
        this.f324752p = e4m.b.b(new m(cVar, this, 10, i));
    }

    @Override // gsi.a
    public final yy0.f Q() {
        return i.j(this.f324743a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return i.p(this.f324743a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f324743a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f324743a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f324743a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return i.n(this.f324743a);
    }

    @Override // gsi.h
    public final g a() {
        return this.f324743a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f324743a);
    }

    @Override // gsi.a
    public final ty0.c b0() {
        return i.g(this.f324743a);
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f324743a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f324743a);
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f324743a);
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(10);
        builderBuilderWithExpectedSize.addAll((Iterable) i.k(this.f324743a));
        builderBuilderWithExpectedSize.add(this.f.get());
        builderBuilderWithExpectedSize.add(this.f324746g.get());
        builderBuilderWithExpectedSize.add(this.i.get());
        builderBuilderWithExpectedSize.add(this.f324748j.get());
        builderBuilderWithExpectedSize.add(this.k.get());
        builderBuilderWithExpectedSize.add(this.f324750m.get());
        builderBuilderWithExpectedSize.add(this.f324751n.get());
        builderBuilderWithExpectedSize.add(this.o.get());
        return j6.a.g(this.f324752p, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f324743a);
    }
}
