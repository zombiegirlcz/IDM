package d4i;

import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChargeBreakdown f111323a;

    public b(ChargeBreakdown fee2) {
        Intrinsics.checkNotNullParameter(fee2, "fee");
        this.f111323a = fee2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f111323a, ((b) obj2).f111323a);
    }

    public final int hashCode() {
        return this.f111323a.hashCode();
    }
}
