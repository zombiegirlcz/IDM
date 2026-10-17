package c5b;

import aw0.k7;
import aw0.o9;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import d9.t0;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import org.jmrtd.lds.LDSFile;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements d2b.a {
    public static TextLocalisedClause b(int i, BigDecimal bigDecimal, n nVar, ej0.b bVar) {
        MoneyClause moneyClause = new MoneyClause(t0.D(bVar, nVar), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        String plainString = bigDecimal.abs().toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
        return new TextLocalisedClause(i, v.k(new TextClause(plainString, (Style) null, (Integer) null, false, o9.SENSITIVE, (List) null, LDSFile.EF_DG14_TAG), new TextClause(nVar.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), moneyClause), null, 12);
    }

    public final MoneyClause a(dj0.d unrealisedPnl) {
        Intrinsics.checkNotNullParameter(unrealisedPnl, "unrealisedPnl");
        return new MoneyClause(unrealisedPnl, new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), new Custom(Integer.valueOf(pu7.a.v(unrealisedPnl)), false, null, false, null, 254), null, 8);
    }

    public final TextLocalisedClause c(String instrumentName, BigDecimal quantity) {
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(instrumentName, "instrumentName");
        return new TextLocalisedClause(quantity.compareTo(BigDecimal.ZERO) == 1 ? R$string.wealth_margin_cfd_open_positions_buy : R$string.wealth_margin_cfd_open_positions_sell, u.c(instrumentName), null, 12);
    }
}
