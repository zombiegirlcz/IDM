package o65;

import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoanDetails f222503a;

    public c(LoanDetails loanDetails) {
        Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
        this.f222503a = loanDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f222503a, ((c) obj2).f222503a);
    }

    public final int hashCode() {
        return this.f222503a.hashCode();
    }
}
