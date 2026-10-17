package vl9;

import com.revolut.feature.pay_with_smile.api.domain.model.PaymentConfirmationChallenge;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentConfirmationChallenge f290304a;

    public c(PaymentConfirmationChallenge challenge) {
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        this.f290304a = challenge;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f290304a, ((c) obj2).f290304a);
    }

    public final int hashCode() {
        return this.f290304a.hashCode();
    }
}
