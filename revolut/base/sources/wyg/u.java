package wyg;

import aw0.o9;
import aw0.p9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.PerformanceChart;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.PerformanceChartPoint;
import d9.e1;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes9.dex */
public final class u implements cli.n {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qxg.g f301294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pxg.b f301295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uyg.e f301296c;
    public final pyg.i d;
    public final gte.a e;

    public u(qxg.g complexAnalyticsPerformanceContributionMapper, pxg.b complexAnalyticsPerformanceLineChartMapper, uyg.e timeframeMapper, uyg.c headerTimeframeMapper, pyg.i analyticsDisclaimersMapper, azg.b calculationMethodMapper, uyg.k categoryTabsMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(complexAnalyticsPerformanceContributionMapper, "complexAnalyticsPerformanceContributionMapper");
        Intrinsics.checkNotNullParameter(complexAnalyticsPerformanceLineChartMapper, "complexAnalyticsPerformanceLineChartMapper");
        Intrinsics.checkNotNullParameter(timeframeMapper, "timeframeMapper");
        Intrinsics.checkNotNullParameter(headerTimeframeMapper, "headerTimeframeMapper");
        Intrinsics.checkNotNullParameter(analyticsDisclaimersMapper, "analyticsDisclaimersMapper");
        Intrinsics.checkNotNullParameter(calculationMethodMapper, "calculationMethodMapper");
        Intrinsics.checkNotNullParameter(categoryTabsMapper, "categoryTabsMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f301294a = complexAnalyticsPerformanceContributionMapper;
        this.f301295b = complexAnalyticsPerformanceLineChartMapper;
        this.f301296c = timeframeMapper;
        this.d = analyticsDisclaimersMapper;
        this.e = featureToggleInteractor;
    }

    public static PercentageClause a(PerformanceChart performanceChart, int i) {
        Float f;
        BigDecimal bigDecimalZ;
        PerformanceChartPoint performanceChartPoint = (PerformanceChartPoint) d0.o0(performanceChart.f94993c);
        if (performanceChartPoint == null || (f = performanceChartPoint.d) == null || (bigDecimalZ = e1.Z(new BigDecimal(String.valueOf(f.floatValue())))) == null) {
            return null;
        }
        return new PercentageClause(bigDecimalZ, new PercentageClause.Format.Custom(2, 10, p9.ALWAYS, null, null), new Custom(Integer.valueOf(i), false, null, false, null, 254));
    }

    public final CompositeClause b(a aVar) {
        TextLocalisedClause textLocalisedClauseB = azg.b.b(aVar.f301275g);
        ImageClause imageClause = new ImageClause(R$drawable.uikit_icn_16_chevron_down, Integer.valueOf(R$attr.uikit_colorGreyTone50), (Float) null, (Float) null, 28);
        if (aVar.i.getError() != null) {
            imageClause = null;
        }
        Clause[] elements = {textLocalisedClauseB, imageClause};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), kotlin.collections.d.L(elements));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r36) {
        /*
            Method dump skipped, instruction units count: 683
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wyg.u.c(cli.j):cli.o");
    }
}
