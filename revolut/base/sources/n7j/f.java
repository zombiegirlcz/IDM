package n7j;

import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChargeBreakdown f213165a;

    public f(ChargeBreakdown fee2) {
        Intrinsics.checkNotNullParameter(fee2, "fee");
        this.f213165a = fee2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f213165a, ((f) obj2).f213165a);
    }

    public final int hashCode() {
        return this.f213165a.hashCode();
    }
}
