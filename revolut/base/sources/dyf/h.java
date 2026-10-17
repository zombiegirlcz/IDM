package dyf;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.domain.models.user.UserCompanyRegion;
import com.revolut.feature.travel.common.api.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class h {
    public final Clause a(lxf.g paymentType, UserCompanyRegion userCompanyRegion) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(paymentType, "paymentType");
        Intrinsics.checkNotNullParameter(userCompanyRegion, "userCompanyRegion");
        if (paymentType instanceof lxf.e) {
            return null;
        }
        if (paymentType instanceof lxf.d) {
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.travel_common_terms_exchange_crypto_uk, null, null, 14);
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.travel_common_terms_exchange_crypto_uk_bank, null, null, 14);
            TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.travel_common_terms_exchange_crypto_eea, null, null, 14);
            switch (g.f121103a[userCompanyRegion.ordinal()]) {
                case 1:
                    return textLocalisedClause2;
                case 2:
                    return textLocalisedClause3;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    return textLocalisedClause4;
                default:
                    return null;
            }
        }
        if (paymentType instanceof lxf.c) {
            TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(R$string.travel_common_terms_exchange_commodity_uk, null, null, 14);
            TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(R$string.travel_common_terms_exchange_commodity_uk_bank, null, null, 14);
            TextLocalisedClause textLocalisedClause7 = new TextLocalisedClause(R$string.travel_common_terms_exchange_commodity_eea, null, null, 14);
            switch (g.f121103a[userCompanyRegion.ordinal()]) {
                case 1:
                    return textLocalisedClause5;
                case 2:
                    return textLocalisedClause6;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    return textLocalisedClause7;
                default:
                    return null;
            }
        }
        if (!(paymentType instanceof lxf.f)) {
            throw new NoWhenBranchMatchedException();
        }
        TextLocalisedClause textLocalisedClause8 = new TextLocalisedClause(R$string.travel_common_terms_exchange_savings_checkout_uk, null, null, 14);
        TextLocalisedClause textLocalisedClause9 = new TextLocalisedClause(R$string.travel_common_terms_exchange_savings_checkout_uk_bank, null, null, 14);
        if (((lxf.f) paymentType).f200574a) {
            textLocalisedClause = new TextLocalisedClause(R$string.travel_common_terms_exchange_savings_checkout_eea_mmf, null, null, 14);
        } else {
            int i = R$string.travel_common_terms_exchange_savings_checkout_eea_savings;
            int i2 = R$string.travel_common_terms_exchange_terms_savings;
            Intrinsics.checkNotNullParameter("https://www.revolut.com/en-LT/legal/savings-account/", "url");
            TextLocalisedClause textLocalisedClause10 = new TextLocalisedClause(i2, null, new Click(28, (Integer) null, (Object) new lxf.b("https://www.revolut.com/en-LT/legal/savings-account/"), "SAVINGS_TERMS_ID", false), 10);
            int i3 = R$string.travel_common_terms_exchange_terms_personal;
            Intrinsics.checkNotNullParameter("https://www.revolut.com/en-LT/legal/terms/", "url");
            textLocalisedClause = new TextLocalisedClause(i, v.k(textLocalisedClause10, new TextLocalisedClause(i3, null, new Click(28, (Integer) null, (Object) new lxf.b("https://www.revolut.com/en-LT/legal/terms/"), "PERSONAL_TERMS_ID", false), 10)), null, 12);
        }
        switch (g.f121103a[userCompanyRegion.ordinal()]) {
            case 1:
                return textLocalisedClause8;
            case 2:
                return textLocalisedClause9;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return textLocalisedClause;
            default:
                return null;
        }
    }
}
