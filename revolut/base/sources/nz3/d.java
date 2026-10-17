package nz3;

import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.models.config.AutoPayPromptScreenConfig;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.autopay.card.flow.CreditCardApplicationAutopayFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.autopay.card.flow.CreditCardApplicationAutopayRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.retail.core.navigation.FeatureCommand;
import io3.h;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends b {
    @Override // oz3.a
    public final PluginFlowControllerV2 f(ks3.c cVar, PluginPayload pluginPayload) {
        ms3.a state = (ms3.a) cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
        String str = pluginPayload.f66247a.f168330m;
        if (str != null) {
            return new CreditCardApplicationAutopayRootFlow(new CreditCardApplicationAutopayFlowContract$InputData(str, null, h.R(pluginPayload, "")));
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // nz3.b
    public final FeatureCommand g(AutoPayPromptScreenConfig promptConfig, PluginPayload payload) {
        Intrinsics.checkNotNullParameter(promptConfig, "promptConfig");
        Intrinsics.checkNotNullParameter(payload, "payload");
        it3.d dVar = payload.f66247a;
        if (c.f220949a[dVar.f168328j.ordinal()] == 1) {
            String str = dVar.f168330m;
            if (str != null) {
                return new FeatureCommand(new CreditApplicationKompotFeatureConfig.CreditCardAutoPay(str, promptConfig, h.R(payload, ""), null));
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalStateException("AutoPay not supported for the " + dVar.f168328j);
    }
}
