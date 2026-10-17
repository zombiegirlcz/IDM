package plj;

import com.revolut.retail.feature.esim.impl.repositories.model.EsimPhoneNumberPortingPowerOfAttorneyRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimPhoneNumberPortingPowerOfAttorneyRequest f237423a;

    public h(EsimPhoneNumberPortingPowerOfAttorneyRequest phoneNumberPortingPowerOfAttorneyRequest) {
        Intrinsics.checkNotNullParameter(phoneNumberPortingPowerOfAttorneyRequest, "phoneNumberPortingPowerOfAttorneyRequest");
        this.f237423a = phoneNumberPortingPowerOfAttorneyRequest;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f237423a, ((h) obj2).f237423a);
    }

    public final int hashCode() {
        return this.f237423a.hashCode();
    }
}
