package s56;

import com.revolut.feature.defi.accounts.api.model.DeFiBalance;
import com.revolut.feature.defi.asset_details.api.model.DeFiAssetDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f259967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f259968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DeFiBalance f259969c;
    public final DeFiAssetDetails d;
    public final xi0.b e;
    public final wk5.a f;

    public m0(String amountInput, n amountInputMode, DeFiBalance assetInBalance, DeFiAssetDetails assetOut, xi0.b baseFiatCurrency, wk5.a chain) {
        Intrinsics.checkNotNullParameter(amountInput, "amountInput");
        Intrinsics.checkNotNullParameter(amountInputMode, "amountInputMode");
        Intrinsics.checkNotNullParameter(assetInBalance, "assetInBalance");
        Intrinsics.checkNotNullParameter(assetOut, "assetOut");
        Intrinsics.checkNotNullParameter(baseFiatCurrency, "baseFiatCurrency");
        Intrinsics.checkNotNullParameter(chain, "chain");
        this.f259967a = amountInput;
        this.f259968b = amountInputMode;
        this.f259969c = assetInBalance;
        this.d = assetOut;
        this.e = baseFiatCurrency;
        this.f = chain;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Intrinsics.f(this.f259967a, m0Var.f259967a) && this.f259968b == m0Var.f259968b && Intrinsics.f(this.f259969c, m0Var.f259969c) && Intrinsics.f(this.d, m0Var.d) && Intrinsics.f(this.e, m0Var.e) && this.f == m0Var.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + h30.l.j(this.e, (this.d.hashCode() + ((this.f259969c.hashCode() + ((this.f259968b.hashCode() + (this.f259967a.hashCode() * 31)) * 31)) * 31)) * 31, 31);
    }
}
