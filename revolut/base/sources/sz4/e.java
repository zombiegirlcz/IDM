package sz4;

import android.content.Context;
import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import com.revolut.core.backend_flow.ui.BackendFlowContract$Configuration;
import com.revolut.feature.credit.forbearance.application.api.navigation.ForbearanceFeatureConfig;
import com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.questionnaire.ForbearanceApplicationQuestionnaireContract$Configuration;
import com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.spinner.ForbearanceSpinnerContract$Configuration;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ExplicitActivityDestination;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import sri.m;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements uri.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof ForbearanceFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        ActivityNavigateCommand activityNavigateCommand;
        ForbearanceFeatureConfig config = (ForbearanceFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (config instanceof ForbearanceFeatureConfig.ForbearanceApplicationQuestionnaire) {
            c05.e.Companion.getClass();
            ForbearanceFeatureConfig.ForbearanceApplicationQuestionnaire forbearanceApplicationQuestionnaire = (ForbearanceFeatureConfig.ForbearanceApplicationQuestionnaire) config;
            activityNavigateCommand = new ActivityNavigateCommand(c05.b.f20167b, new ForbearanceApplicationQuestionnaireContract$Configuration(forbearanceApplicationQuestionnaire.f69923a, forbearanceApplicationQuestionnaire.f69924b), null, null, 0, null, null, null, null, false, 1020);
        } else if (config instanceof ForbearanceFeatureConfig.FinancialDifficultiesFlow) {
            c05.e.Companion.getClass();
            ExplicitActivityDestination explicitActivityDestination = c05.b.f20167b;
            BackendFlowContract$Configuration backendFlowContract$Configuration = ((ForbearanceFeatureConfig.FinancialDifficultiesFlow) config).f69922a;
            m70.a.c(t0.f186434a);
            activityNavigateCommand = new ActivityNavigateCommand(explicitActivityDestination, new ForbearanceApplicationQuestionnaireContract$Configuration(backendFlowContract$Configuration, ""), null, null, 0, null, null, null, null, false, 1020);
        } else {
            if (!(config instanceof ForbearanceFeatureConfig.ForbearanceSpinner)) {
                throw new NoWhenBranchMatchedException();
            }
            e05.c.Companion.getClass();
            ForbearanceFeatureConfig.ForbearanceSpinner forbearanceSpinner = (ForbearanceFeatureConfig.ForbearanceSpinner) config;
            activityNavigateCommand = new ActivityNavigateCommand(e05.a.f121411b, new ForbearanceSpinnerContract$Configuration(forbearanceSpinner.f69925a, forbearanceSpinner.f69926b, CapturePresenter.PASSPORT_OVERLAY_DELAY_MS, forbearanceSpinner.f69927c, null, forbearanceSpinner.e, 7, CapturePresenter.PASSPORT_OVERLAY_DELAY_MS, forbearanceSpinner.d, forbearanceSpinner.f), null, null, 0, null, null, null, null, false, 1020);
        }
        navigator.c(activityNavigateCommand);
    }
}
