package g1i;

import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeOrderDraft;
import com.revolut.feature_market_data_api.MarketDataApi$Toggles$CryptoBuySellFirmPrices;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f139595a;

    public c(gte.a featureToggleInteractor, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                this.f139595a = featureToggleInteractor;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                this.f139595a = featureToggleInteractor;
                break;
            default:
                Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                this.f139595a = featureToggleInteractor;
                break;
        }
    }

    public boolean a(ExchangeOrderDraft draft) {
        Intrinsics.checkNotNullParameter(draft, "draft");
        return ((jte.d) this.f139595a).c(MarketDataApi$Toggles$CryptoBuySellFirmPrices.f97006c) && draft.e == wd6.h.MARKET && r1i.d.j(draft);
    }
}
