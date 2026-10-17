package j04;

import com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ConsentRetention;
import j04.d;
import java.time.LocalDate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b {
    public static d.a a(ConsentRetention consentRetention) {
        LocalDate localDate = null;
        if (!Intrinsics.f(consentRetention, ConsentRetention.ActiveFacility.Indefinitely.f66438a)) {
            if (consentRetention instanceof ConsentRetention.ActiveFacility.Until) {
                localDate = ((ConsentRetention.ActiveFacility.Until) consentRetention).f66439a;
            } else if (!(consentRetention instanceof ConsentRetention.Application.DefaultDuration)) {
                if (!(consentRetention instanceof ConsentRetention.Application.Until)) {
                    throw new NoWhenBranchMatchedException();
                }
                localDate = ((ConsentRetention.Application.Until) consentRetention).f66441a;
            }
        }
        return new d.a(localDate);
    }
}
