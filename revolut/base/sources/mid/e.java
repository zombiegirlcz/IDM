package mid;

import com.revolut.feature.shops.api.model.ShopsOutletAvailabilityInterval;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShopsOutletAvailabilityInterval f205697a;

    public e(ShopsOutletAvailabilityInterval interval) {
        Intrinsics.checkNotNullParameter(interval, "interval");
        this.f205697a = interval;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f205697a, ((e) obj2).f205697a);
    }

    public final int hashCode() {
        return this.f205697a.hashCode();
    }
}
