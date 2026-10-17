package bbk;

import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$Accept;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PendingPaymentResult$Accept f14333a;

    public n(PendingPaymentResult$Accept result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f14333a = result;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f14333a, ((n) obj2).f14333a);
    }

    public final int hashCode() {
        return this.f14333a.hashCode();
    }
}
