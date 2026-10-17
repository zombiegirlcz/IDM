package t73;

import com.revolut.core.model.account.AccountId;
import kotlin.jvm.internal.Intrinsics;
import tof.i7;

/* JADX INFO: loaded from: classes21.dex */
public final class f1 extends com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h93.f0 f268463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountId f268464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i7 f268465c;

    public f1(h93.f0 card, AccountId accountId, i7 transactionsFilter) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(transactionsFilter, "transactionsFilter");
        this.f268463a = card;
        this.f268464b = accountId;
        this.f268465c = transactionsFilter;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj2;
        return Intrinsics.f(this.f268463a, f1Var.f268463a) && Intrinsics.f(this.f268464b, f1Var.f268464b) && Intrinsics.f(this.f268465c, f1Var.f268465c);
    }

    public final int hashCode() {
        return this.f268465c.hashCode() + h30.l.b(this.f268464b, this.f268463a.hashCode() * 31, 31);
    }
}
