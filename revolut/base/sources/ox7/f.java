package ox7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.chooser.ChooserActivity;
import com.revolut.feature.chooser.ChooserScreenContract$Configuration;
import hqi.i;
import java.util.Set;
import ove.w;
import qi3.q;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements ui3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fsi.g f230685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ypi.h f230686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f230687c;
    public final ChooserScreenContract$Configuration d;
    public final b e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f230688g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f230689h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f230690j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f230691l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f230692m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f230693n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f230694p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f230695q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f230696r;

    public f(b bVar, xoi.d dVar, ypi.h hVar, i iVar, ChooserScreenContract$Configuration chooserScreenContract$Configuration) {
        this.e = bVar;
        this.f230685a = dVar;
        this.f230686b = hVar;
        this.f230687c = iVar;
        this.d = chooserScreenContract$Configuration;
        int i = 8;
        this.f = e4m.b.b(new w(bVar, this, 0, i));
        this.f230688g = e4m.b.b(new w(bVar, this, 1, i));
        this.f230689h = e4m.b.b(new w(bVar, this, 2, i));
        this.i = e4m.b.b(new w(bVar, this, 3, i));
        this.f230690j = e4m.b.b(new w(bVar, this, 5, i));
        this.k = e4m.b.b(new w(bVar, this, 4, i));
        this.f230691l = e4m.b.b(new w(bVar, this, 6, i));
        this.f230692m = e4m.b.b(new w(bVar, this, 7, i));
        this.f230693n = e4m.b.b(new w(bVar, this, 9, i));
        this.o = e4m.b.b(new w(bVar, this, 8, i));
        this.f230694p = e4m.b.b(new w(bVar, this, 10, i));
        this.f230695q = e4m.b.b(new w(bVar, this, 12, i));
        this.f230696r = e4m.b.b(new w(bVar, this, 11, i));
    }

    @Override // ui3.b
    public final void H(ChooserActivity chooserActivity) {
        chooserActivity.f65888w0 = (com.revolut.feature.chooser.d) this.e.f230664h.get();
        chooserActivity.f65889x0 = (opi.b) this.f230694p.get();
    }

    @Override // gsi.a
    public final yy0.f Q() {
        return bq.i.j(this.f230685a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return bq.i.p(this.f230685a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f230685a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f230685a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f230685a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return bq.i.n(this.f230685a);
    }

    @Override // gsi.h
    public final fsi.g a() {
        return this.f230685a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f230685a);
    }

    @Override // ui3.b
    public final q b() {
        return (q) this.f230696r.get();
    }

    @Override // gsi.a
    public final ty0.c b0() {
        return bq.i.g(this.f230685a);
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f230685a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f230685a);
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f230685a);
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(10);
        builderBuilderWithExpectedSize.addAll((Iterable) bq.i.k(this.f230685a));
        builderBuilderWithExpectedSize.add(this.f.get());
        builderBuilderWithExpectedSize.add(this.f230688g.get());
        builderBuilderWithExpectedSize.add(this.f230689h.get());
        builderBuilderWithExpectedSize.add(this.i.get());
        builderBuilderWithExpectedSize.add(this.k.get());
        builderBuilderWithExpectedSize.add(this.f230691l.get());
        builderBuilderWithExpectedSize.add(this.f230692m.get());
        builderBuilderWithExpectedSize.add(this.o.get());
        return j6.a.g(this.f230694p, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f230685a);
    }
}
