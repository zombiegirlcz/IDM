package bah;

import aw0.o9;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.wealth.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.wealth.models.config.Links;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import z0h.f1;
import z0h.j1;
import z0h.m1;
import z0h.n1;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements pzg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qy5.a f14073a;

    public b(qy5.a commonDisclaimerProvider) {
        Intrinsics.checkNotNullParameter(commonDisclaimerProvider, "commonDisclaimerProvider");
        this.f14073a = commonDisclaimerProvider;
    }

    public static CompositeClause c(Links links) {
        List listK = v.k(new TextLocalisedClause(R$string.wealth_disclosure_collection_eea_past_performance, null, null, 14), new TextLocalisedClause(R$string.wealth_disclosure_collection_eea_services_provided_by_revolut, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_eea_car_text, v.k(new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_eea_car_link, null, new Click(28, (Integer) null, (Object) new n1(links.d), "SECURITIES_CAR", false), 10), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclosure_securities_eea_stock_trading_disclosures_link, null, new Click(28, (Integer) null, (Object) m1.f318535a, "SECURITIES_DISCLOSURES", false), 10)), null, 12));
        t0 t0Var = t0.f186434a;
        return yoj.b.m(new TextClause(a0.d.r(m70.a.o(t0Var), m70.a.o(t0Var)), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), listK);
    }

    public static CompositeClause d(Links links) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_sng_services_are_provided_by_revolut, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclosure_securities_past_performance, null, null, 14);
        HtmlLocalisedClause htmlLocalisedClause = new HtmlLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_disclosures_footer_view_terms_business, u.c(links.f105092g), (Integer) null, new n1(links.f105092g), 12);
        int i = com.revolut.retail.wealth.resources.R$string.trading_disclosures_footer_and_trading_disclosures;
        m70.a.c(t0.f186434a);
        return new CompositeClause(v.k(textLocalisedClause, textLocalisedClause2, yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(htmlLocalisedClause, new HtmlLocalisedClause(i, u.c(""), (Integer) null, m1.f318535a, 12)))), e(), null, null, 12);
    }

    public static TextClause e() {
        return new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public static CompositeClause f() {
        return yoj.b.m(new TextClause(m70.a.o(t0.f186434a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextLocalisedClause(R$string.wealth_disclosure_collection_us_past_performance, null, null, 14), new TextLocalisedClause(R.string.common_action_learn_more, null, new Click(28, (Integer) null, (Object) new j1(f7d.i.CATEGORY_WEALTH.a()), "LEARN_MORE", false), 10)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0012  */
    @Override // pzg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.models.Clause a(z0h.f1 r28) {
        /*
            Method dump skipped, instruction units count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bah.b.a(z0h.f1):com.revolut.core.ui_kit.models.Clause");
    }

    @Override // pzg.a
    public final boolean b(f1 disclaimer) {
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        return disclaimer instanceof z0h.j;
    }
}
