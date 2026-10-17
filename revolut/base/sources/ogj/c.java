package ogj;

import com.revolut.feature.esim.instructions.domain.EsimInstructionType;
import com.revolut.feature.esim.instructions.navigation.EsimInstructionsControllerDescriptor$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.home.EsimHomeFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.home.EsimHomeFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.EsimMobilePlanNumberTransferConfirmationOrchestratorFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a;
import com.revolut.retail.feature.esim.impl.ui.flows.post_checkout.EsimPostCheckoutFlowContract$Step;
import com.revolut.retail.feature.esim.impl.ui.screens.share_qr_code.EsimShareQrCodeScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.share_qr_code.EsimShareQrCodeScreenContract$InputData;
import dej.c4;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import oki.g;
import oki.h;
import yki.l;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f225161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.flows.post_checkout.a f225162b;

    public /* synthetic */ c(com.revolut.retail.feature.esim.impl.ui.flows.post_checkout.a aVar, int i) {
        this.f225161a = i;
        this.f225162b = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f225161a) {
            case 0:
                l FlowCoordinator = (l) obj2;
                EsimPostCheckoutFlowContract$Step step = (EsimPostCheckoutFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                boolean z = step instanceof EsimPostCheckoutFlowContract$Step.EsimHome;
                com.revolut.retail.feature.esim.impl.ui.flows.post_checkout.a aVar = this.f225162b;
                if (z) {
                    return new EsimHomeFlow(new EsimHomeFlowContract$InputData(new EsimHomeFlowContract$InputData.InitialDestination.Subscriptions(aVar.o.f100858b, (c4) null, 6)));
                }
                if (step instanceof EsimPostCheckoutFlowContract$Step.ShareEsim) {
                    return new EsimShareQrCodeScreen(new EsimShareQrCodeScreenContract$InputData(((EsimPostCheckoutFlowContract$Step.ShareEsim) step).f100864a));
                }
                if (step instanceof EsimPostCheckoutFlowContract$Step.InstallationInstructions) {
                    EsimInstructionType.INSTANCE.getClass();
                    return aVar.e1(new sd6.b(new EsimInstructionsControllerDescriptor$InputData("INSTALLATION", null)));
                }
                if (!(step instanceof EsimPostCheckoutFlowContract$Step.NumberTransferConfirmation)) {
                    throw new NoWhenBranchMatchedException();
                }
                EsimPostCheckoutFlowContract$Step.NumberTransferConfirmation numberTransferConfirmation = (EsimPostCheckoutFlowContract$Step.NumberTransferConfirmation) step;
                EsimMobilePlanNumberTransferConfirmationOrchestratorFlow esimMobilePlanNumberTransferConfirmationOrchestratorFlow = new EsimMobilePlanNumberTransferConfirmationOrchestratorFlow(new EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData(numberTransferConfirmation.f100861a, numberTransferConfirmation.f100862b, numberTransferConfirmation.f100863c, numberTransferConfirmation.d));
                aVar.a(esimMobilePlanNumberTransferConfirmationOrchestratorFlow, new c(aVar, 1));
                return esimMobilePlanNumberTransferConfirmationOrchestratorFlow;
            default:
                com.revolut.retail.feature.esim.impl.ui.flows.post_checkout.a aVar2 = this.f225162b;
                yki.a aVar3 = aVar2.f100865p;
                g onResult = (g) obj2;
                com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a result = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a) obj3;
                Intrinsics.checkNotNullParameter(onResult, "$this$onResult");
                Intrinsics.checkNotNullParameter(result, "result");
                boolean zF = Intrinsics.f(result, a.b.f100765a);
                EsimPostCheckoutFlowContract$Step.EsimHome esimHome = EsimPostCheckoutFlowContract$Step.EsimHome.f100859a;
                if (zF) {
                    h.r2(aVar3);
                    h.t2(aVar2, aVar3, esimHome, false, null, false, 12);
                } else {
                    if (!(result instanceof a.C0612a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (((a.C0612a) result).f100764a) {
                        h.r2(aVar3);
                        h.t2(aVar2, aVar3, esimHome, false, null, false, 12);
                    } else {
                        onResult.pop();
                    }
                }
                return Unit.f186387a;
        }
    }
}
