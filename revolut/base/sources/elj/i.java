package elj;

import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPorting;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.pac.number_transfer_confirmation.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimPhoneNumberPorting f127501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f127502b;

    public i(EsimPhoneNumberPorting esimPhoneNumberPorting, String portingId) {
        Intrinsics.checkNotNullParameter(portingId, "portingId");
        this.f127501a = esimPhoneNumberPorting;
        this.f127502b = portingId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f127501a, iVar.f127501a) && Intrinsics.f(this.f127502b, iVar.f127502b);
    }

    public final int hashCode() {
        EsimPhoneNumberPorting esimPhoneNumberPorting = this.f127501a;
        return this.f127502b.hashCode() + ((esimPhoneNumberPorting == null ? 0 : esimPhoneNumberPorting.hashCode()) * 31);
    }
}
