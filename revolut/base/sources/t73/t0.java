package t73;

import com.revolut.core.model.account.AccountId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class t0 extends com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h93.f0 f268541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountId f268542b;

    public t0(h93.f0 card, AccountId accountId) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f268541a = card;
        this.f268542b = accountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj2;
        return Intrinsics.f(this.f268541a, t0Var.f268541a) && Intrinsics.f(this.f268542b, t0Var.f268542b);
    }

    public final int hashCode() {
        return this.f268542b.hashCode() + (this.f268541a.hashCode() * 31);
    }
}
