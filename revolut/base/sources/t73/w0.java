package t73;

import com.revolut.core.model.account.AccountId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class w0 extends com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b93.e f268558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountId f268559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f268560c;

    public w0(b93.e cardType, AccountId accountId, String str) {
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f268558a = cardType;
        this.f268559b = accountId;
        this.f268560c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj2;
        return this.f268558a == w0Var.f268558a && Intrinsics.f(this.f268559b, w0Var.f268559b) && Intrinsics.f(this.f268560c, w0Var.f268560c);
    }

    public final int hashCode() {
        int iB = h30.l.b(this.f268559b, this.f268558a.hashCode() * 31, 31);
        String str = this.f268560c;
        return iB + (str == null ? 0 : str.hashCode());
    }
}
