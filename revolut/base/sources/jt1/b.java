package jt1;

import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmQuote f178276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PaymentPocketInfo f178277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hrf.h f178278c;
    public final List d;

    public b(ApmQuote apmQuote, PaymentPocketInfo paymentPocketInfo, hrf.h errorState, List suggestions) {
        Intrinsics.checkNotNullParameter(errorState, "errorState");
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        this.f178276a = apmQuote;
        this.f178277b = paymentPocketInfo;
        this.f178278c = errorState;
        this.d = suggestions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f178276a, bVar.f178276a) && Intrinsics.f(this.f178277b, bVar.f178277b) && Intrinsics.f(this.f178278c, bVar.f178278c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        ApmQuote apmQuote = this.f178276a;
        int iHashCode = (apmQuote == null ? 0 : apmQuote.hashCode()) * 31;
        PaymentPocketInfo paymentPocketInfo = this.f178277b;
        return this.d.hashCode() + ((this.f178278c.hashCode() + ((iHashCode + (paymentPocketInfo != null ? paymentPocketInfo.hashCode() : 0)) * 31)) * 31);
    }
}
