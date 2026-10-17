package t73;

import com.revolut.core.model.account.AccountId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class x0 extends com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h93.f0 f268566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountId f268567b;

    public x0(h93.f0 disposableCard, AccountId accountId) {
        Intrinsics.checkNotNullParameter(disposableCard, "disposableCard");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f268566a = disposableCard;
        this.f268567b = accountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj2;
        return Intrinsics.f(this.f268566a, x0Var.f268566a) && Intrinsics.f(this.f268567b, x0Var.f268567b);
    }

    public final int hashCode() {
        return this.f268567b.hashCode() + (this.f268566a.hashCode() * 31);
    }
}
