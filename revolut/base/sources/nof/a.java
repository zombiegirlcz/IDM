package nof;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.data.model.Data;
import com.revolut.feature.transactions.impl.R$plurals;
import com.revolut.feature.transactions.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import tof.a8;
import tof.i7;
import tof.ja;
import tof.q7;
import tof.y6;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h {
    @Override // nof.h
    public final boolean a(a3 currentTransaction) {
        Intrinsics.checkNotNullParameter(currentTransaction, "currentTransaction");
        y6 y6Var = currentTransaction.e;
        return (y6Var == y6.CARD_PAYMENT || y6Var == y6.CARD_REFUND) && !currentTransaction.m0;
    }

    @Override // nof.h
    public final q7 c(a3 currentTransaction) {
        Intrinsics.checkNotNullParameter(currentTransaction, "currentTransaction");
        i7.c cVar = i7.Companion;
        String str = currentTransaction.A.f272779a.d;
        if (str == null) {
            return null;
        }
        ja jaVar = new ja(str);
        a8 a8Var = new a8();
        y6[] y6VarArr = {y6.CARD_PAYMENT, y6.CARD_REFUND};
        cVar.getClass();
        return i7.c.a(jaVar, a8Var, i7.c.d(y6VarArr));
    }

    @Override // nof.h
    public final List d(g gVar, boolean z) {
        c statistics = (c) gVar;
        Intrinsics.checkNotNullParameter(statistics, "statistics");
        int i = R$string.transaction_statistics_section_spent_at_merchant;
        String str = statistics.f218024c;
        int i2 = statistics.f218022a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, u.c(str), null, 12);
        dj0.d dVar = statistics.f218023b;
        qv0.i[] elements = {new CellDetailsDelegate.Model("ID_STATS_TOTAL_SENT", textLocalisedClause, sx4.f.b(3, null, null, dVar), null, null, false, 1, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048488), z ? h.b(new TextLocalisedQuantityClause(R$plurals.transaction_details_statistics_see_all, Integer.valueOf(i2), u.c(Integer.valueOf(i2)), (Style) null, 24), new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.transaction_statistics_list_spent_in_total, u.c(sx4.f.b(3, null, null, dVar)), null, 12), statistics.d) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return listL;
    }

    @Override // nof.h
    public final Data e(a3 currentTransaction, int i, dj0.d sentAmount, dj0.d receivedAmount, i7 filter) {
        String str;
        Intrinsics.checkNotNullParameter(currentTransaction, "currentTransaction");
        Intrinsics.checkNotNullParameter(sentAmount, "sentAmount");
        Intrinsics.checkNotNullParameter(receivedAmount, "receivedAmount");
        Intrinsics.checkNotNullParameter(filter, "filter");
        dj0.d dVarH = pyd.c.H(sentAmount, receivedAmount);
        dj0.d.Companion.getClass();
        if (dVarH.compareTo(dj0.d.e) < 0) {
            dVarH = null;
        }
        if (dVarH != null && (str = currentTransaction.A.f272779a.d) != null) {
            return zi0.c.P(new c(i, dVarH, str, filter), false, null, 3);
        }
        return new Data(null, null, false, 7, null);
    }
}
