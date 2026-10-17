package n2f;

import aw0.n6;
import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.j2;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.trade_rev_points.api.R$plurals;
import com.revolut.feature.trade_rev_points.api.R$string;
import com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.breakdown.TradeRevPointsTransferBreakdownScreenContract$InputData;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradeRevPointsTransferBreakdownScreenContract$InputData f211537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m2f.c f211538b;

    public e(TradeRevPointsTransferBreakdownScreenContract$InputData inputData, v1f.c tradeRevPointsClauseFormatter, m2f.c tradeRevPointsFormatter) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(tradeRevPointsClauseFormatter, "tradeRevPointsClauseFormatter");
        Intrinsics.checkNotNullParameter(tradeRevPointsFormatter, "tradeRevPointsFormatter");
        this.f211537a = inputData;
        this.f211538b = tradeRevPointsFormatter;
    }

    public final TextLocalisedQuantityClause a(c cVar) {
        int i = R$plurals.trade_rev_points_trade_currency_rev_points;
        Double dValueOf = Double.valueOf(cVar.f211534a);
        String str = this.f211538b.f201965a.format(cVar.f211534a);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return new TextLocalisedQuantityClause(i, dValueOf, u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), (Style) null, 24);
    }

    @Override // cli.n
    public final o c(j jVar) {
        Clause compositeClause;
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.miles_transfer_breakdown_title, null, null, 14);
        double d = domainState.f211536c;
        double d5 = domainState.f211534a;
        lw0.a aVar = new lw0.a(textLocalisedClause, d == d5 ? null : new TextLocalisedClause(R$string.miles_transfer_breakdown_exchange_rate_description_adjusted_amount, null, null, 14), null, null, false, 28);
        aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.trade_rev_points_common_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.miles_transfer_breakdown_exchange_rate_title, null, null, 14);
        TradeRevPointsTransferBreakdownScreenContract$InputData tradeRevPointsTransferBreakdownScreenContract$InputData = this.f211537a;
        CompositeClause compositeClauseF = v1f.c.f(tradeRevPointsTransferBreakdownScreenContract$InputData.getF91175b(), v1f.a.REV_POINTS, null);
        j2 j2Var = j2.H6;
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("TRANSFER_BREAKDOWN_EXCHANGE_RATE_ITEM_ID", textLocalisedClause2, compositeClauseF, 0, null, null, j2Var, null, null, false, 0, 0, 32696);
        double d6 = domainState.f211536c;
        if (d6 == d5) {
            compositeClause = a(domainState);
        } else {
            String str = this.f211538b.f201965a.format(d6);
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            List listK = v.k(new TextClause(str, (Style) new Custom(new Custom.Color.Solid(R$attr.uikit_colorGreyTone50), true, false, Constants.TAG_FC_SPEED_MODE), (Integer) null, false, (o9) null, (List) null, 124), a(domainState));
            m70.a.t(t0.f186434a);
            compositeClause = new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        }
        List listK2 = v.k(model, new CellDetailsDelegate.Model("TRANSFER_BREAKDOWN_USER_TRANSFER_ITEM_ID", new TextLocalisedClause(R$string.miles_transfer_breakdown_user_transfer_title, null, null, 14), compositeClause, 0, null, null, j2Var, null, null, false, 0, 0, 32696), new CellDetailsDelegate.Model("TRANSFER_BREAKDOWN_USER_RECEIVE_ITEM_ID", new TextLocalisedClause(R$string.miles_transfer_breakdown_user_receive_title, null, null, 14), v1f.c.d(tradeRevPointsTransferBreakdownScreenContract$InputData.getF91175b().f91192c, (int) domainState.f211535b, null), 0, null, null, j2Var, null, null, false, 0, 0, 32696));
        yp0.b.k(listK2, 0, 0, 0, 0, 31);
        return new cii.b(eVar, listK2, aVar);
    }
}
