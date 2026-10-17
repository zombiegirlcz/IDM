package e7i;

import com.revolut.feature.shared.recurring_payments.models.WalletAutomation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletAutomation.Limit f123342a;

    public l(WalletAutomation.Limit limit) {
        Intrinsics.checkNotNullParameter(limit, "limit");
        this.f123342a = limit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f123342a, ((l) obj2).f123342a);
    }

    public final int hashCode() {
        return this.f123342a.hashCode();
    }
}
