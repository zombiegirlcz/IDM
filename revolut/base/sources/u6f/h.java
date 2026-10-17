package u6f;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.robo.api.model.RiskMetrics;
import com.revolut.feature.trading.managed_portfolios.impl.R$string;
import d9.e1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.r5;
import mx0.v5;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements n {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Custom f277591a = new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254);

    public static final class a {
        private a() {
        }
    }

    public static List a(int i, Clause clause, TextLocalisedClause textLocalisedClause, String str) {
        List listK = v.k(new RowDelegate.Model(p.a.p("ManagedPortfolioFeesInfoControllerStateMapper_", str, "_title"), null, textLocalisedClause, null, 0, null, null, null, 0, new RowDelegate.Model.c.b(clause, null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, R$attr.uikit_dp0, 0, 0, 503313402), new PlainTextDelegate.Model(p.a.p("ManagedPortfolioFeesInfoControllerStateMapper_", str, "_description"), (Clause) null, (Clause) new TextLocalisedClause(i, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, R$attr.uikit_dp8, 0, 0, 0, 61422));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return listK;
    }

    @Override // cli.n
    public final o c(j jVar) {
        List listA;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.managed_portfolios_details_fees_info_title, null, null, 14);
        int i = R$string.managed_portfolios_template_list_about_widget_fees_management;
        Custom custom = f277591a;
        List listA2 = a(R$string.wealth_robo_template_details_about_widget_management_fee_description, new PercentageClause(e1.Z(domainState.f277587a), (PercentageClause.Format) null, custom, 2), new TextLocalisedClause(i, null, custom, 10), "management");
        RiskMetrics.ReturnBreakDown.OngoingCharges ongoingCharges = domainState.f277588b;
        if (ongoingCharges != null) {
            listA = a(R$string.wealth_robo_template_details_about_widget_product_fee_description, new TextLocalisedClause(R$string.wealth_robo_template_details_about_widget_product_fee_value, v.k(new PercentageClause(e1.Z(ongoingCharges.f85047a), (PercentageClause.Format) null, (Style) null, 6), new PercentageClause(e1.Z(ongoingCharges.f85048b), (PercentageClause.Format) null, (Style) null, 6)), custom, 8), new TextLocalisedClause(R$string.wealth_robo_template_details_about_widget_product_fee_title, null, custom, 10), "product");
        } else {
            listA = null;
        }
        List[] elements = {listA2, listA};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new f(textLocalisedClause, d0.F0(new PlainTextDelegate.Model("EX_ANTE_COSTS_INFORMATION_CLICK_ID", (Clause) null, (Clause) new TextLocalisedClause(R$string.wealth_robo_template_details_fees_info_ex_ante_costs_information, null, new Click(30, (Integer) null, (Object) null, "EX_ANTE_COSTS_INFORMATION_CLICK_ID", false), 10), (v5) r5.e, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, R$attr.uikit_dp8, 0, 0, 0, 61390), w.u(kotlin.collections.d.L(elements))));
    }
}
