package w25;

import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Loan f293943a;

    public b(Loan loan) {
        Intrinsics.checkNotNullParameter(loan, "loan");
        this.f293943a = loan;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f293943a, ((b) obj2).f293943a);
    }

    public final int hashCode() {
        return this.f293943a.hashCode();
    }
}
