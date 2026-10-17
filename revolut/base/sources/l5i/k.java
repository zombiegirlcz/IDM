package l5i;

import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChargeBreakdown f192285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f192286b;

    public k(ChargeBreakdown fee2, xi0.b bVar) {
        Intrinsics.checkNotNullParameter(fee2, "fee");
        this.f192285a = fee2;
        this.f192286b = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f192285a, kVar.f192285a) && Intrinsics.f(this.f192286b, kVar.f192286b);
    }

    public final int hashCode() {
        int iHashCode = this.f192285a.hashCode() * 31;
        xi0.b bVar = this.f192286b;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }
}
