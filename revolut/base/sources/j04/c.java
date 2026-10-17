package j04;

import com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ActiveCreditFacilityRetention;
import com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ConsentPreferences;
import com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ConsentRetention;
import com.revolut.feature.credit.application.plugins.api.models.consent_preferences.IncompleteApplicationRetention;
import j04.a;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public abstract class c {
    public static final ConsentPreferences a(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Integer defaultDurationDays = aVar.getIncompleteApplicationRetention().getDefaultDurationDays();
        if (defaultDurationDays == null) {
            throw new IllegalStateException("defaultDurationDays is required for incomplete application retention");
        }
        int iIntValue = defaultDurationDays.intValue();
        a.C0959a activeCreditFacilityRetention = aVar.getActiveCreditFacilityRetention();
        LocalDate customExpirationDate = activeCreditFacilityRetention.getCustomExpirationDate();
        ActiveCreditFacilityRetention activeCreditFacilityRetention2 = new ActiveCreditFacilityRetention(customExpirationDate != null ? new ConsentRetention.ActiveFacility.Until(customExpirationDate) : ConsentRetention.ActiveFacility.Indefinitely.f66438a, activeCreditFacilityRetention.getMinimumExpirationDate(), activeCreditFacilityRetention.getMaximumExpirationDate(), activeCreditFacilityRetention.getSuggestedCustomExpirationDate());
        a.C0959a incompleteApplicationRetention = aVar.getIncompleteApplicationRetention();
        LocalDate customExpirationDate2 = incompleteApplicationRetention.getCustomExpirationDate();
        return new ConsentPreferences(activeCreditFacilityRetention2, new IncompleteApplicationRetention(customExpirationDate2 != null ? new ConsentRetention.Application.Until(customExpirationDate2) : new ConsentRetention.Application.DefaultDuration(iIntValue), iIntValue, incompleteApplicationRetention.getMinimumExpirationDate(), incompleteApplicationRetention.getMaximumExpirationDate(), incompleteApplicationRetention.getSuggestedCustomExpirationDate()));
    }
}
