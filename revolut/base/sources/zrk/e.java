package zrk;

import bq.i;
import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.stockdetails.impl.ui.activities.statements.StockFinancialsStatementsContract$Configuration;
import fsi.g;
import java.util.Set;
import zpc.m;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements dsk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xoi.d f324768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xpi.f f324769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StockFinancialsStatementsContract$Configuration f324770c;
    public final c d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f324771g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f324772h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f324773j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f324774l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f324775m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f324776n;
    public final e4m.e o;

    public e(c cVar, xoi.d dVar, xpi.f fVar, StockFinancialsStatementsContract$Configuration stockFinancialsStatementsContract$Configuration) {
        this.d = cVar;
        this.f324768a = dVar;
        this.f324769b = fVar;
        this.f324770c = stockFinancialsStatementsContract$Configuration;
        int i = 4;
        this.e = e4m.b.b(new m(cVar, this, 0, i));
        this.f = e4m.b.b(new m(cVar, this, 1, i));
        this.f324771g = e4m.b.b(new m(cVar, this, 3, i));
        this.f324772h = e4m.b.b(new m(cVar, this, 2, i));
        this.i = e4m.b.b(new m(cVar, this, 4, i));
        this.f324773j = e4m.b.b(new m(cVar, this, 5, i));
        this.k = e4m.b.b(new m(cVar, this, 7, i));
        this.f324774l = e4m.b.b(new m(cVar, this, 6, i));
        this.f324775m = e4m.b.b(new m(cVar, this, 8, i));
        this.f324776n = e4m.b.b(new m(cVar, this, 9, i));
        this.o = e4m.b.b(new m(cVar, this, 10, i));
    }

    @Override // gsi.a
    public final yy0.f Q() {
        return i.j(this.f324768a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return i.p(this.f324768a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f324768a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f324768a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f324768a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return i.n(this.f324768a);
    }

    @Override // gsi.h
    public final g a() {
        return this.f324768a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f324768a);
    }

    @Override // gsi.a
    public final ty0.c b0() {
        return i.g(this.f324768a);
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f324768a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f324768a);
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f324768a);
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(10);
        builderBuilderWithExpectedSize.addAll((Iterable) i.k(this.f324768a));
        builderBuilderWithExpectedSize.add(this.e.get());
        builderBuilderWithExpectedSize.add(this.f.get());
        builderBuilderWithExpectedSize.add(this.f324772h.get());
        builderBuilderWithExpectedSize.add(this.i.get());
        builderBuilderWithExpectedSize.add(this.f324773j.get());
        builderBuilderWithExpectedSize.add(this.f324774l.get());
        builderBuilderWithExpectedSize.add(this.f324775m.get());
        builderBuilderWithExpectedSize.add(this.f324776n.get());
        return j6.a.g(this.o, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f324768a);
    }
}
