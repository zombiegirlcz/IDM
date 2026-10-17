package l55;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\tR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0004R\u001c\u0010%\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010(\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0007\u001a\u0004\b'\u0010\tR\u001a\u0010.\u001a\u00020)8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Ll55/j;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "getAmount", "()J", "amount", "b", "getAmountOfPartialRepayment", "amountOfPartialRepayment", "c", "getOutstanding", "outstanding", "d", "Ljava/lang/Long;", "getFirstRepayment", "()Ljava/lang/Long;", "firstRepayment", "e", "Ljava/lang/String;", "getFirstRepaymentDate", "firstRepaymentDate", "f", "getMonthlyRepayment", "monthlyRepayment", "g", "getLastRepaymentDate", "lastRepaymentDate", "", "h", "Ljava/lang/Boolean;", "getCoolDownPeriod", "()Ljava/lang/Boolean;", "coolDownPeriod", "i", "getOutstandingPenaltyBalance", "outstandingPenaltyBalance", "", "j", "I", "getScheduleVersion", "()I", "scheduleVersion", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    private final long amount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("amountOfPartialRepayment")
    private final long amountOfPartialRepayment;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("outstanding")
    private final long outstanding;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("firstRepayment")
    private final Long firstRepayment;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("firstRepaymentDate")
    private final String firstRepaymentDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("monthlyRepayment")
    private final Long monthlyRepayment;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("lastRepaymentDate")
    private final String lastRepaymentDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("inCooldownPeriod")
    private final Boolean coolDownPeriod;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("outstandingPenaltyBalance")
    private final long outstandingPenaltyBalance;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("scheduleVersion")
    private final int scheduleVersion;

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.amount == jVar.amount && this.amountOfPartialRepayment == jVar.amountOfPartialRepayment && this.outstanding == jVar.outstanding && Intrinsics.f(this.firstRepayment, jVar.firstRepayment) && Intrinsics.f(this.firstRepaymentDate, jVar.firstRepaymentDate) && Intrinsics.f(this.monthlyRepayment, jVar.monthlyRepayment) && Intrinsics.f(this.lastRepaymentDate, jVar.lastRepaymentDate) && Intrinsics.f(this.coolDownPeriod, jVar.coolDownPeriod) && this.outstandingPenaltyBalance == jVar.outstandingPenaltyBalance && this.scheduleVersion == jVar.scheduleVersion;
    }

    public final int hashCode() {
        int iC = a0.d.c(a0.d.c(Long.hashCode(this.amount) * 31, 31, this.amountOfPartialRepayment), 31, this.outstanding);
        Long l2 = this.firstRepayment;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.firstRepaymentDate;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l3 = this.monthlyRepayment;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str2 = this.lastRepaymentDate;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.coolDownPeriod;
        return Integer.hashCode(this.scheduleVersion) + a0.d.c((iHashCode4 + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.outstandingPenaltyBalance);
    }
}
