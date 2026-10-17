package did;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.shops.impl.ui.home.ShopsCombinedHomeScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShopsCombinedHomeScreenContract$InputData f115020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f115021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f115022c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f115023g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f115024h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f115025j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f115026l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f115027m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f115028n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f115029p;

    public i(d dVar, ViewController viewController, ShopsCombinedHomeScreenContract$InputData shopsCombinedHomeScreenContract$InputData) {
        this.f115021b = dVar;
        this.f115020a = shopsCombinedHomeScreenContract$InputData;
        this.f115022c = e4m.b.b(e4m.c.a(viewController));
        int i = 7;
        this.d = e4m.b.b(new db1.f(dVar, this, 2, i));
        this.e = e4m.b.b(new db1.f(dVar, this, 1, i));
        this.f = e4m.b.b(new db1.f(dVar, this, 0, i));
        this.f115023g = e4m.b.b(new db1.f(dVar, this, 5, i));
        this.f115024h = e4m.b.b(new db1.f(dVar, this, 4, i));
        this.i = e4m.b.b(new db1.f(dVar, this, 3, i));
        this.f115025j = e4m.b.b(new db1.f(dVar, this, 7, i));
        this.k = e4m.b.b(new db1.f(dVar, this, 6, i));
        this.f115026l = e4m.b.b(new db1.f(dVar, this, 8, i));
        this.f115027m = e4m.b.b(new db1.f(dVar, this, 10, i));
        this.f115028n = e4m.b.b(new db1.f(dVar, this, 11, i));
        this.o = e4m.b.b(new db1.f(dVar, this, 9, i));
        this.f115029p = e4m.b.b(new db1.f(dVar, this, 12, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.k.get(), (yji.n) this.f115026l.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get(), (yji.d) this.i.get());
    }
}
