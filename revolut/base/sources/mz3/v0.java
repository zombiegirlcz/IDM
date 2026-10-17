package mz3;

import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.feature.credit.application.plugins.impl.ui.email_verification.EmailVerificationFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.email_verification.EmailVerificationRootFlow;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class v0 extends oz3.a {
    @Override // oz3.a
    public final efm.d0 d(ks3.c cVar, PluginPayload payload, CreditApplicationStatusNavigationConfig navigationConfig) {
        ss3.a state = (ss3.a) cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(navigationConfig, "navigationConfig");
        if (u0.f210690a[state.ordinal()] == 1) {
            return new ufm.c(new i(payload, 11), 2);
        }
        ufm.c cVarL = efm.d0.l(new IllegalStateException("Email verification plugin does not support this state: " + payload.f66247a.d));
        Intrinsics.checkNotNullExpressionValue(cVarL, "error(...)");
        return cVarL;
    }

    @Override // oz3.a
    public final PluginFlowControllerV2 f(ks3.c cVar, PluginPayload pluginPayload) {
        ss3.a state = (ss3.a) cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
        if (u0.f210690a[state.ordinal()] == 1) {
            return new EmailVerificationRootFlow(new EmailVerificationFlowContract$InputData(io3.h.R(pluginPayload, ""), null));
        }
        throw new IllegalStateException("Email verification plugin does not support this state: " + state);
    }
}
