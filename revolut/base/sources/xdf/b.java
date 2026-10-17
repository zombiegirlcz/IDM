package xdf;

import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Amount f304423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Amount f304424b;

    public b(Amount balanceAmount, Amount amount) {
        Intrinsics.checkNotNullParameter(balanceAmount, "balanceAmount");
        this.f304423a = balanceAmount;
        this.f304424b = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f304423a, bVar.f304423a) && Intrinsics.f(this.f304424b, bVar.f304424b);
    }

    public final int hashCode() {
        int iHashCode = this.f304423a.hashCode() * 31;
        Amount amount = this.f304424b;
        return iHashCode + (amount == null ? 0 : amount.hashCode());
    }
}
