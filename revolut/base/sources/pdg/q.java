package pdg;

import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsCheckoutParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class q extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsCheckoutParams f235214a;

    public q(TravelHotelsCheckoutParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f235214a = params;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f235214a, ((q) obj2).f235214a);
    }

    public final int hashCode() {
        return this.f235214a.hashCode();
    }
}
