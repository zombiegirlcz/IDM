package kgj;

import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPorting;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.power_of_attorney.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimPhoneNumberPorting f184012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f184013b;

    public c(EsimPhoneNumberPorting esimPhoneNumberPorting, String portingId) {
        Intrinsics.checkNotNullParameter(portingId, "portingId");
        this.f184012a = esimPhoneNumberPorting;
        this.f184013b = portingId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f184012a, cVar.f184012a) && Intrinsics.f(this.f184013b, cVar.f184013b);
    }

    public final int hashCode() {
        EsimPhoneNumberPorting esimPhoneNumberPorting = this.f184012a;
        return this.f184013b.hashCode() + ((esimPhoneNumberPorting == null ? 0 : esimPhoneNumberPorting.hashCode()) * 31);
    }
}
