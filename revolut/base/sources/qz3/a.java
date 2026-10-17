package qz3;

import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v2.CreditLinkedAccountsV2FlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v2.CreditLinkedAccountsV2RootFlow;
import efm.d0;
import gc0.c;
import io3.h;
import kotlin.jvm.internal.Intrinsics;
import sv3.b;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements b, oz3.b {
    @Override // oz3.b
    public final PluginFlowControllerV2 a(PluginPayload pluginPayload) {
        Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
        return new CreditLinkedAccountsV2RootFlow(new CreditLinkedAccountsV2FlowContract$InputData(h.R(pluginPayload, "")));
    }

    @Override // sv3.b
    public final d0 c(PluginPayload payload, CreditApplicationStatusNavigationConfig navigationConfig) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(navigationConfig, "navigationConfig");
        ufm.b bVarM = d0.m(c.f(new CreditApplicationKompotFeatureConfig.LinkedAccountsV2(h.R(payload, ""))));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }
}
