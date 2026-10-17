package i56;

import com.revolut.feature.defi.common.models.domain.DeFiAssetAmount;
import com.revolut.feature.defi.common.models.domain.DeFiAssetAmountWithFiat;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f158758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DeFiAssetAmountWithFiat f158759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DeFiAssetAmount f158760c;

    public b(String networkFeePercent, DeFiAssetAmountWithFiat networkFee, DeFiAssetAmount networkFeeInInputAsset) {
        Intrinsics.checkNotNullParameter(networkFeePercent, "networkFeePercent");
        Intrinsics.checkNotNullParameter(networkFee, "networkFee");
        Intrinsics.checkNotNullParameter(networkFeeInInputAsset, "networkFeeInInputAsset");
        this.f158758a = networkFeePercent;
        this.f158759b = networkFee;
        this.f158760c = networkFeeInInputAsset;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f158758a, bVar.f158758a) && Intrinsics.f(this.f158759b, bVar.f158759b) && Intrinsics.f(this.f158760c, bVar.f158760c);
    }

    public final int hashCode() {
        return this.f158760c.hashCode() + ((this.f158759b.hashCode() + (this.f158758a.hashCode() * 31)) * 31);
    }
}
