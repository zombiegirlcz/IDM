package c7j;

import aw0.o9;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.RateClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.t0;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class f {
    public static CompositeClause a(CurrencyClause currencyClause, String str, double d, xi0.b bVar) {
        List listK = v.k(currencyClause, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new RateClause(new BigDecimal(String.valueOf(d)), bVar, new RateClause.Format.ExchangeRate(true), null));
        m70.a.t(t0.f186434a);
        return new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }
}
