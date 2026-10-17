package urd;

import aw0.c7;
import aw0.ka;
import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.retail.feature.api.custom_assets.models.CustomAsset;
import ip0.ga;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lnd.k0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class g0 implements cli.n {

    @NotNull
    public static final b0 Companion = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bsd.h f282284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f282285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rrd.q f282286c;
    public final gte.a d;

    public g0(bsd.h balanceChartMapper, bsd.e balanceChartAxisMapper, rrd.f performanceMapper, rrd.g disclaimerProvider, l80.e dateProvider, rrd.q smartEstimationToggleMapper, k0 timeSwitcherMapper, rrd.r chartPopupContentMapper, rrd.k performanceBackgroundMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(balanceChartMapper, "balanceChartMapper");
        Intrinsics.checkNotNullParameter(balanceChartAxisMapper, "balanceChartAxisMapper");
        Intrinsics.checkNotNullParameter(performanceMapper, "performanceMapper");
        Intrinsics.checkNotNullParameter(disclaimerProvider, "disclaimerProvider");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(smartEstimationToggleMapper, "smartEstimationToggleMapper");
        Intrinsics.checkNotNullParameter(timeSwitcherMapper, "timeSwitcherMapper");
        Intrinsics.checkNotNullParameter(chartPopupContentMapper, "chartPopupContentMapper");
        Intrinsics.checkNotNullParameter(performanceBackgroundMapper, "performanceBackgroundMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f282284a = balanceChartMapper;
        this.f282285b = dateProvider;
        this.f282286c = smartEstimationToggleMapper;
        this.d = featureToggleInteractor;
    }

    public static ga a(CustomAsset customAsset, boolean z) {
        ZonedDateTime zonedDateTime = customAsset.e;
        if (!z || !customAsset.k || customAsset.f99221j != vzi.i.SMART_ESTIMATION || zonedDateTime == null) {
            return new ga("chart_empty_state", new TextLocalisedClause(R$string.analytics_total_wealth_custom_assets_smart_estimation_chart_empty_title, null, null, 14), z ? new TextLocalisedClause(R$string.analytics_total_wealth_custom_assets_smart_estimation_chart_empty_subtitle, null, null, 14) : new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new ResourceImage(R$drawable.uikit_icn_24_line_chart, (Integer) null, (Integer) null, (Integer) null, (List) null, new ImageTransformations(null, null, null, gz0.b.CenterInside, null, 52, 52, 23), (Clause) null, 190), 0, 0, null, 112);
        }
        LocalDate localDate = zonedDateTime.toLocalDate();
        Intrinsics.checkNotNullExpressionValue(localDate, "toLocalDate(...)");
        return new ga("chart_empty_state", new TextLocalisedClause(R$string.analytics_total_wealth_custom_assets_smart_estimation_chart_empty_next_title, zhm.u.c(com.revolut.core.ui_kit.models.j.b(c7.Companion, localDate, new LocalDateClause$DateFormat.DayAndMonth(ka.SHORT))), null, 12), new TextLocalisedClause(R$string.analytics_total_wealth_custom_assets_smart_estimation_chart_empty_next_subtitle, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_line_chart, (Integer) null, (Integer) null, (Integer) null, (List) null, new ImageTransformations(null, null, null, gz0.b.CenterInside, null, 52, 52, 23), (Clause) null, 190), 0, 0, null, 112);
    }

    public static boolean d(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(Long.valueOf(((nzi.g) it8.next()).f221072b));
        }
        return zhm.d0.U(arrayList2).size() <= 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final urd.z b(com.revolut.retail.feature.api.custom_assets.models.CustomAsset r19, amd.a r20) {
        /*
            Method dump skipped, instruction units count: 843
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: urd.g0.b(com.revolut.retail.feature.api.custom_assets.models.CustomAsset, amd.a):urd.z");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x018c  */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14, types: [com.revolut.core.ui_kit.models.Style, java.lang.Integer, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r68) {
        /*
            Method dump skipped, instruction units count: 1573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: urd.g0.c(cli.j):cli.o");
    }
}
