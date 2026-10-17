package ss4;

import com.revolut.feature.credit.card.api.models.instalment.CreditCardCustomAmountQuote;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f265285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditCardCustomAmountQuote f265286b;

    public m(dj0.d repaymentAmount, CreditCardCustomAmountQuote quote) {
        Intrinsics.checkNotNullParameter(repaymentAmount, "repaymentAmount");
        Intrinsics.checkNotNullParameter(quote, "quote");
        this.f265285a = repaymentAmount;
        this.f265286b = quote;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f265285a, mVar.f265285a) && Intrinsics.f(this.f265286b, mVar.f265286b);
    }

    public final int hashCode() {
        return this.f265286b.hashCode() + (this.f265285a.hashCode() * 31);
    }
}
