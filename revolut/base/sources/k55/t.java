package k55;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004¨\u0006\u0016"}, d2 = {"Lk55/t;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "changePayDayUnavailabilityReason", "f", "settlementUnavailabilityReason", "c", "g", "statementUnavailabilityReason", "d", "partialUnavailabilityReason", "e", "cancellationUnavailabilityReason", "h", "zeroLoanAmountRenegotiationUnavailabilityReason", "repaymentDeferralRenegotiationUnavailabilityReason", "interestOnlyWithoutTermExtensionRenegotiationUnavailabilityReason", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final /* data */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("changePayDayUnavailabilityReason")
    private final String changePayDayUnavailabilityReason;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("settlementUnavailabilityReason")
    private final String settlementUnavailabilityReason;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("statementUnavailabilityReason")
    private final String statementUnavailabilityReason;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("partialUnavailabilityReason")
    private final String partialUnavailabilityReason;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("cancellationUnavailabilityReason")
    private final String cancellationUnavailabilityReason;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("zeroLoanAmountRenegotiationUnavailabilityReason")
    private final String zeroLoanAmountRenegotiationUnavailabilityReason;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("repaymentDeferralRenegotiationUnavailabilityReason")
    private final String repaymentDeferralRenegotiationUnavailabilityReason;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("interestOnlyWithoutTermExtensionRenegotiationUnavailabilityReason")
    private final String interestOnlyWithoutTermExtensionRenegotiationUnavailabilityReason;

    public t(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.changePayDayUnavailabilityReason = str;
        this.settlementUnavailabilityReason = str2;
        this.statementUnavailabilityReason = str3;
        this.partialUnavailabilityReason = str4;
        this.cancellationUnavailabilityReason = str5;
        this.zeroLoanAmountRenegotiationUnavailabilityReason = str6;
        this.repaymentDeferralRenegotiationUnavailabilityReason = str7;
        this.interestOnlyWithoutTermExtensionRenegotiationUnavailabilityReason = str8;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCancellationUnavailabilityReason() {
        return this.cancellationUnavailabilityReason;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getChangePayDayUnavailabilityReason() {
        return this.changePayDayUnavailabilityReason;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getInterestOnlyWithoutTermExtensionRenegotiationUnavailabilityReason() {
        return this.interestOnlyWithoutTermExtensionRenegotiationUnavailabilityReason;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPartialUnavailabilityReason() {
        return this.partialUnavailabilityReason;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getRepaymentDeferralRenegotiationUnavailabilityReason() {
        return this.repaymentDeferralRenegotiationUnavailabilityReason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.changePayDayUnavailabilityReason, tVar.changePayDayUnavailabilityReason) && Intrinsics.f(this.settlementUnavailabilityReason, tVar.settlementUnavailabilityReason) && Intrinsics.f(this.statementUnavailabilityReason, tVar.statementUnavailabilityReason) && Intrinsics.f(this.partialUnavailabilityReason, tVar.partialUnavailabilityReason) && Intrinsics.f(this.cancellationUnavailabilityReason, tVar.cancellationUnavailabilityReason) && Intrinsics.f(this.zeroLoanAmountRenegotiationUnavailabilityReason, tVar.zeroLoanAmountRenegotiationUnavailabilityReason) && Intrinsics.f(this.repaymentDeferralRenegotiationUnavailabilityReason, tVar.repaymentDeferralRenegotiationUnavailabilityReason) && Intrinsics.f(this.interestOnlyWithoutTermExtensionRenegotiationUnavailabilityReason, tVar.interestOnlyWithoutTermExtensionRenegotiationUnavailabilityReason);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSettlementUnavailabilityReason() {
        return this.settlementUnavailabilityReason;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getStatementUnavailabilityReason() {
        return this.statementUnavailabilityReason;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getZeroLoanAmountRenegotiationUnavailabilityReason() {
        return this.zeroLoanAmountRenegotiationUnavailabilityReason;
    }

    public final int hashCode() {
        String str = this.changePayDayUnavailabilityReason;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.settlementUnavailabilityReason;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.statementUnavailabilityReason;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.partialUnavailabilityReason;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.cancellationUnavailabilityReason;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.zeroLoanAmountRenegotiationUnavailabilityReason;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.repaymentDeferralRenegotiationUnavailabilityReason;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.interestOnlyWithoutTermExtensionRenegotiationUnavailabilityReason;
        return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public t() {
        this(null, null, null, null, null, null, null, null);
    }
}
