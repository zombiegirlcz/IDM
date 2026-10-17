package h33;

import com.revolut.feature.cards.models.delivery.CardDeliveryRecipient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardDeliveryRecipient f149027a;

    public i(CardDeliveryRecipient recipient) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        this.f149027a = recipient;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f149027a, ((i) obj2).f149027a);
    }

    public final int hashCode() {
        return this.f149027a.hashCode();
    }
}
