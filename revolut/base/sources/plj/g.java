package plj;

import com.revolut.retail.feature.esim.impl.repositories.model.EsimPhoneNumberPortingPowerOfAttorneyRequest;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimPhoneNumberPortingPowerOfAttorneyRequest f237421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f237422b;

    public g(EsimPhoneNumberPortingPowerOfAttorneyRequest phoneNumberPortingPowerOfAttorneyRequest, List attributes) {
        Intrinsics.checkNotNullParameter(phoneNumberPortingPowerOfAttorneyRequest, "phoneNumberPortingPowerOfAttorneyRequest");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.f237421a = phoneNumberPortingPowerOfAttorneyRequest;
        this.f237422b = attributes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f237421a, gVar.f237421a) && Intrinsics.f(this.f237422b, gVar.f237422b);
    }

    public final int hashCode() {
        return this.f237422b.hashCode() + (this.f237421a.hashCode() * 31);
    }
}
