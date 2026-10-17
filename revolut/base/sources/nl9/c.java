package nl9;

import com.revolut.feature.pay_with_smile.api.domain.model.PaymentConfirmationChallenge;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentConfirmationChallenge f217100a;

    public c(PaymentConfirmationChallenge challenge) {
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        this.f217100a = challenge;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f217100a, ((c) obj2).f217100a);
    }

    public final int hashCode() {
        return this.f217100a.hashCode();
    }
}
