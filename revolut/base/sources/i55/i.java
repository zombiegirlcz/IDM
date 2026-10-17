package i55;

import java.time.LocalDate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\t\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001a\u0010\u0019\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\u0004R\u001a\u0010\u001e\u001a\u00020\u001a8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\r\u0010\u001dR\u001a\u0010!\u001a\u00020\u001a8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001dR\u001a\u0010#\u001a\u00020\u001a8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b\u0005\u0010\u001dR\u001a\u0010)\u001a\u00020$8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010/\u001a\u00020*8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u00105\u001a\u0002008\u0016X\u0097\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u00107\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b6\u0010\u0006\u001a\u0004\b1\u0010\u0004R\u001a\u0010=\u001a\u0002088\u0016X\u0097\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010?\u001a\u0002088\u0016X\u0097\u0004¢\u0006\f\n\u0004\b>\u0010:\u001a\u0004\b\u001c\u0010<R\u001a\u0010E\u001a\u00020@8\u0016X\u0097\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001c\u0010J\u001a\u0004\u0018\u00010F8\u0016X\u0097\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\b%\u0010IR\u001c\u0010P\u001a\u0004\u0018\u00010K8\u0016X\u0097\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u001a\u0010S\u001a\u0002088\u0006X\u0087\u0004¢\u0006\f\n\u0004\bQ\u0010:\u001a\u0004\bR\u0010<R\u001a\u0010T\u001a\u0002088\u0006X\u0087\u0004¢\u0006\f\n\u0004\bR\u0010:\u001a\u0004\bQ\u0010<R\u001c\u0010V\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bU\u0010\u0006\u001a\u0004\b\u001f\u0010\u0004R\u001a\u0010Y\u001a\u00020\u001a8\u0016X\u0097\u0004¢\u0006\f\n\u0004\bW\u0010\u001c\u001a\u0004\bX\u0010\u001dR\u001c\u0010^\u001a\u0004\u0018\u00010\u001a8\u0016X\u0097\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u001a\u0010`\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b_\u0010\u001c\u001a\u0004\bG\u0010\u001dR\u001c\u0010b\u001a\u0004\u0018\u00010\u001a8\u0016X\u0097\u0004¢\u0006\f\n\u0004\ba\u0010[\u001a\u0004\b\u0012\u0010]R\u001a\u0010g\u001a\u00020c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\b\u001b\u0010fR\u001a\u0010i\u001a\u00020c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bh\u0010e\u001a\u0004\b\u0017\u0010fR\u001a\u0010k\u001a\u00020c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bj\u0010e\u001a\u0004\bA\u0010fR\u001a\u0010m\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bl\u0010\u001c\u001a\u0004\b>\u0010\u001dR\u001a\u0010q\u001a\u00020n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010o\u001a\u0004\b9\u0010pR\u001a\u0010v\u001a\u00020r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bU\u0010uR \u0010|\u001a\b\u0012\u0004\u0012\u00020x0w8\u0006X\u0087\u0004¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\b6\u0010{R\u001e\u0010\u0081\u0001\u001a\u0004\u0018\u00010}8\u0006X\u0087\u0004¢\u0006\r\n\u0004\b~\u0010\u007f\u001a\u0005\b\"\u0010\u0080\u0001R!\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0082\u00018\u0006X\u0087\u0004¢\u0006\u000f\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0005\b+\u0010\u0085\u0001R\u001e\u0010\u008a\u0001\u001a\u00030\u0087\u00018\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b:\u0010\u0088\u0001\u001a\u0005\bL\u0010\u0089\u0001R!\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008b\u00018\u0016X\u0097\u0004¢\u0006\u000f\n\u0005\b\u001c\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R!\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0090\u00018\u0016X\u0097\u0004¢\u0006\u000f\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0005\bd\u0010\u0093\u0001R&\u0010\u0098\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0095\u0001\u0018\u00010w8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0096\u0001\u0010z\u001a\u0005\b\u0097\u0001\u0010{R!\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u0099\u00018\u0016X\u0097\u0004¢\u0006\u000f\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0005\b\u0014\u0010\u009c\u0001¨\u0006\u009e\u0001"}, d2 = {"Li55/i;", "Li55/v;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getId", "id", "b", "getName", "name", "Ljava/time/LocalDate;", "c", "Ljava/time/LocalDate;", "p0", "()Ljava/time/LocalDate;", "disbursalDate", "d", "finalRepaymentDate", "e", "getCurrency", "currency", "f", "getCountryCode", "countryCode", "", "g", "J", "()J", "principal", "h", "N0", "totalRepaid", "i", "totalToRepay", "", "j", "D", "f0", "()D", "fractionRepaid", "Li55/g0;", "k", "Li55/g0;", "getState", "()Li55/g0;", "state", "Li55/m;", "l", "Li55/m;", "getConfig", "()Li55/m;", "config", "m", "product", "", "n", "I", "c0", "()I", "repaidCount", "o", "remainingTerm", "Li55/s;", "p", "Li55/s;", "k0", "()Li55/s;", "interestRate", "Li55/o;", "q", "Li55/o;", "()Li55/o;", "nextInstalment", "Li55/d0;", "r", "Li55/d0;", "J0", "()Li55/d0;", "lastPaidRepayment", "s", "t", "term", "repaymentDay", "u", "agreementNumber", "v", "R0", "outstandingPrincipal", "w", "Ljava/lang/Long;", "W", "()Ljava/lang/Long;", "outstandingRescheduledPrincipal", "x", "outstandingBalance", "y", "fixedOutstandingBalance", "Li55/b;", "z", "Li55/b;", "()Li55/b;", "accruedInterest", "A", "accruedFee", "B", "oneTimeFee", "C", "monthlyRepayment", "", "Z", "()Z", "inCooldownPeriod", "Li55/j0;", "E", "Li55/j0;", "()Li55/j0;", "unavailableFeatures", "", "Li55/f;", "F", "Ljava/util/List;", "()Ljava/util/List;", "borrowers", "Li55/d;", "G", "Li55/d;", "()Li55/d;", "autoPayRepaymentSource", "Li55/e;", "H", "Li55/e;", "()Li55/e;", "backupCard", "Li55/b0;", "Li55/b0;", "()Li55/b0;", "repaymentConfig", "Li55/y;", "Li55/y;", "T", "()Li55/y;", "refurbishment", "Li55/r;", "K", "Li55/r;", "()Li55/r;", "interestOnly", "", "L", "getInsurancePolicies", "insurancePolicies", "Li55/q;", "M", "Li55/q;", "()Li55/q;", "insuranceState", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i implements v {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @lg.b("accruedFee")
    @NotNull
    private final b accruedFee;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @lg.b("oneTimeFee")
    @NotNull
    private final b oneTimeFee;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @lg.b("monthlyRepayment")
    private final long monthlyRepayment;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @lg.b("inCooldownPeriod")
    private final boolean inCooldownPeriod;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @lg.b("unavailableFeatures")
    @NotNull
    private final j0 unavailableFeatures;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @lg.b("borrowers")
    @NotNull
    private final List<f> borrowers;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @lg.b("autoPayRepaymentSource")
    private final d autoPayRepaymentSource;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @lg.b("backupCard")
    private final e backupCard;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @lg.b("repaymentConfig")
    @NotNull
    private final b0 repaymentConfig;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @lg.b("refurbishment")
    private final y refurbishment;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @lg.b("interestOnly")
    private final r interestOnly;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @lg.b("insurancePolicies")
    private final List<Object> insurancePolicies;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @lg.b("insuranceState")
    private final q insuranceState;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("disbursalDate")
    @NotNull
    private final LocalDate disbursalDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("finalRepaymentDate")
    @NotNull
    private final LocalDate finalRepaymentDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("countryCode")
    @NotNull
    private final String countryCode;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("principal")
    private final long principal;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalRepaid")
    private final long totalRepaid;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("totalToRepay")
    private final long totalToRepay;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("fractionRepaid")
    private final double fractionRepaid;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final g0 state;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("config")
    @NotNull
    private final m config;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("product")
    @NotNull
    private final String product;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("repaidCount")
    private final int repaidCount;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("remainingTerm")
    private final int remainingTerm;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("interestRate")
    @NotNull
    private final s interestRate;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("nextInstalment")
    private final o nextInstalment;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("lastPaidRepayment")
    private final d0 lastPaidRepayment;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("term")
    private final int term;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("repaymentDay")
    private final int repaymentDay;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("agreementNumber")
    private final String agreementNumber;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("outstandingPrincipal")
    private final long outstandingPrincipal;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("outstandingRescheduledPrincipal")
    private final Long outstandingRescheduledPrincipal;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @lg.b("outstandingBalance")
    private final long outstandingBalance;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @lg.b("fixedOutstandingBalance")
    private final Long fixedOutstandingBalance;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @lg.b("accruedInterest")
    @NotNull
    private final b accruedInterest;

    @Override // i55.v
    /* JADX INFO: renamed from: J, reason: from getter */
    public final int getRemainingTerm() {
        return this.remainingTerm;
    }

    @Override // i55.v
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final d0 getLastPaidRepayment() {
        return this.lastPaidRepayment;
    }

    @Override // i55.v
    /* JADX INFO: renamed from: N0, reason: from getter */
    public final long getTotalRepaid() {
        return this.totalRepaid;
    }

    @Override // i55.v
    /* JADX INFO: renamed from: R0, reason: from getter */
    public final long getOutstandingPrincipal() {
        return this.outstandingPrincipal;
    }

    @Override // i55.v
    /* JADX INFO: renamed from: T, reason: from getter */
    public final y getRefurbishment() {
        return this.refurbishment;
    }

    @Override // i55.v
    /* JADX INFO: renamed from: W, reason: from getter */
    public final Long getOutstandingRescheduledPrincipal() {
        return this.outstandingRescheduledPrincipal;
    }

    @Override // i55.v
    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getTotalToRepay() {
        return this.totalToRepay;
    }

    @Override // i55.v
    /* JADX INFO: renamed from: b, reason: from getter */
    public final LocalDate getFinalRepaymentDate() {
        return this.finalRepaymentDate;
    }

    @Override // i55.v
    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getPrincipal() {
        return this.principal;
    }

    @Override // i55.v
    /* JADX INFO: renamed from: c0, reason: from getter */
    public final int getRepaidCount() {
        return this.repaidCount;
    }

    @Override // i55.v
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getFixedOutstandingBalance() {
        return this.fixedOutstandingBalance;
    }

    @Override // i55.v
    /* JADX INFO: renamed from: e, reason: from getter */
    public final q getInsuranceState() {
        return this.insuranceState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.id, iVar.id) && Intrinsics.f(this.name, iVar.name) && Intrinsics.f(this.disbursalDate, iVar.disbursalDate) && Intrinsics.f(this.finalRepaymentDate, iVar.finalRepaymentDate) && Intrinsics.f(this.currency, iVar.currency) && Intrinsics.f(this.countryCode, iVar.countryCode) && this.principal == iVar.principal && this.totalRepaid == iVar.totalRepaid && this.totalToRepay == iVar.totalToRepay && Double.compare(this.fractionRepaid, iVar.fractionRepaid) == 0 && Intrinsics.f(this.state, iVar.state) && Intrinsics.f(this.config, iVar.config) && Intrinsics.f(this.product, iVar.product) && this.repaidCount == iVar.repaidCount && this.remainingTerm == iVar.remainingTerm && Intrinsics.f(this.interestRate, iVar.interestRate) && Intrinsics.f(this.nextInstalment, iVar.nextInstalment) && Intrinsics.f(this.lastPaidRepayment, iVar.lastPaidRepayment) && this.term == iVar.term && this.repaymentDay == iVar.repaymentDay && Intrinsics.f(this.agreementNumber, iVar.agreementNumber) && this.outstandingPrincipal == iVar.outstandingPrincipal && Intrinsics.f(this.outstandingRescheduledPrincipal, iVar.outstandingRescheduledPrincipal) && this.outstandingBalance == iVar.outstandingBalance && Intrinsics.f(this.fixedOutstandingBalance, iVar.fixedOutstandingBalance) && Intrinsics.f(this.accruedInterest, iVar.accruedInterest) && Intrinsics.f(this.accruedFee, iVar.accruedFee) && Intrinsics.f(this.oneTimeFee, iVar.oneTimeFee) && this.monthlyRepayment == iVar.monthlyRepayment && this.inCooldownPeriod == iVar.inCooldownPeriod && Intrinsics.f(this.unavailableFeatures, iVar.unavailableFeatures) && Intrinsics.f(this.borrowers, iVar.borrowers) && Intrinsics.f(this.autoPayRepaymentSource, iVar.autoPayRepaymentSource) && Intrinsics.f(this.backupCard, iVar.backupCard) && Intrinsics.f(this.repaymentConfig, iVar.repaymentConfig) && Intrinsics.f(this.refurbishment, iVar.refurbishment) && Intrinsics.f(this.interestOnly, iVar.interestOnly) && Intrinsics.f(this.insurancePolicies, iVar.insurancePolicies) && Intrinsics.f(this.insuranceState, iVar.insuranceState);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final b getAccruedFee() {
        return this.accruedFee;
    }

    @Override // i55.v
    /* JADX INFO: renamed from: f0, reason: from getter */
    public final double getFractionRepaid() {
        return this.fractionRepaid;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final b getAccruedInterest() {
        return this.accruedInterest;
    }

    @Override // i55.v
    public final m getConfig() {
        return this.config;
    }

    @Override // i55.v
    public final String getCountryCode() {
        return this.countryCode;
    }

    @Override // i55.v
    public final String getCurrency() {
        return this.currency;
    }

    @Override // i55.v
    public final String getId() {
        return this.id;
    }

    @Override // i55.v
    public final String getName() {
        return this.name;
    }

    @Override // i55.v
    public final g0 getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getAgreementNumber() {
        return this.agreementNumber;
    }

    public final int hashCode() {
        int iHashCode = (this.interestRate.hashCode() + j6.a.b(this.remainingTerm, j6.a.b(this.repaidCount, p.a.c((this.config.hashCode() + ((this.state.hashCode() + m72.b.c(a0.d.c(a0.d.c(a0.d.c(p.a.c(p.a.c(wp5.y.a(wp5.y.a(p.a.c(this.id.hashCode() * 31, 31, this.name), 31, this.disbursalDate), 31, this.finalRepaymentDate), 31, this.currency), 31, this.countryCode), 31, this.principal), 31, this.totalRepaid), 31, this.totalToRepay), this.fractionRepaid, 31)) * 31)) * 31, 31, this.product), 31), 31)) * 31;
        o oVar = this.nextInstalment;
        int iHashCode2 = (iHashCode + (oVar == null ? 0 : oVar.hashCode())) * 31;
        d0 d0Var = this.lastPaidRepayment;
        int iB = j6.a.b(this.repaymentDay, j6.a.b(this.term, (iHashCode2 + (d0Var == null ? 0 : d0Var.hashCode())) * 31, 31), 31);
        String str = this.agreementNumber;
        int iC = a0.d.c((iB + (str == null ? 0 : str.hashCode())) * 31, 31, this.outstandingPrincipal);
        Long l2 = this.outstandingRescheduledPrincipal;
        int iC2 = a0.d.c((iC + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.outstandingBalance);
        Long l3 = this.fixedOutstandingBalance;
        int iD = p.a.d((this.unavailableFeatures.hashCode() + j6.a.c(a0.d.c((this.oneTimeFee.hashCode() + ((this.accruedFee.hashCode() + ((this.accruedInterest.hashCode() + ((iC2 + (l3 == null ? 0 : l3.hashCode())) * 31)) * 31)) * 31)) * 31, 31, this.monthlyRepayment), 31, this.inCooldownPeriod)) * 31, 31, this.borrowers);
        d dVar = this.autoPayRepaymentSource;
        int iHashCode3 = (iD + (dVar == null ? 0 : dVar.hashCode())) * 31;
        e eVar = this.backupCard;
        int iHashCode4 = (this.repaymentConfig.hashCode() + ((iHashCode3 + (eVar == null ? 0 : eVar.hashCode())) * 31)) * 31;
        y yVar = this.refurbishment;
        int iHashCode5 = (iHashCode4 + (yVar == null ? 0 : yVar.hashCode())) * 31;
        r rVar = this.interestOnly;
        int iHashCode6 = (iHashCode5 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        List<Object> list = this.insurancePolicies;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        q qVar = this.insuranceState;
        return iHashCode7 + (qVar != null ? qVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final d getAutoPayRepaymentSource() {
        return this.autoPayRepaymentSource;
    }

    @Override // i55.v
    /* JADX INFO: renamed from: j, reason: from getter */
    public final o getNextInstalment() {
        return this.nextInstalment;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final e getBackupCard() {
        return this.backupCard;
    }

    @Override // i55.v
    /* JADX INFO: renamed from: k0, reason: from getter */
    public final s getInterestRate() {
        return this.interestRate;
    }

    @Override // i55.v
    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getProduct() {
        return this.product;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final List getBorrowers() {
        return this.borrowers;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getInCooldownPeriod() {
        return this.inCooldownPeriod;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final long getMonthlyRepayment() {
        return this.monthlyRepayment;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final b getOneTimeFee() {
        return this.oneTimeFee;
    }

    @Override // i55.v
    /* JADX INFO: renamed from: p0, reason: from getter */
    public final LocalDate getDisbursalDate() {
        return this.disbursalDate;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final long getOutstandingBalance() {
        return this.outstandingBalance;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final b0 getRepaymentConfig() {
        return this.repaymentConfig;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final int getRepaymentDay() {
        return this.repaymentDay;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final int getTerm() {
        return this.term;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final j0 getUnavailableFeatures() {
        return this.unavailableFeatures;
    }

    @Override // i55.v
    /* JADX INFO: renamed from: z, reason: from getter */
    public final r getInterestOnly() {
        return this.interestOnly;
    }
}
