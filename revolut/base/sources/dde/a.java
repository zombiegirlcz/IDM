package dde;

import aii.u;
import com.revolut.feature.support.api.SupportApi$Toggles$SupportTroubleshootingFlowKompotMigration;
import com.revolut.feature.support.api.navigation.CardDeliveryTroubleshootingDestination;
import com.revolut.feature.support.api.navigation.CardDeliveryTroubleshootingFeatureFlow;
import com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.CardDeliveryDetailsContract$InputData;
import com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.CardDeliveryDetailsController;
import dki.g;
import jte.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements ohi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f113211a;

    public a(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f113211a = featureToggleInteractor;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!((d) this.f113211a).c(SupportApi$Toggles$SupportTroubleshootingFlowKompotMigration.f89344c) || !(destination instanceof CardDeliveryTroubleshootingDestination)) {
            return null;
        }
        CardDeliveryTroubleshootingDestination cardDeliveryTroubleshootingDestination = (CardDeliveryTroubleshootingDestination) destination;
        String str = cardDeliveryTroubleshootingDestination.f89345a;
        CardDeliveryTroubleshootingFeatureFlow cardDeliveryTroubleshootingFeatureFlow = cardDeliveryTroubleshootingDestination.f89346b;
        String str2 = cardDeliveryTroubleshootingDestination.f89347c;
        if (str2 == null) {
            str2 = "";
        }
        return new CardDeliveryDetailsController(new CardDeliveryDetailsContract$InputData(str, cardDeliveryTroubleshootingFeatureFlow, str2, cardDeliveryTroubleshootingDestination.d, cardDeliveryTroubleshootingDestination.e));
    }
}
