package zb6;

import com.revolut.feature.donations.api.model.quote.DonationQuoteRequest;
import com.revolut.feature.donations.api.model.quote.DonationQuoteResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DonationQuoteResponse f320810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DonationQuoteRequest f320811b;

    public j(DonationQuoteRequest quoteRequest, DonationQuoteResponse quote) {
        Intrinsics.checkNotNullParameter(quote, "quote");
        Intrinsics.checkNotNullParameter(quoteRequest, "quoteRequest");
        this.f320810a = quote;
        this.f320811b = quoteRequest;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f320810a, jVar.f320810a) && Intrinsics.f(this.f320811b, jVar.f320811b);
    }

    public final int hashCode() {
        return this.f320811b.hashCode() + (this.f320810a.hashCode() * 31);
    }
}
