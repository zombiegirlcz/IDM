package t73;

import com.revolut.core.model.account.AccountId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a1 extends com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f268424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b93.e f268425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccountId f268426c;
    public final String d;

    public a1(String cardId, b93.e cardType, AccountId accountId, String str) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f268424a = cardId;
        this.f268425b = cardType;
        this.f268426c = accountId;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj2;
        return Intrinsics.f(this.f268424a, a1Var.f268424a) && this.f268425b == a1Var.f268425b && Intrinsics.f(this.f268426c, a1Var.f268426c) && Intrinsics.f(this.d, a1Var.d);
    }

    public final int hashCode() {
        int iB = h30.l.b(this.f268426c, (this.f268425b.hashCode() + (this.f268424a.hashCode() * 31)) * 31, 31);
        String str = this.d;
        return iB + (str == null ? 0 : str.hashCode());
    }
}
