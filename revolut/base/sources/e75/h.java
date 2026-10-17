package e75;

import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoanDetails f123070a;

    public h(LoanDetails loanDetails) {
        Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
        this.f123070a = loanDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f123070a, ((h) obj2).f123070a);
    }

    public final int hashCode() {
        return this.f123070a.hashCode();
    }
}
