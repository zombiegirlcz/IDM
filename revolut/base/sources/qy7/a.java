package qy7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.chooser.ChooserActivity;
import com.revolut.feature.chooser.ChooserScreenContract$Configuration;
import hqi.i;
import java.util.Set;
import qi3.q;
import ql7.v1;
import ypi.h;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements ui3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fsi.g f250158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f250159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f250160c;
    public final ChooserScreenContract$Configuration d;
    public final c e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f250161g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f250162h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f250163j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f250164l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f250165m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f250166n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f250167p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f250168q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f250169r;

    public a(c cVar, xoi.d dVar, h hVar, i iVar, ChooserScreenContract$Configuration chooserScreenContract$Configuration) {
        this.e = cVar;
        this.f250158a = dVar;
        this.f250159b = hVar;
        this.f250160c = iVar;
        this.d = chooserScreenContract$Configuration;
        int i = 26;
        this.f = e4m.b.b(new v1(cVar, this, 0, i));
        this.f250161g = e4m.b.b(new v1(cVar, this, 1, i));
        this.f250162h = e4m.b.b(new v1(cVar, this, 2, i));
        this.i = e4m.b.b(new v1(cVar, this, 3, i));
        this.f250163j = e4m.b.b(new v1(cVar, this, 5, i));
        this.k = e4m.b.b(new v1(cVar, this, 4, i));
        this.f250164l = e4m.b.b(new v1(cVar, this, 6, i));
        this.f250165m = e4m.b.b(new v1(cVar, this, 7, i));
        this.f250166n = e4m.b.b(new v1(cVar, this, 9, i));
        this.o = e4m.b.b(new v1(cVar, this, 8, i));
        this.f250167p = e4m.b.b(new v1(cVar, this, 10, i));
        this.f250168q = e4m.b.b(new v1(cVar, this, 12, i));
        this.f250169r = e4m.b.b(new v1(cVar, this, 11, i));
    }

    @Override // ui3.b
    public final void H(ChooserActivity chooserActivity) {
        chooserActivity.f65888w0 = (com.revolut.feature.chooser.d) this.e.f250192j.get();
        chooserActivity.f65889x0 = (opi.b) this.f250167p.get();
    }

    @Override // gsi.a
    public final yy0.f Q() {
        return bq.i.j(this.f250158a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return bq.i.p(this.f250158a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f250158a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f250158a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f250158a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return bq.i.n(this.f250158a);
    }

    @Override // gsi.h
    public final fsi.g a() {
        return this.f250158a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f250158a);
    }

    @Override // ui3.b
    public final q b() {
        return (q) this.f250169r.get();
    }

    @Override // gsi.a
    public final ty0.c b0() {
        return bq.i.g(this.f250158a);
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f250158a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f250158a);
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f250158a);
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(10);
        builderBuilderWithExpectedSize.addAll((Iterable) bq.i.k(this.f250158a));
        builderBuilderWithExpectedSize.add(this.f.get());
        builderBuilderWithExpectedSize.add(this.f250161g.get());
        builderBuilderWithExpectedSize.add(this.f250162h.get());
        builderBuilderWithExpectedSize.add(this.i.get());
        builderBuilderWithExpectedSize.add(this.k.get());
        builderBuilderWithExpectedSize.add(this.f250164l.get());
        builderBuilderWithExpectedSize.add(this.f250165m.get());
        builderBuilderWithExpectedSize.add(this.o.get());
        return j6.a.g(this.f250167p, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f250158a);
    }
}
