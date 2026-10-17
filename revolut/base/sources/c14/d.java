package c14;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\rR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0013"}, d2 = {"Lc14/d;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "b", "()Z", "restrictSensitivePurchases", "", "J", "()J", "monthlySpendingLimit", "c", "Ljava/lang/Long;", "()Ljava/lang/Long;", "singlePurchaseLimit", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("restrictSensitivePurchases")
    private final boolean restrictSensitivePurchases;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("monthlySpendingLimit")
    private final long monthlySpendingLimit;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("singlePurchaseLimit")
    private final Long singlePurchaseLimit;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getMonthlySpendingLimit() {
        return this.monthlySpendingLimit;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getRestrictSensitivePurchases() {
        return this.restrictSensitivePurchases;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getSinglePurchaseLimit() {
        return this.singlePurchaseLimit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.restrictSensitivePurchases == dVar.restrictSensitivePurchases && this.monthlySpendingLimit == dVar.monthlySpendingLimit && Intrinsics.f(this.singlePurchaseLimit, dVar.singlePurchaseLimit);
    }

    public final int hashCode() {
        int iC = a0.d.c(Boolean.hashCode(this.restrictSensitivePurchases) * 31, 31, this.monthlySpendingLimit);
        Long l2 = this.singlePurchaseLimit;
        return iC + (l2 == null ? 0 : l2.hashCode());
    }
}
