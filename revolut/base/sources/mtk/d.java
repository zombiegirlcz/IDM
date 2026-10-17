package mtk;

import aii.r;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f208907a;

    public d(Set updatedAssetStatsIdSet) {
        Intrinsics.checkNotNullParameter(updatedAssetStatsIdSet, "updatedAssetStatsIdSet");
        this.f208907a = updatedAssetStatsIdSet;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f208907a, ((d) obj2).f208907a);
    }

    public final int hashCode() {
        return this.f208907a.hashCode();
    }
}
