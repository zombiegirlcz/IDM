package uvk;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f283478a;

    public g(Set updatedAssetStatsIdSet) {
        Intrinsics.checkNotNullParameter(updatedAssetStatsIdSet, "updatedAssetStatsIdSet");
        this.f283478a = updatedAssetStatsIdSet;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f283478a, ((g) obj2).f283478a);
    }

    public final int hashCode() {
        return this.f283478a.hashCode();
    }
}
