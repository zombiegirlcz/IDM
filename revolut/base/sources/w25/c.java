package w25;

import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Loan f293944a;

    public c(Loan loan) {
        Intrinsics.checkNotNullParameter(loan, "loan");
        this.f293944a = loan;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f293944a, ((c) obj2).f293944a);
    }

    public final int hashCode() {
        return this.f293944a.hashCode();
    }
}
