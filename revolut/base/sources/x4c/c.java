package x4c;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.revolut_x_balances.api.fiat.navigation.RevolutXFiatBalancesDetailsController$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import whc.t;
import yji.n;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewController f302855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevolutXFiatBalancesDetailsController$InputData f302856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f302857c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f302858g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f302859h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f302860j;

    public c(b bVar, ViewController viewController, RevolutXFiatBalancesDetailsController$InputData revolutXFiatBalancesDetailsController$InputData) {
        this.f302857c = bVar;
        this.f302855a = viewController;
        this.f302856b = revolutXFiatBalancesDetailsController$InputData;
        int i = 26;
        this.d = e4m.b.b(new t(bVar, this, 2, i));
        this.e = e4m.b.b(new t(bVar, this, 3, i));
        this.f = e4m.b.b(new t(bVar, this, 1, i));
        this.f302858g = e4m.b.b(new t(bVar, this, 0, i));
        this.f302859h = e4m.b.b(new t(bVar, this, 4, i));
        this.i = e4m.b.b(new t(bVar, this, 6, i));
        this.f302860j = e4m.b.b(new t(bVar, this, 5, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.e.get(), (n) this.f302859h.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f302858g.get());
    }
}
