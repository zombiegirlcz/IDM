package uk6;

import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction;
import com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final PaymentMethodDetails.Pse a(ApmPaymentAuthorisationPendingAction apmPaymentAuthorisationPendingAction) {
        Intrinsics.checkNotNullParameter(apmPaymentAuthorisationPendingAction, "<this>");
        PaymentMethodDetails paymentMethodDetails = apmPaymentAuthorisationPendingAction.getF61991a().f61995g;
        if (paymentMethodDetails instanceof PaymentMethodDetails.Pse) {
            return (PaymentMethodDetails.Pse) paymentMethodDetails;
        }
        return null;
    }
}
