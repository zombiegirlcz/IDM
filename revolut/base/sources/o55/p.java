package o55;

import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import com.revolut.feature.credit.loan.api.models.rev10.LoanState;
import java.util.Comparator;

/* JADX INFO: loaded from: classes21.dex */
public final class p implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(!(((Loan) obj2).i instanceof LoanState.Repaid) ? 1 : num, ((Loan) obj3).i instanceof LoanState.Repaid ? 2 : 1);
    }
}
