package ax2;

import android.content.Context;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.card_add_to_googlepay.api.AddToGooglePayFeatureConfig;
import com.revolut.feature.card_add_to_googlepay.api.NavigationIconConfig;
import com.revolut.feature.card_add_to_googlepay.impl.AddCardToGooglePayContract$Configuration;
import com.revolut.feature.card_add_to_googlepay.impl.AddToGooglePayViewControllerContract$InputData;
import com.revolut.feature.card_add_to_googlepay.impl.navigation.AddToGooglePayDestination;
import com.revolut.feature.card_add_to_googlepay.impl.navigation.GooglePayFeatureGateway$AddCardToGooglePayMigration;
import com.revolut.feature.card_contactless_limit.api.CardContactlessLimitApi$Toggles$ResetCardScaKompotMigration;
import com.revolut.feature.card_contactless_limit.api.CardContactlessLimitFeatureConfig;
import com.revolut.feature.card_contactless_limit.api.navigation.CardContactlessLimitDestination;
import com.revolut.feature.card_contactless_limit.impl.ui.mvp.RevolutCardResetScaScreenContract$Configuration;
import com.revolut.feature.support.api.SupportApi$Toggles$SupportTroubleshootingFlowKompotMigration;
import com.revolut.feature.support.api.navigation.CardDeliveryTroubleshootingDestination;
import com.revolut.feature.support.api.navigation.CardDeliveryTroubleshootingFeatureConfig;
import com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.CardDeliveryConfiguration;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ExplicitActivityDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import ew2.h;
import gx2.l;
import gx2.t;
import h93.f0;
import jte.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nee.f;
import sri.m;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements uri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f10849b;

    public b(gte.a featureToggleInteractor, int i) {
        this.f10848a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                this.f10849b = featureToggleInteractor;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                this.f10849b = featureToggleInteractor;
                break;
            default:
                Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                this.f10849b = featureToggleInteractor;
                break;
        }
    }

    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        switch (this.f10848a) {
            case 0:
                Intrinsics.checkNotNullParameter(config, "config");
                return config instanceof CardContactlessLimitFeatureConfig;
            case 1:
                Intrinsics.checkNotNullParameter(config, "config");
                return config instanceof CardDeliveryTroubleshootingFeatureConfig;
            default:
                Intrinsics.checkNotNullParameter(config, "config");
                return config instanceof AddToGooglePayFeatureConfig;
        }
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        String str;
        switch (this.f10848a) {
            case 0:
                CardContactlessLimitFeatureConfig config = (CardContactlessLimitFeatureConfig) featureConfig;
                Intrinsics.checkNotNullParameter(navigator, "navigator");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(config, "config");
                if (((d) this.f10849b).c(CardContactlessLimitApi$Toggles$ResetCardScaKompotMigration.f64505c)) {
                    navigator.c(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new CardContactlessLimitDestination(config.f64506a, config.f64507b, config.f64508c, config.d, config.e, config.f, config.f64509g), false, (Integer) null, 0, 61)));
                    return;
                } else {
                    t.Companion.getClass();
                    navigator.c(new ActivityNavigateCommand(l.f147632b, new RevolutCardResetScaScreenContract$Configuration(config.f64506a, config.f64507b, config.f64508c, config.d, config.e, config.f, config.f64509g), null, null, 0, null, null, null, null, false, 1020));
                    return;
                }
            case 1:
                CardDeliveryTroubleshootingFeatureConfig config2 = (CardDeliveryTroubleshootingFeatureConfig) featureConfig;
                Intrinsics.checkNotNullParameter(navigator, "navigator");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(config2, "config");
                if (((d) this.f10849b).c(SupportApi$Toggles$SupportTroubleshootingFlowKompotMigration.f89344c)) {
                    navigator.c(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new CardDeliveryTroubleshootingDestination(config2.f89348a, config2.f89349b, config2.f89350c, config2.e, config2.f), false, (Integer) null, config2.d, 45)));
                    return;
                }
                f.Companion.getClass();
                ExplicitActivityDestination explicitActivityDestination = nee.a.f214488b;
                String str2 = config2.f89348a;
                int i = gde.a.f143172a[config2.f89349b.ordinal()];
                if (i == 1) {
                    str = "SUPPORT_TROUBLESHOOTING_FLOW";
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "JUNIOR_SUPPORT_TROUBLESHOOTING";
                }
                String str3 = str;
                String str4 = config2.f89350c;
                if (str4 == null) {
                    str4 = "";
                }
                navigator.c(new ActivityNavigateCommand(explicitActivityDestination, new CardDeliveryConfiguration(str2, str3, str4, config2.e, config2.f), null, null, config2.d, null, null, null, null, false, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION));
                return;
            default:
                AddToGooglePayFeatureConfig config3 = (AddToGooglePayFeatureConfig) featureConfig;
                Intrinsics.checkNotNullParameter(navigator, "navigator");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(config3, "config");
                if (((d) this.f10849b).c(GooglePayFeatureGateway$AddCardToGooglePayMigration.f64472c)) {
                    navigator.c(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new AddToGooglePayDestination(new AddToGooglePayViewControllerContract$InputData(config3.f64431a, config3.f64432b, config3.f64433c, config3.d, config3.e, config3.f64434g, config3.i, config3.f64435h)), false, (Integer) null, 0, 61)));
                    return;
                }
                ew2.a aVar = h.Companion;
                f0 card = config3.f64431a;
                boolean z = config3.f64432b;
                NaviCommand onSuccessCommand = config3.f64433c;
                NaviCommand onCancelCommand = config3.d;
                NavigationIconConfig navigationIconConfig = config3.e;
                AnalyticsProduct automaticProduct = config3.f64434g;
                boolean z3 = config3.i;
                boolean z4 = config3.f64435h;
                aVar.getClass();
                Intrinsics.checkNotNullParameter(card, "card");
                Intrinsics.checkNotNullParameter(onSuccessCommand, "onSuccessCommand");
                Intrinsics.checkNotNullParameter(onCancelCommand, "onCancelCommand");
                Intrinsics.checkNotNullParameter(automaticProduct, "automaticProduct");
                navigator.c(new ActivityNavigateCommand(ew2.a.f130003b, new AddCardToGooglePayContract$Configuration(card, z, onSuccessCommand, onCancelCommand, navigationIconConfig, automaticProduct, z3, z4), null, null, 0, null, null, null, null, false, 1020));
                return;
        }
    }
}
