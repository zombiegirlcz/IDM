package jh9;

import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmQuote f174163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PaymentPocketInfo f174164b;

    public g(ApmQuote apmQuote, PaymentPocketInfo paymentPocketInfo) {
        this.f174163a = apmQuote;
        this.f174164b = paymentPocketInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f174163a, gVar.f174163a) && Intrinsics.f(this.f174164b, gVar.f174164b);
    }

    public final int hashCode() {
        ApmQuote apmQuote = this.f174163a;
        int iHashCode = (apmQuote == null ? 0 : apmQuote.hashCode()) * 31;
        PaymentPocketInfo paymentPocketInfo = this.f174164b;
        return iHashCode + (paymentPocketInfo != null ? paymentPocketInfo.hashCode() : 0);
    }
}
