package e85;

import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccountpicker.LoanRepaymentAccountModelExtension;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoanDetails f123579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LoanRepaymentAccountModelExtension.RepaymentAccountState f123580b;

    public f(LoanDetails loanDetails, LoanRepaymentAccountModelExtension.RepaymentAccountState selectedAccountState) {
        Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
        Intrinsics.checkNotNullParameter(selectedAccountState, "selectedAccountState");
        this.f123579a = loanDetails;
        this.f123580b = selectedAccountState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f123579a, fVar.f123579a) && Intrinsics.f(this.f123580b, fVar.f123580b);
    }

    public final int hashCode() {
        return this.f123580b.hashCode() + (this.f123579a.hashCode() * 31);
    }
}
