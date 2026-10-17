package e85;

import com.revolut.feature.credit.loan.api.models.LoanRepaymentAccountData;
import kotlin.jvm.internal.Intrinsics;
import q35.g0;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f123585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LoanRepaymentAccountData f123586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0 f123587c;

    public j(LoanRepaymentAccountData loanRepaymentAccountData, dj0.d amount, g0 g0Var) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f123585a = amount;
        this.f123586b = loanRepaymentAccountData;
        this.f123587c = g0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f123585a, jVar.f123585a) && Intrinsics.f(this.f123586b, jVar.f123586b) && this.f123587c == jVar.f123587c;
    }

    public final int hashCode() {
        int iHashCode = this.f123585a.hashCode() * 31;
        LoanRepaymentAccountData loanRepaymentAccountData = this.f123586b;
        int iHashCode2 = (iHashCode + (loanRepaymentAccountData == null ? 0 : loanRepaymentAccountData.hashCode())) * 31;
        g0 g0Var = this.f123587c;
        return iHashCode2 + (g0Var != null ? g0Var.hashCode() : 0);
    }
}
