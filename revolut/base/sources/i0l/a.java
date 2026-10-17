package i0l;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.chooser.ChooserActivity;
import com.revolut.feature.chooser.ChooserScreenContract$Configuration;
import hqi.i;
import java.util.Set;
import qi3.q;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements ui3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fsi.g f157428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ypi.h f157429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f157430c;
    public final ChooserScreenContract$Configuration d;
    public final d e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f157431g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f157432h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f157433j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f157434l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f157435m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f157436n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f157437p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f157438q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f157439r;

    public a(d dVar, xoi.d dVar2, ypi.h hVar, i iVar, ChooserScreenContract$Configuration chooserScreenContract$Configuration) {
        this.e = dVar;
        this.f157428a = dVar2;
        this.f157429b = hVar;
        this.f157430c = iVar;
        this.d = chooserScreenContract$Configuration;
        int i = 18;
        this.f = e4m.b.b(new hjg.b(dVar, this, 0, i));
        this.f157431g = e4m.b.b(new hjg.b(dVar, this, 1, i));
        this.f157432h = e4m.b.b(new hjg.b(dVar, this, 2, i));
        this.i = e4m.b.b(new hjg.b(dVar, this, 3, i));
        this.f157433j = e4m.b.b(new hjg.b(dVar, this, 5, i));
        this.k = e4m.b.b(new hjg.b(dVar, this, 4, i));
        this.f157434l = e4m.b.b(new hjg.b(dVar, this, 6, i));
        this.f157435m = e4m.b.b(new hjg.b(dVar, this, 7, i));
        this.f157436n = e4m.b.b(new hjg.b(dVar, this, 9, i));
        this.o = e4m.b.b(new hjg.b(dVar, this, 8, i));
        this.f157437p = e4m.b.b(new hjg.b(dVar, this, 10, i));
        this.f157438q = e4m.b.b(new hjg.b(dVar, this, 12, i));
        this.f157439r = e4m.b.b(new hjg.b(dVar, this, 11, i));
    }

    @Override // ui3.b
    public final void H(ChooserActivity chooserActivity) {
        chooserActivity.f65888w0 = (com.revolut.feature.chooser.d) this.e.f157487x.get();
        chooserActivity.f65889x0 = (opi.b) this.f157437p.get();
    }

    @Override // gsi.a
    public final yy0.f Q() {
        return bq.i.j(this.f157428a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return bq.i.p(this.f157428a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f157428a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f157428a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f157428a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return bq.i.n(this.f157428a);
    }

    @Override // gsi.h
    public final fsi.g a() {
        return this.f157428a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f157428a);
    }

    @Override // ui3.b
    public final q b() {
        return (q) this.f157439r.get();
    }

    @Override // gsi.a
    public final ty0.c b0() {
        return bq.i.g(this.f157428a);
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f157428a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f157428a);
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f157428a);
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(10);
        builderBuilderWithExpectedSize.addAll((Iterable) bq.i.k(this.f157428a));
        builderBuilderWithExpectedSize.add(this.f.get());
        builderBuilderWithExpectedSize.add(this.f157431g.get());
        builderBuilderWithExpectedSize.add(this.f157432h.get());
        builderBuilderWithExpectedSize.add(this.i.get());
        builderBuilderWithExpectedSize.add(this.k.get());
        builderBuilderWithExpectedSize.add(this.f157434l.get());
        builderBuilderWithExpectedSize.add(this.f157435m.get());
        builderBuilderWithExpectedSize.add(this.o.get());
        return j6.a.g(this.f157437p, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f157428a);
    }
}
