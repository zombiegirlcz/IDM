package xk7;

import com.revolut.feature.insurance.api.models.CFACClaimExpense;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CFACClaimExpense f306615a;

    public d(CFACClaimExpense expense) {
        Intrinsics.checkNotNullParameter(expense, "expense");
        this.f306615a = expense;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f306615a, ((d) obj2).f306615a);
    }

    public final int hashCode() {
        return this.f306615a.hashCode();
    }
}
