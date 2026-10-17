package com.revolut.retail.feature.payments.payment_links.impl.ui.details;

import com.revolut.domain.models.moneyrequest.TransferLinkState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/payments/payment_links/impl/ui/details/PaymentLinkNotActiveException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "toString", "()Ljava/lang/String;", "feature_payments_payment_links_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentLinkNotActiveException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferLinkState f102184a;

    public PaymentLinkNotActiveException(TransferLinkState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f102184a = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof PaymentLinkNotActiveException) && this.f102184a == ((PaymentLinkNotActiveException) obj2).f102184a;
    }

    public final int hashCode() {
        return this.f102184a.hashCode();
    }
}
