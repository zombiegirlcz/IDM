package x1g;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.domain.models.user.UserCompanyRegion;
import com.revolut.feature.travel.experiences.api.R$string;
import ip0.ak0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dyf.h f302417a;

    public g0(dyf.h exchangeTermsAndConditions) {
        Intrinsics.checkNotNullParameter(exchangeTermsAndConditions, "exchangeTermsAndConditions");
        this.f302417a = exchangeTermsAndConditions;
    }

    public final TextDelegate.Model a(lxf.g gVar, UserCompanyRegion userCompanyRegion, String str, boolean z) {
        aim.e eVarB = zhm.u.b();
        if (userCompanyRegion == UserCompanyRegion.AE) {
            eVarB.add(new TextLocalisedClause(R$string.experiences_checkout_terms_earn_and_redeem_disclaimer, null, null, 14));
        }
        eVarB.add(z ? new TextLocalisedClause(R$string.experiences_checkout_terms_description_with_plan_and_points_terms, zhm.v.k(new TextLocalisedClause(R$string.experiences_checkout_terms_with_points_experiences_terms_placeholder, null, new Click(30, (Integer) null, (Object) null, "TERMS_AND_CONDITIONS_EXPERIENCES_ID", false), 10), new TextLocalisedClause(R$string.experiences_checkout_terms_with_points_points_terms_placeholder, null, new Click(30, (Integer) null, (Object) null, "TERMS_AND_CONDITIONS_REVPOINTS_ID", false), 10), new TextLocalisedClause(R$string.experiences_checkout_terms_plan_placeholder, null, new Click(30, (Integer) null, (Object) null, "CASHBACK_REMOVAL_TERMS_ID", false), 10)), null, 12) : new TextLocalisedClause(R$string.experiences_checkout_terms_description_new_with_points_terms, zhm.v.k(new TextLocalisedClause(R$string.experiences_checkout_terms_with_points_experiences_terms_placeholder, null, new Click(30, (Integer) null, (Object) null, "TERMS_AND_CONDITIONS_EXPERIENCES_ID", false), 10), new TextLocalisedClause(R$string.experiences_checkout_terms_with_points_points_terms_placeholder, null, new Click(30, (Integer) null, (Object) null, "TERMS_AND_CONDITIONS_REVPOINTS_ID", false), 10)), null, 12));
        aim.e eVarA = zhm.u.a(eVarB);
        aim.e eVarB2 = zhm.u.b();
        Clause clauseA = (gVar == null || userCompanyRegion == null) ? null : this.f302417a.a(gVar, userCompanyRegion);
        if (clauseA != null) {
            eVarB2.add(clauseA);
        }
        if (userCompanyRegion == UserCompanyRegion.IL && str != null) {
            eVarB2.add(new TextLocalisedClause(R$string.experiences_checkout_terms_provider_disclaimer_israel, zhm.u.c(str), null, 12));
        }
        aim.e eVarA2 = zhm.u.a(eVarB2);
        aim.e eVarB3 = zhm.u.b();
        eVarB3.addAll(eVarA);
        eVarB3.add(new TextLocalisedClause(R$string.experiences_checkout_terms_partner, zhm.u.c(new TextLocalisedClause(R$string.experiences_checkout_terms_partners_policy_link, null, new Click(30, (Integer) null, (Object) null, "TERMS_AND_CONDITIONS_PARTNERS_ID", false), 10)), null, 12));
        eVarB3.addAll(eVarA2);
        return new TextDelegate.Model("TERMS_AND_CONDITIONS_ITEM_ID", new CompositeClause(zhm.u.a(eVarB3), new TextClause(". ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036);
    }
}
