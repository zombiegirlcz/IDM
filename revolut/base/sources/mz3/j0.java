package mz3;

import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.feature.credit.application.plugins.impl.ui.questionnaire_kompot.QuestionnaireFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.questionnaire_kompot.QuestionnaireFlowContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class j0 implements sv3.b, oz3.b {

    @NotNull
    private static final i0 Companion = new i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hz3.c f210612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sp3.a f210613b;

    public j0(hz3.c commandsFactory, sp3.a creditDataMonitoringFacade) {
        Intrinsics.checkNotNullParameter(commandsFactory, "commandsFactory");
        Intrinsics.checkNotNullParameter("CREDIT_QUESTIONNAIRE_FLOW", "flowName");
        Intrinsics.checkNotNullParameter(creditDataMonitoringFacade, "creditDataMonitoringFacade");
        this.f210612a = commandsFactory;
        this.f210613b = creditDataMonitoringFacade;
    }

    @Override // oz3.b
    public final PluginFlowControllerV2 a(PluginPayload pluginPayload) {
        Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
        return new QuestionnaireFlow(new QuestionnaireFlowContract$InputData(io3.h.R(pluginPayload, "CREDIT_QUESTIONNAIRE_FLOW")));
    }

    @Override // sv3.b
    public final efm.d0 c(PluginPayload payload, CreditApplicationStatusNavigationConfig navigationConfig) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(navigationConfig, "navigationConfig");
        pfm.z zVar = new pfm.z(pd.b.n(skm.p0.f264003c, new mci.e(this, null, 25)), 0, new m1i.t(this, payload, 4), null);
        Intrinsics.checkNotNullExpressionValue(zVar, "toSingle(...)");
        return zVar;
    }
}
