package dj9;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u0010\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0006\u0010\u000f¨\u0006\u0011"}, d2 = {"Ldj9/v;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "c", "()J", "minPurchaseAmount", "b", "maxPurchaseAmount", "", "Z", "()Z", "hasUpfrontPayment", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("minPurchaseAmount")
    private final long minPurchaseAmount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("maxPurchaseAmount")
    private final long maxPurchaseAmount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("hasUpfrontPayment")
    private final boolean hasUpfrontPayment;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getHasUpfrontPayment() {
        return this.hasUpfrontPayment;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getMaxPurchaseAmount() {
        return this.maxPurchaseAmount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getMinPurchaseAmount() {
        return this.minPurchaseAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return this.minPurchaseAmount == vVar.minPurchaseAmount && this.maxPurchaseAmount == vVar.maxPurchaseAmount && this.hasUpfrontPayment == vVar.hasUpfrontPayment;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.hasUpfrontPayment) + a0.d.c(Long.hashCode(this.minPurchaseAmount) * 31, 31, this.maxPurchaseAmount);
    }
}
