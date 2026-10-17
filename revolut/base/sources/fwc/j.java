package fwc;

import com.revolut.data.model.Data;
import com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreenContract$LimitFlowType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f138606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransactionsLimitsScreenContract$LimitFlowType f138607b;

    public j(Data combinedLimits, TransactionsLimitsScreenContract$LimitFlowType transactionsLimitsScreenContract$LimitFlowType) {
        Intrinsics.checkNotNullParameter(combinedLimits, "combinedLimits");
        this.f138606a = combinedLimits;
        this.f138607b = transactionsLimitsScreenContract$LimitFlowType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f138606a, jVar.f138606a) && Intrinsics.f(this.f138607b, jVar.f138607b);
    }

    public final int hashCode() {
        int iHashCode = this.f138606a.hashCode() * 31;
        TransactionsLimitsScreenContract$LimitFlowType transactionsLimitsScreenContract$LimitFlowType = this.f138607b;
        return iHashCode + (transactionsLimitsScreenContract$LimitFlowType == null ? 0 : transactionsLimitsScreenContract$LimitFlowType.hashCode());
    }
}
