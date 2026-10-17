package af2;

import aii.p;
import aii.u;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.upi.api.UpiFeatureConfig;
import com.revolut.feature.apm.upi.impl.deeplink.AccountVerificationExplainerDestination;
import com.revolut.feature.apm.upi.impl.flow.area.flow.UpiFlow;
import com.revolut.feature.apm.upi.impl.flow.intent_payment.UpiIntentPaymentFlow;
import com.revolut.feature.apm.upi.impl.flow.intent_payment.UpiIntentPaymentFlowContract$InputData;
import com.revolut.feature.apm.upi.impl.flow.pending_payment.UpiPendingPaymentFlow;
import com.revolut.feature.apm.upi.impl.flow.pending_payment.UpiPendingPaymentFlowContract$InputData;
import com.revolut.feature.apm.upi.impl.qr.screens.qrcode.UpiQrCodeScreen;
import com.revolut.feature.apm.upi.impl.screens.transfer_input_id_or_mobile.UpiTransferInputIdOrMobileScreen;
import com.revolut.feature.apm.upi.impl.screens.verify_account_prompt.VerifyAccountPromptFlow;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements ohi.a, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f3852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f3853b;

    public g(h navigationScreenProvider, ImmutableSet deeplinkGateways) {
        Intrinsics.checkNotNullParameter(navigationScreenProvider, "navigationScreenProvider");
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        this.f3852a = navigationScreenProvider;
        this.f3853b = deeplinkGateways;
    }

    @Override // ohi.a, nhi.h, aii.p
    public final void b() {
    }

    @Override // nhi.f
    public final aii.g c(aii.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof xe2.c) {
            return ((xe2.c) descriptor).a(new UpiQrCodeScreen());
        }
        return null;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        UpiPendingPaymentFlowContract$InputData pendingAction;
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof AccountVerificationExplainerDestination) {
            return new VerifyAccountPromptFlow();
        }
        if (destination instanceof UpiFeatureConfig.Destination.TransferInputIdOrMobileDestination) {
            return gc0.c.b(new UpiTransferInputIdOrMobileScreen(), new aab.b(1));
        }
        if (!(destination instanceof UpiFeatureConfig.Destination.PendingPaymentConfirmationDestination)) {
            if (destination instanceof UpiFeatureConfig.Destination.IntentPaymentDestination) {
                return new UpiIntentPaymentFlow(new UpiIntentPaymentFlowContract$InputData(((UpiFeatureConfig.Destination.IntentPaymentDestination) destination).f62934a));
            }
            if (destination instanceof UpiFeatureConfig.Destination.Transfer) {
                return this.f3852a.a((UpiFeatureConfig.Destination.Transfer) destination);
            }
            if (Intrinsics.f(destination, UpiFeatureConfig.Area.f62932g.f98274b)) {
                return new UpiFlow();
            }
            return null;
        }
        UpiFeatureConfig.Destination.PendingPaymentConfirmationDestination.InputData inputData = ((UpiFeatureConfig.Destination.PendingPaymentConfirmationDestination) destination).f62935a;
        if (inputData instanceof UpiFeatureConfig.Destination.PendingPaymentConfirmationDestination.InputData.PaymentId) {
            UpiFeatureConfig.Destination.PendingPaymentConfirmationDestination.InputData.PaymentId paymentId = (UpiFeatureConfig.Destination.PendingPaymentConfirmationDestination.InputData.PaymentId) inputData;
            pendingAction = new UpiPendingPaymentFlowContract$InputData.PaymentId(paymentId.f62937a, paymentId.f62938b);
        } else if (inputData instanceof UpiFeatureConfig.Destination.PendingPaymentConfirmationDestination.InputData.MandateDeeplink) {
            pendingAction = new UpiPendingPaymentFlowContract$InputData.MandateDeeplink(((UpiFeatureConfig.Destination.PendingPaymentConfirmationDestination.InputData.MandateDeeplink) inputData).f62936a);
        } else {
            if (!(inputData instanceof UpiFeatureConfig.Destination.PendingPaymentConfirmationDestination.InputData.PendingAction)) {
                throw new NoWhenBranchMatchedException();
            }
            pendingAction = new UpiPendingPaymentFlowContract$InputData.PendingAction(((UpiFeatureConfig.Destination.PendingPaymentConfirmationDestination.InputData.PendingAction) inputData).f62939a);
        }
        return new UpiPendingPaymentFlow(pendingAction);
    }

    @Override // aii.p
    public final Set h() {
        return this.f3853b;
    }
}
