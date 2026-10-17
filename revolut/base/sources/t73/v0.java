package t73;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.checkout.models.CheckoutOrder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class v0 extends com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckoutOrder f268553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountId f268554b;

    public v0(CheckoutOrder order, AccountId accountId) {
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f268553a = order;
        this.f268554b = accountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj2;
        return Intrinsics.f(this.f268553a, v0Var.f268553a) && Intrinsics.f(this.f268554b, v0Var.f268554b);
    }

    public final int hashCode() {
        return this.f268554b.hashCode() + (this.f268553a.hashCode() * 31);
    }
}
