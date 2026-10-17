package s56;

import com.revolut.feature.defi.accounts.api.model.DeFiBalance;
import com.revolut.feature.defi.asset_details.api.model.DeFiAssetDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeFiBalance f259963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DeFiAssetDetails f259964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f259965c;

    public l0(DeFiBalance assetInBalance, DeFiAssetDetails assetOut, xi0.b baseFiatCurrency) {
        Intrinsics.checkNotNullParameter(assetInBalance, "assetInBalance");
        Intrinsics.checkNotNullParameter(assetOut, "assetOut");
        Intrinsics.checkNotNullParameter(baseFiatCurrency, "baseFiatCurrency");
        this.f259963a = assetInBalance;
        this.f259964b = assetOut;
        this.f259965c = baseFiatCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return Intrinsics.f(this.f259963a, l0Var.f259963a) && Intrinsics.f(this.f259964b, l0Var.f259964b) && Intrinsics.f(this.f259965c, l0Var.f259965c);
    }

    public final int hashCode() {
        return this.f259965c.hashCode() + ((this.f259964b.hashCode() + (this.f259963a.hashCode() * 31)) * 31);
    }
}
