package e65;

import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Loan f122897a;

    public e(Loan loan) {
        Intrinsics.checkNotNullParameter(loan, "loan");
        this.f122897a = loan;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f122897a, ((e) obj2).f122897a);
    }

    public final int hashCode() {
        return this.f122897a.hashCode();
    }
}
