package q75;

import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccountpicker.LoanRepaymentAccountModelExtension;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Loan f242742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LoanDetails f242743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LoanRepaymentAccountModelExtension.RepaymentAccountState f242744c;

    public e(Loan loan, LoanDetails loanDetails, LoanRepaymentAccountModelExtension.RepaymentAccountState selectedBalanceState) {
        Intrinsics.checkNotNullParameter(loan, "loan");
        Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
        Intrinsics.checkNotNullParameter(selectedBalanceState, "selectedBalanceState");
        this.f242742a = loan;
        this.f242743b = loanDetails;
        this.f242744c = selectedBalanceState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f242742a, eVar.f242742a) && Intrinsics.f(this.f242743b, eVar.f242743b) && Intrinsics.f(this.f242744c, eVar.f242744c);
    }

    public final int hashCode() {
        return this.f242744c.hashCode() + ((this.f242743b.hashCode() + (this.f242742a.hashCode() * 31)) * 31);
    }
}
