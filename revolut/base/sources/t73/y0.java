package t73;

import com.revolut.core.model.account.AccountId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class y0 extends com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h93.f0 f268571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e93.d f268572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccountId f268573c;

    public y0(h93.f0 card, e93.d cardDesign, AccountId accountId) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(cardDesign, "cardDesign");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f268571a = card;
        this.f268572b = cardDesign;
        this.f268573c = accountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj2;
        return Intrinsics.f(this.f268571a, y0Var.f268571a) && Intrinsics.f(this.f268572b, y0Var.f268572b) && Intrinsics.f(this.f268573c, y0Var.f268573c);
    }

    public final int hashCode() {
        return this.f268573c.hashCode() + ((this.f268572b.hashCode() + (this.f268571a.hashCode() * 31)) * 31);
    }
}
