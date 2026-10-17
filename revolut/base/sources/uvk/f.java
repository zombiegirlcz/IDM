package uvk;

import com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.models.AssetStatsGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AssetStatsGroup f283477a;

    public f(AssetStatsGroup selectedAssetStatsGroup) {
        Intrinsics.checkNotNullParameter(selectedAssetStatsGroup, "selectedAssetStatsGroup");
        this.f283477a = selectedAssetStatsGroup;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f283477a, ((f) obj2).f283477a);
    }

    public final int hashCode() {
        return this.f283477a.hashCode();
    }
}
