package vjj;

import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPorting;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberSelections;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class r extends com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f289780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimPhoneNumberSelections f289781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EsimPhoneNumberPorting f289782c;
    public final EsimGiftRecipient d;

    public r(EsimGiftRecipient esimGiftRecipient, EsimPhoneNumberPorting porting, EsimPhoneNumberSelections phoneNumberSelections, String subscriptionId) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(phoneNumberSelections, "phoneNumberSelections");
        Intrinsics.checkNotNullParameter(porting, "porting");
        this.f289780a = subscriptionId;
        this.f289781b = phoneNumberSelections;
        this.f289782c = porting;
        this.d = esimGiftRecipient;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f289780a, rVar.f289780a) && Intrinsics.f(this.f289781b, rVar.f289781b) && Intrinsics.f(this.f289782c, rVar.f289782c) && Intrinsics.f(this.d, rVar.d);
    }

    public final int hashCode() {
        int iC = wp5.y.c(this.f289782c, (this.f289781b.hashCode() + (this.f289780a.hashCode() * 31)) * 31, 31);
        EsimGiftRecipient esimGiftRecipient = this.d;
        return iC + (esimGiftRecipient == null ? 0 : esimGiftRecipient.hashCode());
    }
}
