package mz3;

import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.OutstandingDebtsV2FlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.OutstandingDebtsV2FlowController;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class u2 extends oz3.a {
    @Override // oz3.a
    public final efm.d0 d(ks3.c cVar, PluginPayload payload, CreditApplicationStatusNavigationConfig navigationConfig) {
        ps3.a state = (ps3.a) cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(navigationConfig, "navigationConfig");
        it3.d dVar = payload.f66247a;
        ks3.c cVar2 = dVar.d;
        if (cVar2 == ps3.a.INTRO) {
            ufm.b bVarM = efm.d0.m(new FeatureCommand(new CreditApplicationKompotFeatureConfig.OutstandingDebtsV2(io3.h.R(payload, ""), CreditApplicationKompotFeatureConfig.OutstandingDebtsV2.Config.Intro.f66766a, null)));
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        if (cVar2 == ps3.a.ANSWERING) {
            ufm.b bVarM2 = efm.d0.m(new FeatureCommand(new CreditApplicationKompotFeatureConfig.OutstandingDebtsV2(io3.h.R(payload, ""), CreditApplicationKompotFeatureConfig.OutstandingDebtsV2.Config.DebtsHub.f66765a, null)));
            Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
            return bVarM2;
        }
        ufm.c cVarL = efm.d0.l(new IllegalStateException("Unsupported state for " + dVar.f168325c + ": " + state));
        Intrinsics.checkNotNullExpressionValue(cVarL, "error(...)");
        return cVarL;
    }

    @Override // oz3.a
    public final PluginFlowControllerV2 f(ks3.c cVar, PluginPayload pluginPayload) {
        OutstandingDebtsV2FlowContract$InputData intro;
        ps3.a state = (ps3.a) cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
        int i = t2.f210684a[state.ordinal()];
        if (i == 1) {
            intro = new OutstandingDebtsV2FlowContract$InputData.Intro(io3.h.R(pluginPayload, ""));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            intro = new OutstandingDebtsV2FlowContract$InputData.DebtsHub(io3.h.R(pluginPayload, ""));
        }
        return new OutstandingDebtsV2FlowController(intro);
    }
}
