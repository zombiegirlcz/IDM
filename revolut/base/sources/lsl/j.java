package lsl;

import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChargeBreakdown f199707a;

    public j(ChargeBreakdown chargeBreakdown) {
        this.f199707a = chargeBreakdown;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f199707a, ((j) obj2).f199707a);
    }

    public final int hashCode() {
        ChargeBreakdown chargeBreakdown = this.f199707a;
        if (chargeBreakdown == null) {
            return 0;
        }
        return chargeBreakdown.hashCode();
    }
}
