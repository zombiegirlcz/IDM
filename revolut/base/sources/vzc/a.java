package vzc;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.chooser.ChooserActivity;
import com.revolut.feature.chooser.ChooserScreenContract$Configuration;
import java.util.Set;
import qi3.q;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements ui3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fsi.g f293437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ypi.h f293438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hqi.i f293439c;
    public final ChooserScreenContract$Configuration d;
    public final b e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f293440g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f293441h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f293442j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f293443l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f293444m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f293445n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f293446p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f293447q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f293448r;

    public a(b bVar, xoi.d dVar, ypi.h hVar, hqi.i iVar, ChooserScreenContract$Configuration chooserScreenContract$Configuration) {
        this.e = bVar;
        this.f293437a = dVar;
        this.f293438b = hVar;
        this.f293439c = iVar;
        this.d = chooserScreenContract$Configuration;
        int i = 26;
        this.f = e4m.b.b(new vn2.l(bVar, this, 0, i));
        this.f293440g = e4m.b.b(new vn2.l(bVar, this, 1, i));
        this.f293441h = e4m.b.b(new vn2.l(bVar, this, 2, i));
        this.i = e4m.b.b(new vn2.l(bVar, this, 3, i));
        this.f293442j = e4m.b.b(new vn2.l(bVar, this, 5, i));
        this.k = e4m.b.b(new vn2.l(bVar, this, 4, i));
        this.f293443l = e4m.b.b(new vn2.l(bVar, this, 6, i));
        this.f293444m = e4m.b.b(new vn2.l(bVar, this, 7, i));
        this.f293445n = e4m.b.b(new vn2.l(bVar, this, 9, i));
        this.o = e4m.b.b(new vn2.l(bVar, this, 8, i));
        this.f293446p = e4m.b.b(new vn2.l(bVar, this, 10, i));
        this.f293447q = e4m.b.b(new vn2.l(bVar, this, 12, i));
        this.f293448r = e4m.b.b(new vn2.l(bVar, this, 11, i));
    }

    @Override // ui3.b
    public final void H(ChooserActivity chooserActivity) {
        chooserActivity.f65888w0 = (com.revolut.feature.chooser.d) this.e.f293455l.get();
        chooserActivity.f65889x0 = (opi.b) this.f293446p.get();
    }

    @Override // gsi.a
    public final yy0.f Q() {
        return bq.i.j(this.f293437a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return bq.i.p(this.f293437a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f293437a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f293437a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f293437a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return bq.i.n(this.f293437a);
    }

    @Override // gsi.h
    public final fsi.g a() {
        return this.f293437a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f293437a);
    }

    @Override // ui3.b
    public final q b() {
        return (q) this.f293448r.get();
    }

    @Override // gsi.a
    public final ty0.c b0() {
        return bq.i.g(this.f293437a);
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f293437a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f293437a);
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f293437a);
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(10);
        builderBuilderWithExpectedSize.addAll((Iterable) bq.i.k(this.f293437a));
        builderBuilderWithExpectedSize.add(this.f.get());
        builderBuilderWithExpectedSize.add(this.f293440g.get());
        builderBuilderWithExpectedSize.add(this.f293441h.get());
        builderBuilderWithExpectedSize.add(this.i.get());
        builderBuilderWithExpectedSize.add(this.k.get());
        builderBuilderWithExpectedSize.add(this.f293443l.get());
        builderBuilderWithExpectedSize.add(this.f293444m.get());
        builderBuilderWithExpectedSize.add(this.o.get());
        return j6.a.g(this.f293446p, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f293437a);
    }
}
