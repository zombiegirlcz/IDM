package qee;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.card_design.api.CardDesignFeatureConfig;
import com.revolut.feature.card_management.api.CardManagementFeatureConfig;
import com.revolut.feature.card_order_new.api.navigation.CardOrderFlowDestination;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import h93.f0;
import h93.h0;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class u extends v {
    @Override // qee.v, qee.t
    public final BridgeDestination a(Address address, String walletId, f0 revolutCard, e93.f fVar, d71.a troubleshootingCardDelivery, AccountId accountId) {
        FeatureCommand featureCommand;
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(revolutCard, "revolutCard");
        Intrinsics.checkNotNullParameter(troubleshootingCardDelivery, "troubleshootingCardDelivery");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        if (fVar != null) {
            featureCommand = u0.f(new CardOrderFlowDestination.CardDelivery(h0.g(revolutCard, fVar), revolutCard.f150110a, address, (pi3.h) null, (NaviCommand) null, (xfa.b) null, (c93.j) null, (c93.j) null, accountId, walletId, (String) null, (List) null, (AnalyticsProduct) null, (i93.d) null, (Set) null, (String) null, 129522));
        } else {
            featureCommand = new FeatureCommand(new CardDesignFeatureConfig(b93.e.JUNIOR, AccountId.Personal.f51414a, revolutCard.f150110a, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, 536870898));
        }
        return u0.b(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), new FeatureCommand(new CardManagementFeatureConfig.CardReplaceExpectations(wy2.d.NEVER_RECEIVED, revolutCard.f150110a, featureCommand))));
    }
}
