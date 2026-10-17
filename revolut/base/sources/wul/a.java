package wul;

import android.os.Parcelable;
import aw0.ka;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.trading_orders.api.ui.widgets.free_trades_incentive.FreeTradesIncentiveContract$FreeTradesLimit;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.trading.orders.R$string;
import grl.k9;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yik.h f300224a;

    public a(yik.h pricingPlanStringMapper) {
        Intrinsics.checkNotNullParameter(pricingPlanStringMapper, "pricingPlanStringMapper");
        this.f300224a = pricingPlanStringMapper;
    }

    public final ActionsBottomSheetController a(FreeTradesIncentiveContract$FreeTradesLimit info) {
        Intrinsics.checkNotNullParameter(info, "info");
        hha.d dVar = info.f91766a;
        int i = info.f91767b;
        Clause clauseA = fgk.b.a(this.f300224a, dVar);
        TimeClause timeClause = new TimeClause(pu7.a.I(info.d), new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12);
        hha.d dVar2 = info.f91766a;
        Intrinsics.checkNotNullParameter(dVar2, "<this>");
        TextLocalisedClause textLocalisedClause = dVar2.f152291h.isEmpty() ? new TextLocalisedClause(R$string.trading_orders_commission_free_trades_bottom_sheet_free_plan_description, v.k(clauseA, Integer.valueOf(i), timeClause), null, 12) : new TextLocalisedClause(R$string.trading_orders_commission_free_trades_bottom_sheet_description, v.k(clauseA, Integer.valueOf(i), timeClause, Integer.valueOf(info.f91768c)), null, 12);
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.trading_orders_commission_free_trades_bottom_sheet_title, null, null, 14), null, null, null, false, 30);
        aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), null, null, 55);
        k9 value = k9.Trading;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        return new ActionsBottomSheetController(new dii.a(aVar, eVar, new AnalyticsProduct.Retail(value), (AnalyticsContext) null, textLocalisedClause));
    }
}
