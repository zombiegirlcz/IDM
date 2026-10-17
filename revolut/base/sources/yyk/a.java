package yyk;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.chooser.ChooserActivity;
import com.revolut.feature.chooser.ChooserScreenContract$Configuration;
import fsi.g;
import hqi.i;
import java.util.Set;
import qi3.q;
import ypi.h;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements ui3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f317948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f317949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f317950c;
    public final ChooserScreenContract$Configuration d;
    public final c e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f317951g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f317952h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f317953j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f317954l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f317955m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f317956n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f317957p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f317958q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f317959r;

    public a(c cVar, xoi.d dVar, h hVar, i iVar, ChooserScreenContract$Configuration chooserScreenContract$Configuration) {
        this.e = cVar;
        this.f317948a = dVar;
        this.f317949b = hVar;
        this.f317950c = iVar;
        this.d = chooserScreenContract$Configuration;
        int i = 4;
        this.f = e4m.b.b(new yre.a(cVar, this, 0, i));
        this.f317951g = e4m.b.b(new yre.a(cVar, this, 1, i));
        this.f317952h = e4m.b.b(new yre.a(cVar, this, 2, i));
        this.i = e4m.b.b(new yre.a(cVar, this, 3, i));
        this.f317953j = e4m.b.b(new yre.a(cVar, this, 5, i));
        this.k = e4m.b.b(new yre.a(cVar, this, 4, i));
        this.f317954l = e4m.b.b(new yre.a(cVar, this, 6, i));
        this.f317955m = e4m.b.b(new yre.a(cVar, this, 7, i));
        this.f317956n = e4m.b.b(new yre.a(cVar, this, 9, i));
        this.o = e4m.b.b(new yre.a(cVar, this, 8, i));
        this.f317957p = e4m.b.b(new yre.a(cVar, this, 10, i));
        this.f317958q = e4m.b.b(new yre.a(cVar, this, 12, i));
        this.f317959r = e4m.b.b(new yre.a(cVar, this, 11, i));
    }

    @Override // ui3.b
    public final void H(ChooserActivity chooserActivity) {
        chooserActivity.f65888w0 = (com.revolut.feature.chooser.d) this.e.f317998s.get();
        chooserActivity.f65889x0 = (opi.b) this.f317957p.get();
    }

    @Override // gsi.a
    public final yy0.f Q() {
        return bq.i.j(this.f317948a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return bq.i.p(this.f317948a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f317948a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f317948a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f317948a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return bq.i.n(this.f317948a);
    }

    @Override // gsi.h
    public final g a() {
        return this.f317948a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f317948a);
    }

    @Override // ui3.b
    public final q b() {
        return (q) this.f317959r.get();
    }

    @Override // gsi.a
    public final ty0.c b0() {
        return bq.i.g(this.f317948a);
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f317948a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f317948a);
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f317948a);
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(10);
        builderBuilderWithExpectedSize.addAll((Iterable) bq.i.k(this.f317948a));
        builderBuilderWithExpectedSize.add(this.f.get());
        builderBuilderWithExpectedSize.add(this.f317951g.get());
        builderBuilderWithExpectedSize.add(this.f317952h.get());
        builderBuilderWithExpectedSize.add(this.i.get());
        builderBuilderWithExpectedSize.add(this.k.get());
        builderBuilderWithExpectedSize.add(this.f317954l.get());
        builderBuilderWithExpectedSize.add(this.f317955m.get());
        builderBuilderWithExpectedSize.add(this.o.get());
        return j6.a.g(this.f317957p, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f317948a);
    }
}
