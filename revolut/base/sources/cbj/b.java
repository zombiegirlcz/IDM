package cbj;

import bbj.c;
import com.bumptech.glide.d;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.domain.models.user.UserCompanyRegion;
import com.revolut.retail.feature.crypto_commodities.disclaimer.mapper.impl.R$string;
import ip0.ck0;
import ip0.yj0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ri5.a f22867a;

    public b(ri5.a disclaimerEligibilityChecker) {
        Intrinsics.checkNotNullParameter(disclaimerEligibilityChecker, "disclaimerEligibilityChecker");
        this.f22867a = disclaimerEligibilityChecker;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.models.CompositeClause a(com.revolut.domain.models.user.UserCompanyRegion r22, wi0.b r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cbj.b.a(com.revolut.domain.models.user.UserCompanyRegion, wi0.b, boolean, boolean):com.revolut.core.ui_kit.models.CompositeClause");
    }

    public final TextLocalisedClause b(UserCompanyRegion userCompanyRegion, wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(userCompanyRegion, "userCompanyRegion");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        wi0.b.Companion.getClass();
        if (!Intrinsics.f(countryCode, wi0.b.J)) {
            if (d.p(countryCode)) {
                return new TextLocalisedClause(R$string.crypto_disclosures_card_footer_uab, v.k(new TextLocalisedClause(R$string.crypto_disclosures_card_footer_personalterms, null, new Click(28, (Integer) null, (Object) countryCode, "PERSONAL_TERMS_ID", false), 10), new TextLocalisedClause(R$string.crypto_disclosures_card_footer_cryptoterms, null, new Click(28, (Integer) null, (Object) countryCode, "CRYPTO_TERMS_ID", false), 10)), null, 12);
            }
            if (d.q(countryCode)) {
                return new TextLocalisedClause(R$string.crypto_disclosures_card_footer_uk, v.k(new TextLocalisedClause(R$string.crypto_disclosures_card_footer_personalterms, null, new Click(28, (Integer) null, (Object) countryCode, "PERSONAL_TERMS_ID", false), 10), new TextLocalisedClause(R$string.crypto_disclosures_card_footer_cryptoterms, null, new Click(28, (Integer) null, (Object) countryCode, "CRYPTO_TERMS_ID", false), 10)), null, 12);
            }
        }
        return null;
    }

    public final List c(UserCompanyRegion userCompanyRegion, wi0.b countryCode, boolean z) {
        Intrinsics.checkNotNullParameter(userCompanyRegion, "userCompanyRegion");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(userCompanyRegion, "userCompanyRegion");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return u.c(new TextDelegate.Model("LEGAL_DISCLAIMER_ID", a(userCompanyRegion, countryCode, z, false), false, new ck0(yj0.CENTER_HORIZONTAL), null, null, 0, 0, 0, 0, 2036));
    }
}
