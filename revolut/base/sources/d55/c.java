package d55;

import com.revolut.feature.credit.loan.api.models.rev10.LoanAccrual;
import com.revolut.feature.credit.loan.api.models.rev10.LoanRepaymentAccountDetails;
import com.revolut.feature.credit.loan.api.models.rev10.i;
import i55.a0;
import java.time.ZonedDateTime;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import q35.b0;
import q35.c0;
import q35.d0;
import q35.e0;
import q35.i0;
import q35.j0;
import q35.k0;
import q35.l0;
import q35.m0;
import zhm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes21.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f111351a = r0.k(new Pair("LOAN_INACTIVE", j0.LoanInactive), new Pair("TOGGLED_OFF", j0.ToggledOff), new Pair("AMOUNT_TOO_SMALL", j0.AmountTooSmall));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f111352b = r0.k(new Pair("LOAN_INACTIVE", l0.LoanInactive), new Pair("TOGGLED_OFF", l0.ToggledOff));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f111353c = q0.c(new Pair("TOGGLED_OFF", m0.ToggledOff));
    public static final Object d;
    public static final Object e;
    public static final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f111354g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f111355h;
    public static final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f111356j;
    public static final Object k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Object f111357l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f111358m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Object f111359n;
    public static final Object o;

    static {
        Pair pair = new Pair("LOAN_INACTIVE", k0.LoanInactive);
        Pair pair2 = new Pair("LOAN_AGREEMENT_TERMINATED", k0.LoanAgreementTerminated);
        Pair pair3 = new Pair("LOAN_AGREEMENT_CANCELLED", k0.LoanAgreementCancelled);
        Pair pair4 = new Pair("TOGGLED_OFF", k0.ToggledOff);
        Pair pair5 = new Pair("REPAYMENT_DAY_CHANGE_ALREADY_DONE", k0.RepaymentDayChangeAlreadyDone);
        Pair pair6 = new Pair("LIMIT_PER_PERIOD_REACHED", k0.LimitPerPeriodReached);
        Pair pair7 = new Pair("LOAN_HAS_ZERO_LOAN_AMOUNT_RENEGOTIATION_ACTIVE", k0.LoanHasZeroLoanAmountRenegotiationActive);
        Pair pair8 = new Pair("LOAN_HAS_INTEREST_ONLY_WITHOUT_TERM_EXTENSION_RENEGOTIATION_ACTIVE", k0.LoanHasInterestOnlyWithoutTermExtensionRenegotiationActive);
        Pair pair9 = new Pair("LOAN_HAS_REPAYMENT_DEFERRAL_RENEGOTIATION_ACTIVE", k0.LoanHasRepaymentDeferralRenegotiationActive);
        Pair pair10 = new Pair("LOAN_HAS_PROLONGATION_RENEGOTIATION_ACTIVE", k0.LoanHasProlongationRenegotiationActive);
        Pair pair11 = new Pair("LOAN_HAS_INTEREST_FREE_PERIOD_RENEGOTIATION_ACTIVE", k0.LoanHasInterestFreePeriodRenegotiationActive);
        Pair pair12 = new Pair("LOAN_HAS_TOKEN_REPAYMENT_PLAN_ACTIVE", k0.LoanHasTokenRepaymentPlanActive);
        Pair pair13 = new Pair("LOAN_IN_OVERDUE", k0.LoanInOverdue);
        Pair pair14 = new Pair("LOAN_HAS_OUTSTANDING_REPAYMENT", k0.LoanHasOutstandingRepayment);
        k0 k0Var = k0.LoanHasNoScheduledRepaymentsPaid;
        d = r0.k(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, new Pair("LOAN_HAS_NO_SCHEDULED_REPAYMENTS_PAID", k0Var), new Pair("LOAN_HAS_NO_SCHEDULED_REPAYMENTS_LEFT", k0Var), new Pair("LOAN_IN_SUBMISSION_WINDOW", k0.LoanInSubmissionWindow), new Pair("LOAN_HAS_PENDING_REPAYMENT_REQUEST", k0.LoanHasPendingRepaymentRequest), new Pair("UNKNOWN", k0.Unknown));
        e = r0.k(new Pair("LOAN_INACTIVE", i0.LoanInactive), new Pair("NOT_SUPPORTED", i0.NotSupported), new Pair("TOGGLED_OFF", i0.ToggledOff), new Pair("LOAN_ALREADY_CANCELLED", i0.LoanAlreadyCancelled), new Pair("LOAN_NOT_IN_COOLDOWN_PERIOD", i0.LoanNotInCooldownPeriod), new Pair("DISBURSAL_IN_PROGRESS", i0.DisbursalInProgress));
        f = r0.k(new Pair("ACTIVE", com.revolut.feature.credit.loan.api.models.rev10.b.Active), new Pair("INACTIVE", com.revolut.feature.credit.loan.api.models.rev10.b.Inactive));
        f111354g = r0.k(new Pair("DIRECT_DEBIT", com.revolut.feature.credit.loan.api.models.rev10.c.DirectDebit), new Pair("WALLET", com.revolut.feature.credit.loan.api.models.rev10.c.Wallet));
        f111355h = r0.k(new Pair("ACTIVE", q35.a.Active), new Pair("DISABLED", q35.a.Disabled));
        i = r0.k(new Pair("DIRECT_DEBIT", q35.b.DirectDebit), new Pair("WALLET", q35.b.Wallet));
        f111356j = r0.k(new Pair("ACTIVE", q35.c.Active), new Pair("INACTIVE", q35.c.Inactive));
        k = r0.k(new Pair("EURIBOR_3", i.euribor3), new Pair("EURIBOR_6", i.euribor6));
        f111357l = r0.k(new Pair("YEARS_5", com.revolut.feature.credit.loan.api.models.rev10.f.Years5), new Pair("YEARS_3", com.revolut.feature.credit.loan.api.models.rev10.f.Years3));
        f111358m = r0.k(new Pair("FIXED", e.Fixed), new Pair("VARIABLE", e.Variable), new Pair("TEMPORARY_FIXED", e.TemporaryFixed));
        f111359n = r0.k(new Pair("AUTO", d0.Auto), new Pair("MANUAL", d0.Manual));
        o = r0.k(new Pair("SCHEDULED", q35.i.SCHEDULED), new Pair("PAID", q35.i.PAID), new Pair("CANCELED", q35.i.CANCELED), new Pair("LATE", q35.i.LATE), new Pair("OUTSTANDING", q35.i.OUTSTANDING), new Pair("CLAIMED", q35.i.CLAIMED), new Pair("UNKNOWN", q35.i.UNKNOWN));
    }

    public static final LoanAccrual a(i55.b bVar, xi0.b currency) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(currency, "currency");
        dj0.d dVar = new dj0.d(bVar.getAmount(), currency);
        Long stampDuty = bVar.getStampDuty();
        return new LoanAccrual(dVar, stampDuty != null ? new dj0.d(stampDuty.longValue(), currency) : null);
    }

    public static final LoanAccrual b(o45.c cVar, xi0.b currency) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(currency, "currency");
        dj0.d dVar = new dj0.d(cVar.f222018a, currency);
        Long l2 = cVar.f222019b;
        return new LoanAccrual(dVar, l2 != null ? new dj0.d(l2.longValue(), currency) : null);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.Map] */
    public static final e0 c(i55.d0 d0Var) {
        LoanRepaymentAccountDetails loanRepaymentAccountDetails;
        LoanRepaymentAccountDetails loanRepaymentAccountDetails2;
        b0 b0Var;
        b0 b0Var2;
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        xi0.a aVar = xi0.b.Companion;
        String currency = d0Var.getCurrency();
        aVar.getClass();
        xi0.b bVarA = xi0.a.a(currency);
        String id10 = d0Var.getId();
        String transactionId = d0Var.getTransactionId();
        ZonedDateTime repaymentDateTime = d0Var.getRepaymentDateTime();
        dj0.d dVar = new dj0.d(d0Var.getAmount(), bVarA);
        d0 d0Var2 = (d0) u1.u(d0Var.getType(), f111359n);
        String clientId = d0Var.getClientId();
        String firstName = d0Var.getFirstName();
        String lastName = d0Var.getLastName();
        Long principal = d0Var.getPrincipal();
        dj0.d dVar2 = principal != null ? new dj0.d(principal.longValue(), bVarA) : null;
        Long accruedInterest = d0Var.getAccruedInterest();
        dj0.d dVar3 = accruedInterest != null ? new dj0.d(accruedInterest.longValue(), bVarA) : null;
        Long lateRepaymentInterest = d0Var.getLateRepaymentInterest();
        dj0.d dVar4 = lateRepaymentInterest != null ? new dj0.d(lateRepaymentInterest.longValue(), bVarA) : null;
        String transferType = d0Var.getTransferType();
        c0 c0VarValueOf = transferType != null ? c0.valueOf(transferType) : null;
        a0 accountDetails = d0Var.getAccountDetails();
        if (accountDetails != null) {
            Intrinsics.checkNotNullParameter(accountDetails, "<this>");
            loanRepaymentAccountDetails = new LoanRepaymentAccountDetails(accountDetails.getAccountNumber(), accountDetails.getInternalPocketId());
        } else {
            loanRepaymentAccountDetails = null;
        }
        String insuranceType = d0Var.getInsuranceType();
        if (insuranceType != null) {
            b0[] b0VarArrValues = b0.values();
            int length = b0VarArrValues.length;
            loanRepaymentAccountDetails2 = loanRepaymentAccountDetails;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    b0Var2 = null;
                    break;
                }
                b0 b0Var3 = b0VarArrValues[i2];
                int i3 = i2;
                b0[] b0VarArr = b0VarArrValues;
                if (kotlin.text.a0.z(b0Var3.name(), insuranceType, true)) {
                    b0Var2 = b0Var3;
                    break;
                }
                i2 = i3 + 1;
                b0VarArrValues = b0VarArr;
            }
            b0Var = b0Var2;
        } else {
            loanRepaymentAccountDetails2 = loanRepaymentAccountDetails;
            b0Var = null;
        }
        return new e0(id10, transactionId, repaymentDateTime, dVar, d0Var2, clientId, firstName, lastName, dVar2, dVar3, dVar4, c0VarValueOf, loanRepaymentAccountDetails2, b0Var);
    }

    public static final o45.c d(LoanAccrual loanAccrual) {
        Intrinsics.checkNotNullParameter(loanAccrual, "<this>");
        long j2 = loanAccrual.f70124a.f115082a;
        dj0.d dVar = loanAccrual.f70125b;
        return new o45.c(dVar != null ? Long.valueOf(dVar.f115082a) : null, j2);
    }
}
