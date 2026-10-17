package wj7;

import com.revolut.feature.insurance.api.models.CFACClaimExpense;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CFACClaimExpense f297986a;

    public k(CFACClaimExpense expense) {
        Intrinsics.checkNotNullParameter(expense, "expense");
        this.f297986a = expense;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f297986a, ((k) obj2).f297986a);
    }

    public final int hashCode() {
        return this.f297986a.hashCode();
    }
}
