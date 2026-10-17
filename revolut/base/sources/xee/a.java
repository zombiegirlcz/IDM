package xee;

import bq.i;
import com.google.common.collect.ImmutableSet;
import e4m.b;
import e4m.e;
import fsi.g;
import java.util.Set;
import uce.c;
import xb1.m;
import xoi.d;
import xpi.f;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements pee.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f304636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f304637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f304638c;
    public final vee.c d;
    public final e e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f304639g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f304640h;
    public final e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f304641j;
    public final e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f304642l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e f304643m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e f304644n;
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f304645p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f304646q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f304647r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f304648s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f304649t;
    public final e u;
    public final e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e f304650w;

    public a(vee.c cVar, d dVar, f fVar, c cVar2) {
        this.d = cVar;
        this.f304636a = dVar;
        this.f304637b = fVar;
        this.f304638c = cVar2;
        int i = 4;
        this.e = b.b(new m(cVar, this, 0, i));
        this.f = b.b(new m(cVar, this, 1, i));
        this.f304639g = b.b(new m(cVar, this, 3, i));
        this.f304640h = b.b(new m(cVar, this, 2, i));
        this.i = b.b(new m(cVar, this, 4, i));
        this.f304641j = b.b(new m(cVar, this, 5, i));
        this.k = b.b(new m(cVar, this, 7, i));
        this.f304642l = b.b(new m(cVar, this, 6, i));
        this.f304643m = b.b(new m(cVar, this, 8, i));
        this.f304644n = b.b(new m(cVar, this, 9, i));
        this.o = b.b(new m(cVar, this, 11, i));
        this.f304645p = b.b(new m(cVar, this, 10, i));
        this.f304646q = b.b(new m(cVar, this, 13, i));
        this.f304647r = b.b(new m(cVar, this, 12, i));
        this.f304648s = b.b(new m(cVar, this, 14, i));
        this.f304649t = b.b(new m(cVar, this, 17, i));
        this.u = b.b(new m(cVar, this, 16, i));
        this.v = b.b(new m(cVar, this, 18, i));
        this.f304650w = b.b(new m(cVar, this, 15, i));
    }

    @Override // gsi.a
    public final yy0.f Q() {
        return i.j(this.f304636a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return i.p(this.f304636a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f304636a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f304636a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f304636a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return i.n(this.f304636a);
    }

    @Override // gsi.h
    public final g a() {
        return this.f304636a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f304636a);
    }

    @Override // gsi.a
    public final ty0.c b0() {
        return i.g(this.f304636a);
    }

    @Override // pee.a
    public final opi.b c() {
        return (opi.b) this.f304643m.get();
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f304636a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f304636a);
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f304636a);
    }

    @Override // pee.a
    public final oee.i f0() {
        return (oee.i) this.f304650w.get();
    }

    @Override // pee.a
    public final nee.b l() {
        return (nee.b) this.f304648s.get();
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(13);
        builderBuilderWithExpectedSize.addAll((Iterable) i.k(this.f304636a));
        builderBuilderWithExpectedSize.add(this.e.get());
        builderBuilderWithExpectedSize.add(this.f.get());
        builderBuilderWithExpectedSize.add(this.f304640h.get());
        builderBuilderWithExpectedSize.add(this.i.get());
        builderBuilderWithExpectedSize.add(this.f304641j.get());
        builderBuilderWithExpectedSize.add(this.f304642l.get());
        builderBuilderWithExpectedSize.add(this.f304643m.get());
        builderBuilderWithExpectedSize.add(this.f304644n.get());
        builderBuilderWithExpectedSize.add(this.f304645p.get());
        builderBuilderWithExpectedSize.add(this.o.get());
        builderBuilderWithExpectedSize.add(this.f304647r.get());
        return j6.a.g(this.f304646q, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f304636a);
    }

    @Override // pee.a
    public final nee.d state() {
        return (nee.d) this.f304649t.get();
    }
}
