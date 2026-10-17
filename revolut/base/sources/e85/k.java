package e85;

import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoanDetails f123588a;

    public final boolean equals(Object obj2) {
        if (obj2 instanceof k) {
            return Intrinsics.f(this.f123588a, ((k) obj2).f123588a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f123588a.hashCode();
    }

    public final String toString() {
        return "SeeRepaymentDetailsParcel(loanDetails=" + this.f123588a + ")";
    }
}
