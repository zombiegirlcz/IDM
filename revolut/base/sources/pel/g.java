package pel;

import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Asset f235402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Amount f235403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f235404c;
    public final h d;

    public g(Asset moneyInputAsset, Amount selectedPocketBalance, boolean z, h fixedAmountSelection) {
        Intrinsics.checkNotNullParameter(moneyInputAsset, "moneyInputAsset");
        Intrinsics.checkNotNullParameter(selectedPocketBalance, "selectedPocketBalance");
        Intrinsics.checkNotNullParameter(fixedAmountSelection, "fixedAmountSelection");
        this.f235402a = moneyInputAsset;
        this.f235403b = selectedPocketBalance;
        this.f235404c = z;
        this.d = fixedAmountSelection;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f235402a, gVar.f235402a) && Intrinsics.f(this.f235403b, gVar.f235403b) && this.f235404c == gVar.f235404c && this.d == gVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.c(y.d(this.f235403b, this.f235402a.hashCode() * 31, 31), 31, this.f235404c);
    }
}
