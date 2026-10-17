package vjj;

import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class p extends com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f289775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimGiftRecipient f289776b;

    public p(String subscriptionId, EsimGiftRecipient esimGiftRecipient) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        this.f289775a = subscriptionId;
        this.f289776b = esimGiftRecipient;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f289775a, pVar.f289775a) && Intrinsics.f(this.f289776b, pVar.f289776b);
    }

    public final int hashCode() {
        int iHashCode = this.f289775a.hashCode() * 31;
        EsimGiftRecipient esimGiftRecipient = this.f289776b;
        return iHashCode + (esimGiftRecipient == null ? 0 : esimGiftRecipient.hashCode());
    }
}
