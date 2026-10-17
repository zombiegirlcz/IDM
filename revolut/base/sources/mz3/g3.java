package mz3;

import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.RefinancingOfferFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.RefinancingOfferRootFlow;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g3 extends oz3.a {
    @Override // oz3.a
    public final efm.d0 d(ks3.c cVar, PluginPayload payload, CreditApplicationStatusNavigationConfig navigationConfig) {
        CreditApplicationKompotFeatureConfig.RefinancingOffer.Config setup;
        at3.a state = (at3.a) cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(navigationConfig, "navigationConfig");
        int i = f3.f210600a[state.ordinal()];
        if (i == 1) {
            setup = new CreditApplicationKompotFeatureConfig.RefinancingOffer.Config.Setup(true);
        } else if (i == 2) {
            setup = new CreditApplicationKompotFeatureConfig.RefinancingOffer.Config.Setup(false);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            setup = CreditApplicationKompotFeatureConfig.RefinancingOffer.Config.FinalOffer.f66805a;
        }
        ufm.b bVarM = efm.d0.m(new FeatureCommand(new CreditApplicationKompotFeatureConfig.RefinancingOffer(io3.h.R(payload, ""), setup, null)));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    @Override // oz3.a
    public final PluginFlowControllerV2 f(ks3.c cVar, PluginPayload pluginPayload) {
        CreditApplicationKompotFeatureConfig.RefinancingOffer.Config setup;
        at3.a state = (at3.a) cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
        int i = f3.f210600a[state.ordinal()];
        if (i == 1) {
            setup = new CreditApplicationKompotFeatureConfig.RefinancingOffer.Config.Setup(true);
        } else if (i == 2) {
            setup = new CreditApplicationKompotFeatureConfig.RefinancingOffer.Config.Setup(false);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            setup = CreditApplicationKompotFeatureConfig.RefinancingOffer.Config.FinalOffer.f66805a;
        }
        return new RefinancingOfferRootFlow(new RefinancingOfferFlowContract$InputData(io3.h.R(pluginPayload, ""), setup));
    }
}
