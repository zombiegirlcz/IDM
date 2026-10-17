package en4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Len4/i;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Long;", "getAmount", "()Ljava/lang/Long;", "amount", "", "b", "Ljava/lang/Boolean;", "getEnabled", "()Ljava/lang/Boolean;", "enabled", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    private final Long amount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("enabled")
    private final Boolean enabled;

    public i(Boolean bool, Long l2) {
        this.amount = l2;
        this.enabled = bool;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.amount, iVar.amount) && Intrinsics.f(this.enabled, iVar.enabled);
    }

    public final int hashCode() {
        Long l2 = this.amount;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        Boolean bool = this.enabled;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }
}
