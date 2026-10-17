package vxk;

import android.os.Parcelable;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.core.navigation.FinishFlowCommand;
import com.revolut.retail.feature.trading_onboarding.impl.actions.OnboardingActionsContract$LaunchRemediationNextPartAction;
import com.revolut.retail.feature.trading_onboarding.impl.actions.OnboardingActionsContract$LaunchTradingAccountNextOnboardingAction;
import com.revolut.retail.feature.trading_onboarding.impl.actions.handlers.OnboardingActionErrorHandlerImpl$CloseCurrentFlow;
import com.revolut.retail.feature.trading_onboarding.impl.ui.failed_prompt.flow.GiaOnboardingFailedFlowContract$Destination;
import com.revolut.retail.feature.trading_onboarding.impl.ui.failed_prompt.flow.GiaOnboardingFailedFlowContract$InputData;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import efm.d0;
import k3l.j;
import kotlin.jvm.internal.Intrinsics;
import ofm.q;
import org.jetbrains.annotations.NotNull;
import pfm.z;
import sf0.h;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends vm.e implements g3l.d {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g3l.a f293095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f293096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v60.e f293097c;
    public final ln.a d;

    public e(g3l.a statusDialogViewConfigurationDispatcher, h serverErrorParser, v60.e serverErrorsProvider, ln.a navigationCommandsDispatcher) {
        Intrinsics.checkNotNullParameter(statusDialogViewConfigurationDispatcher, "statusDialogViewConfigurationDispatcher");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        this.f293095a = statusDialogViewConfigurationDispatcher;
        this.f293096b = serverErrorParser;
        this.f293097c = serverErrorsProvider;
        this.d = navigationCommandsDispatcher;
    }

    public static OnboardingActionErrorHandlerImpl$CloseCurrentFlow e(mm.a aVar) {
        return aVar instanceof OnboardingActionsContract$LaunchRemediationNextPartAction ? new OnboardingActionErrorHandlerImpl$CloseCurrentFlow(((OnboardingActionsContract$LaunchRemediationNextPartAction) aVar).d) : aVar instanceof OnboardingActionsContract$LaunchTradingAccountNextOnboardingAction ? new OnboardingActionErrorHandlerImpl$CloseCurrentFlow(((OnboardingActionsContract$LaunchTradingAccountNextOnboardingAction) aVar).d) : new OnboardingActionErrorHandlerImpl$CloseCurrentFlow(false);
    }

    @Override // g3l.d
    public final d0 b(j result) {
        Intrinsics.checkNotNullParameter(result, "result");
        StatusViewConfiguration statusViewConfigurationA = result.a();
        Parcelable f = statusViewConfigurationA.getF();
        OnboardingActionErrorHandlerImpl$CloseCurrentFlow onboardingActionErrorHandlerImpl$CloseCurrentFlow = f instanceof OnboardingActionErrorHandlerImpl$CloseCurrentFlow ? (OnboardingActionErrorHandlerImpl$CloseCurrentFlow) f : null;
        return (Intrinsics.f(statusViewConfigurationA.getF104385a(), "LaunchNextOnboarding_StatusDialog") && onboardingActionErrorHandlerImpl$CloseCurrentFlow != null && onboardingActionErrorHandlerImpl$CloseCurrentFlow.f104129a) ? this.d.a(FinishFlowCommand.f98647a).D(Boolean.TRUE) : d0.m(Boolean.FALSE);
    }

    @Override // vm.d
    public final d0 d(um.a errorData) {
        StatusViewConfiguration.Error error;
        Intrinsics.checkNotNullParameter(errorData, "errorData");
        mm.a aVar = errorData.f281172a;
        if (!(aVar instanceof OnboardingActionsContract$LaunchRemediationNextPartAction) && !(aVar instanceof OnboardingActionsContract$LaunchTradingAccountNextOnboardingAction)) {
            return d0.m(Boolean.FALSE);
        }
        ServerError serverErrorA = this.f293096b.a(errorData.f281173b);
        if (serverErrorA != null && serverErrorA.f51362a == 7039) {
            this.d.b(vhi.c.c(new GiaOnboardingFailedFlowContract$Destination(new GiaOnboardingFailedFlowContract$InputData(bzk.h.RETRY_LIMIT_REACHED)), yhi.b.SOLID, null, false, 12));
            ufm.b bVarM = d0.m(Boolean.TRUE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        mm.a aVar2 = errorData.f281172a;
        if (serverErrorA != null) {
            v60.d dVarB = ((ao0.a) this.f293097c).b(Integer.valueOf(serverErrorA.f51362a));
            if (dVarB == null) {
                dVarB = new v60.b();
            }
            error = new StatusViewConfiguration.Error("LaunchNextOnboarding_StatusDialog", q.O(dVarB), null, null, null, e(aVar2), null, 8124);
        } else {
            error = new StatusViewConfiguration.Error("LaunchNextOnboarding_StatusDialog", new TextLocalisedClause(R$string.general_error_common, null, null, 14), null, null, null, e(aVar2), null, 8124);
        }
        z zVarD = this.f293095a.c0(error).D(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
        return zVarD;
    }
}
