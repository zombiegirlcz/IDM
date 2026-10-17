package on4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\r\u0010\bR\u001a\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0007\u001a\u0004\b\u000f\u0010\bR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\n\u0010\u0013¨\u0006\u0015"}, d2 = {"Lon4/g;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "()J", "currentDate", "b", "e", "repaymentDueDate", "c", "paymentOverdueAmount", "d", "paymentOverdueDate", "", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "overdueDays", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("currentDate")
    private final long currentDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("repaymentDueDate")
    private final long repaymentDueDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentOverdueAmount")
    private final long paymentOverdueAmount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("paymentOverdueDate")
    private final long paymentOverdueDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("overdueDays")
    private final Integer overdueDays;

    public g(long j2, long j3, long j5, long j16, Integer num) {
        this.currentDate = j2;
        this.repaymentDueDate = j3;
        this.paymentOverdueAmount = j5;
        this.paymentOverdueDate = j16;
        this.overdueDays = num;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getCurrentDate() {
        return this.currentDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getOverdueDays() {
        return this.overdueDays;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getPaymentOverdueAmount() {
        return this.paymentOverdueAmount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getPaymentOverdueDate() {
        return this.paymentOverdueDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getRepaymentDueDate() {
        return this.repaymentDueDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.currentDate == gVar.currentDate && this.repaymentDueDate == gVar.repaymentDueDate && this.paymentOverdueAmount == gVar.paymentOverdueAmount && this.paymentOverdueDate == gVar.paymentOverdueDate && Intrinsics.f(this.overdueDays, gVar.overdueDays);
    }

    public final int hashCode() {
        int iC = a0.d.c(a0.d.c(a0.d.c(Long.hashCode(this.currentDate) * 31, 31, this.repaymentDueDate), 31, this.paymentOverdueAmount), 31, this.paymentOverdueDate);
        Integer num = this.overdueDays;
        return iC + (num == null ? 0 : num.hashCode());
    }
}
