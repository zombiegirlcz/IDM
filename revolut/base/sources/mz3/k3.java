package mz3;

import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.feature.credit.application.plugins.impl.ui.security_deposit.SecurityDepositFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.security_deposit.SecurityDepositRootFlow;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k3 implements sv3.b, oz3.b {
    @Override // oz3.b
    public final PluginFlowControllerV2 a(PluginPayload pluginPayload) {
        Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
        it3.d dVar = pluginPayload.f66247a;
        boolean z = dVar.f168326g;
        String str = dVar.f168330m;
        if (str != null) {
            return new SecurityDepositRootFlow(new SecurityDepositFlowContract$InputData(z, str, io3.h.R(pluginPayload, "")));
        }
        throw new IllegalStateException("FacilityId cannot be null in SECURITY_DEPOSIT");
    }

    @Override // sv3.b
    public final efm.d0 c(PluginPayload payload, CreditApplicationStatusNavigationConfig navigationConfig) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(navigationConfig, "navigationConfig");
        it3.d dVar = payload.f66247a;
        boolean z = dVar.f168326g;
        String str = dVar.f168330m;
        if (str == null) {
            throw new IllegalStateException("FacilityId cannot be null in SECURITY_DEPOSIT");
        }
        ufm.b bVarM = efm.d0.m(new FeatureCommand(new CreditApplicationKompotFeatureConfig.SecurityDeposit(z, str, io3.h.R(payload, ""), null)));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }
}
