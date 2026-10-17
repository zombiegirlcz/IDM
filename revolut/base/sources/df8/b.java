package df8;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u000e"}, d2 = {"Ldf8/b;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "()I", "maxCardsCount", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "maxOrderVirtualCardLimit", "feature_junior_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("maxCardsCount")
    private final int maxCardsCount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("maxOrderVirtualCardLimit")
    private final Integer maxOrderVirtualCardLimit;

    public b(int i, Integer num) {
        this.maxCardsCount = i;
        this.maxOrderVirtualCardLimit = num;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getMaxCardsCount() {
        return this.maxCardsCount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getMaxOrderVirtualCardLimit() {
        return this.maxOrderVirtualCardLimit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.maxCardsCount == bVar.maxCardsCount && Intrinsics.f(this.maxOrderVirtualCardLimit, bVar.maxOrderVirtualCardLimit);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.maxCardsCount) * 31;
        Integer num = this.maxOrderVirtualCardLimit;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
