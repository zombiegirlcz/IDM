package clh;

import com.revolut.feature.global_markets.domain.MarketAsset;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class r implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MarketAsset.Index f25008a;

    public r(MarketAsset.Index asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        this.f25008a = asset;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f25008a, ((r) obj2).f25008a);
    }

    public final int hashCode() {
        return this.f25008a.hashCode();
    }
}
