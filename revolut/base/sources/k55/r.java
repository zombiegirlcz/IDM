package k55;

import ip0.v7;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u001a\u0010 \u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\u0004R\u001a\u0010\"\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\u001e\u0010\u0004R\u001a\u0010$\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u000f\u001a\u0004\b\u000e\u0010\u0013R\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\"\u0010+\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010*R\u001a\u00101\u001a\u00020,8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001c\u00106\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001a\u0010:\u001a\u0002078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u00108\u001a\u0004\b2\u00109R\u001c\u0010>\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b!\u0010=R\u001a\u0010C\u001a\u00020?8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010D\u001a\u00020?8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010@\u001a\u0004\b;\u0010BR\u001a\u0010G\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010\u0017\u001a\u0004\bF\u0010\u0019R\u001a\u0010I\u001a\u0002078\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u00108\u001a\u0004\bH\u00109R\"\u0010M\u001a\n\u0012\u0004\u0012\u00020J\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010(\u001a\u0004\bL\u0010*R\u001a\u0010O\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010\u000b\u001a\u0004\bE\u0010\fR\u001a\u0010P\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b\u001b\u0010\u0004R\u001a\u0010R\u001a\u00020,8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010.\u001a\u0004\bQ\u00100R\u001c\u0010X\u001a\u0004\u0018\u00010S8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u001a\u0010Y\u001a\u0002078\u0006X\u0087\u0004¢\u0006\f\n\u0004\bL\u00108\u001a\u0004\b\u0005\u00109R\u001a\u0010[\u001a\u00020,8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010.\u001a\u0004\bK\u00100R\u001c\u0010]\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\\\u0010\u0006\u001a\u0004\bN\u0010\u0004R\u001c\u0010_\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b^\u0010\u0006\u001a\u0004\b-\u0010\u0004R\u001a\u0010a\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b`\u0010\u0017\u001a\u0004\b\\\u0010\u0019R\"\u0010c\u001a\n\u0012\u0004\u0012\u00020b\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010(\u001a\u0004\b^\u0010*R\"\u0010e\u001a\n\u0012\u0004\u0012\u00020d\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010(\u001a\u0004\b`\u0010*R\u001c\u0010f\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010.\u001a\u0004\bZ\u00100R\u001a\u0010g\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bV\u0010\u0006\u001a\u0004\b#\u0010\u0004R\u001a\u0010h\u001a\u0002078\u0006X\u0087\u0004¢\u0006\f\n\u0004\bQ\u00108\u001a\u0004\bT\u00109¨\u0006i"}, d2 = {"Lk55/r;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "k", "id", "", "b", "J", "()J", "amount", "c", "D", "state", "", "d", "()D", "apr", "", "e", "I", "E", "()I", "term", "f", "j", "duration", "g", "n", "loanName", "h", "currency", "i", "annualInterestRate", "cardId", "", "Lk55/h;", "Ljava/util/List;", "v", "()Ljava/util/List;", "payments", "Ljo3/a;", "l", "Ljo3/a;", "p", "()Ljo3/a;", "minPartialRepaymentAmount", "m", "Lk55/h;", "q", "()Lk55/h;", "nextRepayment", "", "Z", "()Z", "inCooldownPeriod", "o", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "daysPastDue", "Lk55/p;", "Lk55/p;", "w", "()Lk55/p;", "payoffAmountBreakdown", "maxPartialRepaymentAmountBreakdown", "r", "s", "overdueRepaymentsCount", "F", "terminatedState", "Li55/n;", "t", "y", "renegotiations", "u", "oneTimeFee", "countryCode", "H", "totalRepayable", "Lk55/t;", "x", "Lk55/t;", "G", "()Lk55/t;", "toggleStatus", "agreementCancelledFlag", "z", "paidAmount", "A", "paidDate", "B", "imageId", "C", "repaymentDay", "Ll55/i;", "repaymentRequests", "Lk55/s;", "repaymentSources", "repaymentAmount", "disbursalDateTime", "refinanced", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final /* data */ class r {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @lg.b("repaidDate")
    private final String paidDate;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @lg.b("imageId")
    private final String imageId;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @lg.b("repaymentDay")
    private final int repaymentDay;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @lg.b("repaymentRequests")
    private final List<l55.i> repaymentRequests;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @lg.b("repaymentSources")
    private final List<s> repaymentSources;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @lg.b("repaymentAmount")
    private final jo3.a repaymentAmount;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @lg.b("disbursalDateTime")
    @NotNull
    private final String disbursalDateTime;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @lg.b("refinanced")
    private final boolean refinanced;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("principal")
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
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("annualInterestRate")
    private final double annualInterestRate;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("cardId")
    private final String cardId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("payments")
    private final List<h> payments;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("minPartialRepaymentAmount")
    @NotNull
    private final jo3.a minPartialRepaymentAmount;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("nextRepayment")
    private final h nextRepayment;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("inCooldownPeriod")
    private final boolean inCooldownPeriod;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("daysPastDue")
    private final Integer daysPastDue;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("payoffAmountBreakdown")
    @NotNull
    private final p payoffAmountBreakdown;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("maxPartialRepaymentAmountBreakdown")
    @NotNull
    private final p maxPartialRepaymentAmountBreakdown;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("overdueRepaymentsCount")
    private final int overdueRepaymentsCount;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("agreementTerminatedFlag")
    private final boolean terminatedState;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("renegotiations")
    private final List<i55.n> renegotiations;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("oneTimeFee")
    private final long oneTimeFee;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("countryCode")
    @NotNull
    private final String countryCode;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalRepayable")
    @NotNull
    private final jo3.a totalRepayable;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @lg.b("toggleStatus")
    private final t toggleStatus;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @lg.b("agreementCancelledFlag")
    private final boolean agreementCancelledFlag;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @lg.b("paidAmount")
    @NotNull
    private final jo3.a paidAmount;

    /* JADX INFO: renamed from: A, reason: from getter */
    public final int getRepaymentDay() {
        return this.repaymentDay;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final List getRepaymentRequests() {
        return this.repaymentRequests;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final List getRepaymentSources() {
        return this.repaymentSources;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final int getTerm() {
        return this.term;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final boolean getTerminatedState() {
        return this.terminatedState;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final t getToggleStatus() {
        return this.toggleStatus;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final jo3.a getTotalRepayable() {
        return this.totalRepayable;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAgreementCancelledFlag() {
        return this.agreementCancelledFlag;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final double getApr() {
        return this.apr;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCardId() {
        return this.cardId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.id, rVar.id) && this.amount == rVar.amount && Intrinsics.f(this.state, rVar.state) && Double.compare(this.apr, rVar.apr) == 0 && this.term == rVar.term && this.duration == rVar.duration && Intrinsics.f(this.loanName, rVar.loanName) && Intrinsics.f(this.currency, rVar.currency) && Double.compare(this.annualInterestRate, rVar.annualInterestRate) == 0 && Intrinsics.f(this.cardId, rVar.cardId) && Intrinsics.f(this.payments, rVar.payments) && Intrinsics.f(this.minPartialRepaymentAmount, rVar.minPartialRepaymentAmount) && Intrinsics.f(this.nextRepayment, rVar.nextRepayment) && this.inCooldownPeriod == rVar.inCooldownPeriod && Intrinsics.f(this.daysPastDue, rVar.daysPastDue) && Intrinsics.f(this.payoffAmountBreakdown, rVar.payoffAmountBreakdown) && Intrinsics.f(this.maxPartialRepaymentAmountBreakdown, rVar.maxPartialRepaymentAmountBreakdown) && this.overdueRepaymentsCount == rVar.overdueRepaymentsCount && this.terminatedState == rVar.terminatedState && Intrinsics.f(this.renegotiations, rVar.renegotiations) && this.oneTimeFee == rVar.oneTimeFee && Intrinsics.f(this.countryCode, rVar.countryCode) && Intrinsics.f(this.totalRepayable, rVar.totalRepayable) && Intrinsics.f(this.toggleStatus, rVar.toggleStatus) && this.agreementCancelledFlag == rVar.agreementCancelledFlag && Intrinsics.f(this.paidAmount, rVar.paidAmount) && Intrinsics.f(this.paidDate, rVar.paidDate) && Intrinsics.f(this.imageId, rVar.imageId) && this.repaymentDay == rVar.repaymentDay && Intrinsics.f(this.repaymentRequests, rVar.repaymentRequests) && Intrinsics.f(this.repaymentSources, rVar.repaymentSources) && Intrinsics.f(this.repaymentAmount, rVar.repaymentAmount) && Intrinsics.f(this.disbursalDateTime, rVar.disbursalDateTime) && this.refinanced == rVar.refinanced;
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
        int iC = m72.b.c(p.a.c(p.a.c(j6.a.b(this.duration, j6.a.b(this.term, m72.b.c(p.a.c(a0.d.c(this.id.hashCode() * 31, 31, this.amount), 31, this.state), this.apr, 31), 31), 31), 31, this.loanName), 31, this.currency), this.annualInterestRate, 31);
        String str = this.cardId;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        List<h> list = this.payments;
        int iJ = v7.j(this.minPartialRepaymentAmount, (iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31);
        h hVar = this.nextRepayment;
        int iC2 = j6.a.c((iJ + (hVar == null ? 0 : hVar.hashCode())) * 31, 31, this.inCooldownPeriod);
        Integer num = this.daysPastDue;
        int iC3 = j6.a.c(j6.a.b(this.overdueRepaymentsCount, (this.maxPartialRepaymentAmountBreakdown.hashCode() + ((this.payoffAmountBreakdown.hashCode() + ((iC2 + (num == null ? 0 : num.hashCode())) * 31)) * 31)) * 31, 31), 31, this.terminatedState);
        List<i55.n> list2 = this.renegotiations;
        int iJ2 = v7.j(this.totalRepayable, p.a.c(a0.d.c((iC3 + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.oneTimeFee), 31, this.countryCode), 31);
        t tVar = this.toggleStatus;
        int iJ3 = v7.j(this.paidAmount, j6.a.c((iJ2 + (tVar == null ? 0 : tVar.hashCode())) * 31, 31, this.agreementCancelledFlag), 31);
        String str2 = this.paidDate;
        int iHashCode2 = (iJ3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageId;
        int iB = j6.a.b(this.repaymentDay, (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        List<l55.i> list3 = this.repaymentRequests;
        int iHashCode3 = (iB + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<s> list4 = this.repaymentSources;
        int iHashCode4 = (iHashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        jo3.a aVar = this.repaymentAmount;
        return Boolean.hashCode(this.refinanced) + p.a.c((iHashCode4 + (aVar != null ? aVar.hashCode() : 0)) * 31, 31, this.disbursalDateTime);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getDisbursalDateTime() {
        return this.disbursalDateTime;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getImageId() {
        return this.imageId;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getInCooldownPeriod() {
        return this.inCooldownPeriod;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getLoanName() {
        return this.loanName;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final p getMaxPartialRepaymentAmountBreakdown() {
        return this.maxPartialRepaymentAmountBreakdown;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final jo3.a getMinPartialRepaymentAmount() {
        return this.minPartialRepaymentAmount;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final h getNextRepayment() {
        return this.nextRepayment;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final long getOneTimeFee() {
        return this.oneTimeFee;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final int getOverdueRepaymentsCount() {
        return this.overdueRepaymentsCount;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final jo3.a getPaidAmount() {
        return this.paidAmount;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getPaidDate() {
        return this.paidDate;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final List getPayments() {
        return this.payments;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final p getPayoffAmountBreakdown() {
        return this.payoffAmountBreakdown;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final boolean getRefinanced() {
        return this.refinanced;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final List getRenegotiations() {
        return this.renegotiations;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final jo3.a getRepaymentAmount() {
        return this.repaymentAmount;
    }
}
