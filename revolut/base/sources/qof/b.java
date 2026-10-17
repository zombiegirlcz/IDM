package qof;

import bq.i;
import com.google.common.collect.ImmutableSet;
import fsi.g;
import gsi.h;
import java.util.Set;
import ql7.v1;
import xpi.f;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xoi.d f248166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ypi.h f248167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f248168c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f248169g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f248170h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f248171j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f248172l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f248173m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f248174n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f248175p;

    public b(c cVar, xoi.d dVar, f fVar, ypi.h hVar) {
        this.f248166a = dVar;
        this.f248167b = hVar;
        this.f248168c = fVar;
        this.d = e4m.b.b(new v1(cVar, this, 0, 2));
        this.e = e4m.b.b(new v1(cVar, this, 1, 2));
        this.f = e4m.b.b(new v1(cVar, this, 2, 2));
        this.f248169g = e4m.b.b(new v1(cVar, this, 3, 2));
        this.f248170h = e4m.b.b(new v1(cVar, this, 5, 2));
        this.i = e4m.b.b(new v1(cVar, this, 4, 2));
        this.f248171j = e4m.b.b(new v1(cVar, this, 6, 2));
        this.k = e4m.b.b(new v1(cVar, this, 7, 2));
        this.f248172l = e4m.b.b(new v1(cVar, this, 9, 2));
        this.f248173m = e4m.b.b(new v1(cVar, this, 8, 2));
        this.f248174n = e4m.b.b(new v1(cVar, this, 10, 2));
        this.o = e4m.b.b(new v1(cVar, this, 12, 2));
        this.f248175p = e4m.b.b(new v1(cVar, this, 11, 2));
    }

    @Override // gsi.a
    public final yy0.f Q() {
        return i.j(this.f248166a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return i.p(this.f248166a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f248166a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f248166a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f248166a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return i.n(this.f248166a);
    }

    @Override // gsi.h
    public final g a() {
        return this.f248166a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f248166a);
    }

    @Override // gsi.a
    public final ty0.c b0() {
        return i.g(this.f248166a);
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f248166a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f248166a);
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f248166a);
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(10);
        builderBuilderWithExpectedSize.addAll((Iterable) i.k(this.f248166a));
        builderBuilderWithExpectedSize.add(this.d.get());
        builderBuilderWithExpectedSize.add(this.e.get());
        builderBuilderWithExpectedSize.add(this.f.get());
        builderBuilderWithExpectedSize.add(this.f248169g.get());
        builderBuilderWithExpectedSize.add(this.i.get());
        builderBuilderWithExpectedSize.add(this.f248171j.get());
        builderBuilderWithExpectedSize.add(this.k.get());
        builderBuilderWithExpectedSize.add(this.f248173m.get());
        return j6.a.g(this.f248174n, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f248166a);
    }
}
