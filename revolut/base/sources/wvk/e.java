package wvk;

import aii.r;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f300544a;

    public e(Set updatedAssetStatsIdSet) {
        Intrinsics.checkNotNullParameter(updatedAssetStatsIdSet, "updatedAssetStatsIdSet");
        this.f300544a = updatedAssetStatsIdSet;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f300544a, ((e) obj2).f300544a);
    }

    public final int hashCode() {
        return this.f300544a.hashCode();
    }
}
