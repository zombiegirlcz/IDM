package lk6;

import com.revolut.feature.external_accounts.api.model.brazil.payment_confirmation.BrazilPaymentConsentInput;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BrazilPaymentConsentInput f196246a;

    public j(BrazilPaymentConsentInput consentInput) {
        Intrinsics.checkNotNullParameter(consentInput, "consentInput");
        this.f196246a = consentInput;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f196246a, ((j) obj2).f196246a);
    }

    public final int hashCode() {
        return this.f196246a.hashCode();
    }
}
