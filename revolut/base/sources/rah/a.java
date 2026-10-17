package rah;

import bq.i;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth.impl.ui.activities.mosttraded.MostTradedAssetsScreenContract$Configuration;
import e4m.e;
import fsi.g;
import gsi.h;
import java.util.Set;
import r7d.o;
import ty0.c;
import xoi.d;
import xpi.f;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f252854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dqi.h f252855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MostTradedAssetsScreenContract$Configuration f252856c;
    public final o0h.b d;
    public final b e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f252857g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f252858h;
    public final e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f252859j;
    public final e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f252860l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e f252861m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e f252862n;
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f252863p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f252864q;

    public a(b bVar, o0h.b bVar2, d dVar, dqi.h hVar, MostTradedAssetsScreenContract$Configuration mostTradedAssetsScreenContract$Configuration) {
        xpi.e eVar = f.Companion;
        this.e = bVar;
        this.f252854a = dVar;
        this.f252855b = hVar;
        this.f252856c = mostTradedAssetsScreenContract$Configuration;
        this.d = bVar2;
        this.f = e4m.b.b(new o(bVar, this, 0, 2));
        this.f252857g = e4m.b.b(new o(bVar, this, 1, 2));
        this.f252858h = e4m.b.b(new o(bVar, this, 3, 2));
        this.i = e4m.b.b(new o(bVar, this, 2, 2));
        this.f252859j = e4m.b.b(new o(bVar, this, 4, 2));
        this.k = e4m.b.b(new o(bVar, this, 5, 2));
        this.f252860l = e4m.b.b(new o(bVar, this, 7, 2));
        this.f252861m = e4m.b.b(new o(bVar, this, 6, 2));
        this.f252862n = e4m.b.b(new o(bVar, this, 8, 2));
        this.o = e4m.b.b(new o(bVar, this, 9, 2));
        this.f252863p = e4m.b.b(new o(bVar, this, 10, 2));
        this.f252864q = e4m.b.b(new o(bVar, this, 11, 2));
    }

    @Override // gsi.a
    public final yy0.f Q() {
        return i.j(this.f252854a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return i.p(this.f252854a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f252854a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f252854a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f252854a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return i.n(this.f252854a);
    }

    @Override // gsi.h
    public final g a() {
        return this.f252854a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f252854a);
    }

    @Override // gsi.a
    public final c b0() {
        return i.g(this.f252854a);
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f252854a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f252854a);
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f252854a);
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(11);
        builderBuilderWithExpectedSize.addAll((Iterable) i.k(this.f252854a));
        builderBuilderWithExpectedSize.add(this.f.get());
        builderBuilderWithExpectedSize.add(this.f252857g.get());
        builderBuilderWithExpectedSize.add(this.i.get());
        builderBuilderWithExpectedSize.add(this.f252859j.get());
        builderBuilderWithExpectedSize.add(this.k.get());
        builderBuilderWithExpectedSize.add(this.f252861m.get());
        builderBuilderWithExpectedSize.add(this.f252862n.get());
        builderBuilderWithExpectedSize.add(this.o.get());
        builderBuilderWithExpectedSize.add(this.f252863p.get());
        return j6.a.g(this.f252864q, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f252854a);
    }
}
