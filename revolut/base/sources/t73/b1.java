package t73;

import com.revolut.core.model.account.AccountId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b1 extends com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f268428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountId f268429b;

    public b1(AccountId accountId, String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f268428a = cardId;
        this.f268429b = accountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj2;
        return Intrinsics.f(this.f268428a, b1Var.f268428a) && Intrinsics.f(this.f268429b, b1Var.f268429b);
    }

    public final int hashCode() {
        return this.f268429b.hashCode() + (this.f268428a.hashCode() * 31);
    }
}
