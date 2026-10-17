package o7j;

import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class p implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Amount f222871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wd6.h f222872b;

    public p(Amount targetPrice, wd6.h orderType) {
        Intrinsics.checkNotNullParameter(targetPrice, "targetPrice");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        this.f222871a = targetPrice;
        this.f222872b = orderType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f222871a, pVar.f222871a) && this.f222872b == pVar.f222872b;
    }

    public final int hashCode() {
        return this.f222872b.hashCode() + (this.f222871a.hashCode() * 31);
    }
}
