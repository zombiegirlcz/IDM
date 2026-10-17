package com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.adjust_asset_value;

import aim.e;
import aw0.c7;
import aw0.n6;
import bw0.h;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.adjust_asset_value.AdjustAssetValueContract$InputData;
import dj0.d;
import ip0.ak0;
import ip0.yj0;
import java.time.LocalDate;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ox0.b0;
import yhm.r;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdjustAssetValueContract$InputData f87943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w80.b f87944b;

    public c(AdjustAssetValueContract$InputData inputData, w80.b amountFormatter) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        this.f87943a = inputData;
        this.f87944b = amountFormatter;
    }

    @Override // cli.n
    public final o c(j jVar) {
        TextLocalisedClause textLocalisedClause;
        r rVar;
        prd.a domainState = (prd.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        AdjustAssetValueContract$InputData adjustAssetValueContract$InputData = this.f87943a;
        boolean z = adjustAssetValueContract$InputData instanceof AdjustAssetValueContract$InputData.CurrentValue;
        if (z) {
            textLocalisedClause = new TextLocalisedClause(R$string.analytics_total_wealth_custom_assets_label_value_as_of, u.c(new TextLocalisedClause(R$string.analytics_dashboard_period_today, null, null, 14)), null, 12);
        } else {
            if (!(adjustAssetValueContract$InputData instanceof AdjustAssetValueContract$InputData.HistoricalValue)) {
                throw new NoWhenBranchMatchedException();
            }
            int i = R$string.analytics_total_wealth_custom_assets_smart_estimation_edit_value_subtitle;
            com.revolut.core.ui_kit.models.j jVar2 = c7.Companion;
            LocalDate localDate = ((AdjustAssetValueContract$InputData.HistoricalValue) adjustAssetValueContract$InputData).f87942b.f99233a;
            LocalDateClause$DateFormat.INSTANCE.getClass();
            textLocalisedClause = new TextLocalisedClause(i, u.c(com.revolut.core.ui_kit.models.j.b(jVar2, localDate, LocalDateClause$DateFormat.Companion.f57815b)), null, 12);
        }
        TextLocalisedClause textLocalisedClause2 = textLocalisedClause;
        e eVarB = u.b();
        d dVar = domainState.f238977a;
        eVarB.add(new CenteredAmountDelegate.Model("amount_input", null, new h(this.f87944b.e(dVar), cp5.d.J(dVar.f115083b), true, null, Boolean.TRUE, false, false, false, false, null, 8084), null, null, null, null, false, false, dVar.f115083b, null, 1530));
        eVarB.add(new TextDelegate.Model("date_subtitle", textLocalisedClause2, false, new ak0(yj0.CENTER_HORIZONTAL, null, 2), null, null, R$attr.uikit_dp8, R$attr.uikit_dp16, 0, 0, 1652));
        e eVarA = u.a(eVarB);
        if (z) {
            rVar = new r(new TextLocalisedClause(R$string.analytics_total_wealth_custom_assets_title_adjust_current_value, null, null, 14), new TextLocalisedClause(com.revolut.uicomponent.R$string.common_action_confirm, null, null, 14), u.c(new TextNavBarMenuItem("remove_menu_item", new TextLocalisedClause(R$string.analytics_total_wealth_custom_assets_label_remove, null, null, 14), null, null, 12)));
        } else {
            if (!(adjustAssetValueContract$InputData instanceof AdjustAssetValueContract$InputData.HistoricalValue)) {
                throw new NoWhenBranchMatchedException();
            }
            rVar = new r(new TextLocalisedClause(R$string.analytics_total_wealth_custom_assets_title_adjust_value, null, null, 14), new TextLocalisedClause(R$string.analytics_total_wealth_custom_assets_label_update, null, null, 14), u.c(new TextNavBarMenuItem("remove_menu_item", new TextLocalisedClause(R$string.analytics_total_wealth_custom_assets_label_remove, null, null, 14), null, null, 12)));
        }
        TextLocalisedClause textLocalisedClause3 = (TextLocalisedClause) rVar.f314201a;
        TextLocalisedClause textLocalisedClause4 = (TextLocalisedClause) rVar.f314202b;
        List list = (List) rVar.f314203c;
        boolean z3 = dVar.f(d.e) && !Intrinsics.f(adjustAssetValueContract$InputData.getF87939b(), dVar);
        boolean z4 = z && ((AdjustAssetValueContract$InputData.CurrentValue) adjustAssetValueContract$InputData).f87940c;
        return new prd.c(eVarA, textLocalisedClause3, list, new aw0.e(false, z4 ? new TextLocalisedClause(R$string.analytics_total_wealth_custom_assets_smart_estimation_edit_current_value_disclaimer, null, null, 14) : null, b0.ABOVE_BUTTONS, new n6(textLocalisedClause4, LargeActionButton.ButtonStyle.f58725a, null, "confirm_button", z3, null, null, 972), null, null, 49));
    }
}
