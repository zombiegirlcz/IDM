package mz3;

import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.CreditApplicationPluginsApi$Toggles$StartCreditApplicationKompotNavigation;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.feature.credit.application.plugins.impl.ui.expired.popup.flow.ExpiredApplicationLazyFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.expired.popup.flow.ExpiredApplicationLazyFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.expired.popup.flow.ExpiredApplicationRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.expired.popup.flow.ExpiredApplicationRootFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.transparent.TransparentKompotDestinationContract$Configuration;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class x0 implements sv3.b, oz3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f210701a;

    public x0(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f210701a = featureToggleInteractor;
    }

    @Override // oz3.b
    public final PluginFlowControllerV2 a(PluginPayload pluginPayload) {
        Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
        return ((jte.d) this.f210701a).c(CreditApplicationPluginsApi$Toggles$StartCreditApplicationKompotNavigation.f66284c) ? new ExpiredApplicationLazyFlow(new ExpiredApplicationLazyFlowContract$InputData(io3.h.R(pluginPayload, ""))) : new ExpiredApplicationRootFlow(new ExpiredApplicationRootFlowContract$InputData(io3.h.R(pluginPayload, "")));
    }

    @Override // sv3.b
    public final efm.d0 c(PluginPayload payload, CreditApplicationStatusNavigationConfig navigationConfig) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(navigationConfig, "navigationConfig");
        aj4.c.Companion.getClass();
        ufm.b bVarM = efm.d0.m(new ActivityNavigateCommand(aj4.a.f5397b, new TransparentKompotDestinationContract$Configuration(new CreditApplicationKompotFeatureConfig.ExpiredPopup(io3.h.R(payload, ""), null).f98274b), null, null, 0, null, null, null, null, false, 1020));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }
}
