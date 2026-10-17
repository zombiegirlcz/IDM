package a32;

import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmQuote f1031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PaymentPocketInfo f1032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hrf.h f1033c;

    public n(ApmQuote apmQuote, PaymentPocketInfo paymentPocketInfo, hrf.h errorState) {
        Intrinsics.checkNotNullParameter(errorState, "errorState");
        this.f1031a = apmQuote;
        this.f1032b = paymentPocketInfo;
        this.f1033c = errorState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f1031a, nVar.f1031a) && Intrinsics.f(this.f1032b, nVar.f1032b) && Intrinsics.f(this.f1033c, nVar.f1033c);
    }

    public final int hashCode() {
        ApmQuote apmQuote = this.f1031a;
        int iHashCode = (apmQuote == null ? 0 : apmQuote.hashCode()) * 31;
        PaymentPocketInfo paymentPocketInfo = this.f1032b;
        return this.f1033c.hashCode() + ((iHashCode + (paymentPocketInfo != null ? paymentPocketInfo.hashCode() : 0)) * 31);
    }
}
