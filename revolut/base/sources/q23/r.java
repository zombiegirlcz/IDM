package q23;

import com.revolut.feature.address.models.Address;
import com.revolut.feature.cards.models.delivery.CardDeliveryRecipient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class r extends com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Address f241518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f241519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CardDeliveryRecipient f241520c;

    public r(Address confirmedAddress, Boolean bool, CardDeliveryRecipient cardDeliveryRecipient) {
        Intrinsics.checkNotNullParameter(confirmedAddress, "confirmedAddress");
        this.f241518a = confirmedAddress;
        this.f241519b = bool;
        this.f241520c = cardDeliveryRecipient;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f241518a, rVar.f241518a) && Intrinsics.f(this.f241519b, rVar.f241519b) && Intrinsics.f(this.f241520c, rVar.f241520c);
    }

    public final int hashCode() {
        int iHashCode = this.f241518a.hashCode() * 31;
        Boolean bool = this.f241519b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        CardDeliveryRecipient cardDeliveryRecipient = this.f241520c;
        return iHashCode2 + (cardDeliveryRecipient != null ? cardDeliveryRecipient.hashCode() : 0);
    }
}
