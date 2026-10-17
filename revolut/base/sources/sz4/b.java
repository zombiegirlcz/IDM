package sz4;

import com.revolut.core.backend_flow.ui.BackendFlowContract$Configuration;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.application.plugins.api.models.config.WaitingPopupScreenConfig;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.forbearance.application.api.navigation.ForbearanceFeatureConfig;
import com.revolut.feature.credit.forbearance.application.api.navigation.ForbearanceKompotFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import efm.k;
import it3.f;
import ju3.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rfm.h;
import rfm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements mz4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mz4.b f266756a;

    public b(mz4.b forbearanceApplicationCommandsFactory) {
        Intrinsics.checkNotNullParameter(forbearanceApplicationCommandsFactory, "forbearanceApplicationCommandsFactory");
        this.f266756a = forbearanceApplicationCommandsFactory;
    }

    public final k a(lz4.a applicationStatus) {
        Intrinsics.checkNotNullParameter(applicationStatus, "applicationStatus");
        f fVar = applicationStatus.f200935b;
        String applicationId = applicationStatus.f200934a;
        String loanFacilityId = applicationStatus.d;
        gs3.a forbearanceType = applicationStatus.e;
        int i = a.f266754a[fVar.ordinal()];
        mz4.b bVar = this.f266756a;
        switch (i) {
            case 1:
            case 2:
                gc0.c.y(forbearanceType);
                ((d) bVar).getClass();
                Intrinsics.checkNotNullParameter("LOAN_FORBEARANCE_APPLICATION_FLOW", "flowName");
                Intrinsics.checkNotNullParameter(loanFacilityId, "loanFacilityId");
                u uVarG = k.g(new FeatureCommand(new ForbearanceFeatureConfig.ForbearanceApplicationQuestionnaire(new BackendFlowContract$Configuration(30, null, "LOAN_FORBEARANCE_APPLICATION_FLOW"), loanFacilityId)));
                Intrinsics.checkNotNullExpressionValue(uVarG, "just(...)");
                return uVarG;
            case 3:
            case 4:
                gc0.c.y(forbearanceType);
                u uVarG2 = k.g(mz4.b.a(bVar, applicationId, forbearanceType, loanFacilityId, 16));
                Intrinsics.checkNotNullExpressionValue(uVarG2, "just(...)");
                return uVarG2;
            case 5:
                gc0.c.y(forbearanceType);
                ((d) bVar).getClass();
                Intrinsics.checkNotNullParameter("LOAN_FORBEARANCE_APPLICATION_FLOW", "flowName");
                Intrinsics.checkNotNullParameter(applicationId, "applicationId");
                Intrinsics.checkNotNullParameter(loanFacilityId, "facilityId");
                Intrinsics.checkNotNullParameter(forbearanceType, "forbearanceType");
                u uVarG3 = k.g(new FeatureCommand(new ForbearanceKompotFeatureConfig.Agreements(loanFacilityId, null)));
                Intrinsics.checkNotNullExpressionValue(uVarG3, "just(...)");
                return uVarG3;
            case 6:
                d dVar = (d) bVar;
                dVar.getClass();
                WaitingPopupScreenConfig screenConfig = new WaitingPopupScreenConfig(new TextLocalisedClause(R$string.credit_forbearance_locktime_title, null, null, 14), new TextLocalisedClause(R$string.credit_forbearance_locktime_subtitle, null, null, 14), new TextLocalisedClause(R$string.credit_forbearance_locktime_button_got_it, null, null, 14), new TextLocalisedClause(R$string.credit_forbearance_locktime_button_turn_notifications_on, null, null, 14));
                g popupType = g.STATUS_DIALOG;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
                Intrinsics.checkNotNullParameter(popupType, "popupType");
                u uVarG4 = k.g(dVar.f266757a.f(screenConfig, popupType));
                Intrinsics.checkNotNullExpressionValue(uVarG4, "just(...)");
                return uVarG4;
            case 7:
            case 8:
            case 9:
                int i2 = a.f266755b[forbearanceType.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        throw new IllegalStateException("Pay later forbearance flow has been removed");
                    }
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException("Credit card forbearance flow has been removed");
                }
                TextLocalisedClause title = new TextLocalisedClause(R$string.credit_forbearance_result_success_title, null, null, 14);
                TextLocalisedClause description = new TextLocalisedClause(R$string.credit_forbearance_result_success_subtitle, null, null, 14);
                FinishCommand nextScreenNaviCommand = new FinishCommand(null, null, null, 7);
                ((d) bVar).getClass();
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(description, "description");
                Intrinsics.checkNotNullParameter(nextScreenNaviCommand, "nextScreenNaviCommand");
                u uVarG5 = k.g(com.revolut.retail.operation_status.modal_screen.a.a(h3l.g.Companion, new StatusViewConfiguration.Success("id_approved", title, description, null, null, 2040), null, null, nextScreenNaviCommand, null, 478));
                Intrinsics.checkNotNullExpressionValue(uVarG5, "just(...)");
                return uVarG5;
            case 10:
                u uVarG6 = k.g(new FinishCommand(null, null, null, 7));
                Intrinsics.checkNotNullExpressionValue(uVarG6, "just(...)");
                return uVarG6;
            default:
                h hVar = h.f253943a;
                Intrinsics.checkNotNullExpressionValue(hVar, "empty(...)");
                return hVar;
        }
    }
}
