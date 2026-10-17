package dj9;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\r\u0010\tR\u001a\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u000f\u0010\tR\u001a\u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\u0012"}, d2 = {"Ldj9/r;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "b", "()J", "firstRepaymentAmount", "d", "secondRepaymentAmount", "c", "firstRepaymentDate", "e", "totalFeeAmount", "amountToTopUp", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("firstRepaymentAmount")
    private final long firstRepaymentAmount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("secondRepaymentAmount")
    private final long secondRepaymentAmount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("firstRepaymentDate")
    private final long firstRepaymentDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("totalFeeAmount")
    private final long totalFeeAmount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("amountToTopUp")
    private final long amountToTopUp;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getAmountToTopUp() {
        return this.amountToTopUp;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getFirstRepaymentAmount() {
        return this.firstRepaymentAmount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getFirstRepaymentDate() {
        return this.firstRepaymentDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getSecondRepaymentAmount() {
        return this.secondRepaymentAmount;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getTotalFeeAmount() {
        return this.totalFeeAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.firstRepaymentAmount == rVar.firstRepaymentAmount && this.secondRepaymentAmount == rVar.secondRepaymentAmount && this.firstRepaymentDate == rVar.firstRepaymentDate && this.totalFeeAmount == rVar.totalFeeAmount && this.amountToTopUp == rVar.amountToTopUp;
    }

    public final int hashCode() {
        return Long.hashCode(this.amountToTopUp) + a0.d.c(a0.d.c(a0.d.c(Long.hashCode(this.firstRepaymentAmount) * 31, 31, this.secondRepaymentAmount), 31, this.firstRepaymentDate), 31, this.totalFeeAmount);
    }
}
