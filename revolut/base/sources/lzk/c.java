package lzk;

import bq.i;
import com.google.common.collect.ImmutableSet;
import e4m.e;
import gsi.h;
import java.util.Set;
import xpi.f;
import ypi.g;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xoi.d f201020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f201021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f201022c;
    public final e d;
    public final e e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f201023g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f201024h;

    public c(a aVar, xoi.d dVar) {
        xpi.e eVar = f.Companion;
        g gVar = ypi.h.Companion;
        this.f201021b = aVar;
        this.f201020a = dVar;
        this.f201022c = e4m.b.b(new b(aVar, this, 0, 0));
        this.d = e4m.b.b(new b(aVar, this, 1, 0));
        this.e = e4m.b.b(new b(aVar, this, 2, 0));
        this.f = e4m.b.b(new b(aVar, this, 3, 0));
        this.f201023g = e4m.b.b(new b(aVar, this, 5, 0));
        this.f201024h = e4m.b.b(new b(aVar, this, 4, 0));
        e4m.b.b(new b(aVar, this, 6, 0));
    }

    @Override // gsi.a
    public final yy0.f Q() {
        return i.j(this.f201020a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return i.p(this.f201020a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f201020a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f201020a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f201020a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return i.n(this.f201020a);
    }

    @Override // gsi.h
    public final fsi.g a() {
        return this.f201020a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f201020a);
    }

    @Override // gsi.a
    public final ty0.c b0() {
        return i.g(this.f201020a);
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f201020a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f201020a);
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f201020a);
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(6);
        builderBuilderWithExpectedSize.addAll((Iterable) i.k(this.f201020a));
        builderBuilderWithExpectedSize.add(this.f201022c.get());
        builderBuilderWithExpectedSize.add(this.d.get());
        builderBuilderWithExpectedSize.add(this.e.get());
        builderBuilderWithExpectedSize.add(this.f.get());
        return j6.a.g(this.f201024h, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f201020a);
    }
}
