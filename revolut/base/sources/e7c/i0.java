package e7c;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u000b\u0010\t¨\u0006\u000e"}, d2 = {"Le7c/i0;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "c", "()J", "orderTotalAmount", "b", "orderSubtotalAmount", "orderTaxTotalAmount", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("orderTotalAmount")
    private final long orderTotalAmount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("orderSubtotalAmount")
    private final long orderSubtotalAmount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("orderTaxTotalAmount")
    private final long orderTaxTotalAmount;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getOrderSubtotalAmount() {
        return this.orderSubtotalAmount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getOrderTaxTotalAmount() {
        return this.orderTaxTotalAmount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getOrderTotalAmount() {
        return this.orderTotalAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return this.orderTotalAmount == i0Var.orderTotalAmount && this.orderSubtotalAmount == i0Var.orderSubtotalAmount && this.orderTaxTotalAmount == i0Var.orderTaxTotalAmount;
    }

    public final int hashCode() {
        return Long.hashCode(this.orderTaxTotalAmount) + a0.d.c(Long.hashCode(this.orderTotalAmount) * 31, 31, this.orderSubtotalAmount);
    }
}
