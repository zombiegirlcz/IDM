package t73;

import com.revolut.core.model.account.AccountId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e1 extends com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h93.f0 f268456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f268457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccountId f268458c;

    public e1(h93.f0 card, String str, AccountId accountId) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f268456a = card;
        this.f268457b = str;
        this.f268458c = accountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj2;
        return Intrinsics.f(this.f268456a, e1Var.f268456a) && Intrinsics.f(this.f268457b, e1Var.f268457b) && Intrinsics.f(this.f268458c, e1Var.f268458c);
    }

    public final int hashCode() {
        int iHashCode = this.f268456a.hashCode() * 31;
        String str = this.f268457b;
        return this.f268458c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
