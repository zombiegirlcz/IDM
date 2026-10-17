package s56;

import com.revolut.feature.defi.accounts.api.model.DeFiBalance;
import com.revolut.feature.defi.asset_details.api.model.DeFiAssetDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeFiBalance f259999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DeFiAssetDetails f260000b;

    public v0(DeFiBalance assetInBalance, DeFiAssetDetails assetOut) {
        Intrinsics.checkNotNullParameter(assetInBalance, "assetInBalance");
        Intrinsics.checkNotNullParameter(assetOut, "assetOut");
        this.f259999a = assetInBalance;
        this.f260000b = assetOut;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj2;
        return Intrinsics.f(this.f259999a, v0Var.f259999a) && Intrinsics.f(this.f260000b, v0Var.f260000b);
    }

    public final int hashCode() {
        return this.f260000b.hashCode() + (this.f259999a.hashCode() * 31);
    }
}
