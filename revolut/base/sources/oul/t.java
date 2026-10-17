package oul;

import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class t implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Amount f229922a;

    public t(Amount marketPrice) {
        Intrinsics.checkNotNullParameter(marketPrice, "marketPrice");
        this.f229922a = marketPrice;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f229922a, ((t) obj2).f229922a);
    }

    public final int hashCode() {
        return this.f229922a.hashCode();
    }
}
