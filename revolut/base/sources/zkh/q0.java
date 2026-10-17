package zkh;

import com.revolut.feature.wealth.api.domain.model.transactions.InvestTransaction;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestTransaction f323028a;

    public q0(InvestTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f323028a = transaction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q0) && Intrinsics.f(this.f323028a, ((q0) obj2).f323028a);
    }

    public final int hashCode() {
        return this.f323028a.hashCode();
    }
}
