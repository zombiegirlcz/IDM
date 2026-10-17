package m1e;

import android.os.Parcelable;
import aw0.o9;
import cli.o;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.ExpandableCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.stock_lending.impl.R$string;
import ip0.ak0;
import ip0.xk;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements cli.n {
    public static aim.e a(f fVar) {
        aim.e eVarB = u.b();
        eVarB.addAll(yp0.b.g(v.k(new RowDelegate.Model("daily_interest_row", new RowDelegate.Model.MainImage.Image40(new ResourceImage(R$drawable.uikit_icn_10_stocks_tax, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, new ImageTransformations(null, null, null, null, null, 24, 24, 31), (Clause) null, 182), null, null, false, null, false, 62), new TextLocalisedClause(R$string.wealth_stock_lending_rsuab_daily_interest_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.wealth_stock_lending_rsuab_daily_interest_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), new RowDelegate.Model("no_restriction_row", new RowDelegate.Model.MainImage.Image40(new ResourceImage(R$drawable.uikit_icn_24_candlestick_chart, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, false, null, false, 62), new TextLocalisedClause(R$string.wealth_stock_lending_rsuab_no_restriction_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.wealth_stock_lending_rsuab_no_restriction_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), new RowDelegate.Model("fully_automatic_row", new RowDelegate.Model.MainImage.Image40(new ResourceImage(R$drawable.uikit_icn_24_refinancing, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, false, null, false, 62), new TextLocalisedClause(R$string.wealth_stock_lending_rsuab_fully_automatic_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.wealth_stock_lending_rsuab_fully_automatic_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872)), new ListSubheaderDelegate.Model("how_it_works_header", (Image) null, (Clause) new TextLocalisedClause(R$string.wealth_stock_lending_rsuab_how_it_works, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
        eVarB.add(new ListSubheaderDelegate.Model("example_header", (Image) null, (Clause) new TextLocalisedClause(R$string.wealth_stock_lending_rsuab_example_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp0, 0, 0, 57338));
        CounterTextDelegate.Model.Companion companion = CounterTextDelegate.Model.INSTANCE;
        List listK = v.k(CounterTextDelegate.Model.Companion.c(companion, "example_apy", new TextLocalisedClause(R$string.wealth_stock_lending_rsuab_example_avarage_apy_title, null, null, 14), n.f201488a, null, false, 2040), CounterTextDelegate.Model.Companion.c(companion, "example_earning", new TextLocalisedClause(R$string.wealth_stock_lending_rsuab_example_annual_earning_title, null, null, 14), n.f201489b, null, false, 2040));
        eVarB.add(new xk("example_grid", listK, Integer.valueOf(Math.min(listK.size(), 2)), Float.valueOf(8.0f), null, 48));
        eVarB.add(new TextDelegate.Model("example_disclaimer", new TextLocalisedClause(R$string.wealth_stock_lending_rsuab_example_disclaimer, u.c(n.f201490c), null, 12), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036));
        ExpandableCellDelegate.Model model = new ExpandableCellDelegate.Model("faq_dividends", new TextLocalisedClause(R$string.wealth_stock_lending_rsuab_faq_dividends_question, null, null, 14), new TextLocalisedClause(R$string.wealth_stock_lending_rsuab_faq_dividends_answer, null, null, 14), null, fVar.f201480b.contains("faq_dividends"), null, null, 104);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_stock_lending_rsuab_faq_voting_question, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_stock_lending_rsuab_faq_voting_answer, null, null, 14);
        Set set = fVar.f201480b;
        eVarB.addAll(yp0.b.g(v.k(model, new ExpandableCellDelegate.Model("faq_voting", textLocalisedClause, textLocalisedClause2, null, set.contains("faq_voting"), null, null, 104), new ExpandableCellDelegate.Model("faq_risk", new TextLocalisedClause(R$string.wealth_stock_lending_rsuab_faq_risk_question, null, null, 14), new TextLocalisedClause(R$string.wealth_stock_lending_rsuab_faq_risk_answer, null, null, 14), null, set.contains("faq_risk"), null, null, 104), new ExpandableCellDelegate.Model("faq_protection", new TextLocalisedClause(R$string.wealth_stock_lending_rsuab_faq_protection_question, null, null, 14), new TextLocalisedClause(R$string.wealth_stock_lending_rsuab_faq_protection_answer, null, null, 14), null, set.contains("faq_protection"), null, null, 104), new ExpandableCellDelegate.Model("faq_interest", new TextLocalisedClause(R$string.wealth_stock_lending_rsuab_faq_interest_question, null, null, 14), new TextLocalisedClause(R$string.wealth_stock_lending_rsuab_faq_interest_answer, null, null, 14), null, set.contains("faq_interest"), null, null, 104)), new ListSubheaderDelegate.Model("faq_header", (Image) null, (Clause) new TextLocalisedClause(R$string.wealth_stock_lending_rsuab_faq_title, null, null, 14), (Image) null, (Clause) new TextLocalisedClause(R$string.wealth_stock_lending_rsuab_faq_see_all, null, null, 14), (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(false, false, true, 3), false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65450), null, 0, 0, 126));
        eVarB.addAll(yp0.b.i(new RowDelegate.Model("disclosures_info", new RowDelegate.Model.MainImage.Image40(new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, false, null, false, 62), new TextLocalisedClause(R$string.wealth_stock_lending_rsuab_disclosures_info_title, null, null, 14), null, 0, new CompositeClause(v.k(new TextLocalisedClause(R$string.wealth_stock_lending_rsuab_disclosures_info_risk_disclosures, null, null, 14), new TextLocalisedClause(R$string.wealth_stock_lending_rsuab_disclosures_info_master_share, null, null, 14)), new TextClause(",", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), new ListSubheaderDelegate.Model("disclosures_header", (Image) null, (Clause) new TextLocalisedClause(R$string.wealth_stock_lending_rsuab_disclosures_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
        return u.a(eVarB);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        int i;
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f201479a, new m11.h(2, domainState, this), new lxi.g(11), new lk7.n(13, domainState, this));
        Boolean bool = (Boolean) domainState.f201479a.getContent();
        if (bool == null) {
            i = R$string.wealth_stock_lending_rsuab_cta_close;
        } else if (bool.equals(Boolean.TRUE)) {
            i = R$string.wealth_stock_lending_rsuab_cta_disable;
        } else {
            if (!bool.equals(Boolean.FALSE)) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.wealth_stock_lending_rsuab_cta_enable;
        }
        return new h(new TextLocalisedClause(i, null, null, 14), list);
    }
}
