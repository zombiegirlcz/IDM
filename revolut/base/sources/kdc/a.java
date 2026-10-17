package kdc;

import com.revolut.feature.revolutpay.api.shared.domain.models.payment.ExpandableDisclaimerConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExpandableDisclaimerConfiguration f182866a;

    public a(ExpandableDisclaimerConfiguration expandableDisclaimerConfiguration) {
        Intrinsics.checkNotNullParameter(expandableDisclaimerConfiguration, "expandableDisclaimerConfiguration");
        this.f182866a = expandableDisclaimerConfiguration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f182866a, ((a) obj2).f182866a);
    }

    public final int hashCode() {
        return this.f182866a.hashCode();
    }
}
