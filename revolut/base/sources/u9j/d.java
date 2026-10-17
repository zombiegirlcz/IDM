package u9j;

import aw0.k7;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.TabsDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.RateClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit.views.q;
import com.revolut.core.ui_kit.views.t;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.crypto.asset_details_chart_mapping.api.R$string;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.lc;
import mx0.v5;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f278487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f278488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f278489c;
    public final Lazy d;

    public d(g dateFormatMapper, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateFormatMapper, "dateFormatMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f278487a = dateFormatMapper;
        this.f278488b = dateProvider;
        this.f278489c = R$attr.uikit_dp0;
        this.d = yhm.j.b(new tyl.a(this, 14));
    }

    public static RateClause b(float f, xi0.b bVar, xi0.b bVar2) {
        return new RateClause(new BigDecimal(String.valueOf(f)), bVar, new RateClause.Format.Default(bVar2, false), null);
    }

    public static int c(qta.f fVar) {
        switch (c.f278486a[fVar.ordinal()]) {
            case 1:
                return R$string.crypto_asset_details_chart_mapping_tab_1d;
            case 2:
                return R$string.crypto_asset_details_chart_mapping_tab_1w;
            case 3:
                return R$string.crypto_asset_details_chart_mapping_tab_1m;
            case 4:
                return R$string.crypto_asset_details_chart_mapping_tab_3m;
            case 5:
                return R$string.crypto_asset_details_chart_mapping_tab_6m;
            case 6:
                return R$string.crypto_asset_details_chart_mapping_tab_1y;
            case 7:
                return R$string.crypto_asset_details_chart_mapping_tab_5y;
            case 8:
                return R$string.crypto_asset_details_chart_mapping_tab_all;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static CompositeClause d(long j2, xi0.b bVar, float f, qta.f fVar) {
        int i;
        MoneyClause moneyClauseB = u5l.a.b(new dj0.d(j2, bVar), o9.NON_SENSITIVE, k7.ALWAYS, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 2);
        CompositeClause compositeClauseF = u5l.a.f(new BigDecimal(String.valueOf(f)));
        CompositeClause compositeClauseM = null;
        if (fVar != null) {
            TextClause textClause = new TextClause("·", (Style) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), false, (o9) null, (List) null, 122);
            Intrinsics.checkNotNullParameter(fVar, "<this>");
            switch (f.f278493a[fVar.ordinal()]) {
                case 1:
                    i = R$string.crypto_asset_details_chart_mapping_duration_title_1d;
                    break;
                case 2:
                    i = R$string.crypto_asset_details_chart_mapping_duration_title_1w;
                    break;
                case 3:
                    i = R$string.crypto_asset_details_chart_mapping_duration_title_1m;
                    break;
                case 4:
                    i = R$string.crypto_asset_details_chart_mapping_duration_title_3m;
                    break;
                case 5:
                    i = R$string.crypto_asset_details_chart_mapping_duration_title_6m;
                    break;
                case 6:
                    i = R$string.crypto_asset_details_chart_mapping_duration_title_1y;
                    break;
                case 7:
                    i = R$string.crypto_asset_details_chart_mapping_duration_title_5y;
                    break;
                case 8:
                    i = R$string.crypto_asset_details_chart_mapping_duration_title_all;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            compositeClauseM = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(textClause, new TextLocalisedClause(i, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10)));
        }
        Clause[] elements = {moneyClauseB, compositeClauseF, compositeClauseM};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), kotlin.collections.d.L(elements));
    }

    public static CompositeClause f(xi0.b bVar) {
        return yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new CurrencyClause(bVar, CurrencyClause.Format.Ticker.f57756a, null, 4), new TextClause("·", (Style) null, (Integer) null, false, (o9) null, (List) null, 122), new CurrencyClause(bVar, CurrencyClause.Format.DisplayName.f57755a, null, 4)));
    }

    public final qv0.i e(qta.f selectedChartPeriod, qta.f[] chartPeriods, Integer num, Integer num2, p9j.b chartTabStyle) {
        Intrinsics.checkNotNullParameter(selectedChartPeriod, "selectedChartPeriod");
        Intrinsics.checkNotNullParameter(chartPeriods, "chartPeriods");
        Intrinsics.checkNotNullParameter(chartTabStyle, "chartTabStyle");
        ResourceImage resourceImage = num != null ? new ResourceImage(num.intValue(), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, new TextLocalisedClause(R$string.crypto_asset_details_chart_mode_switch, null, null, 14), 126) : null;
        int iY = kotlin.collections.d.Y(chartPeriods, selectedChartPeriod);
        int i = R$attr.uikit_dp16;
        int i2 = 0;
        if (chartTabStyle != p9j.b.SCROLLABLE) {
            String strName = selectedChartPeriod.name();
            ArrayList arrayList = new ArrayList(chartPeriods.length);
            int length = chartPeriods.length;
            while (i2 < length) {
                qta.f fVar = chartPeriods[i2];
                arrayList.add(new FixedTabs.Item(fVar.name(), new TextLocalisedClause(c(fVar), null, null, 14), (AnalyticsContext) null, 12));
                i2++;
            }
            return new FixedTabsDelegate.Model("ASSET_DETAILS_CHART_TABS_LIST_ID", arrayList, strName, Integer.valueOf(iY), resourceImage != null ? new FixedTabsDelegate.ExtraButton.Icon(resourceImage) : null, 0, i, 0, 0, 416);
        }
        String strName2 = selectedChartPeriod.name();
        ArrayList arrayList2 = new ArrayList(chartPeriods.length);
        int length2 = chartPeriods.length;
        while (i2 < length2) {
            qta.f fVar2 = chartPeriods[i2];
            arrayList2.add(new q(fVar2.name(), new t(new TextLocalisedClause(c(fVar2), null, null, 14)), 58));
            i2++;
        }
        lc[] elements = {resourceImage != null ? new lc(null, resourceImage, "CHART_TAB_ACTION_TYPE_SWITCH_ID") : null, num2 != null ? new lc(null, new ResourceImage(num2.intValue(), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), "CHART_TAB_ACTION_ADVANCED_CHART_ID") : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new TabsDelegate.Model("ASSET_DETAILS_CHART_TABS_LIST_ID", arrayList2, strName2, Integer.valueOf(iY), null, kotlin.collections.d.L(elements), 0, i, null, 7888);
    }

    public final PlainTextDelegate.Model g(Clause clause, xi0.b pocketCurrency, xi0.b bVar) {
        Clause clause2;
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(pocketCurrency, "pocketCurrency");
        if (clause == null) {
            if (bVar != null) {
                int i = R$string.crypto_asset_details_chart_mapping_stablecoin_disclaimer;
                CurrencyClause.Format.Ticker ticker = CurrencyClause.Format.Ticker.f57756a;
                textLocalisedClause = new TextLocalisedClause(i, v.k(new CurrencyClause(pocketCurrency, ticker, null, 4), new CurrencyClause(bVar, ticker, null, 4)), null, 12);
            } else {
                textLocalisedClause = new TextLocalisedClause(R$string.crypto_asset_details_chart_mapping_disclaimer, null, null, 14);
            }
            clause2 = textLocalisedClause;
        } else {
            clause2 = clause;
        }
        pa paVar = pa.LIGHT;
        int i2 = R$attr.uikit_dp0;
        int i3 = R$attr.uikit_dp16;
        return new PlainTextDelegate.Model("ASSET_DETAILS_CHART_MARKET_DATA_DISCLAIMER_LIST_ID", (Clause) null, clause2, (v5) null, (UrlImage) null, false, paVar, (Object) null, (AnalyticsContext) null, i2, i3, i3, i3, 3566);
    }
}
