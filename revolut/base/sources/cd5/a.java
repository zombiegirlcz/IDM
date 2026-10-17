package cd5;

import aw0.k7;
import com.revolut.core.ui_kit.models.MoneyClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public a(wt5.a cryptoInvestmentsCalculations) {
        Intrinsics.checkNotNullParameter(cryptoInvestmentsCalculations, "cryptoInvestmentsCalculations");
    }

    public final MoneyClause a(dj0.d money, ej0.b bVar, ej0.b bVar2) {
        Intrinsics.checkNotNullParameter(money, "money");
        if (bVar == null || bVar2 == null) {
            return null;
        }
        long j2 = money.f115082a;
        xi0.b currency = money.f115083b;
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new MoneyClause(mif.a.P(wt5.a.d(bVar, bVar2, j2 / cp5.d.k(currency)), 2, 2), new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), null, null, 12);
    }
}
