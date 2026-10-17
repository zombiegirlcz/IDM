package i85;

import com.revolut.feature.credit.loan.api.models.LoanRepaymentTerms;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccountpicker.LoanRepaymentAccountModelExtension;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoanDetails f159457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LoanRepaymentTerms f159458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LoanRepaymentAccountModelExtension.RepaymentAccountState f159459c;

    public m(LoanDetails loanDetails, LoanRepaymentTerms terms, LoanRepaymentAccountModelExtension.RepaymentAccountState selectedAccountState) {
        Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
        Intrinsics.checkNotNullParameter(terms, "terms");
        Intrinsics.checkNotNullParameter(selectedAccountState, "selectedAccountState");
        this.f159457a = loanDetails;
        this.f159458b = terms;
        this.f159459c = selectedAccountState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f159457a, mVar.f159457a) && Intrinsics.f(this.f159458b, mVar.f159458b) && Intrinsics.f(this.f159459c, mVar.f159459c);
    }

    public final int hashCode() {
        return this.f159459c.hashCode() + ((this.f159458b.hashCode() + (this.f159457a.hashCode() * 31)) * 31);
    }
}
