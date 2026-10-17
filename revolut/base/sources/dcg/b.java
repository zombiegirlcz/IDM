package dcg;

import aw0.o9;
import cgi.e;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.travel.hotels.api.R$string;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.t0;
import rd0.d;
import zhm.h0;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class b {
    public static TextLocalisedClause a() {
        return new TextLocalisedClause(R$string.hotels_checkout_terms_with_points_and_plan_plan_terms_placeholder, null, new Click(30, (Integer) null, (Object) null, "CASHBACK_REMOVAL_TERMS_AND_CONDITIONS_ID", false), 10);
    }

    public static Clause b(fgi.a aVar) {
        int i = a.f112986b[aVar.ordinal()];
        if (i == 1) {
            IllegalStateException illegalStateException = new IllegalStateException("Trying to get a link to UNKNOWN provider");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            m70.a.c(t0.f186434a);
            return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.hotels_checkout_terms_with_points_expedia_terms_placeholder, null, new Click(28, (Integer) null, (Object) fgi.a.EXPEDIA, "PROVIDER_TERMS_AND_CONDITIONS_ID", false), 10);
        }
        if (i == 3) {
            return new TextLocalisedClause(R$string.hotels_checkout_terms_with_points_vrbo_terms_placeholder, null, new Click(28, (Integer) null, (Object) fgi.a.VRBO, "PROVIDER_TERMS_AND_CONDITIONS_ID", false), 10);
        }
        if (i == 4) {
            return new TextLocalisedClause(R$string.hotels_checkout_terms_with_points_nuitee_terms_placeholder, null, new Click(28, (Integer) null, (Object) fgi.a.NUITEE, "PROVIDER_TERMS_AND_CONDITIONS_ID", false), 10);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static TextLocalisedClause c(boolean z, fgi.a aVar, e eVar) {
        if (z) {
            if (a.f112986b[aVar.ordinal()] == 1) {
                int i = a.f112985a[eVar.ordinal()];
                if (i == 1) {
                    return new TextLocalisedClause(R$string.hotels_checkout_terms_with_points_and_plan_description, v.k(e(), d(), a()), null, 12);
                }
                if (i == 2) {
                    return new TextLocalisedClause(R$string.hotels_checkout_terms_with_points_and_plan_pay_later_description, v.k(e(), d(), a()), null, 12);
                }
                throw new NoWhenBranchMatchedException();
            }
            int i2 = a.f112985a[eVar.ordinal()];
            if (i2 == 1) {
                return new TextLocalisedClause(R$string.hotels_checkout_terms_with_points_and_plan_description_with_provider, v.k(e(), d(), b(aVar), a()), null, 12);
            }
            if (i2 == 2) {
                return new TextLocalisedClause(R$string.hotels_checkout_terms_with_points_and_plan_pay_later_description_with_provider, v.k(e(), d(), b(aVar), a()), null, 12);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (a.f112986b[aVar.ordinal()] == 1) {
            int i3 = a.f112985a[eVar.ordinal()];
            if (i3 == 1) {
                return new TextLocalisedClause(R$string.hotels_checkout_terms_with_points_description, v.k(e(), d()), null, 12);
            }
            if (i3 == 2) {
                return new TextLocalisedClause(R$string.hotels_checkout_terms_with_points_pay_later_description, v.k(e(), d()), null, 12);
            }
            throw new NoWhenBranchMatchedException();
        }
        int i5 = a.f112985a[eVar.ordinal()];
        if (i5 == 1) {
            return new TextLocalisedClause(R$string.hotels_checkout_terms_with_points_description_with_provider, v.k(e(), d(), b(aVar)), null, 12);
        }
        if (i5 == 2) {
            return new TextLocalisedClause(R$string.hotels_checkout_terms_with_points_pay_later_description_with_provider, v.k(e(), d(), b(aVar)), null, 12);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static TextLocalisedClause d() {
        return new TextLocalisedClause(R$string.hotels_checkout_terms_with_points_points_terms_placeholder, null, new Click(30, (Integer) null, (Object) null, "REV_POINTS_TERMS_AND_CONDITIONS_ID", false), 10);
    }

    public static TextLocalisedClause e() {
        return new TextLocalisedClause(R$string.hotels_checkout_terms_with_points_stays_terms_placeholder, null, new Click(30, (Integer) null, (Object) null, "REVOLUT_TERMS_AND_CONDITIONS_ID", false), 10);
    }
}
