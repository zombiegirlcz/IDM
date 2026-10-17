package o65;

import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoanDetails f222504a;

    public d() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f222504a, ((d) obj2).f222504a);
    }

    public final int hashCode() {
        LoanDetails loanDetails = this.f222504a;
        if (loanDetails == null) {
            return 0;
        }
        return loanDetails.hashCode();
    }

    public d(LoanDetails loanDetails) {
        this.f222504a = loanDetails;
    }
}
