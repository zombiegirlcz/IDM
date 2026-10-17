package whh;

import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.retail.trading.core.domain.account_closure.AccountClosureStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WealthAccount.TaxAdvantageWealthAccount f297663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountClosureStatus f297664b;

    public e(WealthAccount.TaxAdvantageWealthAccount wealthTaxAdvantageAccount, AccountClosureStatus closureData) {
        Intrinsics.checkNotNullParameter(wealthTaxAdvantageAccount, "wealthTaxAdvantageAccount");
        Intrinsics.checkNotNullParameter(closureData, "closureData");
        this.f297663a = wealthTaxAdvantageAccount;
        this.f297664b = closureData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f297663a, eVar.f297663a) && Intrinsics.f(this.f297664b, eVar.f297664b);
    }

    public final int hashCode() {
        return this.f297664b.hashCode() + (this.f297663a.hashCode() * 31);
    }
}
