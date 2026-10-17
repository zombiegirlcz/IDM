package b05;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.chooser.ChooserActivity;
import com.revolut.feature.chooser.ChooserScreenContract$Configuration;
import fsi.g;
import hqi.i;
import java.util.Set;
import qi3.q;
import ypi.h;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements ui3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f11556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f11557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f11558c;
    public final ChooserScreenContract$Configuration d;
    public final e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f11559g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f11560h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f11561j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f11562l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f11563m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f11564n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f11565p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f11566q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f11567r;

    public b(e eVar, xoi.d dVar, h hVar, i iVar, ChooserScreenContract$Configuration chooserScreenContract$Configuration) {
        this.e = eVar;
        this.f11556a = dVar;
        this.f11557b = hVar;
        this.f11558c = iVar;
        this.d = chooserScreenContract$Configuration;
        int i = 22;
        this.f = e4m.b.b(new ak5.f(eVar, this, 0, i));
        this.f11559g = e4m.b.b(new ak5.f(eVar, this, 1, i));
        this.f11560h = e4m.b.b(new ak5.f(eVar, this, 2, i));
        this.i = e4m.b.b(new ak5.f(eVar, this, 3, i));
        this.f11561j = e4m.b.b(new ak5.f(eVar, this, 5, i));
        this.k = e4m.b.b(new ak5.f(eVar, this, 4, i));
        this.f11562l = e4m.b.b(new ak5.f(eVar, this, 6, i));
        this.f11563m = e4m.b.b(new ak5.f(eVar, this, 7, i));
        this.f11564n = e4m.b.b(new ak5.f(eVar, this, 9, i));
        this.o = e4m.b.b(new ak5.f(eVar, this, 8, i));
        this.f11565p = e4m.b.b(new ak5.f(eVar, this, 10, i));
        this.f11566q = e4m.b.b(new ak5.f(eVar, this, 12, i));
        this.f11567r = e4m.b.b(new ak5.f(eVar, this, 11, i));
    }

    @Override // ui3.b
    public final void H(ChooserActivity chooserActivity) {
        chooserActivity.f65888w0 = (com.revolut.feature.chooser.d) this.e.u.get();
        chooserActivity.f65889x0 = (opi.b) this.f11565p.get();
    }

    @Override // gsi.a
    public final yy0.f Q() {
        return bq.i.j(this.f11556a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return bq.i.p(this.f11556a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f11556a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f11556a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f11556a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return bq.i.n(this.f11556a);
    }

    @Override // gsi.h
    public final g a() {
        return this.f11556a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f11556a);
    }

    @Override // ui3.b
    public final q b() {
        return (q) this.f11567r.get();
    }

    @Override // gsi.a
    public final ty0.c b0() {
        return bq.i.g(this.f11556a);
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f11556a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f11556a);
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f11556a);
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(10);
        builderBuilderWithExpectedSize.addAll((Iterable) bq.i.k(this.f11556a));
        builderBuilderWithExpectedSize.add(this.f.get());
        builderBuilderWithExpectedSize.add(this.f11559g.get());
        builderBuilderWithExpectedSize.add(this.f11560h.get());
        builderBuilderWithExpectedSize.add(this.i.get());
        builderBuilderWithExpectedSize.add(this.k.get());
        builderBuilderWithExpectedSize.add(this.f11562l.get());
        builderBuilderWithExpectedSize.add(this.f11563m.get());
        builderBuilderWithExpectedSize.add(this.o.get());
        return j6.a.g(this.f11565p, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f11556a);
    }
}
