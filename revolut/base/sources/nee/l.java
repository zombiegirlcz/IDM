package nee;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.card_design.api.CardDesignFeatureConfig;
import com.revolut.feature.card_management.api.CardManagementFeatureConfig;
import com.revolut.feature.card_order_new.api.navigation.CardOrderFlowDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import h93.f0;
import h93.h0;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public class l implements c {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f80.a f214499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v60.i f214500b;

    public l(f80.a uriHelper) {
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.f214499a = uriHelper;
        v60.i iVar = new v60.i();
        Intrinsics.checkNotNullExpressionValue(iVar, "create(...)");
        this.f214500b = iVar;
    }

    @Override // nee.c
    public void a(Address address, String walletId, f0 revolutCard, e93.f fVar, d71.a troubleshootingCardDelivery, AccountId accountId) {
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
        this.f214500b.onNext(new FeatureCommand(new CardManagementFeatureConfig.CardReplaceExpectations(wy2.d.NEVER_RECEIVED, revolutCard.f150110a, featureCommand)));
    }

    public final void b() {
        this.f214500b.onNext(new FinishCommand(null, null, null, 7));
    }
}
