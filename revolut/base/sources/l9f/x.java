package l9f;

import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.screens.buy_in_price.BuyInPriceScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes8.dex */
public final class x implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f193235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f193236c;
    public BuyInPriceScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ x(k kVar, Object obj2, int i) {
        this.f193234a = i;
        this.f193235b = kVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f193234a) {
            case 0:
                this.f193236c = viewController;
                break;
            default:
                this.f193236c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f193234a) {
            case 0:
                vc.s.h(this.f193236c, ViewController.class);
                vc.s.h(this.d, BuyInPriceScreenContract$InputData.class);
                return new y(this.f193235b, (j) this.e, this.f193236c, this.d);
            default:
                vc.s.h(this.f193236c, ViewController.class);
                vc.s.h(this.d, BuyInPriceScreenContract$InputData.class);
                return new y(this.f193235b, (h) this.e, this.f193236c, this.d);
        }
    }
}
