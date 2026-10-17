package nz3;

import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.models.config.AutoPayPromptScreenConfig;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.autopay.loan.flow.AutopayFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.autopay.loan.flow.AutopayRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.retail.core.navigation.FeatureCommand;
import io3.h;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends b {
    @Override // oz3.a
    public final PluginFlowControllerV2 f(ks3.c cVar, PluginPayload pluginPayload) {
        ms3.a state = (ms3.a) cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
        return new AutopayRootFlow(new AutopayFlowContract$InputData(h.R(pluginPayload, "")));
    }

    @Override // nz3.b
    public final FeatureCommand g(AutoPayPromptScreenConfig promptConfig, PluginPayload payload) {
        Intrinsics.checkNotNullParameter(promptConfig, "promptConfig");
        Intrinsics.checkNotNullParameter(payload, "payload");
        it3.d dVar = payload.f66247a;
        if (e.f220950a[dVar.f168328j.ordinal()] == 1) {
            return new FeatureCommand(new CreditApplicationKompotFeatureConfig.AutoPay(promptConfig, h.R(payload, "")));
        }
        throw new IllegalStateException("AutoPay not supported for the " + dVar.f168328j);
    }
}
