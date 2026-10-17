package vjj;

import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPorting;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class q extends com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f289777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f289778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EsimPhoneNumberPorting f289779c;
    public final EsimGiftRecipient d;

    public q(String subscriptionId, String phoneNumber, EsimPhoneNumberPorting porting, EsimGiftRecipient esimGiftRecipient) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(porting, "porting");
        this.f289777a = subscriptionId;
        this.f289778b = phoneNumber;
        this.f289779c = porting;
        this.d = esimGiftRecipient;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f289777a, qVar.f289777a) && Intrinsics.f(this.f289778b, qVar.f289778b) && Intrinsics.f(this.f289779c, qVar.f289779c) && Intrinsics.f(this.d, qVar.d);
    }

    public final int hashCode() {
        int iC = wp5.y.c(this.f289779c, p.a.c(this.f289777a.hashCode() * 31, 31, this.f289778b), 31);
        EsimGiftRecipient esimGiftRecipient = this.d;
        return iC + (esimGiftRecipient == null ? 0 : esimGiftRecipient.hashCode());
    }
}
