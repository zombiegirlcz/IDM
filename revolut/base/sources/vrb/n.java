package vrb;

import aw0.k7;
import cli.o;
import com.revolut.core.ui_kit.models.AssetClauseType;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.ResourceId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.retail.wealth.resources.R$plurals;
import com.revolut.retail.wealth.resources.R$string;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vo8.t;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static MoneyClause a(dj0.d dVar) {
        return new MoneyClause(dVar, new MoneyClause.Format.Headers(k7.ALWAYS, null, null, false, false, 30), new Custom(Integer.valueOf(dVar.f(dj0.d.e) ? R$attr.uikit_colorPerformancePositive : dVar.k() ? R$attr.uikit_colorPerformanceStatic : R$attr.uikit_colorPerformanceNegative), false, null, false, null, 254), null, 8);
    }

    public static TextLocalisedQuantityClause b(dj0.d dVar, BigDecimal bigDecimal) {
        return new TextLocalisedQuantityClause(new ResourceId.IntResourceId(R$plurals.wealth_margin_cfd_position_and_price_string), bigDecimal, v.k(new NumberClause(bigDecimal, new AssetClauseType.Stock(0).f57737a, null, null, 12), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.trading_advanced_charts_open_positions_title, null, null, 14), null, null, null, false, 30);
        Data data = domainState.f291547a;
        List list = data != null ? (List) iii.c.f(data, new vq0.g(12), new t(16), new m(this, domainState)) : null;
        if (list == null) {
            list = f0.f322471a;
        }
        Data data2 = domainState.f291547a;
        return new cii.b(data2 != null ? (aw0.g) iii.c.f(data2, new vq0.g(13), new t(17), new m(domainState)) : null, list, aVar);
    }
}
