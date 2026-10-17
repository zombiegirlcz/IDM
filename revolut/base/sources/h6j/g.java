package h6j;

import aw0.n6;
import aw0.o9;
import aw0.t0;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.commodity.asset_details.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements n {
    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.wealth_trading_commodity_investment_bottom_sheet_avg_price_title, null, null, 14), new TextLocalisedClause(R$string.wealth_trading_commodity_investment_bottom_sheet_avg_price_subtitle, null, null, 14), null, null, false, 28);
        Object[] elements = {new CellDetailsDelegate.Model("EXAMPLE_CALCULATION_TITLE_LIST_ID", new t0((Clause) new TextLocalisedClause(R$string.wealth_trading_commodity_investment_bottom_sheet_avg_price_example_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), (Image) null, 0, false, 30), new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, e.f149751a, null, null, 0, new ResourceImage(domainState.f149750a ? R$drawable.uikit_icn_24_chevron_up : R$drawable.uikit_icn_24_chevron_down, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, true, null, null, 27576), domainState.f149750a ? new PlainTextDelegate.Model("EXAMPLE_CALCULATION_CONTENT_LIST_ID", (Clause) null, (Clause) new TextLocalisedClause(R$string.wealth_trading_commodity_investment_bottom_sheet_avg_price_example_description, null, new Custom(Integer.valueOf(R$attr.uikit_colorGrey50), false, null, false, null, 254), 10), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return new cii.b(new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), listL, aVar);
    }
}
