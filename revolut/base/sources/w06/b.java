package w06;

import bq.i;
import com.google.common.collect.ImmutableSet;
import e4m.e;
import f9b.f;
import java.util.Set;
import lz0.g;
import ty0.c;
import vzc.j;
import xoi.d;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements w2l.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f293641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v06.d f293642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f293643c;
    public final e d;
    public final e e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f293644g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f293645h;
    public final e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f293646j;
    public final e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f293647l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e f293648m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e f293649n;

    public b(a aVar, d dVar, v06.d dVar2) {
        this.f293643c = aVar;
        this.f293641a = dVar;
        this.f293642b = dVar2;
        int i = 4;
        this.d = e4m.b.b(new j(aVar, this, 0, i));
        this.e = e4m.b.b(new j(aVar, this, 2, i));
        this.f = e4m.b.b(new j(aVar, this, 1, i));
        this.f293644g = e4m.b.b(new j(aVar, this, 3, i));
        this.f293645h = e4m.b.b(new j(aVar, this, 5, i));
        this.i = e4m.b.b(new j(aVar, this, 4, i));
        this.f293646j = e4m.b.b(new j(aVar, this, 6, i));
        e4m.b.b(new j(aVar, this, 7, i));
        e4m.b.b(new j(aVar, this, 8, i));
        this.k = e4m.b.b(new j(aVar, this, 9, i));
        this.f293647l = e4m.b.b(new j(aVar, this, 11, i));
        this.f293648m = e4m.b.b(new j(aVar, this, 12, i));
        this.f293649n = e4m.b.b(new j(aVar, this, 10, i));
    }

    @Override // w2l.a
    public final f N() {
        return (f) this.k.get();
    }

    @Override // gsi.a
    public final yy0.f Q() {
        return i.j(this.f293641a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return i.p(this.f293641a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f293641a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f293641a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f293641a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return i.n(this.f293641a);
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f293641a);
    }

    @Override // gsi.a
    public final c b0() {
        return i.g(this.f293641a);
    }

    @Override // gsi.a
    public final g c0() {
        return gmf.b.f(this.f293641a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f293641a);
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f293641a);
    }

    @Override // w2l.a
    public final tpi.j getProgressView() {
        return (tpi.j) this.i.get();
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(6);
        builderBuilderWithExpectedSize.addAll((Iterable) i.k(this.f293641a));
        builderBuilderWithExpectedSize.add(this.d.get());
        builderBuilderWithExpectedSize.add(this.f.get());
        builderBuilderWithExpectedSize.add(this.f293644g.get());
        builderBuilderWithExpectedSize.add(this.i.get());
        return j6.a.g(this.f293646j, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f293641a);
    }
}
