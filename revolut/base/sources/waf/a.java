package waf;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.chooser.ChooserActivity;
import com.revolut.feature.chooser.ChooserScreenContract$Configuration;
import hqi.i;
import java.util.Set;
import qi3.q;
import vzc.j;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements ui3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fsi.g f295872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ypi.h f295873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f295874c;
    public final ChooserScreenContract$Configuration d;
    public final d e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f295875g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f295876h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f295877j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f295878l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f295879m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f295880n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f295881p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f295882q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f295883r;

    public a(d dVar, xoi.d dVar2, ypi.h hVar, i iVar, ChooserScreenContract$Configuration chooserScreenContract$Configuration) {
        this.e = dVar;
        this.f295872a = dVar2;
        this.f295873b = hVar;
        this.f295874c = iVar;
        this.d = chooserScreenContract$Configuration;
        int i = 21;
        this.f = e4m.b.b(new j(dVar, this, 0, i));
        this.f295875g = e4m.b.b(new j(dVar, this, 1, i));
        this.f295876h = e4m.b.b(new j(dVar, this, 2, i));
        this.i = e4m.b.b(new j(dVar, this, 3, i));
        this.f295877j = e4m.b.b(new j(dVar, this, 5, i));
        this.k = e4m.b.b(new j(dVar, this, 4, i));
        this.f295878l = e4m.b.b(new j(dVar, this, 6, i));
        this.f295879m = e4m.b.b(new j(dVar, this, 7, i));
        this.f295880n = e4m.b.b(new j(dVar, this, 9, i));
        this.o = e4m.b.b(new j(dVar, this, 8, i));
        this.f295881p = e4m.b.b(new j(dVar, this, 10, i));
        this.f295882q = e4m.b.b(new j(dVar, this, 12, i));
        this.f295883r = e4m.b.b(new j(dVar, this, 11, i));
    }

    @Override // ui3.b
    public final void H(ChooserActivity chooserActivity) {
        chooserActivity.f65888w0 = (com.revolut.feature.chooser.d) this.e.f295922p.get();
        chooserActivity.f65889x0 = (opi.b) this.f295881p.get();
    }

    @Override // gsi.a
    public final yy0.f Q() {
        return bq.i.j(this.f295872a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return bq.i.p(this.f295872a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f295872a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f295872a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f295872a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return bq.i.n(this.f295872a);
    }

    @Override // gsi.h
    public final fsi.g a() {
        return this.f295872a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f295872a);
    }

    @Override // ui3.b
    public final q b() {
        return (q) this.f295883r.get();
    }

    @Override // gsi.a
    public final ty0.c b0() {
        return bq.i.g(this.f295872a);
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f295872a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f295872a);
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f295872a);
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(10);
        builderBuilderWithExpectedSize.addAll((Iterable) bq.i.k(this.f295872a));
        builderBuilderWithExpectedSize.add(this.f.get());
        builderBuilderWithExpectedSize.add(this.f295875g.get());
        builderBuilderWithExpectedSize.add(this.f295876h.get());
        builderBuilderWithExpectedSize.add(this.i.get());
        builderBuilderWithExpectedSize.add(this.k.get());
        builderBuilderWithExpectedSize.add(this.f295878l.get());
        builderBuilderWithExpectedSize.add(this.f295879m.get());
        builderBuilderWithExpectedSize.add(this.o.get());
        return j6.a.g(this.f295881p, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f295872a);
    }
}
