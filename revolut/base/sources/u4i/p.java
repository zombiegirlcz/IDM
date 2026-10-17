package u4i;

import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class p extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChargeBreakdown f277360a;

    public p(ChargeBreakdown fee2) {
        Intrinsics.checkNotNullParameter(fee2, "fee");
        this.f277360a = fee2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f277360a, ((p) obj2).f277360a);
    }

    public final int hashCode() {
        return this.f277360a.hashCode();
    }
}
