package qig;

import aw0.e;
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
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.travel.miles.api.R$plurals;
import com.revolut.feature.travel.miles.api.R$string;
import com.revolut.feature.travel.miles.impl.ui.screen.transfer.breakdown.TravelMilesTransferBreakdownScreenContract$InputData;
import com.youTransactor.uCube.rpc.Constants;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelMilesTransferBreakdownScreenContract$InputData f246708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pig.b f246709b;

    public d(TravelMilesTransferBreakdownScreenContract$InputData inputData, agg.d milesClauseFormatter, pig.b milesFormatter) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(milesClauseFormatter, "milesClauseFormatter");
        Intrinsics.checkNotNullParameter(milesFormatter, "milesFormatter");
        this.f246708a = inputData;
        this.f246709b = milesFormatter;
    }

    public final TextLocalisedQuantityClause a(b bVar) {
        int i = R$plurals.miles_trade_currency_rev_points;
        BigDecimal bigDecimalB = bVar.f246705a.b();
        String str = this.f246709b.f236476a.format(bVar.f246705a.J());
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return new TextLocalisedQuantityClause(i, bigDecimalB, u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), (Style) null, 24);
    }

    @Override // cli.n
    public final o c(j jVar) {
        Clause compositeClause;
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.miles_transfer_breakdown_title, null, null, 14);
        RevPoints revPoints = domainState.f246707c;
        RevPoints revPoints2 = domainState.f246707c;
        RevPoints revPoints3 = domainState.f246705a;
        lw0.a aVar = new lw0.a(textLocalisedClause, !revPoints.equals(revPoints3) ? new TextLocalisedClause(R$string.miles_transfer_breakdown_exchange_rate_description_adjusted_amount, null, null, 14) : null, null, null, false, 28);
        e eVar = new e(false, null, null, new n6(new TextLocalisedClause(R$string.miles_common_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.miles_transfer_breakdown_exchange_rate_title, null, null, 14);
        TravelMilesTransferBreakdownScreenContract$InputData travelMilesTransferBreakdownScreenContract$InputData = this.f246708a;
        CompositeClause compositeClauseB = agg.d.b(travelMilesTransferBreakdownScreenContract$InputData.getF94399b(), travelMilesTransferBreakdownScreenContract$InputData.getF94400c(), agg.b.REV_POINTS, null);
        j2 j2Var = j2.H6;
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("TRANSFER_BREAKDOWN_EXCHANGE_RATE_ITEM_ID", textLocalisedClause2, compositeClauseB, 0, null, null, j2Var, null, null, false, 0, 0, 32696);
        if (revPoints2.equals(revPoints3)) {
            compositeClause = a(domainState);
        } else {
            String str = this.f246709b.f236476a.format(revPoints2.J());
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            List listK = v.k(new TextClause(str, (Style) new Custom(new Custom.Color.Solid(R$attr.uikit_colorGreyTone50), true, false, Constants.TAG_FC_SPEED_MODE), (Integer) null, false, (o9) null, (List) null, 124), a(domainState));
            m70.a.t(t0.f186434a);
            compositeClause = new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        }
        List listK2 = v.k(model, new CellDetailsDelegate.Model("TRANSFER_BREAKDOWN_USER_TRANSFER_ITEM_ID", new TextLocalisedClause(R$string.miles_transfer_breakdown_user_transfer_title, null, null, 14), compositeClause, 0, null, null, j2Var, null, null, false, 0, 0, 32696), new CellDetailsDelegate.Model("TRANSFER_BREAKDOWN_USER_RECEIVE_ITEM_ID", new TextLocalisedClause(R$string.miles_transfer_breakdown_user_receive_title, null, null, 14), agg.d.a(travelMilesTransferBreakdownScreenContract$InputData.getF94400c(), (int) domainState.f246706b, null), 0, null, null, j2Var, null, null, false, 0, 0, 32696));
        yp0.b.k(listK2, 0, 0, 0, 0, 31);
        return new cii.b(eVar, listK2, aVar);
    }
}
