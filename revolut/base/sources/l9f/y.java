package l9f;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.screens.buy_in_price.BuyInPriceScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class y implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193237a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BuyInPriceScreenContract$InputData f193238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f193239c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f193240g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f193241h;
    public final e4m.e i;

    public y(k kVar, h hVar, ViewController viewController, BuyInPriceScreenContract$InputData buyInPriceScreenContract$InputData) {
        this.f193239c = kVar;
        this.f193238b = buyInPriceScreenContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 1;
        this.e = e4m.b.b(new z(kVar, this, 2, i));
        this.f = e4m.b.b(new z(kVar, this, 1, i));
        this.f193240g = e4m.b.b(new z(kVar, this, 0, i));
        this.f193241h = e4m.b.b(new z(kVar, this, 4, i));
        this.i = e4m.b.b(new z(kVar, this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f193237a) {
        }
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f193237a) {
        }
        return ImmutableSet.of((yji.d) this.f193240g.get());
    }

    public y(k kVar, j jVar, ViewController viewController, BuyInPriceScreenContract$InputData buyInPriceScreenContract$InputData) {
        this.f193239c = kVar;
        this.f193238b = buyInPriceScreenContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 29;
        this.e = e4m.b.b(new kr9.m(kVar, this, 2, i));
        this.f = e4m.b.b(new kr9.m(kVar, this, 1, i));
        this.f193240g = e4m.b.b(new kr9.m(kVar, this, 0, i));
        this.f193241h = e4m.b.b(new kr9.m(kVar, this, 4, i));
        this.i = e4m.b.b(new kr9.m(kVar, this, 3, i));
    }
}
