package c14;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lc14/e;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "getRestrictSensitivePurchases", "()Z", "restrictSensitivePurchases", "", "b", "J", "getMonthlySpendingLimit", "()J", "monthlySpendingLimit", "c", "Ljava/lang/Long;", "getSinglePurchaseLimit", "()Ljava/lang/Long;", "singlePurchaseLimit", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("restrictSensitivePurchases")
    private final boolean restrictSensitivePurchases;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("monthlySpendingLimit")
    private final long monthlySpendingLimit;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("singlePurchaseLimit")
    private final Long singlePurchaseLimit;

    public e(long j2, Long l2, boolean z) {
        this.restrictSensitivePurchases = z;
        this.monthlySpendingLimit = j2;
        this.singlePurchaseLimit = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.restrictSensitivePurchases == eVar.restrictSensitivePurchases && this.monthlySpendingLimit == eVar.monthlySpendingLimit && Intrinsics.f(this.singlePurchaseLimit, eVar.singlePurchaseLimit);
    }

    public final int hashCode() {
        int iC = a0.d.c(Boolean.hashCode(this.restrictSensitivePurchases) * 31, 31, this.monthlySpendingLimit);
        Long l2 = this.singlePurchaseLimit;
        return iC + (l2 == null ? 0 : l2.hashCode());
    }
}
