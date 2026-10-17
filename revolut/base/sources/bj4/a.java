package bj4;

import b6b.m;
import bq.i;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.transparent.TransparentKompotDestinationContract$Configuration;
import e4m.e;
import fsi.g;
import gsi.h;
import java.util.Set;
import xoi.d;
import yy0.f;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f15548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransparentKompotDestinationContract$Configuration f15549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f15550c;
    public final e d;
    public final e e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f15551g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f15552h;
    public final e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f15553j;
    public final e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f15554l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e f15555m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e f15556n;

    public a(b bVar, d dVar, TransparentKompotDestinationContract$Configuration transparentKompotDestinationContract$Configuration) {
        this.f15550c = bVar;
        this.f15548a = dVar;
        this.f15549b = transparentKompotDestinationContract$Configuration;
        this.d = e4m.b.b(new m(bVar, this, 0, 22));
        this.e = e4m.b.b(new m(bVar, this, 1, 22));
        this.f = e4m.b.b(new m(bVar, this, 3, 22));
        this.f15551g = e4m.b.b(new m(bVar, this, 2, 22));
        this.f15552h = e4m.b.b(new m(bVar, this, 4, 22));
        this.i = e4m.b.b(new m(bVar, this, 5, 22));
        this.f15553j = e4m.b.b(new m(bVar, this, 7, 22));
        this.k = e4m.b.b(new m(bVar, this, 6, 22));
        this.f15554l = e4m.b.b(new m(bVar, this, 8, 22));
        this.f15555m = e4m.b.b(new m(bVar, this, 9, 22));
        this.f15556n = e4m.b.b(new m(bVar, this, 10, 22));
    }

    @Override // gsi.a
    public final f Q() {
        return i.j(this.f15548a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return i.p(this.f15548a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f15548a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f15548a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f15548a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return i.n(this.f15548a);
    }

    @Override // gsi.h
    public final g a() {
        return this.f15548a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f15548a);
    }

    @Override // gsi.a
    public final ty0.c b0() {
        return i.g(this.f15548a);
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f15548a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f15548a);
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f15548a);
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(9);
        builderBuilderWithExpectedSize.addAll((Iterable) i.k(this.f15548a));
        builderBuilderWithExpectedSize.add(this.d.get());
        builderBuilderWithExpectedSize.add(this.e.get());
        builderBuilderWithExpectedSize.add(this.f15551g.get());
        builderBuilderWithExpectedSize.add(this.f15552h.get());
        builderBuilderWithExpectedSize.add(this.i.get());
        builderBuilderWithExpectedSize.add(this.k.get());
        builderBuilderWithExpectedSize.add(this.f15554l.get());
        return j6.a.g(this.f15555m, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f15548a);
    }
}
