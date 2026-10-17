package c55;

import com.revolut.feature.credit.loan.api.models.rev10.LoanAccrual;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f21466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f21467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LoanAccrual f21468c;
    public final LoanAccrual d;

    public x(dj0.d principal, dj0.d dVar, LoanAccrual loanAccrual, LoanAccrual loanAccrual2) {
        Intrinsics.checkNotNullParameter(principal, "principal");
        this.f21466a = principal;
        this.f21467b = dVar;
        this.f21468c = loanAccrual;
        this.d = loanAccrual2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f21466a, xVar.f21466a) && Intrinsics.f(this.f21467b, xVar.f21467b) && Intrinsics.f(this.f21468c, xVar.f21468c) && Intrinsics.f(this.d, xVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f21466a.hashCode() * 31;
        dj0.d dVar = this.f21467b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        LoanAccrual loanAccrual = this.f21468c;
        int iHashCode3 = (iHashCode2 + (loanAccrual == null ? 0 : loanAccrual.hashCode())) * 31;
        LoanAccrual loanAccrual2 = this.d;
        return iHashCode3 + (loanAccrual2 != null ? loanAccrual2.hashCode() : 0);
    }
}
