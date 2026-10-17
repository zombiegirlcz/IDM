package c55;

import com.revolut.feature.credit.loan.api.models.LoanRepaymentTerms;
import i55.f0;
import kotlin.Pair;
import zhm.r0;

/* JADX INFO: loaded from: classes21.dex */
public abstract class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f21442a = r0.k(new Pair("PARTIAL_HEALTHY", n35.h.PartialHealthy), new Pair("PARTIAL_OUTSTANDING", n35.h.PartialOutstanding), new Pair("PARTIAL_OVERDUE", n35.h.PartialOverdue), new Pair("PARTIAL_OUTSTANDING_OVERDUE", n35.h.PartialOutstandingOverdue), new Pair("FULL_REPAYMENT", n35.h.FullRepayment));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f21443b = r0.k(new Pair("EXACT_DUE_AMOUNT", n35.i.ExactDueAmount), new Pair("LESS_THAN_DUE", n35.i.LessThanDue), new Pair("MORE_THAN_DUE", n35.i.MoreThanDue));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f21444c = r0.k(new Pair("INSTANT_REPAYMENT", n35.d.InstantRepayment), new Pair("CONFIRMATION_NECESSARY", n35.d.ConfirmationNecessary));
    public static final Object d = r0.k(new Pair("FEE_FREE", n35.g.FeeFree), new Pair("INTEREST_FREE", n35.g.InterestFree));
    public static final Object e = r0.k(new Pair("MONTHLY_PAYMENT_REDUCTION", n35.f.MonthlyPaymentReduction), new Pair("FINAL_PAYMENT_REDUCTION", n35.f.FinalPaymentReduction), new Pair("NEXT_PAYMENT_REDUCTION", n35.f.NextPaymentReduction), new Pair("TERM_REDUCTION", n35.f.TermReduction));
    public static final Object f = r0.k(new Pair("EQUAL", n35.e.Equal), new Pair("DECREASING", n35.e.Decreasing));

    public static final LoanRepaymentTerms.AmountDifference a(f0.a aVar, xi0.b bVar) {
        dj0.d dVar = new dj0.d(aVar.getCurrent(), bVar);
        Long l2 = aVar.getNew();
        return new LoanRepaymentTerms.AmountDifference(dVar, l2 != null ? new dj0.d(l2.longValue(), bVar) : null);
    }
}
