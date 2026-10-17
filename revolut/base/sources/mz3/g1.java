package mz3;

import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.feature.credit.application.plugins.impl.ui.how_it_works.flow.HowItWorksFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.how_it_works.flow.HowItWorksRootFlow;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g1 implements sv3.b, oz3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hz3.c f210601a;

    public g1(hz3.c creditApplicationCommandFactory) {
        Intrinsics.checkNotNullParameter(creditApplicationCommandFactory, "creditApplicationCommandFactory");
        this.f210601a = creditApplicationCommandFactory;
    }

    @Override // oz3.b
    public final PluginFlowControllerV2 a(PluginPayload pluginPayload) {
        Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
        return new HowItWorksRootFlow(new HowItWorksFlowContract$InputData(io3.h.R(pluginPayload, "")));
    }

    @Override // sv3.b
    public final efm.d0 c(PluginPayload payload, CreditApplicationStatusNavigationConfig navigationConfig) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(navigationConfig, "navigationConfig");
        CreditApplicationPluginFlowContract$Configuration pluginConfiguration = io3.h.R(payload, "");
        this.f210601a.getClass();
        Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
        ufm.b bVarM = efm.d0.m(new FeatureCommand(new CreditApplicationKompotFeatureConfig.HowItWorks(pluginConfiguration, null)));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }
}
