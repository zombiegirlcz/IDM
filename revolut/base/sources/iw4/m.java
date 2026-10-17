package iw4;

import com.revolut.feature.credit.card.api.models.instalment.CreditCardStatementDeferralQuote;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardStatementDeferralQuote f168951a;

    public m(CreditCardStatementDeferralQuote quote) {
        Intrinsics.checkNotNullParameter(quote, "quote");
        this.f168951a = quote;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f168951a, ((m) obj2).f168951a);
    }

    public final int hashCode() {
        return this.f168951a.hashCode();
    }
}
