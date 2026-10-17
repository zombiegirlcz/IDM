package e6b;

import b93.h;
import c93.j;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.card_order_new.api.navigation.CardOrderFlowDestination;
import com.revolut.feature.checkout.models.CheckoutParams;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsCardConfiguration;
import com.revolut.retail.core.navigation.NaviCommand;
import java.util.Set;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {
    public static e a(e93.f cardDesign, CobrandedCardsCardConfiguration cardConfiguration) {
        Intrinsics.checkNotNullParameter(cardDesign, "cardDesign");
        Intrinsics.checkNotNullParameter(cardConfiguration, "cardConfiguration");
        if (cardDesign instanceof e93.e) {
            e93.e eVar = (e93.e) cardDesign;
            return new c(new CheckoutParams.CardOrder(new h(eVar, null, null, null, null, null, null, UUID.randomUUID().toString(), eVar.e, eVar.f123855w, true), null, AccountId.Personal.f51414a));
        }
        if (cardDesign instanceof e93.d) {
            return new d(new CardOrderFlowDestination.CardDelivery(new c93.b(cardDesign), (String) null, (Address) null, (pi3.h) null, (NaviCommand) null, (xfa.b) null, (j) null, (j) null, (AccountId) null, (String) null, (String) null, cardConfiguration.f82302a, (AnalyticsProduct) null, (i93.d) null, (Set) null, (String) null, 126974));
        }
        throw new NoWhenBranchMatchedException();
    }
}
