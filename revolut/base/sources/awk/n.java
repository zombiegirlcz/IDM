package awk;

import com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.AssetStatsId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AssetStatsId f10811a;

    public n(AssetStatsId assetStatsId) {
        Intrinsics.checkNotNullParameter(assetStatsId, "assetStatsId");
        this.f10811a = assetStatsId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f10811a, ((n) obj2).f10811a);
    }

    public final int hashCode() {
        return this.f10811a.hashCode();
    }
}
