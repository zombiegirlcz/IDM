package urf;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transfer.shared_core.R$string;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements yqi.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f282305a;

    public a(dj0.d money) {
        Intrinsics.checkNotNullParameter(money, "money");
        this.f282305a = money;
    }

    @Override // yqi.b
    public final Clause a() {
        return new TextLocalisedClause(R$string.transfer_error_amount_maximum_amount, u.c(new MoneyClause(this.f282305a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4)), null, 12);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f282305a, ((a) obj2).f282305a);
    }

    public final int hashCode() {
        return this.f282305a.hashCode();
    }
}
