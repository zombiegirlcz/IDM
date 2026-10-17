package i1l;

import aw0.k7;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transfer.core.R$string;
import com.revolut.feature.wallets.api.module.WalletLimit;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final class k implements yqi.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hrf.i f157653a;

    public k(hrf.i limits) {
        Intrinsics.checkNotNullParameter(limits, "limits");
        this.f157653a = limits;
    }

    @Override // yqi.b
    public final Clause a() {
        WalletLimit.CounterLimit counterLimit = this.f157653a.f154820a;
        return new TextLocalisedClause(R$string.transfer_error_amount_remaining_limit, u.c(new MoneyClause(pyd.c.M(counterLimit != null ? pyd.c.H(counterLimit.e, counterLimit.f94846c) : null), new MoneyClause.Format.Defaults(k7.NEVER, null, false, false, 14), null, null, 12)), null, 12);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f157653a, ((k) obj2).f157653a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f157653a.hashCode() * 31);
    }
}
