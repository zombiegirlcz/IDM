package w4i;

import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class y implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChargeBreakdown f294598a;

    public y(ChargeBreakdown taxes) {
        Intrinsics.checkNotNullParameter(taxes, "taxes");
        this.f294598a = taxes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && Intrinsics.f(this.f294598a, ((y) obj2).f294598a);
    }

    public final int hashCode() {
        return this.f294598a.hashCode();
    }
}
