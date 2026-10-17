package w4i;

import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class s implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChargeBreakdown f294587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f294588b;

    public s(ChargeBreakdown fee2, xi0.b bVar) {
        Intrinsics.checkNotNullParameter(fee2, "fee");
        this.f294587a = fee2;
        this.f294588b = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f294587a, sVar.f294587a) && Intrinsics.f(this.f294588b, sVar.f294588b);
    }

    public final int hashCode() {
        int iHashCode = this.f294587a.hashCode() * 31;
        xi0.b bVar = this.f294588b;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }
}
