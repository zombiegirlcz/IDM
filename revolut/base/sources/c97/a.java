package c97;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Lc97/a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "minQueryLength", "Lc97/h;", "b", "Lc97/h;", "()Lc97/h;", "reorderByPrefix", "feature_global_search_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("minQueryLength")
    private final Integer minQueryLength;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("reorderByPrefix")
    private final h reorderByPrefix;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getMinQueryLength() {
        return this.minQueryLength;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final h getReorderByPrefix() {
        return this.reorderByPrefix;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.minQueryLength, aVar.minQueryLength) && Intrinsics.f(this.reorderByPrefix, aVar.reorderByPrefix);
    }

    public final int hashCode() {
        Integer num = this.minQueryLength;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        h hVar = this.reorderByPrefix;
        return iHashCode + (hVar != null ? hVar.hashCode() : 0);
    }
}
