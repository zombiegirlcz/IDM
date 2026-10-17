package qy7;

import bq.i;
import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends jy7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fsi.g f250235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xpi.f f250236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f250237c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f250238g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f250239h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f250240j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f250241l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f250242m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f250243n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f250244p;

    public g(c cVar, xoi.d dVar, xpi.f fVar) {
        this.f250237c = cVar;
        this.f250235a = dVar;
        this.f250236b = fVar;
        int i = 0;
        this.d = e4m.b.b(new f(cVar, this, 0, i));
        this.e = e4m.b.b(new f(cVar, this, 1, i));
        this.f = e4m.b.b(new f(cVar, this, 3, i));
        this.f250238g = e4m.b.b(new f(cVar, this, 2, i));
        this.f250239h = e4m.b.b(new f(cVar, this, 4, i));
        this.i = e4m.b.b(new f(cVar, this, 5, i));
        this.f250240j = e4m.b.b(new f(cVar, this, 7, i));
        this.k = e4m.b.b(new f(cVar, this, 6, i));
        this.f250241l = e4m.b.b(new f(cVar, this, 8, i));
        this.f250242m = e4m.b.b(new f(cVar, this, 9, i));
        this.f250243n = e4m.b.b(new f(cVar, this, 10, i));
        this.o = e4m.b.b(new f(cVar, this, 12, i));
        this.f250244p = e4m.b.b(new f(cVar, this, 11, i));
    }

    @Override // gsi.a
    public final yy0.f Q() {
        return i.j(this.f250235a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return i.p(this.f250235a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f250235a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f250235a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f250235a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return i.n(this.f250235a);
    }

    @Override // gsi.h
    public final fsi.g a() {
        return this.f250235a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f250235a);
    }

    @Override // gsi.a
    public final ty0.c b0() {
        return i.g(this.f250235a);
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f250235a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f250235a);
    }

    @Override // jy7.b
    public final hy7.i e() {
        return (hy7.i) this.f250244p.get();
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f250235a);
    }

    @Override // jy7.b
    public final hy7.c f() {
        return (hy7.c) this.f250237c.f250197q.get();
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(10);
        builderBuilderWithExpectedSize.addAll((Iterable) i.k(this.f250235a));
        builderBuilderWithExpectedSize.add(this.d.get());
        builderBuilderWithExpectedSize.add(this.e.get());
        builderBuilderWithExpectedSize.add(this.f250238g.get());
        builderBuilderWithExpectedSize.add(this.f250239h.get());
        builderBuilderWithExpectedSize.add(this.i.get());
        builderBuilderWithExpectedSize.add(this.k.get());
        builderBuilderWithExpectedSize.add(this.f250241l.get());
        builderBuilderWithExpectedSize.add(this.f250242m.get());
        return j6.a.g(this.f250243n, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f250235a);
    }
}
