package o99;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.onboarding.api.esignature.models.QesTermsAcknowledgementSection;
import com.revolut.feature.onboarding.api.esignature.models.QesTermsConfiguration;
import com.revolut.feature.onboarding.api.qes_terms.QesTermsAuthenticationMethod;
import com.revolut.feature.onboarding.impl.R$string;
import com.revolut.feature.terms.api.model.TermsScope;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.y0;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements j89.a {
    public static QesTermsConfiguration a() {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.qes_terms_title, null, null, 14);
        int i = R$string.qes_terms_passcode_disclaimers_infocert_consents;
        f0 f0Var = f0.f322471a;
        TermsScope.INSTANCE.getClass();
        List listC = u.c(TermsScope.S);
        TermsScope termsScope = TermsScope.f90372m;
        return new QesTermsConfiguration(textLocalisedClause, (TextLocalisedClause) null, i, (List) f0Var, (QesTermsAuthenticationMethod) QesTermsAuthenticationMethod.Sso.f78198a, true, listC, u.c(termsScope), (List) f0Var, y0.b(termsScope), new TextLocalisedClause(R$string.qes_terms_accept, null, null, 14), new TextLocalisedClause(R$string.qes_terms_footer_mx, null, null, 14), new TextLocalisedClause(R$string.qes_terms_passcode_disclaimers_title, null, null, 14), (QesTermsAcknowledgementSection) null, 16384);
    }

    public final QesTermsConfiguration b(wi0.b userCountryCode) {
        Intrinsics.checkNotNullParameter(userCountryCode, "userCountryCode");
        wi0.b.Companion.getClass();
        if (Intrinsics.f(userCountryCode, wi0.b.Y1)) {
            return a();
        }
        if (!Intrinsics.f(userCountryCode, wi0.b.f297760n0)) {
            throw new IllegalStateException(j6.a.q("No QES configuration for country=", userCountryCode.f297794a));
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.qes_terms_passcode_title, null, null, 14);
        int i = R$string.qes_terms_passcode_disclaimers_infocert_consents;
        List listK = v.k(new TextLocalisedClause(R$string.qes_terms_passcode_disclaimers_confirm_data_accurate, null, null, 14), new TextLocalisedClause(R$string.qes_terms_passcode_disclaimers_request_issuance_certificate, null, null, 14), new TextLocalisedClause(R$string.qes_terms_disclaimers_non_withdrawal_acknoledgement, null, null, 14));
        TermsScope.INSTANCE.getClass();
        return new QesTermsConfiguration(textLocalisedClause, (TextLocalisedClause) null, i, listK, (QesTermsAuthenticationMethod) QesTermsAuthenticationMethod.Passcode.f78197a, false, u.c(TermsScope.S), (List) null, (List) f0.f322471a, (Set) null, new TextLocalisedClause(R$string.qes_terms_accept, null, null, 14), new TextLocalisedClause(R$string.qes_terms_passcode_footer, null, null, 14), new TextLocalisedClause(R$string.qes_terms_passcode_disclaimers_title, null, null, 14), (QesTermsAcknowledgementSection) null, 18080);
    }
}
