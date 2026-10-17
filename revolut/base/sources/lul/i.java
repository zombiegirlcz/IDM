package lul;

import aw0.o9;
import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final class i {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static eii.b a(String str, int i, OrderQuote.PriceLevel priceLevel) {
        return new eii.b(new CellDetailsDelegate.Model(str, new t0((Clause) new TextLocalisedClause(i, null, null, 14), (Image) null, 0, false, 30), yoj.b.m(new TextClause(" × ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new MoneyClause(priceLevel.f104772a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4), new NumberClause(priceLevel.f104773b, null, null, null, 14))), null, null, null, null, 0, null, false, false, null, null, 32760));
    }
}
