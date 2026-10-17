package ma4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.core.R$string;
import com.revolut.retail.core.navigation.FinishFlowCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import dcl.q;
import efm.k;
import ft3.j1;
import h3l.g;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mm.d;
import org.jetbrains.annotations.NotNull;
import ow3.e;
import qc0.f1;
import qc0.h;
import rfm.u;
import skm.p0;
import wli.x;
import xl2.f;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends f1 {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e f203941m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ln.a f203942n;
    public final p54.e o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e creditApplicationCancellationInteractor, ln.a navigationCommandsDispatcher, h presentationModel, q transitionsInteractor, p54.e state, am2.a backendFlowCountryInteractor, t70.b currencyLocalization, f backendFlowConfiguration, d actionsDispatcher, x deeplinkHandler, s70.a intentProvider, yc0.a addressFlowInputDataMapper) {
        super(presentationModel, transitionsInteractor, backendFlowCountryInteractor, state, currencyLocalization, "CREDIT_DROP_OUT_FLOW", actionsDispatcher, deeplinkHandler, backendFlowConfiguration, intentProvider, addressFlowInputDataMapper);
        Intrinsics.checkNotNullParameter(creditApplicationCancellationInteractor, "creditApplicationCancellationInteractor");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(transitionsInteractor, "transitionsInteractor");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter("CREDIT_DROP_OUT_FLOW", "flowName");
        Intrinsics.checkNotNullParameter(backendFlowCountryInteractor, "backendFlowCountryInteractor");
        Intrinsics.checkNotNullParameter(currencyLocalization, "currencyLocalization");
        Intrinsics.checkNotNullParameter(backendFlowConfiguration, "backendFlowConfiguration");
        Intrinsics.checkNotNullParameter(actionsDispatcher, "actionsDispatcher");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        Intrinsics.checkNotNullParameter(addressFlowInputDataMapper, "addressFlowInputDataMapper");
        this.f203941m = creditApplicationCancellationInteractor;
        this.f203942n = navigationCommandsDispatcher;
        this.o = state;
    }

    @Override // qc0.f1, qc0.j
    public final efm.b goBack() {
        boolean zBooleanValue = ((Boolean) this.o.n().get()).booleanValue();
        NaviCommand naviCommandA = FinishFlowCommand.f98647a;
        if (zBooleanValue) {
            naviCommandA = com.revolut.retail.operation_status.modal_screen.a.a(g.Companion, new StatusViewConfiguration.Success("CREDIT_DROP_OUT_SUCCESS_STATUS_ID", x(), null, null, null, 2044), null, null, naviCommandA, this.e, 350);
        }
        pfm.a aVarE = pd.b.n(p0.f264003c, new lo.c(this, (Continuation) null, 27)).e(this.f203942n.a(naviCommandA));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }

    @Override // qc0.f1
    public final k i() {
        boolean zBooleanValue = ((Boolean) this.o.n().get()).booleanValue();
        FinishFlowCommand finishFlowCommand = FinishFlowCommand.f98647a;
        u uVarG = k.g(zBooleanValue ? com.revolut.retail.operation_status.modal_screen.a.a(g.Companion, new StatusViewConfiguration.Success("CREDIT_DROP_OUT_SUCCESS_STATUS_ID", x(), new TextLocalisedClause(R$string.credit_application_cancellation_cancel_application_cancelled_alert_subtitle, null, null, 14), null, null, 2040), null, null, finishFlowCommand, this.e, 350) : com.revolut.retail.operation_status.modal_screen.a.a(g.Companion, new StatusViewConfiguration.Success("CREDIT_DROP_OUT_SUCCESS_STATUS_ID", new TextLocalisedClause(R$string.credit_application_cancellation_cancel_application_status_dialog_feedback_submitted_title, null, null, 14), null, null, null, 2044), null, null, finishFlowCommand, this.e, 350));
        Intrinsics.checkNotNullExpressionValue(uVarG, "just(...)");
        return uVarG;
    }

    @Override // qc0.f1
    public final qc0.k j() {
        return this.o;
    }

    public final TextLocalisedClause x() {
        j1 j1Var = ((CreditApplicationPluginFlowContract$Configuration) this.o.n0().get()).d;
        j1Var.getClass();
        j1[] elements = {j1.FTC_FORBEARANCE, j1.CC_FORBEARANCE};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.y0(elements).contains(j1Var) ? new TextLocalisedClause(R$string.credit_application_cancellation_cancel_request_cancelled_alert_title, null, null, 14) : new TextLocalisedClause(R$string.credit_application_cancellation_cancel_application_cancelled_alert_title, null, null, 14);
    }
}
