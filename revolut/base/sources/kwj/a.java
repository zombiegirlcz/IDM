package kwj;

import cjl.n;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.sso.api.app_consent.RevolutSsoQrConsentDestination;
import com.revolut.sso.api.app_consent.SsoQrConsentInputData;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import lg0.e;
import lg0.g;
import xii.b;
import zhm.y0;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f190367a = y0.b("challenges/qrdelegated/{challengeId}");

    @Override // xii.b
    public final Set a() {
        return this.f190367a;
    }

    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        n nVar = n.QrDelegated;
        String str = (String) deeplink.f195040b.get("challengeId");
        if (str == null) {
            throw new IllegalStateException("Cannot handle challenge QR-code delegated. Challenge id is absent");
        }
        String value = g.a("subjectId", deeplink.f195041c);
        if (value != null) {
            Intrinsics.checkNotNullParameter(value, "value");
        } else {
            value = null;
        }
        return new RevolutSsoQrConsentDestination(new SsoQrConsentInputData(nVar, str, value));
    }
}
