package qee;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.card_design.api.CardDesignFeatureConfig;
import com.revolut.feature.card_management.api.CardManagementFeatureConfig;
import com.revolut.feature.card_order_new.api.navigation.CardOrderFlowDestination;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import h93.f0;
import h93.h0;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public class v implements t {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // qee.t
    public BridgeDestination a(Address address, String walletId, f0 revolutCard, e93.f fVar, d71.a troubleshootingCardDelivery, AccountId accountId) {
        FeatureCommand featureCommand;
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(revolutCard, "revolutCard");
        Intrinsics.checkNotNullParameter(troubleshootingCardDelivery, "troubleshootingCardDelivery");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        if (fVar != null) {
            featureCommand = new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new CardOrderFlowDestination.CardDelivery(h0.g(revolutCard, fVar), revolutCard.f150110a, address, (pi3.h) null, (NaviCommand) null, (xfa.b) null, (c93.j) null, (c93.j) null, accountId, (String) null, (String) null, (List) null, (AnalyticsProduct) null, (i93.d) null, (Set) null, (String) null, 130546), false, (Integer) null, 0, 61));
        } else {
            featureCommand = new FeatureCommand(new CardDesignFeatureConfig(revolutCard.M() ? b93.e.FREELANCER : b93.e.PHYSICAL, accountId, revolutCard.f150110a, null, walletId, revolutCard.C(), null, false, false, null, null, null, null, null, null, null, null, null, revolutCard.G, null, null, false, false, null, 528482194));
        }
        return u0.b(new FeatureCommand(new CardManagementFeatureConfig.CardReplaceExpectations(wy2.d.NEVER_RECEIVED, revolutCard.f150110a, featureCommand)));
    }
}
