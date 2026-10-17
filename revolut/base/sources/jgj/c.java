package jgj;

import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPorting;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.pac.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimPhoneNumberPorting f174064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f174065b;

    public c(EsimPhoneNumberPorting esimPhoneNumberPorting, String portingId) {
        Intrinsics.checkNotNullParameter(portingId, "portingId");
        this.f174064a = esimPhoneNumberPorting;
        this.f174065b = portingId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f174064a, cVar.f174064a) && Intrinsics.f(this.f174065b, cVar.f174065b);
    }

    public final int hashCode() {
        EsimPhoneNumberPorting esimPhoneNumberPorting = this.f174064a;
        return this.f174065b.hashCode() + ((esimPhoneNumberPorting == null ? 0 : esimPhoneNumberPorting.hashCode()) * 31);
    }
}
