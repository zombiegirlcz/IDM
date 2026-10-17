package l5i;

import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class o extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChargeBreakdown f192294a;

    public o(ChargeBreakdown taxes) {
        Intrinsics.checkNotNullParameter(taxes, "taxes");
        this.f192294a = taxes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f192294a, ((o) obj2).f192294a);
    }

    public final int hashCode() {
        return this.f192294a.hashCode();
    }
}
