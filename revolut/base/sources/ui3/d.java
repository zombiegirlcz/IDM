package ui3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.chooser.ChooserActivity;
import com.revolut.feature.chooser.ChooserScreenContract$Configuration;
import fsi.g;
import hqi.i;
import java.util.Set;
import qi3.q;
import ufg.k0;
import ypi.h;
import yy0.f;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f280292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f280293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f280294c;
    public final ChooserScreenContract$Configuration d;
    public final e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f280295g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f280296h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f280297j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f280298l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f280299m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f280300n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f280301p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f280302q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f280303r;

    public d(e eVar, xoi.d dVar, h hVar, i iVar, ChooserScreenContract$Configuration chooserScreenContract$Configuration) {
        this.e = eVar;
        this.f280292a = dVar;
        this.f280293b = hVar;
        this.f280294c = iVar;
        this.d = chooserScreenContract$Configuration;
        int i = 7;
        this.f = e4m.b.b(new k0(eVar, this, 0, i));
        this.f280295g = e4m.b.b(new k0(eVar, this, 1, i));
        this.f280296h = e4m.b.b(new k0(eVar, this, 2, i));
        this.i = e4m.b.b(new k0(eVar, this, 3, i));
        this.f280297j = e4m.b.b(new k0(eVar, this, 5, i));
        this.k = e4m.b.b(new k0(eVar, this, 4, i));
        this.f280298l = e4m.b.b(new k0(eVar, this, 6, i));
        this.f280299m = e4m.b.b(new k0(eVar, this, 7, i));
        this.f280300n = e4m.b.b(new k0(eVar, this, 9, i));
        this.o = e4m.b.b(new k0(eVar, this, 8, i));
        this.f280301p = e4m.b.b(new k0(eVar, this, 10, i));
        this.f280302q = e4m.b.b(new k0(eVar, this, 12, i));
        this.f280303r = e4m.b.b(new k0(eVar, this, 11, i));
    }

    @Override // ui3.b
    public final void H(ChooserActivity chooserActivity) {
        chooserActivity.f65888w0 = (com.revolut.feature.chooser.d) this.e.e.get();
        chooserActivity.f65889x0 = (opi.b) this.f280301p.get();
    }

    @Override // gsi.a
    public final f Q() {
        return bq.i.j(this.f280292a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return bq.i.p(this.f280292a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f280292a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f280292a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f280292a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return bq.i.n(this.f280292a);
    }

    @Override // gsi.h
    public final g a() {
        return this.f280292a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f280292a);
    }

    @Override // ui3.b
    public final q b() {
        return (q) this.f280303r.get();
    }

    @Override // gsi.a
    public final ty0.c b0() {
        return bq.i.g(this.f280292a);
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f280292a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f280292a);
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f280292a);
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(10);
        builderBuilderWithExpectedSize.addAll((Iterable) bq.i.k(this.f280292a));
        builderBuilderWithExpectedSize.add(this.f.get());
        builderBuilderWithExpectedSize.add(this.f280295g.get());
        builderBuilderWithExpectedSize.add(this.f280296h.get());
        builderBuilderWithExpectedSize.add(this.i.get());
        builderBuilderWithExpectedSize.add(this.k.get());
        builderBuilderWithExpectedSize.add(this.f280298l.get());
        builderBuilderWithExpectedSize.add(this.f280299m.get());
        builderBuilderWithExpectedSize.add(this.o.get());
        return j6.a.g(this.f280301p, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f280292a);
    }
}
