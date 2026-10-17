package s9k;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.payments.peer_to_peer.impl.R$string;
import dj0.d;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements yqi.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f261197a;

    public c(d money) {
        Intrinsics.checkNotNullParameter(money, "money");
        this.f261197a = money;
    }

    @Override // yqi.b
    public final Clause a() {
        return new TextLocalisedClause(R$string.payments_peer_to_peer_transfer_warning_minimum_amount, u.c(new MoneyClause(this.f261197a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f261197a, ((c) obj2).f261197a);
    }

    public final int hashCode() {
        return this.f261197a.hashCode();
    }
}
