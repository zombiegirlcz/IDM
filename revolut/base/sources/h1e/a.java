package h1e;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.chooser.ChooserActivity;
import com.revolut.feature.chooser.ChooserScreenContract$Configuration;
import java.util.Set;
import qi3.q;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements ui3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fsi.g f148492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ypi.h f148493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hqi.i f148494c;
    public final ChooserScreenContract$Configuration d;
    public final c e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f148495g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f148496h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f148497j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f148498l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f148499m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f148500n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f148501p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f148502q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f148503r;

    public a(c cVar, xoi.d dVar, ypi.h hVar, hqi.i iVar, ChooserScreenContract$Configuration chooserScreenContract$Configuration) {
        this.e = cVar;
        this.f148492a = dVar;
        this.f148493b = hVar;
        this.f148494c = iVar;
        this.d = chooserScreenContract$Configuration;
        int i = 4;
        this.f = e4m.b.b(new h08.e(cVar, this, 0, i));
        this.f148495g = e4m.b.b(new h08.e(cVar, this, 1, i));
        this.f148496h = e4m.b.b(new h08.e(cVar, this, 2, i));
        this.i = e4m.b.b(new h08.e(cVar, this, 3, i));
        this.f148497j = e4m.b.b(new h08.e(cVar, this, 5, i));
        this.k = e4m.b.b(new h08.e(cVar, this, 4, i));
        this.f148498l = e4m.b.b(new h08.e(cVar, this, 6, i));
        this.f148499m = e4m.b.b(new h08.e(cVar, this, 7, i));
        this.f148500n = e4m.b.b(new h08.e(cVar, this, 9, i));
        this.o = e4m.b.b(new h08.e(cVar, this, 8, i));
        this.f148501p = e4m.b.b(new h08.e(cVar, this, 10, i));
        this.f148502q = e4m.b.b(new h08.e(cVar, this, 12, i));
        this.f148503r = e4m.b.b(new h08.e(cVar, this, 11, i));
    }

    @Override // ui3.b
    public final void H(ChooserActivity chooserActivity) {
        chooserActivity.f65888w0 = (com.revolut.feature.chooser.d) this.e.f148544t.get();
        chooserActivity.f65889x0 = (opi.b) this.f148501p.get();
    }

    @Override // gsi.a
    public final yy0.f Q() {
        return bq.i.j(this.f148492a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return bq.i.p(this.f148492a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f148492a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f148492a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f148492a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return bq.i.n(this.f148492a);
    }

    @Override // gsi.h
    public final fsi.g a() {
        return this.f148492a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f148492a);
    }

    @Override // ui3.b
    public final q b() {
        return (q) this.f148503r.get();
    }

    @Override // gsi.a
    public final ty0.c b0() {
        return bq.i.g(this.f148492a);
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f148492a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f148492a);
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f148492a);
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(10);
        builderBuilderWithExpectedSize.addAll((Iterable) bq.i.k(this.f148492a));
        builderBuilderWithExpectedSize.add(this.f.get());
        builderBuilderWithExpectedSize.add(this.f148495g.get());
        builderBuilderWithExpectedSize.add(this.f148496h.get());
        builderBuilderWithExpectedSize.add(this.i.get());
        builderBuilderWithExpectedSize.add(this.k.get());
        builderBuilderWithExpectedSize.add(this.f148498l.get());
        builderBuilderWithExpectedSize.add(this.f148499m.get());
        builderBuilderWithExpectedSize.add(this.o.get());
        return j6.a.g(this.f148501p, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f148492a);
    }
}
