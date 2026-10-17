package v7f;

import android.os.Parcelable;
import aw0.p9;
import ch.qos.logback.core.net.SyslogConstants;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.robo.api.model.RiskMetrics;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.main.model.PortfolioInsightParcel;
import com.revolut.retail.wealth.resources.R$string;
import java.math.BigDecimal;
import java.math.MathContext;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import org.jetbrains.annotations.NotNull;
import qv0.i;
import t7f.h;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements n {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pdh.c[] f286631a;

    public static final class a {
        private a() {
        }
    }

    static {
        pdh.c[] elements = {pdh.c.ONE_YEAR, pdh.c.THREE_YEARS, pdh.c.FIVE_YEARS};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f286631a = (pdh.c[]) kotlin.collections.d.L(elements).toArray(new pdh.c[0]);
    }

    public static BigDecimal a(int i, BigDecimal bigDecimal) {
        BigDecimal bigDecimal2 = BigDecimal.ONE;
        if (bigDecimal.compareTo(bigDecimal2) <= 0) {
            MathContext DECIMAL128 = MathContext.DECIMAL128;
            Intrinsics.checkNotNullExpressionValue(DECIMAL128, "DECIMAL128");
            return new BigDecimal(0, DECIMAL128);
        }
        BigDecimal bigDecimalSubtract = bigDecimal.subtract(bigDecimal2);
        MathContext DECIMAL1282 = MathContext.DECIMAL128;
        Intrinsics.checkNotNullExpressionValue(DECIMAL1282, "DECIMAL128");
        BigDecimal bigDecimalDivide = new BigDecimal(i, DECIMAL1282).divide(bigDecimalSubtract, DECIMAL1282);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        return bigDecimalDivide;
    }

    public static hw0.a b(BigDecimal bigDecimal) {
        return new hw0.a(bigDecimal.floatValue(), new PercentageClause(bigDecimal, new PercentageClause.Format.Custom(2, 10, p9.ALWAYS, null, null), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254)));
    }

    @Override // cli.n
    public final o c(j jVar) throws Throwable {
        Integer num;
        TextLocalisedClause textLocalisedClause;
        Integer numValueOf;
        v7f.a domainState = (v7f.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        sdh.b bVar = (sdh.b) domainState.f286624a.getContent();
        if (bVar != null) {
            Instant instant = bVar.d;
            Instant instant2 = bVar.e;
            if (instant == null || instant2 == null) {
                numValueOf = null;
            } else {
                ChronoUnit chronoUnit = ChronoUnit.MONTHS;
                ZoneOffset zoneOffset = ZoneOffset.UTC;
                int iBetween = (int) chronoUnit.between(instant.atZone(zoneOffset), instant2.atZone(zoneOffset));
                if (iBetween < 1) {
                    iBetween = 1;
                }
                numValueOf = Integer.valueOf(iBetween);
            }
            num = numValueOf;
        } else {
            num = null;
        }
        List list = (List) iii.c.f(domainState.f286624a, new h(this, domainState), new v78.d(1), new tvh.e(this, 24, num, domainState));
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_robo_insights_max_drawdown_title, null, null, 14);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        ListSubheaderDelegate.Model.a.b bVar2 = new ListSubheaderDelegate.Model.a.b(true, false, false, 6);
        RiskMetrics riskMetrics = (RiskMetrics) domainState.f286625b.getContent();
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("DrawdownChart_list_subheader", (Image) null, (Clause) textLocalisedClause2, (Image) resourceImage, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) bVar2, false, false, (Object) (riskMetrics != null ? new PortfolioInsightParcel.MaxDrawdown(riskMetrics.f, riskMetrics.f85033g, riskMetrics.f85034h, riskMetrics.f85035j, num) : null), (Parcelable) null, 0, 0, 0, 0, 64434);
        s0 s0Var = new s0(2);
        s0Var.b(list.toArray(new i[0]));
        String strName = domainState.d.name();
        ArrayList arrayList = new ArrayList();
        for (pdh.c cVar : f286631a) {
            int i = g.f286632a[cVar.ordinal()];
            if (i == 1) {
                textLocalisedClause = new TextLocalisedClause(R$string.wealth_robo_insights_max_drawdown_chart_one_year_timespan, null, null, 14);
            } else if (i == 2) {
                textLocalisedClause = new TextLocalisedClause(R$string.wealth_robo_insights_max_drawdown_chart_three_years_timespan, null, null, 14);
            } else if (i != 3) {
                hx7.e.n(new IllegalStateException("Unsupported timespan " + cVar + " in drawdown chart"));
                textLocalisedClause = null;
            } else {
                textLocalisedClause = new TextLocalisedClause(R$string.wealth_robo_insights_max_drawdown_chart_five_years_timespan, null, null, 14);
            }
            FixedTabs.Item item = textLocalisedClause != null ? new FixedTabs.Item(cVar.name(), textLocalisedClause, (AnalyticsContext) null, 12) : null;
            if (item != null) {
                arrayList.add(item);
            }
        }
        s0Var.a(new FixedTabsDelegate.Model("DrawdownChart_tabs", arrayList, strName, false, null, SyslogConstants.LOG_CLOCK));
        ArrayList arrayList2 = s0Var.f186433a;
        List listK = v.k(arrayList2.toArray(new i[arrayList2.size()]));
        int i2 = R$attr.uikit_dp0;
        int i3 = R$attr.uikit_dp16;
        yp0.b.k(listK, i2, 0, i3, i3, 18);
        return new b(ue0.e.J(model, listK));
    }
}
