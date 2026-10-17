package mlj;

import com.revolut.retail.feature.esim.impl.repositories.model.EsimPhoneNumberPortingPowerOfAttorneyRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimPhoneNumberPortingPowerOfAttorneyRequest f206983a;

    public f(EsimPhoneNumberPortingPowerOfAttorneyRequest phoneNumberPortingPowerOfAttorneyRequest) {
        Intrinsics.checkNotNullParameter(phoneNumberPortingPowerOfAttorneyRequest, "phoneNumberPortingPowerOfAttorneyRequest");
        this.f206983a = phoneNumberPortingPowerOfAttorneyRequest;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f206983a, ((f) obj2).f206983a);
    }

    public final int hashCode() {
        return this.f206983a.hashCode();
    }
}
