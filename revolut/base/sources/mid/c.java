package mid;

import com.revolut.feature.shops.api.model.ShopsOutletAvailabilityInterval;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ShopsOutletAvailabilityInterval f205689b;

    public c(String nextAvailableDayCode, ShopsOutletAvailabilityInterval firstAvailableIntervalOnAnotherDay) {
        Intrinsics.checkNotNullParameter(nextAvailableDayCode, "nextAvailableDayCode");
        Intrinsics.checkNotNullParameter(firstAvailableIntervalOnAnotherDay, "firstAvailableIntervalOnAnotherDay");
        this.f205688a = nextAvailableDayCode;
        this.f205689b = firstAvailableIntervalOnAnotherDay;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f205688a, cVar.f205688a) && Intrinsics.f(this.f205689b, cVar.f205689b);
    }

    public final int hashCode() {
        return this.f205689b.hashCode() + (this.f205688a.hashCode() * 31);
    }
}
