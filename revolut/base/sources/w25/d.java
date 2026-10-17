package w25;

import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Loan f293945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f293946b;

    public d(Loan loan, ArrayList policies) {
        Intrinsics.checkNotNullParameter(loan, "loan");
        Intrinsics.checkNotNullParameter(policies, "policies");
        this.f293945a = loan;
        this.f293946b = policies;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f293945a, dVar.f293945a) && this.f293946b.equals(dVar.f293946b);
    }

    public final int hashCode() {
        return this.f293946b.hashCode() + (this.f293945a.hashCode() * 31);
    }
}
