package rhg;

import com.revolut.feature.travel.miles.api.model.TravelMilesMoneyRangeFilter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelMilesMoneyRangeFilter f254465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f254466b;

    public s(TravelMilesMoneyRangeFilter rangeFilter, xi0.b currency) {
        Intrinsics.checkNotNullParameter(rangeFilter, "rangeFilter");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f254465a = rangeFilter;
        this.f254466b = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f254465a, sVar.f254465a) && Intrinsics.f(this.f254466b, sVar.f254466b);
    }

    public final int hashCode() {
        return this.f254466b.hashCode() + (this.f254465a.hashCode() * 31);
    }
}
