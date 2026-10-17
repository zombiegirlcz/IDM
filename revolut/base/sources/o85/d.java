package o85;

import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoanDetails f222935a;

    public d(LoanDetails loanDetails) {
        Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
        this.f222935a = loanDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f222935a, ((d) obj2).f222935a);
    }

    public final int hashCode() {
        return this.f222935a.hashCode();
    }
}
