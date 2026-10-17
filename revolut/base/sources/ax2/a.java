package ax2;

import com.revolut.feature.card_contactless_limit.api.CardContactlessLimitApi$Toggles$ResetCardScaKompotMigration;
import com.revolut.feature.card_contactless_limit.api.navigation.CardContactlessLimitDestination;
import com.revolut.feature.card_contactless_limit.impl.ui.kompot.ResetCardScaContract$InputData;
import com.revolut.feature.card_contactless_limit.impl.ui.kompot.ResetCardScaController;
import com.revolut.feature.wealth.commodity_additional_services.api.CommodityAdditionalServicesApi$Toggles$CommodityAdditionalServices;
import com.revolut.feature.wealth.commodity_additional_services.api.navigation.CommodityAdditionalServicesDestination;
import com.revolut.feature.wealth.commodity_additional_services.api.navigation.PhysicalDeliveryFlowDestination;
import com.revolut.feature.wealth.commodity_additional_services.impl.ui.flows.physical_delivery.PhysicalDeliveryFlow;
import com.revolut.feature.wealth.commodity_additional_services.impl.ui.flows.physical_delivery.PhysicalDeliveryFlowContract$InputData;
import com.revolut.feature.wealth.commodity_additional_services.impl.ui.screens.additional_services.CommodityAdditionalServicesController;
import com.revolut.feature.wealth.commodity_additional_services.impl.ui.screens.additional_services.CommodityAdditionalServicesControllerContract$InputData;
import dki.g;
import java.util.List;
import jte.d;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements ohi.a, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f10847b;

    public a(gte.a featureToggleInteractor, int i) {
        this.f10846a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                this.f10847b = featureToggleInteractor;
                break;
            default:
                Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                this.f10847b = featureToggleInteractor;
                break;
        }
    }

    @Override // nte.a
    public final List e() {
        switch (this.f10846a) {
            case 0:
                return u.c(CardContactlessLimitApi$Toggles$ResetCardScaKompotMigration.f64505c);
            default:
                return u.c(CommodityAdditionalServicesApi$Toggles$CommodityAdditionalServices.f95438c);
        }
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(aii.u destination, g flowModel) {
        switch (this.f10846a) {
            case 0:
                Intrinsics.checkNotNullParameter(destination, "destination");
                Intrinsics.checkNotNullParameter(flowModel, "flowModel");
                if (!((d) this.f10847b).c(CardContactlessLimitApi$Toggles$ResetCardScaKompotMigration.f64505c) || !(destination instanceof CardContactlessLimitDestination)) {
                    return null;
                }
                CardContactlessLimitDestination cardContactlessLimitDestination = (CardContactlessLimitDestination) destination;
                return new ResetCardScaController(new ResetCardScaContract$InputData(cardContactlessLimitDestination.f64515a, cardContactlessLimitDestination.f64516b, cardContactlessLimitDestination.f64517c, cardContactlessLimitDestination.d, cardContactlessLimitDestination.e, cardContactlessLimitDestination.f, cardContactlessLimitDestination.f64518g));
            default:
                Intrinsics.checkNotNullParameter(destination, "destination");
                Intrinsics.checkNotNullParameter(flowModel, "flowModel");
                if (((d) this.f10847b).c(CommodityAdditionalServicesApi$Toggles$CommodityAdditionalServices.f95438c)) {
                    if (destination instanceof CommodityAdditionalServicesDestination) {
                        return new CommodityAdditionalServicesController(new CommodityAdditionalServicesControllerContract$InputData(((CommodityAdditionalServicesDestination) destination).f95439b));
                    }
                    if (destination instanceof PhysicalDeliveryFlowDestination) {
                        return new PhysicalDeliveryFlow(new PhysicalDeliveryFlowContract$InputData(((PhysicalDeliveryFlowDestination) destination).f95441b));
                    }
                }
                return null;
        }
    }
}
