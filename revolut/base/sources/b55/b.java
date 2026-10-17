package b55;

import com.revolut.feature.credit.loan.api.models.rev10.LoanState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import q35.t;
import ux4.i;
import ux4.j;
import ux4.k;
import ux4.l;
import ux4.m;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f12435a;

    public b(c loanHelpVariantProvider) {
        Intrinsics.checkNotNullParameter(loanHelpVariantProvider, "loanHelpVariantProvider");
        this.f12435a = loanHelpVariantProvider;
    }

    public final m a(t loan) {
        l variant;
        Intrinsics.checkNotNullParameter(loan, "loan");
        LoanState state = loan.getI();
        this.f12435a.getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        if ((state instanceof LoanState.Healthy) || (state instanceof LoanState.Outstanding) || (state instanceof LoanState.Overdue) || (state instanceof LoanState.Forbearance)) {
            variant = l.FAQ_AND_FINANCIAL_DIFFICULTIES;
        } else {
            if (!(state instanceof LoanState.Cancelled) && !(state instanceof LoanState.Planned) && !(state instanceof LoanState.Repaid) && !(state instanceof LoanState.Terminated)) {
                throw new NoWhenBranchMatchedException();
            }
            variant = l.FAQ;
        }
        int i = a.f12434a[loan.getO().ordinal()];
        if (i == 1 || i == 2) {
            i iVar = m.Companion;
            String facilityId = loan.getF70108a();
            String str = loan.getF().f241822h;
            iVar.getClass();
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            Intrinsics.checkNotNullParameter(variant, "variant");
            return new m(new k(facilityId, j.LOAN), variant, str);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        i iVar2 = m.Companion;
        String facilityId2 = loan.getF70108a();
        String str2 = loan.getF().f241822h;
        iVar2.getClass();
        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
        Intrinsics.checkNotNullParameter(variant, "variant");
        return new m(new k(facilityId2, j.MORTGAGE), variant, str2);
    }
}
