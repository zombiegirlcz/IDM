package xg4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.chooser.ChooserActivity;
import com.revolut.feature.chooser.ChooserScreenContract$Configuration;
import fsi.g;
import hqi.i;
import java.util.Set;
import qi3.q;
import xf6.t1;
import ypi.h;
import yy0.f;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements ui3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f305497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f305498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f305499c;
    public final ChooserScreenContract$Configuration d;
    public final d e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f305500g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f305501h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f305502j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f305503l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f305504m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f305505n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f305506p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f305507q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f305508r;

    public a(d dVar, xoi.d dVar2, h hVar, i iVar, ChooserScreenContract$Configuration chooserScreenContract$Configuration) {
        this.e = dVar;
        this.f305497a = dVar2;
        this.f305498b = hVar;
        this.f305499c = iVar;
        this.d = chooserScreenContract$Configuration;
        int i = 15;
        this.f = e4m.b.b(new t1(dVar, this, 0, i));
        this.f305500g = e4m.b.b(new t1(dVar, this, 1, i));
        this.f305501h = e4m.b.b(new t1(dVar, this, 2, i));
        this.i = e4m.b.b(new t1(dVar, this, 3, i));
        this.f305502j = e4m.b.b(new t1(dVar, this, 5, i));
        this.k = e4m.b.b(new t1(dVar, this, 4, i));
        this.f305503l = e4m.b.b(new t1(dVar, this, 6, i));
        this.f305504m = e4m.b.b(new t1(dVar, this, 7, i));
        this.f305505n = e4m.b.b(new t1(dVar, this, 9, i));
        this.o = e4m.b.b(new t1(dVar, this, 8, i));
        this.f305506p = e4m.b.b(new t1(dVar, this, 10, i));
        this.f305507q = e4m.b.b(new t1(dVar, this, 12, i));
        this.f305508r = e4m.b.b(new t1(dVar, this, 11, i));
    }

    @Override // ui3.b
    public final void H(ChooserActivity chooserActivity) {
        chooserActivity.f65888w0 = (com.revolut.feature.chooser.d) this.e.C.get();
        chooserActivity.f65889x0 = (opi.b) this.f305506p.get();
    }

    @Override // gsi.a
    public final f Q() {
        return bq.i.j(this.f305497a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return bq.i.p(this.f305497a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f305497a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f305497a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f305497a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return bq.i.n(this.f305497a);
    }

    @Override // gsi.h
    public final g a() {
        return this.f305497a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f305497a);
    }

    @Override // ui3.b
    public final q b() {
        return (q) this.f305508r.get();
    }

    @Override // gsi.a
    public final ty0.c b0() {
        return bq.i.g(this.f305497a);
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f305497a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f305497a);
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f305497a);
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(10);
        builderBuilderWithExpectedSize.addAll((Iterable) bq.i.k(this.f305497a));
        builderBuilderWithExpectedSize.add(this.f.get());
        builderBuilderWithExpectedSize.add(this.f305500g.get());
        builderBuilderWithExpectedSize.add(this.f305501h.get());
        builderBuilderWithExpectedSize.add(this.i.get());
        builderBuilderWithExpectedSize.add(this.k.get());
        builderBuilderWithExpectedSize.add(this.f305503l.get());
        builderBuilderWithExpectedSize.add(this.f305504m.get());
        builderBuilderWithExpectedSize.add(this.o.get());
        return j6.a.g(this.f305506p, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f305497a);
    }
}
