package d74;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ConsentPreferences;
import com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ConsentPreferencesSelection;
import com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.preferences.LegacyConsentPreferencesScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.a2;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final class m extends oki.h implements k {
    public final LegacyConsentPreferencesScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final rw3.a f111820p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a2 f111821q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f111822r;

    public m(LegacyConsentPreferencesScreenContract$InputData inputData, rw3.a interactor, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f111820p = interactor;
        ConsentPreferences consentPreferences = inputData.f67283c;
        this.f111822r = mra.d.b(this, new f(consentPreferences != null ? new Data(consentPreferences, null, false, 6, null) : new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        if (this.o.f67283c == null) {
            J2();
        }
    }

    public final ConsentPreferencesSelection I2() {
        ConsentPreferencesSelection consentPreferencesSelection = this.o.f67282b;
        if (consentPreferencesSelection != null) {
            return consentPreferencesSelection;
        }
        ConsentPreferences consentPreferences = (ConsentPreferences) ((f) ((j2) this.f111822r.f22677a).getValue()).f111811a.getContent();
        if (consentPreferences != null) {
            return new ConsentPreferencesSelection(consentPreferences.f66434a.f66431a, consentPreferences.f66435b.f66442a);
        }
        return null;
    }

    public final void J2() {
        a2 a2Var = this.f111821q;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        String applicationId = this.o.f67281a;
        rw3.a aVar = this.f111820p;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.f111821q = yji.l.a1(this, ngm.n.K(new r25.a(aVar, applicationId, continuation, 16)), null, null, new cvi.j(this, continuation, 23), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f111822r;
    }
}
