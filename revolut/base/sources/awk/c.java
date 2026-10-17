package awk;

import com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.models.AssetStatsGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AssetStatsGroup f10797a;

    public c(AssetStatsGroup assetStatsGroup) {
        Intrinsics.checkNotNullParameter(assetStatsGroup, "assetStatsGroup");
        this.f10797a = assetStatsGroup;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f10797a, ((c) obj2).f10797a);
    }

    public final int hashCode() {
        return this.f10797a.hashCode();
    }
}
