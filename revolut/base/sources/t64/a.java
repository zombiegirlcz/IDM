package t64;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.chooser.ChooserActivity;
import com.revolut.feature.chooser.ChooserScreenContract$Configuration;
import fsi.g;
import hqi.i;
import java.util.Set;
import qi3.q;
import t0b.l;
import ypi.h;
import yy0.f;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements ui3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f268175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f268176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f268177c;
    public final ChooserScreenContract$Configuration d;
    public final c e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f268178g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f268179h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f268180j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f268181l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f268182m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f268183n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f268184p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f268185q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f268186r;

    public a(c cVar, xoi.d dVar, h hVar, i iVar, ChooserScreenContract$Configuration chooserScreenContract$Configuration) {
        this.e = cVar;
        this.f268175a = dVar;
        this.f268176b = hVar;
        this.f268177c = iVar;
        this.d = chooserScreenContract$Configuration;
        int i = 8;
        this.f = e4m.b.b(new l(cVar, this, 0, i));
        this.f268178g = e4m.b.b(new l(cVar, this, 1, i));
        this.f268179h = e4m.b.b(new l(cVar, this, 2, i));
        this.i = e4m.b.b(new l(cVar, this, 3, i));
        this.f268180j = e4m.b.b(new l(cVar, this, 5, i));
        this.k = e4m.b.b(new l(cVar, this, 4, i));
        this.f268181l = e4m.b.b(new l(cVar, this, 6, i));
        this.f268182m = e4m.b.b(new l(cVar, this, 7, i));
        this.f268183n = e4m.b.b(new l(cVar, this, 9, i));
        this.o = e4m.b.b(new l(cVar, this, 8, i));
        this.f268184p = e4m.b.b(new l(cVar, this, 10, i));
        this.f268185q = e4m.b.b(new l(cVar, this, 12, i));
        this.f268186r = e4m.b.b(new l(cVar, this, 11, i));
    }

    @Override // ui3.b
    public final void H(ChooserActivity chooserActivity) {
        chooserActivity.f65888w0 = (com.revolut.feature.chooser.d) this.e.f268232w.get();
        chooserActivity.f65889x0 = (opi.b) this.f268184p.get();
    }

    @Override // gsi.a
    public final f Q() {
        return bq.i.j(this.f268175a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return bq.i.p(this.f268175a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f268175a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f268175a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f268175a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return bq.i.n(this.f268175a);
    }

    @Override // gsi.h
    public final g a() {
        return this.f268175a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f268175a);
    }

    @Override // ui3.b
    public final q b() {
        return (q) this.f268186r.get();
    }

    @Override // gsi.a
    public final ty0.c b0() {
        return bq.i.g(this.f268175a);
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f268175a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f268175a);
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f268175a);
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(10);
        builderBuilderWithExpectedSize.addAll((Iterable) bq.i.k(this.f268175a));
        builderBuilderWithExpectedSize.add(this.f.get());
        builderBuilderWithExpectedSize.add(this.f268178g.get());
        builderBuilderWithExpectedSize.add(this.f268179h.get());
        builderBuilderWithExpectedSize.add(this.i.get());
        builderBuilderWithExpectedSize.add(this.k.get());
        builderBuilderWithExpectedSize.add(this.f268181l.get());
        builderBuilderWithExpectedSize.add(this.f268182m.get());
        builderBuilderWithExpectedSize.add(this.o.get());
        return j6.a.g(this.f268184p, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f268175a);
    }
}
