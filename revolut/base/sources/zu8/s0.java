package zu8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.kyc.impl.init.InitKycScreenContract$Configuration;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class s0 implements gsi.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xoi.d f325353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InitKycScreenContract$Configuration f325354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u0 f325355c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f325356g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f325357h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f325358j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f325359l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f325360m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f325361n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f325362p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f325363q;

    public s0(u0 u0Var, xoi.d dVar, InitKycScreenContract$Configuration initKycScreenContract$Configuration) {
        this.f325355c = u0Var;
        this.f325353a = dVar;
        this.f325354b = initKycScreenContract$Configuration;
        int i = 24;
        this.d = e4m.b.b(new zpc.m(u0Var, this, 0, i));
        this.e = e4m.b.b(new zpc.m(u0Var, this, 1, i));
        this.f = e4m.b.b(new zpc.m(u0Var, this, 3, i));
        this.f325356g = e4m.b.b(new zpc.m(u0Var, this, 2, i));
        this.f325357h = e4m.b.b(new zpc.m(u0Var, this, 4, i));
        this.i = e4m.b.b(new zpc.m(u0Var, this, 5, i));
        this.f325358j = e4m.b.b(new zpc.m(u0Var, this, 7, i));
        this.k = e4m.b.b(new zpc.m(u0Var, this, 6, i));
        this.f325359l = e4m.b.b(new zpc.m(u0Var, this, 8, i));
        this.f325360m = e4m.b.b(new zpc.m(u0Var, this, 11, i));
        this.f325361n = e4m.b.b(new zpc.m(u0Var, this, 10, i));
        this.o = e4m.b.b(new zpc.m(u0Var, this, 12, i));
        this.f325362p = e4m.b.b(new zpc.m(u0Var, this, 13, i));
        this.f325363q = e4m.b.b(new zpc.m(u0Var, this, 9, i));
    }

    @Override // gsi.a
    public final yy0.f Q() {
        return bq.i.j(this.f325353a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return bq.i.p(this.f325353a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f325353a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f325353a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f325353a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return bq.i.n(this.f325353a);
    }

    @Override // gsi.h
    public final fsi.g a() {
        return this.f325353a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f325353a);
    }

    @Override // gsi.a
    public final ty0.c b0() {
        return bq.i.g(this.f325353a);
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f325353a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f325353a);
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f325353a);
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(8);
        builderBuilderWithExpectedSize.addAll((Iterable) bq.i.k(this.f325353a));
        builderBuilderWithExpectedSize.add(this.d.get());
        builderBuilderWithExpectedSize.add(this.e.get());
        builderBuilderWithExpectedSize.add(this.f325356g.get());
        builderBuilderWithExpectedSize.add(this.f325357h.get());
        builderBuilderWithExpectedSize.add(this.i.get());
        builderBuilderWithExpectedSize.add(this.k.get());
        return j6.a.g(this.f325359l, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f325353a);
    }
}
