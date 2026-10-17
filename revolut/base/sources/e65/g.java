package e65;

import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoanDetails f122899a;

    public g(LoanDetails loanDetails) {
        Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
        this.f122899a = loanDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f122899a, ((g) obj2).f122899a);
    }

    public final int hashCode() {
        return this.f122899a.hashCode();
    }
}
