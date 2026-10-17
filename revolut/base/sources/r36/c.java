package r36;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.defi.exchange.impl.ui.exchange_amount.DeFiExchangeAmountContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import yji.n;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewController f251157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DeFiExchangeAmountContract$InputData f251158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f251159c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f251160g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f251161h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f251162j;
    public final e4m.e k;

    public c(e eVar, f fVar, ViewController viewController, DeFiExchangeAmountContract$InputData deFiExchangeAmountContract$InputData) {
        this.f251159c = eVar;
        this.f251157a = viewController;
        this.f251158b = deFiExchangeAmountContract$InputData;
        int i = 6;
        this.d = e4m.b.b(new qy7.f(eVar, this, 2, i));
        this.e = e4m.b.b(new qy7.f(eVar, this, 1, i));
        this.f = e4m.b.b(new qy7.f(eVar, this, 0, i));
        this.f251160g = e4m.b.b(e4m.c.a(viewController));
        int i2 = 6;
        this.f251161h = e4m.b.b(new qy7.f(eVar, this, 4, i2));
        this.i = e4m.b.b(new qy7.f(eVar, this, 3, i2));
        this.f251162j = e4m.b.b(new qy7.f(eVar, this, 5, i2));
        this.k = e4m.b.b(new qy7.f(eVar, this, 6, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.f251162j.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get(), (yji.d) this.i.get());
    }
}
