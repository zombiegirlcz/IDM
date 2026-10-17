package en4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Len4/e;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Long;", "getSpendingLimit", "()Ljava/lang/Long;", "spendingLimit", "Len4/i;", "b", "Len4/i;", "getSinglePurchaseLimit", "()Len4/i;", "singlePurchaseLimit", "", "c", "Ljava/lang/Boolean;", "getPurchaseRestrictionsEnabled", "()Ljava/lang/Boolean;", "purchaseRestrictionsEnabled", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("spendingLimit")
    private final Long spendingLimit;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("singlePurchaseLimit")
    private final i singlePurchaseLimit;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("purchaseRestrictionsEnabled")
    private final Boolean purchaseRestrictionsEnabled;

    public e(Long l2, i iVar, Boolean bool) {
        this.spendingLimit = l2;
        this.singlePurchaseLimit = iVar;
        this.purchaseRestrictionsEnabled = bool;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.spendingLimit, eVar.spendingLimit) && Intrinsics.f(this.singlePurchaseLimit, eVar.singlePurchaseLimit) && Intrinsics.f(this.purchaseRestrictionsEnabled, eVar.purchaseRestrictionsEnabled);
    }

    public final int hashCode() {
        Long l2 = this.spendingLimit;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        i iVar = this.singlePurchaseLimit;
        int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        Boolean bool = this.purchaseRestrictionsEnabled;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }
}
