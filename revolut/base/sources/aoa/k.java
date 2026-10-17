package aoa;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.payments.api.PaymentsToggles$PaymentsChargesMigration;
import com.revolut.feature.profile.api.ProfileApi$Toggles$ProfilePlanWidgetV3Design;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderPocketInfo;
import com.revolut.feature_market_data.impl.R$string;
import com.revolut.feature_market_data_api.MarketDataApi$Toggles$CryptoBuySellFirmPrices;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import d9.e1;
import hha.s;
import hha.w0;
import io3.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f7954a;

    public k(gte.a featureToggleInteractor, int i) {
        switch (i) {
            case 2:
                Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                this.f7954a = featureToggleInteractor;
                break;
            default:
                Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                this.f7954a = featureToggleInteractor;
                break;
        }
    }

    public TextLocalisedClause a(OrderQuote quote) {
        Intrinsics.checkNotNullParameter(quote, "quote");
        return (e1.z(quote) || !((jte.d) this.f7954a).c(PaymentsToggles$PaymentsChargesMigration.f79158c)) ? new TextLocalisedClause(R$string.market_data_exchange_breakdown_title, null, null, 14) : new TextLocalisedClause(R$string.market_data_exchange_breakdown_title_no_fx, null, null, 14);
    }

    public boolean b(CryptoOrderDraft orderDraft) {
        Intrinsics.checkNotNullParameter(orderDraft, "orderDraft");
        if (((jte.d) this.f7954a).c(MarketDataApi$Toggles$CryptoBuySellFirmPrices.f97006c)) {
            boolean z = orderDraft.f == wd6.h.MARKET;
            CryptoOrderPocketInfo cryptoOrderPocketInfo = orderDraft.f96696m;
            boolean z3 = (cryptoOrderPocketInfo != null ? cryptoOrderPocketInfo.f96705c : null) == l.SAVINGS;
            if (z && !z3) {
                return true;
            }
        }
        return false;
    }

    public boolean c(hha.d dVar) {
        if ((dVar != null ? s.f(dVar) : null) != w0.PRIVATE) {
            return ((jte.d) this.f7954a).c(ProfileApi$Toggles$ProfilePlanWidgetV3Design.f81319c);
        }
        return false;
    }

    public k(oyh.a checker, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(checker, "checker");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f7954a = featureToggleInteractor;
    }
}
