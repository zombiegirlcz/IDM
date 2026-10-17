package k26;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.defi.asset_details.impl.ui.screen.DeFiAssetDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import jqa.h;
import yji.n;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewController f180379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DeFiAssetDetailsScreenContract$InputData f180380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f180381c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f180382g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f180383h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f180384j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f180385l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f180386m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f180387n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f180388p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f180389q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f180390r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f180391s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f180392t;
    public final e4m.e u;

    public d(c cVar, ViewController viewController, DeFiAssetDetailsScreenContract$InputData deFiAssetDetailsScreenContract$InputData) {
        this.f180381c = cVar;
        this.f180379a = viewController;
        this.f180380b = deFiAssetDetailsScreenContract$InputData;
        int i = 7;
        this.d = e4m.b.b(new h(cVar, this, 2, i));
        this.e = e4m.b.b(new h(cVar, this, 1, i));
        this.f = e4m.b.b(new h(cVar, this, 3, i));
        this.f180382g = e4m.b.b(new h(cVar, this, 0, i));
        this.f180383h = e4m.b.b(new h(cVar, this, 6, i));
        this.i = e4m.b.b(new h(cVar, this, 5, i));
        this.f180384j = e4m.b.b(new h(cVar, this, 4, i));
        this.k = e4m.b.b(new h(cVar, this, 9, i));
        this.f180385l = e4m.b.b(new h(cVar, this, 8, i));
        this.f180386m = e4m.b.b(new h(cVar, this, 7, i));
        this.f180387n = e4m.b.b(new h(cVar, this, 12, i));
        this.o = e4m.b.b(new h(cVar, this, 13, i));
        this.f180388p = e4m.b.b(new h(cVar, this, 11, i));
        this.f180389q = e4m.b.b(new h(cVar, this, 10, i));
        this.f180390r = e4m.b.b(new h(cVar, this, 15, i));
        this.f180391s = e4m.b.b(new h(cVar, this, 14, i));
        this.f180392t = e4m.b.b(new h(cVar, this, 17, i));
        this.u = e4m.b.b(new h(cVar, this, 16, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.e.get(), (n) this.f180390r.get(), (n) this.i.get(), (n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f180382g.get(), (yji.d) this.f180384j.get(), (yji.d) this.f180386m.get(), (yji.d) this.f180389q.get(), (yji.d) this.f180391s.get());
    }
}
