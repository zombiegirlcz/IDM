package e75;

import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoanDetails f123068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x35.e f123069b;

    public g(LoanDetails loanDetails, x35.e eVar) {
        Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
        this.f123068a = loanDetails;
        this.f123069b = eVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f123068a, gVar.f123068a) && Intrinsics.f(this.f123069b, gVar.f123069b);
    }

    public final int hashCode() {
        int iHashCode = this.f123068a.hashCode() * 31;
        x35.e eVar = this.f123069b;
        return iHashCode + (eVar == null ? 0 : eVar.hashCode());
    }
}
