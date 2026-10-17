package mz3;

import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.feature.credit.application.plugins.impl.ui.credit_addon.CreditAddonFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.credit_addon.CreditAddonFlowController;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class x implements sv3.b, oz3.b {
    @Override // oz3.b
    public final PluginFlowControllerV2 a(PluginPayload pluginPayload) {
        Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
        return new CreditAddonFlowController(new CreditAddonFlowContract$InputData(io3.h.R(pluginPayload, "")));
    }

    @Override // sv3.b
    public final efm.d0 c(PluginPayload payload, CreditApplicationStatusNavigationConfig navigationConfig) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(navigationConfig, "navigationConfig");
        ufm.c cVar = new ufm.c(new i(payload, 3), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }
}
