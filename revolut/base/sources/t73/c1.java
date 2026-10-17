package t73;

import com.revolut.feature.card_screen.common.cards.models.CardsStateSnapshot$SubscriptionsContent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c1 extends com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h93.f0 f268433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CardsStateSnapshot$SubscriptionsContent f268434b;

    public c1(h93.f0 card, CardsStateSnapshot$SubscriptionsContent subscriptions) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
        this.f268433a = card;
        this.f268434b = subscriptions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj2;
        return Intrinsics.f(this.f268433a, c1Var.f268433a) && Intrinsics.f(this.f268434b, c1Var.f268434b);
    }

    public final int hashCode() {
        return this.f268434b.hashCode() + (this.f268433a.hashCode() * 31);
    }
}
