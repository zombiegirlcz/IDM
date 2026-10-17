package i1l;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transfer.core.R$string;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements yqi.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f157646a;

    public d(dj0.d money) {
        Intrinsics.checkNotNullParameter(money, "money");
        this.f157646a = money;
    }

    @Override // yqi.b
    public final Clause a() {
        return new TextLocalisedClause(R$string.transfer_error_amount_maximum_amount, u.c(new MoneyClause(this.f157646a, new MoneyClause.Format.Shorts(false, 63), null, null, 12)), null, 12);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f157646a, ((d) obj2).f157646a);
    }

    public final int hashCode() {
        return this.f157646a.hashCode();
    }
}
