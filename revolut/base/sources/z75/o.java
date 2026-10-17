package z75;

import com.revolut.data.model.Data;
import com.revolut.feature.credit.loan.api.models.LoanRepaymentTerms;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import kotlin.jvm.internal.Intrinsics;
import q35.g0;

/* JADX INFO: loaded from: classes21.dex */
public final class o implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoanRepaymentTerms f319924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LoanDetails f319925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f319926c;
    public final Data d;
    public final g0 e;

    public o(LoanRepaymentTerms terms, LoanDetails loanDetails, boolean z, Data selectedRepaymentAccountState, g0 g0Var) {
        Intrinsics.checkNotNullParameter(terms, "terms");
        Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
        Intrinsics.checkNotNullParameter(selectedRepaymentAccountState, "selectedRepaymentAccountState");
        this.f319924a = terms;
        this.f319925b = loanDetails;
        this.f319926c = z;
        this.d = selectedRepaymentAccountState;
        this.e = g0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f319924a, oVar.f319924a) && Intrinsics.f(this.f319925b, oVar.f319925b) && this.f319926c == oVar.f319926c && Intrinsics.f(this.d, oVar.d) && this.e == oVar.e;
    }

    public final int hashCode() {
        int iC = kii.e.c(this.d, j6.a.c((this.f319925b.hashCode() + (this.f319924a.hashCode() * 31)) * 31, 31, this.f319926c), 31);
        g0 g0Var = this.e;
        return iC + (g0Var == null ? 0 : g0Var.hashCode());
    }
}
