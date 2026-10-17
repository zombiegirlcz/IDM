package qb2;

import cli.j;
import com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails;
import com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetailsAmendment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentMethodDetails.PayTo.AdditionalInfo f244081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PaymentMethodDetailsAmendment.PayToPaymentMethodDetailsAmendment.AmendmentAdditionalInfo f244082b;

    public a(PaymentMethodDetails.PayTo.AdditionalInfo additionalInfo, PaymentMethodDetailsAmendment.PayToPaymentMethodDetailsAmendment.AmendmentAdditionalInfo amendmentAdditionalInfo) {
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        this.f244081a = additionalInfo;
        this.f244082b = amendmentAdditionalInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f244081a, aVar.f244081a) && Intrinsics.f(this.f244082b, aVar.f244082b);
    }

    public final int hashCode() {
        int iHashCode = this.f244081a.hashCode() * 31;
        PaymentMethodDetailsAmendment.PayToPaymentMethodDetailsAmendment.AmendmentAdditionalInfo amendmentAdditionalInfo = this.f244082b;
        return iHashCode + (amendmentAdditionalInfo == null ? 0 : amendmentAdditionalInfo.hashCode());
    }
}
