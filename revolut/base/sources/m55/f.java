package m55;

import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import k55.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0005\u0010\fR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u0019R\u001a\u0010 \u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\u0004R\u001a\u0010#\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\u0004R\u001a\u0010$\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b\u001e\u0010\u0004R\u001a\u0010%\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\n\u0010\u0014R\u001c\u0010'\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0006\u001a\u0004\b\u0017\u0010\u0004R \u0010-\u001a\b\u0012\u0004\u0012\u00020)0(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010,R\u001a\u00103\u001a\u00020.8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001c\u00108\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001a\u0010=\u001a\u0002098\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b/\u0010<R\u001c\u0010@\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010>\u001a\u0004\b!\u0010?R\u001a\u0010F\u001a\u00020A8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001a\u0010G\u001a\u00020A8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010C\u001a\u0004\bB\u0010ER\u001a\u0010I\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010\u0018\u001a\u0004\bH\u0010\u0019R\u001a\u0010K\u001a\u00020.8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bJ\u00100\u001a\u0004\b4\u00102R\u001a\u0010M\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010\u0018\u001a\u0004\b:\u0010\u0019R\u001a\u0010P\u001a\u0002098\u0006X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010;\u001a\u0004\bO\u0010<R \u0010R\u001a\b\u0012\u0004\u0012\u00020)0(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010*\u001a\u0004\bQ\u0010,R\u001a\u0010U\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bS\u0010\u000b\u001a\u0004\bT\u0010\fR\u001a\u0010V\u001a\u0002098\u0006X\u0087\u0004¢\u0006\f\n\u0004\bT\u0010;\u001a\u0004\b\u000b\u0010<R \u0010Y\u001a\b\u0012\u0004\u0012\u00020W0(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bQ\u0010*\u001a\u0004\bX\u0010,R\u001c\u0010Z\u001a\u0004\u0018\u00010.8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u00100\u001a\u0004\bN\u00102R\u001c\u0010[\u001a\u0004\u0018\u00010.8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u00100\u001a\u0004\bL\u00102R\u001a\u0010\\\u001a\u00020.8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bX\u00100\u001a\u0004\b&\u00102R\u001a\u0010^\u001a\u0002098\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010;\u001a\u0004\b]\u0010<R\u001a\u0010`\u001a\u00020.8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b_\u00100\u001a\u0004\bJ\u00102R\u001a\u0010b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\ba\u0010\u0006\u001a\u0004\b\u001b\u0010\u0004R\u001a\u0010e\u001a\u00020.8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bc\u00100\u001a\u0004\bd\u00102R\u001a\u0010j\u001a\u00020f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010g\u001a\u0004\bh\u0010iR\u001a\u0010l\u001a\u0002098\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010;\u001a\u0004\bk\u0010<R\u001c\u0010o\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010m\u001a\u0004\bS\u0010nR\u001a\u0010p\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\bh\u0010\u0018\u001a\u0004\b_\u0010\u0019R\u001a\u0010q\u001a\u0002098\u0006X\u0087\u0004¢\u0006\f\n\u0004\bd\u0010;\u001a\u0004\b\u0012\u0010<R \u0010s\u001a\b\u0012\u0004\u0012\u00020r0(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bk\u0010*\u001a\u0004\ba\u0010,R \u0010u\u001a\b\u0012\u0004\u0012\u00020t0(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b]\u0010*\u001a\u0004\bc\u0010,R\u001c\u0010v\u001a\u0004\u0018\u00010.8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bO\u00100\u001a\u0004\b\u0013\u00102R\u001a\u0010x\u001a\u0002098\u0006X\u0087\u0004¢\u0006\f\n\u0004\bw\u0010;\u001a\u0004\bw\u0010<¨\u0006y"}, d2 = {"Lm55/f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "l", "id", "", "b", "J", "()J", "amount", "c", "H", "state", "", "d", "D", "()D", "apr", "", "e", "I", "()I", "term", "f", "j", "duration", "g", "p", "loanName", "h", "i", "disburseDateTime", "currency", "annualInterestRate", "k", "cardId", "", "Lm55/b;", "Ljava/util/List;", "A", "()Ljava/util/List;", "payments", "Ljo3/a;", "m", "Ljo3/a;", "r", "()Ljo3/a;", "minPartialRepaymentAmount", "n", "Lm55/b;", "s", "()Lm55/b;", "nextRepayment", "", "o", "Z", "()Z", "inCooldownPeriod", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "daysPastDue", "Lm55/c;", "q", "Lm55/c;", "B", "()Lm55/c;", "payoffAmountBreakdown", "maxPartialRepaymentAmountBreakdown", "w", "overdueRepaymentsCount", "t", "leftPrincipalAmount", "u", "leftRepaymentsCount", "v", "O", "isPaymentOverdue", "z", "paidRepayments", "x", "y", "paidRepaymentAmount", "terminatedState", "Lm55/e;", "C", "renegotiations", "overdueBalance", "outstandingBalance", "fullOutstandingBalance", "N", "isOutstanding", "E", "oneTimeFee", "F", "countryCode", "G", "L", "totalRepayable", "Lk55/t;", "Lk55/t;", "K", "()Lk55/t;", "toggleStatus", "M", "isCancelled", "Ljava/lang/Long;", "()Ljava/lang/Long;", "paidDate", "repaymentDay", "canChangeDirectDebit", "Lm55/g;", "repaymentRequests", "Lm55/h;", "repaymentSources", "repaymentAmount", "P", "isRefinanced", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final /* data */ class f {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @lg.b("overdueBalance")
    private final jo3.a overdueBalance;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @lg.b("outstandingBalance")
    private final jo3.a outstandingBalance;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @lg.b("fullOutstandingBalance")
    @NotNull
    private final jo3.a fullOutstandingBalance;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @lg.b("isOutstanding")
    private final boolean isOutstanding;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @lg.b("oneTimeFee")
    @NotNull
    private final jo3.a oneTimeFee;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @lg.b("countryCode")
    @NotNull
    private final String countryCode;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @lg.b("totalRepayable")
    @NotNull
    private final jo3.a totalRepayable;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @lg.b("toggleStatus")
    @NotNull
    private final t toggleStatus;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @lg.b("isCancelled")
    private final boolean isCancelled;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @lg.b("repaidDate")
    private final Long paidDate;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @lg.b("repaymentDay")
    private final int repaymentDay;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @lg.b("canChangeDirectDebit")
    private final boolean canChangeDirectDebit;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @lg.b("repaymentRequests")
    @NotNull
    private final List<g> repaymentRequests;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @lg.b("repaymentSources")
    @NotNull
    private final List<h> repaymentSources;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    @lg.b("repaymentAmount")
    private final jo3.a repaymentAmount;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @lg.b("refinanced")
    private final boolean isRefinanced;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    private final long amount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("apr")
    private final double apr;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("term")
    private final int term;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("duration")
    private final int duration;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("loanName")
    @NotNull
    private final String loanName;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("disbursalDateTime")
    @NotNull
    private final String disburseDateTime;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("annualInterestRate")
    private final double annualInterestRate;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("cardId")
    private final String cardId;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("payments")
    @NotNull
    private final List<b> payments;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("minPartialRepaymentAmount")
    @NotNull
    private final jo3.a minPartialRepaymentAmount;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("nextRepayment")
    private final b nextRepayment;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("inCooldownPeriod")
    private final boolean inCooldownPeriod;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("daysPastDue")
    private final Integer daysPastDue;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("payoffAmountBreakdown")
    @NotNull
    private final c payoffAmountBreakdown;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("maxPartialRepaymentAmountBreakdown")
    @NotNull
    private final c maxPartialRepaymentAmountBreakdown;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("overdueRepaymentsCount")
    private final int overdueRepaymentsCount;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("leftPrincipalAmount")
    @NotNull
    private final jo3.a leftPrincipalAmount;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("leftRepaymentsCount")
    private final int leftRepaymentsCount;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("isPaymentOverdue")
    private final boolean isPaymentOverdue;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("paidRepayments")
    @NotNull
    private final List<b> paidRepayments;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @lg.b("paidRepaymentAmount")
    private final long paidRepaymentAmount;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @lg.b("agreementTerminatedFlag")
    private final boolean terminatedState;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @lg.b("renegotiations")
    @NotNull
    private final List<e> renegotiations;

    public f(String id10, long j2, String state, double d, int i, int i2, String loanName, String disburseDateTime, String currency, double d5, String str, ArrayList payments, jo3.a minPartialRepaymentAmount, b bVar, boolean z, Integer num, c payoffAmountBreakdown, c maxPartialRepaymentAmountBreakdown, int i3, jo3.a leftPrincipalAmount, int i5, boolean z3, ArrayList paidRepayments, long j3, boolean z4, ArrayList renegotiations, jo3.a aVar, jo3.a aVar2, jo3.a fullOutstandingBalance, boolean z6, jo3.a oneTimeFee, String countryCode, jo3.a totalRepayable, t toggleStatus, boolean z11, Long l2, int i6, boolean z12, ArrayList repaymentRequests, ArrayList repaymentSources, jo3.a aVar3, boolean z29) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(loanName, "loanName");
        Intrinsics.checkNotNullParameter(disburseDateTime, "disburseDateTime");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(payments, "payments");
        Intrinsics.checkNotNullParameter(minPartialRepaymentAmount, "minPartialRepaymentAmount");
        Intrinsics.checkNotNullParameter(payoffAmountBreakdown, "payoffAmountBreakdown");
        Intrinsics.checkNotNullParameter(maxPartialRepaymentAmountBreakdown, "maxPartialRepaymentAmountBreakdown");
        Intrinsics.checkNotNullParameter(leftPrincipalAmount, "leftPrincipalAmount");
        Intrinsics.checkNotNullParameter(paidRepayments, "paidRepayments");
        Intrinsics.checkNotNullParameter(renegotiations, "renegotiations");
        Intrinsics.checkNotNullParameter(fullOutstandingBalance, "fullOutstandingBalance");
        Intrinsics.checkNotNullParameter(oneTimeFee, "oneTimeFee");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(totalRepayable, "totalRepayable");
        Intrinsics.checkNotNullParameter(toggleStatus, "toggleStatus");
        Intrinsics.checkNotNullParameter(repaymentRequests, "repaymentRequests");
        Intrinsics.checkNotNullParameter(repaymentSources, "repaymentSources");
        this.id = id10;
        this.amount = j2;
        this.state = state;
        this.apr = d;
        this.term = i;
        this.duration = i2;
        this.loanName = loanName;
        this.disburseDateTime = disburseDateTime;
        this.currency = currency;
        this.annualInterestRate = d5;
        this.cardId = str;
        this.payments = payments;
        this.minPartialRepaymentAmount = minPartialRepaymentAmount;
        this.nextRepayment = bVar;
        this.inCooldownPeriod = z;
        this.daysPastDue = num;
        this.payoffAmountBreakdown = payoffAmountBreakdown;
        this.maxPartialRepaymentAmountBreakdown = maxPartialRepaymentAmountBreakdown;
        this.overdueRepaymentsCount = i3;
        this.leftPrincipalAmount = leftPrincipalAmount;
        this.leftRepaymentsCount = i5;
        this.isPaymentOverdue = z3;
        this.paidRepayments = paidRepayments;
        this.paidRepaymentAmount = j3;
        this.terminatedState = z4;
        this.renegotiations = renegotiations;
        this.overdueBalance = aVar;
        this.outstandingBalance = aVar2;
        this.fullOutstandingBalance = fullOutstandingBalance;
        this.isOutstanding = z6;
        this.oneTimeFee = oneTimeFee;
        this.countryCode = countryCode;
        this.totalRepayable = totalRepayable;
        this.toggleStatus = toggleStatus;
        this.isCancelled = z11;
        this.paidDate = l2;
        this.repaymentDay = i6;
        this.canChangeDirectDebit = z12;
        this.repaymentRequests = repaymentRequests;
        this.repaymentSources = repaymentSources;
        this.repaymentAmount = aVar3;
        this.isRefinanced = z29;
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final List getPayments() {
        return this.payments;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final c getPayoffAmountBreakdown() {
        return this.payoffAmountBreakdown;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final List getRenegotiations() {
        return this.renegotiations;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final jo3.a getRepaymentAmount() {
        return this.repaymentAmount;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final int getRepaymentDay() {
        return this.repaymentDay;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final List getRepaymentRequests() {
        return this.repaymentRequests;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final List getRepaymentSources() {
        return this.repaymentSources;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final int getTerm() {
        return this.term;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final boolean getTerminatedState() {
        return this.terminatedState;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final t getToggleStatus() {
        return this.toggleStatus;
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final jo3.a getTotalRepayable() {
        return this.totalRepayable;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final boolean getIsCancelled() {
        return this.isCancelled;
    }

    /* JADX INFO: renamed from: N, reason: from getter */
    public final boolean getIsOutstanding() {
        return this.isOutstanding;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final boolean getIsPaymentOverdue() {
        return this.isPaymentOverdue;
    }

    /* JADX INFO: renamed from: P, reason: from getter */
    public final boolean getIsRefinanced() {
        return this.isRefinanced;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final double getApr() {
        return this.apr;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getCanChangeDirectDebit() {
        return this.canChangeDirectDebit;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCardId() {
        return this.cardId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.id, fVar.id) && this.amount == fVar.amount && Intrinsics.f(this.state, fVar.state) && Double.compare(this.apr, fVar.apr) == 0 && this.term == fVar.term && this.duration == fVar.duration && Intrinsics.f(this.loanName, fVar.loanName) && Intrinsics.f(this.disburseDateTime, fVar.disburseDateTime) && Intrinsics.f(this.currency, fVar.currency) && Double.compare(this.annualInterestRate, fVar.annualInterestRate) == 0 && Intrinsics.f(this.cardId, fVar.cardId) && Intrinsics.f(this.payments, fVar.payments) && Intrinsics.f(this.minPartialRepaymentAmount, fVar.minPartialRepaymentAmount) && Intrinsics.f(this.nextRepayment, fVar.nextRepayment) && this.inCooldownPeriod == fVar.inCooldownPeriod && Intrinsics.f(this.daysPastDue, fVar.daysPastDue) && Intrinsics.f(this.payoffAmountBreakdown, fVar.payoffAmountBreakdown) && Intrinsics.f(this.maxPartialRepaymentAmountBreakdown, fVar.maxPartialRepaymentAmountBreakdown) && this.overdueRepaymentsCount == fVar.overdueRepaymentsCount && Intrinsics.f(this.leftPrincipalAmount, fVar.leftPrincipalAmount) && this.leftRepaymentsCount == fVar.leftRepaymentsCount && this.isPaymentOverdue == fVar.isPaymentOverdue && Intrinsics.f(this.paidRepayments, fVar.paidRepayments) && this.paidRepaymentAmount == fVar.paidRepaymentAmount && this.terminatedState == fVar.terminatedState && Intrinsics.f(this.renegotiations, fVar.renegotiations) && Intrinsics.f(this.overdueBalance, fVar.overdueBalance) && Intrinsics.f(this.outstandingBalance, fVar.outstandingBalance) && Intrinsics.f(this.fullOutstandingBalance, fVar.fullOutstandingBalance) && this.isOutstanding == fVar.isOutstanding && Intrinsics.f(this.oneTimeFee, fVar.oneTimeFee) && Intrinsics.f(this.countryCode, fVar.countryCode) && Intrinsics.f(this.totalRepayable, fVar.totalRepayable) && Intrinsics.f(this.toggleStatus, fVar.toggleStatus) && this.isCancelled == fVar.isCancelled && Intrinsics.f(this.paidDate, fVar.paidDate) && this.repaymentDay == fVar.repaymentDay && this.canChangeDirectDebit == fVar.canChangeDirectDebit && Intrinsics.f(this.repaymentRequests, fVar.repaymentRequests) && Intrinsics.f(this.repaymentSources, fVar.repaymentSources) && Intrinsics.f(this.repaymentAmount, fVar.repaymentAmount) && this.isRefinanced == fVar.isRefinanced;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Integer getDaysPastDue() {
        return this.daysPastDue;
    }

    public final int hashCode() {
        int iC = m72.b.c(p.a.c(p.a.c(p.a.c(j6.a.b(this.duration, j6.a.b(this.term, m72.b.c(p.a.c(a0.d.c(this.id.hashCode() * 31, 31, this.amount), 31, this.state), this.apr, 31), 31), 31), 31, this.loanName), 31, this.disburseDateTime), 31, this.currency), this.annualInterestRate, 31);
        String str = this.cardId;
        int iJ = v7.j(this.minPartialRepaymentAmount, p.a.d((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.payments), 31);
        b bVar = this.nextRepayment;
        int iC2 = j6.a.c((iJ + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.inCooldownPeriod);
        Integer num = this.daysPastDue;
        int iD = p.a.d(j6.a.c(a0.d.c(p.a.d(j6.a.c(j6.a.b(this.leftRepaymentsCount, v7.j(this.leftPrincipalAmount, j6.a.b(this.overdueRepaymentsCount, (this.maxPartialRepaymentAmountBreakdown.hashCode() + ((this.payoffAmountBreakdown.hashCode() + ((iC2 + (num == null ? 0 : num.hashCode())) * 31)) * 31)) * 31, 31), 31), 31), 31, this.isPaymentOverdue), 31, this.paidRepayments), 31, this.paidRepaymentAmount), 31, this.terminatedState), 31, this.renegotiations);
        jo3.a aVar = this.overdueBalance;
        int iHashCode = (iD + (aVar == null ? 0 : aVar.hashCode())) * 31;
        jo3.a aVar2 = this.outstandingBalance;
        int iC3 = j6.a.c((this.toggleStatus.hashCode() + v7.j(this.totalRepayable, p.a.c(v7.j(this.oneTimeFee, j6.a.c(v7.j(this.fullOutstandingBalance, (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31, 31), 31, this.isOutstanding), 31), 31, this.countryCode), 31)) * 31, 31, this.isCancelled);
        Long l2 = this.paidDate;
        int iD2 = p.a.d(p.a.d(j6.a.c(j6.a.b(this.repaymentDay, (iC3 + (l2 == null ? 0 : l2.hashCode())) * 31, 31), 31, this.canChangeDirectDebit), 31, this.repaymentRequests), 31, this.repaymentSources);
        jo3.a aVar3 = this.repaymentAmount;
        return Boolean.hashCode(this.isRefinanced) + ((iD2 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getDisburseDateTime() {
        return this.disburseDateTime;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final jo3.a getFullOutstandingBalance() {
        return this.fullOutstandingBalance;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getInCooldownPeriod() {
        return this.inCooldownPeriod;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final jo3.a getLeftPrincipalAmount() {
        return this.leftPrincipalAmount;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final int getLeftRepaymentsCount() {
        return this.leftRepaymentsCount;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getLoanName() {
        return this.loanName;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final c getMaxPartialRepaymentAmountBreakdown() {
        return this.maxPartialRepaymentAmountBreakdown;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final jo3.a getMinPartialRepaymentAmount() {
        return this.minPartialRepaymentAmount;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final b getNextRepayment() {
        return this.nextRepayment;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final jo3.a getOneTimeFee() {
        return this.oneTimeFee;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final jo3.a getOutstandingBalance() {
        return this.outstandingBalance;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final jo3.a getOverdueBalance() {
        return this.overdueBalance;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final int getOverdueRepaymentsCount() {
        return this.overdueRepaymentsCount;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final Long getPaidDate() {
        return this.paidDate;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final long getPaidRepaymentAmount() {
        return this.paidRepaymentAmount;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final List getPaidRepayments() {
        return this.paidRepayments;
    }
}
