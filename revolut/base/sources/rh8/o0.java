package rh8;

import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.junior_onboarding.api.model.OnboardingTerms;
import com.revolut.feature.junior_onboarding.impl.R$string;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o0 implements lh8.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f254362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kbb.c f254363b;

    public o0(ang.f userInteractor, kbb.c juniorConfigInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(juniorConfigInteractor, "juniorConfigInteractor");
        this.f254362a = userInteractor;
        this.f254363b = juniorConfigInteractor;
    }

    public static Click a(OnboardingTerms onboardingTerms) {
        return new Click(28, (Integer) null, (Object) onboardingTerms.f76956c.f76906a, "ID_CLAUSE_CARD_HOLDER_TERMS", false);
    }

    public static Click b(OnboardingTerms onboardingTerms) {
        return new Click(28, (Integer) null, (Object) onboardingTerms.f76956c.f76907b, "ID_CLAUSE_PRIVACY_STATEMENT", false);
    }

    public final TextLocalisedClause c(OnboardingTerms onboardingTerms) {
        Intrinsics.checkNotNullParameter(onboardingTerms, "onboardingTerms");
        wi0.b bVar = onboardingTerms.f76955b;
        wi0.b.Companion.getClass();
        if (Intrinsics.f(bVar, wi0.b.f297756l)) {
            return new TextLocalisedClause(R$string.junior_signup_details_confirmation_au_terms_acceptance_format, zhm.v.k(new TextLocalisedClause(R$string.rev_u18_signup_details_confirmation_au_cardholder_terms, null, a(onboardingTerms), 10), new TextLocalisedClause(R$string.junior_signup_details_confirmation_au_privacy_statement, null, b(onboardingTerms), 10)), null, 12);
        }
        if (Intrinsics.f(bVar, wi0.b.O0)) {
            return new TextLocalisedClause(R$string.junior_signup_details_confirmation_india_terms_acceptance_nested, zhm.v.k(new TextLocalisedClause(R$string.rev_u18_signup_details_confirmation_cardholder_terms, null, a(onboardingTerms), 10), new TextLocalisedClause(R$string.junior_signup_details_confirmation_revolut_customer_privacy_notice, null, b(onboardingTerms), 10), new TextLocalisedClause(R$string.junior_signup_details_confirmation_data_protection_terms, null, new Click(28, (Integer) null, (Object) onboardingTerms.f76956c.d, "ID_CLAUSE_DATA_PROTECTION_TERMS", false), 10)), null, 12);
        }
        if (Intrinsics.f(bVar, wi0.b.f297770q3)) {
            return null;
        }
        return Intrinsics.f(bVar, wi0.b.Y1) ? new TextLocalisedClause(R$string.junior_signup_details_confirmation_terms_acceptance_mx_format, zhm.u.c(new TextLocalisedClause(R$string.junior_signup_details_confirmation_mx_privacy_statement, null, b(onboardingTerms), 10)), null, 12) : Intrinsics.f(bVar, wi0.b.O) ? new TextLocalisedClause(R$string.junior_signup_details_confirmation_terms_acceptance_co_format, zhm.v.k(new TextLocalisedClause(R$string.rev_u18_signup_details_confirmation_cardholder_terms, null, a(onboardingTerms), 10), new TextLocalisedClause(R$string.junior_signup_details_confirmation_revolut_customer_privacy_notice, null, b(onboardingTerms), 10)), null, 12) : new TextLocalisedClause(R$string.junior_signup_details_confirmation_terms_acceptance_format_upd202309, zhm.v.k(new TextLocalisedClause(R$string.rev_u18_signup_details_confirmation_cardholder_terms, null, a(onboardingTerms), 10), new TextLocalisedClause(R$string.junior_signup_details_confirmation_revolut_customer_privacy_notice, null, b(onboardingTerms), 10)), null, 12);
    }

    public final efm.r d() {
        return nim.a.w(kli.a.h(this.f254362a.k(false), this.f254363b.H()), new rg3.d(14));
    }
}
