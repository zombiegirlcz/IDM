package c97;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\r¨\u0006\u000f"}, d2 = {"Lc97/k;", "", "", "toString", "()Ljava/lang/String;", "Lc97/l;", "a", "Lc97/l;", "b", "()Lc97/l;", "timings", "Lc97/b;", "Lc97/b;", "()Lc97/b;", "blockConstraints", "feature_global_search_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("timings")
    @NotNull
    private final l timings;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("blockConstraints")
    private final b blockConstraints;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getBlockConstraints() {
        return this.blockConstraints;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final l getTimings() {
        return this.timings;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.timings, kVar.timings) && Intrinsics.f(this.blockConstraints, kVar.blockConstraints);
    }

    public final int hashCode() {
        int iHashCode = this.timings.hashCode() * 31;
        b bVar = this.blockConstraints;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }
}
