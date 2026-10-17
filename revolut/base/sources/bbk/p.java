package bbk;

import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$Decline;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class p extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PendingPaymentResult$Decline f14336a;

    public p(PendingPaymentResult$Decline result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f14336a = result;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f14336a, ((p) obj2).f14336a);
    }

    public final int hashCode() {
        return this.f14336a.hashCode();
    }
}
