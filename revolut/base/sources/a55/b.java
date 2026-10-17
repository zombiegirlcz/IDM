package a55;

import com.revolut.feature.credit.loan.api.models.LoanRepaymentTerms;
import dj0.d;
import pyd.c;

/* JADX INFO: loaded from: classes21.dex */
public abstract class b {
    public static final d a(LoanRepaymentTerms.AmountDifference amountDifference) {
        d dVar;
        if (amountDifference == null || (dVar = amountDifference.f70087b) == null) {
            return null;
        }
        return c.H(amountDifference.f70086a, dVar);
    }
}
