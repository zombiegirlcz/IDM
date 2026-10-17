package ile;

import android.os.Parcelable;
import aw0.e;
import aw0.m6;
import aw0.n6;
import cm2.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.backgroundpicker.models.RetailBackgroundKey;
import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistPayload;
import com.revolut.feature.tab.invest.impl.R$string;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.navigable.vc.ViewController;
import grl.k9;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends a {
    @Override // ile.a
    public final ViewController Z2(SlotChecklistPayload checklistPayload) {
        Intrinsics.checkNotNullParameter(checklistPayload, "checklistPayload");
        k9 k9Var = k9.Wealth;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return o2(new jkd.a(checklistPayload, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var)));
    }

    @Override // ile.a
    public final ActionsBottomSheetController b3(hel.b tradingContext) throws Throwable {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        Intrinsics.checkNotNullParameter(tradingContext, "tradingContext");
        switch (b.f162231a[tradingContext.ordinal()]) {
            case 1:
                textLocalisedClause = new TextLocalisedClause(R$string.wealth_invest_home_header_total_portfolio_value_description_us, null, null, 14);
                textLocalisedClause2 = textLocalisedClause;
                lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.wealth_invest_home_header_total_portfolio_value_title, null, null, 14), textLocalisedClause2, null, null, false, 28);
                e eVar = new e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.wealth_invest_common_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55);
                k9 k9Var = k9.Wealth;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                return new ActionsBottomSheetController(new dii.a(aVar, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
            case 2:
                textLocalisedClause = new TextLocalisedClause(R$string.wealth_invest_home_header_total_portfolio_value_combined_description_gb, null, null, 14);
                textLocalisedClause2 = textLocalisedClause;
                lw0.a aVar2 = new lw0.a(new TextLocalisedClause(R$string.wealth_invest_home_header_total_portfolio_value_title, null, null, 14), textLocalisedClause2, null, null, false, 28);
                e eVar2 = new e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.wealth_invest_common_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55);
                k9 k9Var2 = k9.Wealth;
                Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                return new ActionsBottomSheetController(new dii.a(aVar2, eVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null, null, 24));
            case 3:
                textLocalisedClause = new TextLocalisedClause(R$string.wealth_invest_home_header_total_portfolio_value_description_eea, null, null, 14);
                textLocalisedClause2 = textLocalisedClause;
                lw0.a aVar22 = new lw0.a(new TextLocalisedClause(R$string.wealth_invest_home_header_total_portfolio_value_title, null, null, 14), textLocalisedClause2, null, null, false, 28);
                e eVar22 = new e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.wealth_invest_common_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55);
                k9 k9Var22 = k9.Wealth;
                Parcelable.Creator<AnalyticsProduct.Retail> creator22 = AnalyticsProduct.Retail.CREATOR;
                return new ActionsBottomSheetController(new dii.a(aVar22, eVar22, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var22, "value", k9Var22), null, null, 24));
            case 4:
            case 5:
            case 6:
            case 7:
                hx7.e.n(new IllegalStateException("Portfolio value info modal is not supposed to be displayed for the " + tradingContext + " TradingContext"));
                textLocalisedClause2 = null;
                lw0.a aVar222 = new lw0.a(new TextLocalisedClause(R$string.wealth_invest_home_header_total_portfolio_value_title, null, null, 14), textLocalisedClause2, null, null, false, 28);
                e eVar222 = new e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.wealth_invest_common_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55);
                k9 k9Var222 = k9.Wealth;
                Parcelable.Creator<AnalyticsProduct.Retail> creator222 = AnalyticsProduct.Retail.CREATOR;
                return new ActionsBottomSheetController(new dii.a(aVar222, eVar222, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var222, "value", k9Var222), null, null, 24));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // ile.a
    public final ViewController c3() {
        return o2(h9b.a.f150222a);
    }

    @Override // ile.a
    public final ViewController d3() {
        RetailBackgroundKey.InvestHome investHome = RetailBackgroundKey.InvestHome.f63830b;
        em2.b.Companion.getClass();
        return o2(new h(investHome, em2.a.a(), null));
    }
}
