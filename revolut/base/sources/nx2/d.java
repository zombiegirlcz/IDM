package nx2;

import com.revolut.feature.card_order_new.api.navigation.CardOrderFlowDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardOrderFlowDestination.CardDelivery f220096a;

    public d(CardOrderFlowDestination.CardDelivery destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f220096a = destination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f220096a.equals(((d) obj2).f220096a);
    }

    public final int hashCode() {
        return this.f220096a.hashCode();
    }
}
