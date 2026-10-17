package q75;

import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Loan f242751a;

    public final boolean equals(Object obj2) {
        if (obj2 instanceof l) {
            return Intrinsics.f(this.f242751a, ((l) obj2).f242751a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f242751a.hashCode();
    }

    public final String toString() {
        return "SeeRepaymentDetailsParcel(loan=" + this.f242751a + ")";
    }
}
