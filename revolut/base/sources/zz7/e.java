package zz7;

import bq.i;
import com.google.common.collect.ImmutableSet;
import fsi.g;
import java.util.Set;
import xpi.f;
import zxb.s;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends jy7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f326577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f326578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f326579c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f326580g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f326581h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f326582j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f326583l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f326584m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f326585n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f326586p;

    public e(c cVar, xoi.d dVar, f fVar) {
        this.f326579c = cVar;
        this.f326577a = dVar;
        this.f326578b = fVar;
        int i = 11;
        this.d = e4m.b.b(new s(cVar, this, 0, i));
        this.e = e4m.b.b(new s(cVar, this, 1, i));
        this.f = e4m.b.b(new s(cVar, this, 3, i));
        this.f326580g = e4m.b.b(new s(cVar, this, 2, i));
        this.f326581h = e4m.b.b(new s(cVar, this, 4, i));
        this.i = e4m.b.b(new s(cVar, this, 5, i));
        this.f326582j = e4m.b.b(new s(cVar, this, 7, i));
        this.k = e4m.b.b(new s(cVar, this, 6, i));
        this.f326583l = e4m.b.b(new s(cVar, this, 8, i));
        this.f326584m = e4m.b.b(new s(cVar, this, 9, i));
        this.f326585n = e4m.b.b(new s(cVar, this, 10, i));
        this.o = e4m.b.b(new s(cVar, this, 12, i));
        this.f326586p = e4m.b.b(new s(cVar, this, 11, i));
    }

    @Override // gsi.a
    public final yy0.f Q() {
        return i.j(this.f326577a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return i.p(this.f326577a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f326577a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f326577a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f326577a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return i.n(this.f326577a);
    }

    @Override // gsi.h
    public final g a() {
        return this.f326577a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f326577a);
    }

    @Override // gsi.a
    public final ty0.c b0() {
        return i.g(this.f326577a);
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f326577a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f326577a);
    }

    @Override // jy7.b
    public final hy7.i e() {
        return (hy7.i) this.f326586p.get();
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f326577a);
    }

    @Override // jy7.b
    public final hy7.c f() {
        return (hy7.c) this.f326579c.i.get();
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(10);
        builderBuilderWithExpectedSize.addAll((Iterable) i.k(this.f326577a));
        builderBuilderWithExpectedSize.add(this.d.get());
        builderBuilderWithExpectedSize.add(this.e.get());
        builderBuilderWithExpectedSize.add(this.f326580g.get());
        builderBuilderWithExpectedSize.add(this.f326581h.get());
        builderBuilderWithExpectedSize.add(this.i.get());
        builderBuilderWithExpectedSize.add(this.k.get());
        builderBuilderWithExpectedSize.add(this.f326583l.get());
        builderBuilderWithExpectedSize.add(this.f326584m.get());
        return j6.a.g(this.f326585n, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f326577a);
    }
}
