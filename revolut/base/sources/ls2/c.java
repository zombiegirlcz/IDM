package ls2;

import bq.i;
import com.google.common.collect.ImmutableSet;
import e4m.e;
import fsi.g;
import gsi.h;
import java.util.Set;
import ljl.u;
import xoi.d;
import yy0.f;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f199604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f199605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f199606c;
    public final e d;
    public final e e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f199607g;

    public c(b bVar, d dVar) {
        this.f199605b = bVar;
        this.f199604a = dVar;
        this.f199606c = e4m.b.b(new u(bVar, this, 0, 21));
        this.d = e4m.b.b(new u(bVar, this, 2, 21));
        this.e = e4m.b.b(new u(bVar, this, 1, 21));
        this.f = e4m.b.b(new u(bVar, this, 3, 21));
        this.f199607g = e4m.b.b(new u(bVar, this, 4, 21));
    }

    @Override // gsi.a
    public final f Q() {
        return i.j(this.f199604a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return i.p(this.f199604a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f199604a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f199604a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f199604a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return i.n(this.f199604a);
    }

    @Override // gsi.h
    public final g a() {
        return this.f199604a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f199604a);
    }

    @Override // gsi.a
    public final ty0.c b0() {
        return i.g(this.f199604a);
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f199604a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f199604a);
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f199604a);
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(4);
        builderBuilderWithExpectedSize.addAll((Iterable) i.k(this.f199604a));
        builderBuilderWithExpectedSize.add(this.f199606c.get());
        builderBuilderWithExpectedSize.add(this.e.get());
        return j6.a.g(this.f, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f199604a);
    }
}
