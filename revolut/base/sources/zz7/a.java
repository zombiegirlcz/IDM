package zz7;

import bq.i;
import com.google.common.collect.ImmutableSet;
import fsi.g;
import gsi.h;
import java.util.Set;
import xpi.f;
import zxb.s;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xoi.d f326517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f326518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f326519c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f326520g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f326521h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f326522j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f326523l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f326524m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f326525n;

    public a(c cVar, xoi.d dVar) {
        xpi.e eVar = f.Companion;
        this.f326518b = cVar;
        this.f326517a = dVar;
        this.f326519c = e4m.b.b(new s(cVar, this, 0, 8));
        this.d = e4m.b.b(new s(cVar, this, 1, 8));
        this.e = e4m.b.b(new s(cVar, this, 3, 8));
        this.f = e4m.b.b(new s(cVar, this, 2, 8));
        this.f326520g = e4m.b.b(new s(cVar, this, 4, 8));
        this.f326521h = e4m.b.b(new s(cVar, this, 5, 8));
        this.i = e4m.b.b(new s(cVar, this, 7, 8));
        this.f326522j = e4m.b.b(new s(cVar, this, 6, 8));
        this.k = e4m.b.b(new s(cVar, this, 8, 8));
        this.f326523l = e4m.b.b(new s(cVar, this, 9, 8));
        this.f326524m = e4m.b.b(new s(cVar, this, 10, 8));
        this.f326525n = e4m.b.b(new s(cVar, this, 11, 8));
    }

    @Override // gsi.a
    public final yy0.f Q() {
        return i.j(this.f326517a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return i.p(this.f326517a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f326517a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f326517a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f326517a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return i.n(this.f326517a);
    }

    @Override // gsi.h
    public final g a() {
        return this.f326517a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f326517a);
    }

    @Override // gsi.a
    public final ty0.c b0() {
        return i.g(this.f326517a);
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f326517a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f326517a);
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f326517a);
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(10);
        builderBuilderWithExpectedSize.addAll((Iterable) i.k(this.f326517a));
        builderBuilderWithExpectedSize.add(this.f326519c.get());
        builderBuilderWithExpectedSize.add(this.d.get());
        builderBuilderWithExpectedSize.add(this.f.get());
        builderBuilderWithExpectedSize.add(this.f326520g.get());
        builderBuilderWithExpectedSize.add(this.f326521h.get());
        builderBuilderWithExpectedSize.add(this.f326522j.get());
        builderBuilderWithExpectedSize.add(this.k.get());
        builderBuilderWithExpectedSize.add(this.f326523l.get());
        return j6.a.g(this.f326524m, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f326517a);
    }
}
