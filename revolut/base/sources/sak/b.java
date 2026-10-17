package sak;

import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmQuote f261437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PaymentPocketInfo f261438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hrf.h f261439c;

    public b(ApmQuote apmQuote, PaymentPocketInfo pocketInfo, hrf.h errorState) {
        Intrinsics.checkNotNullParameter(pocketInfo, "pocketInfo");
        Intrinsics.checkNotNullParameter(errorState, "errorState");
        this.f261437a = apmQuote;
        this.f261438b = pocketInfo;
        this.f261439c = errorState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f261437a, bVar.f261437a) && Intrinsics.f(this.f261438b, bVar.f261438b) && Intrinsics.f(this.f261439c, bVar.f261439c);
    }

    public final int hashCode() {
        ApmQuote apmQuote = this.f261437a;
        return this.f261439c.hashCode() + ((this.f261438b.hashCode() + ((apmQuote == null ? 0 : apmQuote.hashCode()) * 31)) * 31);
    }
}
