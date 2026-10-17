package t73;

import com.revolut.core.model.account.AccountId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class z0 extends com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h93.f0 f268577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountId f268578b;

    public z0(h93.f0 card, AccountId accountId) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f268577a = card;
        this.f268578b = accountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj2;
        return Intrinsics.f(this.f268577a, z0Var.f268577a) && Intrinsics.f(this.f268578b, z0Var.f268578b);
    }

    public final int hashCode() {
        return this.f268578b.hashCode() + (this.f268577a.hashCode() * 31);
    }
}
