package uvk;

import com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.models.AssetStatsGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AssetStatsGroup f283479a;

    public i(AssetStatsGroup assetStatsGroup) {
        Intrinsics.checkNotNullParameter(assetStatsGroup, "assetStatsGroup");
        this.f283479a = assetStatsGroup;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f283479a, ((i) obj2).f283479a);
    }

    public final int hashCode() {
        return this.f283479a.hashCode();
    }
}
