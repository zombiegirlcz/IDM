package o33;

import android.content.Context;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.card_order_new.api.CardOrderAccountWrapper;
import com.revolut.feature.card_order_new.api.CardOrderContext;
import com.revolut.feature.card_order_new.api.CardOrderExperimentDestination;
import com.revolut.feature.card_order_new.api.CardOrderFeatureApi$Toggles;
import com.revolut.feature.card_order_new.api.GetCardFeatureConfig;
import com.revolut.feature.card_order_new.api.SelectedTab;
import com.revolut.feature.card_order_new.api.navigation.OrderNewCardDestination;
import com.revolut.feature.card_order_new.impl.newcard.OrderNewCardContract$Configuration;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import h93.j0;
import h93.l0;
import jte.d;
import kotlin.jvm.internal.Intrinsics;
import n33.j;
import n33.z;
import sri.m;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements uri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f221683a;

    public a(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f221683a = featureToggleInteractor;
    }

    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof GetCardFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        NaviCommand naviCommandA;
        GetCardFeatureConfig config = (GetCardFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        zn3.a aVar = config.f64966b;
        AccountId accountId = config.d;
        boolean z = config.f64965a;
        if (aVar == zn3.a.ONBOARDING) {
            naviCommandA = new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new CardOrderExperimentDestination(config), false, (Integer) null, z ? 335577088 : 0, 45));
        } else {
            if (((d) this.f221683a).c(CardOrderFeatureApi$Toggles.OrderNewCardKompotMigration.f64948c)) {
                naviCommandA = new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new OrderNewCardDestination(SelectedTab.DEBIT, new CardOrderAccountWrapper.Regular(accountId), true, null, null, null, config.e, config.f64966b, null, null, null, false, null, config.f64967c, config.f, 7992), false, (Integer) null, z ? 335577088 : 0, 45));
            } else {
                z.Companion.getClass();
                ActivityNavigateCommand activityNavigateCommand = new ActivityNavigateCommand(j.f211740b, new OrderNewCardContract$Configuration(SelectedTab.DEBIT, true, (CardOrderAccountWrapper) new CardOrderAccountWrapper.Regular(accountId), (NaviCommand) null, (NaviCommand) null, (NaviCommand) null, config.f64966b, config.f64967c, config.e, (CardOrderContext) null, (j0) null, (l0) null, (String) null, config.f, 15920), null, null, 0, null, null, null, null, false, 1020);
                naviCommandA = z ? com.revolut.retail.core.navigation.a.a(activityNavigateCommand) : activityNavigateCommand;
            }
        }
        navigator.c(naviCommandA);
    }
}
