package o8i;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class e {
    public static TextLocalisedClause a(wi0.b countryCode, dj0.d remainingBalance, dj0.d interest) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(remainingBalance, "remainingBalance");
        Intrinsics.checkNotNullParameter(interest, "interest");
        wi0.b.Companion.getClass();
        if (Intrinsics.f(countryCode, wi0.b.f297756l)) {
            return null;
        }
        return Intrinsics.f(countryCode, wi0.b.O) ? new TextLocalisedClause(R$string.credit_card_topup_info_pay_minimum_avoid_everdue, null, null, 14) : new TextLocalisedClause(R$string.credit_card_topup_info_pay_to_save, v.k(sx4.f.b(3, null, null, remainingBalance), sx4.f.b(3, null, null, interest)), null, 12);
    }
}
