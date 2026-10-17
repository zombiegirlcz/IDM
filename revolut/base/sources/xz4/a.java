package xz4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.chooser.ChooserActivity;
import com.revolut.feature.chooser.ChooserScreenContract$Configuration;
import fsi.g;
import hqi.i;
import java.util.Set;
import xsl.q;
import ypi.h;
import yy0.f;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements ui3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f309793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f309794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f309795c;
    public final ChooserScreenContract$Configuration d;
    public final d e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f309796g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f309797h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f309798j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f309799l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f309800m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f309801n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f309802p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f309803q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f309804r;

    public a(d dVar, xoi.d dVar2, h hVar, i iVar, ChooserScreenContract$Configuration chooserScreenContract$Configuration) {
        this.e = dVar;
        this.f309793a = dVar2;
        this.f309794b = hVar;
        this.f309795c = iVar;
        this.d = chooserScreenContract$Configuration;
        int i = 2;
        this.f = e4m.b.b(new q(dVar, this, 0, i));
        this.f309796g = e4m.b.b(new q(dVar, this, 1, i));
        this.f309797h = e4m.b.b(new q(dVar, this, 2, i));
        this.i = e4m.b.b(new q(dVar, this, 3, i));
        this.f309798j = e4m.b.b(new q(dVar, this, 5, i));
        this.k = e4m.b.b(new q(dVar, this, 4, i));
        this.f309799l = e4m.b.b(new q(dVar, this, 6, i));
        this.f309800m = e4m.b.b(new q(dVar, this, 7, i));
        this.f309801n = e4m.b.b(new q(dVar, this, 9, i));
        this.o = e4m.b.b(new q(dVar, this, 8, i));
        this.f309802p = e4m.b.b(new q(dVar, this, 10, i));
        this.f309803q = e4m.b.b(new q(dVar, this, 12, i));
        this.f309804r = e4m.b.b(new q(dVar, this, 11, i));
    }

    @Override // ui3.b
    public final void H(ChooserActivity chooserActivity) {
        chooserActivity.f65888w0 = (com.revolut.feature.chooser.d) this.e.u.get();
        chooserActivity.f65889x0 = (opi.b) this.f309802p.get();
    }

    @Override // gsi.a
    public final f Q() {
        return bq.i.j(this.f309793a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return bq.i.p(this.f309793a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f309793a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f309793a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f309793a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return bq.i.n(this.f309793a);
    }

    @Override // gsi.h
    public final g a() {
        return this.f309793a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f309793a);
    }

    @Override // ui3.b
    public final qi3.q b() {
        return (qi3.q) this.f309804r.get();
    }

    @Override // gsi.a
    public final ty0.c b0() {
        return bq.i.g(this.f309793a);
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f309793a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f309793a);
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f309793a);
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(10);
        builderBuilderWithExpectedSize.addAll((Iterable) bq.i.k(this.f309793a));
        builderBuilderWithExpectedSize.add(this.f.get());
        builderBuilderWithExpectedSize.add(this.f309796g.get());
        builderBuilderWithExpectedSize.add(this.f309797h.get());
        builderBuilderWithExpectedSize.add(this.i.get());
        builderBuilderWithExpectedSize.add(this.k.get());
        builderBuilderWithExpectedSize.add(this.f309799l.get());
        builderBuilderWithExpectedSize.add(this.f309800m.get());
        builderBuilderWithExpectedSize.add(this.o.get());
        return j6.a.g(this.f309802p, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f309793a);
    }
}
