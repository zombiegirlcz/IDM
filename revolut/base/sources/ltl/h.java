package ltl;

import aw0.k7;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.n0;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.trading.core.domain.orders.InvestMutualFundOrder;
import com.revolut.retail.wealth.resources.R$plurals;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import d9.e1;
import java.math.BigDecimal;
import java.util.List;
import k4l.r0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nel.z;
import te0.w;
import wul.o;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f199975a;

    public h(nbh.a instrumentImageProvider, o tradingOrderMapper) {
        Intrinsics.checkNotNullParameter(instrumentImageProvider, "instrumentImageProvider");
        Intrinsics.checkNotNullParameter(tradingOrderMapper, "tradingOrderMapper");
        this.f199975a = tradingOrderMapper;
    }

    public final qv0.l a(boolean z, InvestMutualFundOrder investOrder, Object obj2, String str) throws Throwable {
        Clause moneyClause;
        Intrinsics.checkNotNullParameter("WIDGET_LIST_ID_INVEST_ORDER_", "listIdPrefix");
        Intrinsics.checkNotNullParameter(investOrder, "investOrder");
        String str2 = investOrder.f104568b;
        BigDecimal bigDecimal = investOrder.v;
        bfl.g gVar = investOrder.f104571h;
        String strQ = j6.a.q("WIDGET_LIST_ID_INVEST_ORDER_", str2);
        bfl.g gVar2 = investOrder.f104571h;
        r0 r0Var = investOrder.f104572j;
        String str3 = investOrder.f104579s;
        if (str3.length() == 0) {
            str3 = investOrder.f104577q;
        }
        TextClause textClause = new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        Custom custom = new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254);
        z zVar = investOrder.d;
        o oVar = this.f199975a;
        TextLocalisedClause textLocalisedClauseL = oVar.l(gVar2, r0Var, textClause, custom, zVar);
        Clause clauseB = oVar.b(new CompositeClause(v.k(new TextLocalisedClause(R$string.wealth_trading_orders_execution_date, null, null, 14), new TextClause(": ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TimeClause(investOrder.o.f104584a.toEpochMilli(), new TimeClause.Format.DateMedium(n0.HIDE_CURRENT_YEAR), null, null, 12)), null, null, null, 14), investOrder.f104574m == cfl.j.PERSONAL_JOINT ? investOrder.f104573l : null, str);
        int i = g.f199974a[gVar.ordinal()];
        if (i == 1) {
            moneyClause = new MoneyClause(com.revolut.retail.trading.core.domain.orders.a.n(investOrder.f104581w, gVar), new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), null, null, 12);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i2 = R$plurals.wealth_common_portfolio_shares_parameterized;
            Integer numValueOf = Integer.valueOf(e1.E(bigDecimal) ? 1 : 2);
            BigDecimal bigDecimalNegate = bigDecimal.negate();
            Intrinsics.checkNotNullExpressionValue(bigDecimalNegate, "negate(...)");
            moneyClause = new TextLocalisedQuantityClause(i2, numValueOf, u.c(new NumberClause(bigDecimalNegate, new NumberClause.Format.AllDigitsAfterDot(null, null, 3), null, null, 12)), (Style) null, 24);
        }
        RowDelegate.Model.c.b bVar = new RowDelegate.Model.c.b(moneyClause, null, null, false, 126);
        InstrumentImage instrumentImageA = nbh.a.a(com.revolut.retail.trading.core.domain.orders.a.i(investOrder));
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int i3 = R$drawable.uikit_icn_16_status_clock_arrows;
        int i5 = R$attr.uikit_colorAccentNeutral;
        int i6 = R$attr.uikit_colorPopoverBackground;
        RowDelegate.Model model = new RowDelegate.Model(strQ, new RowDelegate.Model.MainImage.Image40(instrumentImageA, companion.d(i3, i5, i6, Integer.valueOf(i6), 2.0f, 2.0f, Float.valueOf(12.0f)), null, false, 24), textLocalisedClauseL, null, 0, clauseB, null, null, 0, bVar, true, null, false, null, null, null, null, null, null, obj2, null, 0, 0, 0, 0, 532673496);
        return z ? (wh) w.y0(new ky4.f(investOrder, 4, model, obj2)).getValue() : model;
    }
}
