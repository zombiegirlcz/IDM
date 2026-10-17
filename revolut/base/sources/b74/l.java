package b74;

import com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ConsentRetention;
import com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.EditPreferencesConfiguration;
import com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.edit.EditConsentPreferencesScreenContract$InputData;
import java.time.LocalDate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l extends oki.h implements j {
    public final EditConsentPreferencesScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final cli.y f12894p;

    public l(EditConsentPreferencesScreenContract$InputData inputData, m stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f12894p = mra.d.b(this, new f(inputData.f67276a.getSelection(), J2(inputData.f67276a.getSelection())), stateMapper, null, false, 12);
    }

    public final ConsentRetention I2(LocalDate localDate) {
        EditPreferencesConfiguration editPreferencesConfiguration = this.o.f67276a;
        if (editPreferencesConfiguration instanceof EditPreferencesConfiguration.ActiveFacility) {
            return new ConsentRetention.ActiveFacility.Until(localDate);
        }
        if (editPreferencesConfiguration instanceof EditPreferencesConfiguration.Application) {
            return new ConsentRetention.Application.Until(localDate);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean J2(ConsentRetention consentRetention) {
        LocalDate f66441a = consentRetention.getF66441a();
        if (f66441a == null) {
            return true;
        }
        EditConsentPreferencesScreenContract$InputData editConsentPreferencesScreenContract$InputData = this.o;
        return f66441a.compareTo((Object) editConsentPreferencesScreenContract$InputData.f67276a.getD()) <= 0 && f66441a.compareTo((Object) editConsentPreferencesScreenContract$InputData.f67276a.getF67267c()) >= 0;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f12894p;
    }
}
