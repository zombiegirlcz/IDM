package yvk;

import com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.AssetStatsId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AssetStatsId f317220a;

    public i(AssetStatsId assetStatsId) {
        Intrinsics.checkNotNullParameter(assetStatsId, "assetStatsId");
        this.f317220a = assetStatsId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f317220a, ((i) obj2).f317220a);
    }

    public final int hashCode() {
        return this.f317220a.hashCode();
    }
}
