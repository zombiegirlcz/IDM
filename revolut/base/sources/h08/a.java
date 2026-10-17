package h08;

import com.google.common.collect.ImmutableSet;
import g9g.e0;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends q08.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xoi.d f148202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f148203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f148204c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f148205g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f148206h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f148207j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f148208l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f148209m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f148210n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f148211p;

    public a(h hVar, xoi.d dVar) {
        xpi.e eVar = xpi.f.Companion;
        ypi.g gVar = ypi.h.Companion;
        this.f148203b = hVar;
        this.f148202a = dVar;
        this.f148204c = e4m.b.b(new e0(hVar, this, 0, 26));
        this.d = e4m.b.b(new e0(hVar, this, 1, 26));
        this.e = e4m.b.b(new e0(hVar, this, 3, 26));
        this.f = e4m.b.b(new e0(hVar, this, 2, 26));
        this.f148205g = e4m.b.b(new e0(hVar, this, 4, 26));
        this.f148206h = e4m.b.b(new e0(hVar, this, 5, 26));
        this.i = e4m.b.b(new e0(hVar, this, 7, 26));
        this.f148207j = e4m.b.b(new e0(hVar, this, 6, 26));
        this.k = e4m.b.b(new e0(hVar, this, 8, 26));
        this.f148208l = e4m.b.b(new e0(hVar, this, 9, 26));
        this.f148209m = e4m.b.b(new e0(hVar, this, 10, 26));
        this.f148210n = e4m.b.b(new e0(hVar, this, 11, 26));
        this.o = e4m.b.b(new e0(hVar, this, 13, 26));
        this.f148211p = e4m.b.b(new e0(hVar, this, 12, 26));
    }

    @Override // gsi.a
    public final yy0.f Q() {
        return bq.i.j(this.f148202a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return bq.i.p(this.f148202a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f148202a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f148202a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f148202a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return bq.i.n(this.f148202a);
    }

    @Override // gsi.h
    public final fsi.g a() {
        return this.f148202a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f148202a);
    }

    @Override // gsi.a
    public final ty0.c b0() {
        return bq.i.g(this.f148202a);
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f148202a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f148202a);
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f148202a);
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(11);
        builderBuilderWithExpectedSize.addAll((Iterable) bq.i.k(this.f148202a));
        builderBuilderWithExpectedSize.add(this.f148204c.get());
        builderBuilderWithExpectedSize.add(this.d.get());
        builderBuilderWithExpectedSize.add(this.f.get());
        builderBuilderWithExpectedSize.add(this.f148205g.get());
        builderBuilderWithExpectedSize.add(this.f148206h.get());
        builderBuilderWithExpectedSize.add(this.f148207j.get());
        builderBuilderWithExpectedSize.add(this.k.get());
        builderBuilderWithExpectedSize.add(this.f148208l.get());
        builderBuilderWithExpectedSize.add(this.f148209m.get());
        return j6.a.g(this.f148210n, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f148202a);
    }
}
