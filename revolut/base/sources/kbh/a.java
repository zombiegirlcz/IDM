package kbh;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import ip0.ak0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    @NotNull
    public static final C1041a Companion = new C1041a();

    /* JADX INFO: renamed from: kbh.a$a, reason: collision with other inner class name */
    public static final class C1041a {
        private C1041a() {
        }
    }

    public static TextLocalisedClause a(String str) {
        return new TextLocalisedClause(R$string.wealth_robo_disclaimer_advisory_disclosures_title, null, new Click(28, (Integer) null, (Object) new k1h.h(str), "footer.disclosure.advisory_agreement", false), 10);
    }

    public static TextLocalisedClause c(String str) {
        return new TextLocalisedClause(R$string.wealth_robo_disclaimer_advisory_disclosures_content, u.c(a(str)), null, 12);
    }

    public final List b(k1h.f disclaimer) {
        List listC;
        List list;
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        if (disclaimer instanceof k1h.c) {
            String str = ((k1h.c) disclaimer).f180261a.f180266a;
            if (str != null) {
                listC = v.k(c(str), new TextLocalisedClause(R$string.wealth_robo_disclaimer_us_returns_are_hypothetical, null, null, 14));
                list = listC;
            }
            list = null;
        } else if (disclaimer instanceof k1h.d) {
            String str2 = ((k1h.d) disclaimer).f180262a.f180266a;
            if (str2 != null) {
                listC = v.k(new TextLocalisedClause(R$string.wealth_robo_disclaimer_us_returns_are_hypothetical, null, null, 14), new TextLocalisedClause(R$string.wealth_robo_disclaimer_us_past_hypothetical_performance, u.c(a(str2)), null, 12));
                list = listC;
            }
            list = null;
        } else if (disclaimer instanceof k1h.a) {
            String str3 = ((k1h.a) disclaimer).f180259a.f180266a;
            if (str3 != null) {
                listC = v.k(c(str3), new TextLocalisedClause(R$string.wealth_robo_disclaimer_actual_portfolio_performance, null, null, 14));
                list = listC;
            }
            list = null;
        } else if (disclaimer instanceof k1h.e) {
            k1h.e eVar = (k1h.e) disclaimer;
            String str4 = eVar.f180263a.f180266a;
            if (str4 != null) {
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_robo_onboarding_projections_disclaimer, u.c(new PercentageClause(eVar.f180264b, new PercentageClause.Format.Custom(4, 14, null, null, null), (Style) null, 4)), null, 12);
                int i = R$string.wealth_robo_common_learn_more;
                Intrinsics.checkNotNullParameter("question.how-is-the-projections-values-of-my-portfolio-calculated", "key");
                listC = v.k(new CompositeClause(v.k(textLocalisedClause, new TextLocalisedClause(i, null, new Click(28, (Integer) null, (Object) new k1h.g(), "learn-more-robo-projection", false), 10)), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), c(str4));
                list = listC;
            }
            list = null;
        } else {
            if (!(disclaimer instanceof k1h.b)) {
                throw new NoWhenBranchMatchedException();
            }
            String str5 = ((k1h.b) disclaimer).f180260a.f180266a;
            if (str5 != null) {
                listC = u.c(c(str5));
                list = listC;
            }
            list = null;
        }
        if (list == null) {
            return f0.f322471a;
        }
        t0 t0Var = t0.f186434a;
        List listC2 = u.c(new TextDelegate.Model("footer-disclosures", new CompositeClause(list, new TextClause(a0.d.r(m70.a.o(t0Var), m70.a.o(t0Var)), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036));
        yp0.b.q(listC2, 0, 0, 0, 0, 15);
        return listC2;
    }
}
