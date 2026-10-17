package q8j;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.holding.CryptoHoldingScreenContract$InputData;
import java.util.Set;
import prk.k0;
import x8j.o;
import yji.n;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f243133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CryptoHoldingScreenContract$InputData f243134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f243135c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f243136g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f243137h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f243138j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f243139l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f243140m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f243141n;
    public final e4m.e o;

    public g(c cVar, ViewController viewController, CryptoHoldingScreenContract$InputData cryptoHoldingScreenContract$InputData, o oVar) {
        this.f243135c = cVar;
        this.f243133a = oVar;
        this.f243134b = cryptoHoldingScreenContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 13;
        this.e = e4m.b.b(new k0(cVar, this, 2, i));
        this.f = e4m.b.b(new k0(cVar, this, 1, i));
        this.f243136g = e4m.b.b(new k0(cVar, this, 0, i));
        this.f243137h = e4m.b.b(new k0(cVar, this, 5, i));
        this.i = e4m.b.b(new k0(cVar, this, 4, i));
        this.f243138j = e4m.b.b(new k0(cVar, this, 3, i));
        this.k = e4m.b.b(new k0(cVar, this, 8, i));
        this.f243139l = e4m.b.b(new k0(cVar, this, 7, i));
        this.f243140m = e4m.b.b(new k0(cVar, this, 6, i));
        this.f243141n = e4m.b.b(new k0(cVar, this, 10, i));
        this.o = e4m.b.b(new k0(cVar, this, 9, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.f243139l.get(), (n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f243136g.get(), (yji.d) this.f243138j.get(), (yji.d) this.f243140m.get());
    }
}
