package com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.smart_estimation.bottom_sheet;

import aw0.c7;
import aw0.h;
import aw0.ka;
import aw0.n6;
import btd.f;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.PeriodClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.spending_analytics.api.R$plurals;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.smart_estimation.bottom_sheet.SmartEstimationBottomSheetContract$Variant;
import egk.e;
import hha.w0;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rrd.g;
import rrd.i;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements n {

    @NotNull
    private static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btd.a f88042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f88043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l80.e f88044c;

    public c(btd.a inputData, g disclaimerProvider, e pricingPlansUiInteractor, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(disclaimerProvider, "disclaimerProvider");
        Intrinsics.checkNotNullParameter(pricingPlansUiInteractor, "pricingPlansUiInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f88042a = inputData;
        this.f88043b = pricingPlansUiInteractor;
        this.f88044c = dateProvider;
    }

    public static RowDelegate.Model a(int i, int i2, Clause clause) {
        boolean z = false;
        return new RowDelegate.Model("smart_estimation_assets_left", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_coins, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), z, z, 6), new TextLocalisedClause(R$string.analytics_total_wealth_custom_assets_smart_estimation_info_sheet_benefits2_title, v.k(Integer.valueOf(i), Integer.valueOf(i2)), null, 12), null, 0, clause, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
    }

    public static lw0.a d(int i, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2) {
        return new lw0.a(textLocalisedClause, textLocalisedClause2, new lw0.c(new GlyphImage(i, null, null, 6)), null, false, 24);
    }

    public static aw0.e e(TextLocalisedClause textLocalisedClause) {
        return new aw0.e(false, null, null, new n6(textLocalisedClause, LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
    }

    public static RowDelegate.Model f() {
        boolean z = false;
        return new RowDelegate.Model("smart_estimation_track_value", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_line_chart, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), z, z, 6), new TextLocalisedClause(R$string.analytics_total_wealth_custom_assets_smart_estimation_info_sheet_benefits1_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.analytics_total_wealth_custom_assets_smart_estimation_info_sheet_benefits1_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
    }

    public final TextLocalisedClause b() {
        return new TextLocalisedClause(this.f88042a.f18559b ? R$string.analytics_total_wealth_custom_assets_smart_estimation_sheet_button_package_account : R$string.analytics_total_wealth_custom_assets_smart_estimation_sheet_button, null, null, 14);
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        SmartEstimationBottomSheetContract$Variant smartEstimationBottomSheetContract$Variant = this.f88042a.f18558a;
        boolean z = false;
        if (smartEstimationBottomSheetContract$Variant instanceof SmartEstimationBottomSheetContract$Variant.FreeInfo) {
            List listK = v.k(f(), new RowDelegate.Model("smart_estimation_assets_left", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_coins, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), z, z, 6), new TextLocalisedQuantityClause(R$plurals.analytics_total_wealth_custom_assets_smart_estimation_upgrade_sheet_benefits2_title, Integer.valueOf(((SmartEstimationBottomSheetContract$Variant.FreeInfo) smartEstimationBottomSheetContract$Variant).f88032a), (List) null, (Style) null, 28), null, 0, new TextLocalisedClause(R$string.analytics_total_wealth_custom_assets_smart_estimation_upgrade_sheet_benefits2_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
            yp0.b.k(listK, 0, 0, 0, 0, 31);
            return new cii.b(e(b()), d0.F0(g.a(i.VALUES_NOT_VERIFIED), listK), d(R$drawable.uikit_icn_24_premium, new TextLocalisedClause(R$string.analytics_total_wealth_custom_assets_smart_estimation_upgrade_sheet_title, null, null, 14), null));
        }
        boolean z3 = smartEstimationBottomSheetContract$Variant instanceof SmartEstimationBottomSheetContract$Variant.OutOfAssets;
        e eVar = this.f88043b;
        if (z3) {
            SmartEstimationBottomSheetContract$Variant.OutOfAssets outOfAssets = (SmartEstimationBottomSheetContract$Variant.OutOfAssets) smartEstimationBottomSheetContract$Variant;
            boolean z4 = outOfAssets.f88035c;
            TextLocalisedClause textLocalisedClause = z4 ? new TextLocalisedClause(R$string.analytics_total_wealth_custom_assets_smart_estimation_out_of_assets_sheet_subtitle_upgrade, null, null, 14) : new TextLocalisedClause(R$string.analytics_total_wealth_custom_assets_smart_estimation_out_of_assets_sheet_subtitle_disable, null, null, 14);
            List listC = u.c(a(0, outOfAssets.f88034b, e.b(eVar, outOfAssets.f88033a)));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            return new cii.b(e(z4 ? b() : new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14)), d0.F0(g.a(i.VALUES_NOT_VERIFIED), listC), d(R$drawable.uikit_icn_24_exclamation_triangle, new TextLocalisedClause(R$string.analytics_total_wealth_custom_assets_smart_estimation_out_of_assets_sheet_title, null, null, 14), textLocalisedClause));
        }
        if (smartEstimationBottomSheetContract$Variant instanceof SmartEstimationBottomSheetContract$Variant.Remaining) {
            SmartEstimationBottomSheetContract$Variant.Remaining remaining = (SmartEstimationBottomSheetContract$Variant.Remaining) smartEstimationBottomSheetContract$Variant;
            boolean z6 = remaining.d;
            w0 w0Var = remaining.f88036a;
            List listK2 = v.k(f(), a(remaining.f88037b, remaining.f88038c, z6 ? v1.c.f(v.k(e.b(eVar, w0Var), new TextLocalisedClause(R$string.analytics_total_wealth_custom_assets_smart_estimation_info_sheet_benefits2_subtitle_upgrade, null, null, 14)), null) : e.b(eVar, w0Var)));
            yp0.b.k(listK2, 0, 0, 0, 0, 31);
            return new cii.b(e(z6 ? b() : new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14)), d0.F0(g.a(i.VALUES_NOT_VERIFIED), listK2), d(R$drawable.uikit_icn_24_market_order, new TextLocalisedClause(R$string.analytics_total_wealth_custom_assets_smart_estimation_info_sheet_title, null, null, 14), null));
        }
        if (!(smartEstimationBottomSheetContract$Variant instanceof SmartEstimationBottomSheetContract$Variant.Deferred)) {
            throw new NoWhenBranchMatchedException();
        }
        SmartEstimationBottomSheetContract$Variant.Deferred deferred = (SmartEstimationBottomSheetContract$Variant.Deferred) smartEstimationBottomSheetContract$Variant;
        LocalDate localDate = deferred.d.toLocalDate();
        long jBetween = ChronoUnit.DAYS.between(((l80.f) this.f88044c).e(), localDate);
        if (jBetween < 0) {
            jBetween = 0;
        }
        List listC2 = u.c(a(0, deferred.f88030b, e.b(eVar, deferred.f88029a)));
        yp0.b.k(listC2, 0, 0, 0, 0, 31);
        int i = (int) jBetween;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.analytics_total_wealth_custom_assets_smart_estimation_deferred_sheet_title, u.c(new PeriodClause(new PeriodClause.PeriodComponents(0, 0, i < 1 ? 1 : i, 0, 0, 0, 59), null)), null, 12);
        int i2 = R$string.analytics_total_wealth_custom_assets_smart_estimation_deferred_sheet_subtitle;
        com.revolut.core.ui_kit.models.j jVar2 = c7.Companion;
        Intrinsics.h(localDate);
        LocalDateClause$DateFormat.DayAndMonth dayAndMonth = new LocalDateClause$DateFormat.DayAndMonth(ka.SHORT);
        jVar2.getClass();
        return new cii.b(deferred.f88031c ? new h(false, new n6(b(), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.o, null, null, false, null, null, 1020), null, null, null, 121) : e(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14)), listC2, d(R$drawable.uikit_icn_24_info_outline, textLocalisedClause2, new TextLocalisedClause(i2, u.c(com.revolut.core.ui_kit.models.j.a(localDate, dayAndMonth, null)), null, 12)));
    }
}
