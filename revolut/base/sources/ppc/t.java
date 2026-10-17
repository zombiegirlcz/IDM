package ppc;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.retail.wealth.resources.R$string;
import ip0.ak0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import z0h.j1;
import z0h.m1;
import z0h.n1;
import zhm.f0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class t implements jlc.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kbh.a f238336a;

    public t(nd.m roboDisclaimerClauseMapper, kbh.a usRoboFooterDisclaimerFactory) {
        Intrinsics.checkNotNullParameter(roboDisclaimerClauseMapper, "roboDisclaimerClauseMapper");
        Intrinsics.checkNotNullParameter(usRoboFooterDisclaimerFactory, "usRoboFooterDisclaimerFactory");
        this.f238336a = usRoboFooterDisclaimerFactory;
    }

    public final List a(Data data) {
        Parcelable textLocalisedClause;
        Object content = data != null ? data.getContent() : null;
        if (!(content instanceof s)) {
            if (content instanceof Data) {
                hx7.e.n(new IllegalArgumentException("RoboFooterDisclaimersWidgetMapper received Data<Data<T>> with error", ((Data) content).getError()));
            } else if (content != null) {
                hx7.e.n(new IllegalArgumentException(a0.d.l(content.getClass(), "RoboFooterDisclaimersWidgetMapper received unexpected type: ")));
            }
            return f0.f322471a;
        }
        s sVar = (s) content;
        if (!(sVar instanceof q)) {
            if (sVar instanceof r) {
                return this.f238336a.b(((r) sVar).f238335a);
            }
            throw new NoWhenBranchMatchedException();
        }
        List<p> list = ((q) sVar).f238334a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (p disclaimer : list) {
            Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
            boolean z = disclaimer instanceof h;
            m1 m1Var = m1.f318535a;
            if (z) {
                h disclaimer2 = (h) disclaimer;
                Intrinsics.checkNotNullParameter(disclaimer2, "disclaimer");
                if (disclaimer2 instanceof a) {
                    textLocalisedClause = new TextLocalisedClause(R$string.wealth_robo_disclaimer_eea_investment_services_provider, null, null, 14);
                } else if (disclaimer2 instanceof f) {
                    textLocalisedClause = new TextLocalisedClause(R$string.wealth_robo_disclaimer_eea_simulated_past_performance_source, null, null, 14);
                } else if (disclaimer2 instanceof g) {
                    g gVar = (g) disclaimer2;
                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_robo_disclaimer_eea_trading_disclosures_link, null, new Click(28, (Integer) null, (Object) m1Var, "robo-eea-disclaimer-trading-disclosures-link", false), 10);
                    TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.wealth_robo_disclaimer_eea_car_link, null, new Click(28, (Integer) null, (Object) new n1(gVar.f238326a), "robo-eea-disclaimer-car-link", false), 10);
                    String str = gVar.f238327b;
                    textLocalisedClause = str != null ? new TextLocalisedClause(R$string.wealth_robo_disclaimer_eea_car_text_two_links, v.k(textLocalisedClause3, new TextLocalisedClause(R$string.wealth_robo_disclaimer_eea_trading_terms_and_conditions, null, new Click(28, (Integer) null, (Object) new n1(str), "robo-eea-disclaimer-trading-terms-and-conditions-link", false), 10), textLocalisedClause2), null, 12) : new TextLocalisedClause(R$string.wealth_robo_disclaimer_eea_car_text, v.k(textLocalisedClause3, textLocalisedClause2), null, 12);
                } else if (disclaimer2 instanceof e) {
                    textLocalisedClause = new CompositeClause(v.k(new TextLocalisedClause(R$string.wealth_robo_disclaimer_eea_simulated_future_projections, null, null, 14), new TextLocalisedClause(R$string.wealth_robo_common_learn_more, null, new Click(28, (Integer) null, (Object) new j1("question.return-projections"), "robo-eea-disclaimer-simulate-future-link", false), 10)), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                } else if (disclaimer2.equals(b.f238321a)) {
                    textLocalisedClause = new TextLocalisedClause(R$string.wealth_robo_disclaimer_eea_past_performance, null, null, 14);
                } else if (disclaimer2.equals(c.f238322a)) {
                    textLocalisedClause = new TextLocalisedClause(R$string.wealth_robo_disclaimer_eea_past_performance_and_fluctuations, null, null, 14);
                } else {
                    if (!disclaimer2.equals(d.f238323a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textLocalisedClause = new TextLocalisedClause(R$string.wealth_robo_disclaimer_eea_past_performance_projected_values_and_fluctuations, null, null, 14);
                }
            } else {
                if (!(disclaimer instanceof o)) {
                    throw new NoWhenBranchMatchedException();
                }
                o disclaimer3 = (o) disclaimer;
                Intrinsics.checkNotNullParameter(disclaimer3, "disclaimer");
                if (disclaimer3 instanceof i) {
                    textLocalisedClause = new TextLocalisedClause(R$string.wealth_robo_disclaimer_sg_investment_services_provider, null, null, 14);
                } else if (disclaimer3 instanceof m) {
                    textLocalisedClause = new TextLocalisedClause(R$string.wealth_robo_disclaimer_sg_past_performance_and_fluctuations, null, null, 14);
                } else if (disclaimer3 instanceof l) {
                    textLocalisedClause = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextLocalisedClause(R$string.wealth_robo_disclaimer_sg_simulated_future_projections, null, null, 14), new TextLocalisedClause(R$string.wealth_robo_common_learn_more, null, new Click(28, (Integer) null, (Object) new j1("question.return-projections"), "robo-sg-disclaimer-simulate-future-link", false), 10)));
                } else if (disclaimer3 instanceof k) {
                    textLocalisedClause = new TextLocalisedClause(R$string.wealth_robo_disclaimer_sg_past_performance_projected_values_and_fluctuations, null, null, 14);
                } else if (disclaimer3 instanceof n) {
                    textLocalisedClause = new TextLocalisedClause(R$string.wealth_robo_disclaimer_eea_car_text_two_links, v.k(new TextLocalisedClause(R$string.wealth_robo_disclaimer_eea_car_link, null, null, 14), new TextLocalisedClause(R$string.wealthcore_footer_disclosure_securities_sng_terms_of_business_link, null, new Click(28, (Integer) null, (Object) new n1(((n) disclaimer3).f238333a), "robo-eea-disclaimer-car-link", false), 10), new TextLocalisedClause(R$string.wealth_robo_disclaimer_eea_trading_disclosures_link, null, new Click(28, (Integer) null, (Object) m1Var, "robo-eea-disclaimer-trading-disclosures-link", false), 10)), null, 12);
                } else {
                    if (!(disclaimer3 instanceof j)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textLocalisedClause = new TextLocalisedClause(R$string.wealth_robo_disclaimer_sg_past_performance, null, null, 14);
                }
            }
            arrayList.add(textLocalisedClause);
        }
        t0 t0Var = t0.f186434a;
        List listC = zhm.u.c(new TextDelegate.Model("robo-footer-disclaimers", yoj.b.m(new TextClause(a0.d.r(m70.a.o(t0Var), m70.a.o(t0Var)), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), arrayList), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036));
        yp0.b.q(listC, 0, 0, 0, 0, 15);
        return listC;
    }
}
