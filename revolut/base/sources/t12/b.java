package t12;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.models.payments_authorisations.AuthorisationFrequency;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b {
    public static TextLocalisedClause a(AuthorisationFrequency frequency) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        switch (a.f267076a[frequency.ordinal()]) {
            case 1:
            case 2:
                return new TextLocalisedClause(R$string.apm_payments_authorisations_detail_frequency_daily, null, null, 14);
            case 3:
                return new TextLocalisedClause(R$string.apm_payments_authorisations_detail_frequency_weekly, null, null, 14);
            case 4:
                return new TextLocalisedClause(R$string.apm_recurring_payments_frequency_fortnightly, null, null, 14);
            case 5:
                return new TextLocalisedClause(R$string.apm_payments_authorisations_detail_frequency_monthly, null, null, 14);
            case 6:
                return new TextLocalisedClause(R$string.apm_payments_authorisations_detail_frequency_quarterly, null, null, 14);
            case 7:
                return new TextLocalisedClause(R$string.apm_payments_authorisations_detail_frequency_semiannually, null, null, 14);
            case 8:
                return new TextLocalisedClause(R$string.apm_payments_authorisations_detail_frequency_annually, null, null, 14);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
