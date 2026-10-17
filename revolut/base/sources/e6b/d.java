package e6b;

import com.revolut.feature.card_order_new.api.navigation.CardOrderFlowDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardOrderFlowDestination.CardDelivery f122964a;

    public d(CardOrderFlowDestination.CardDelivery destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f122964a = destination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f122964a, ((d) obj2).f122964a);
    }

    public final int hashCode() {
        return this.f122964a.hashCode();
    }
}
