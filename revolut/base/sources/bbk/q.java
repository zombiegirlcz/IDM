package bbk;

import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$Timeout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class q extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PendingPaymentResult$Timeout f14337a;

    public q(PendingPaymentResult$Timeout result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f14337a = result;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f14337a, ((q) obj2).f14337a);
    }

    public final int hashCode() {
        return this.f14337a.hashCode();
    }
}
