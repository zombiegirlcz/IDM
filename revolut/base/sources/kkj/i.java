package kkj;

import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPorting;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f185076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f185077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EsimPhoneNumberPorting f185078c;
    public final EsimGiftRecipient d;

    public i(String subscriptionId, String phoneNumber, EsimPhoneNumberPorting porting, EsimGiftRecipient esimGiftRecipient) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(porting, "porting");
        this.f185076a = subscriptionId;
        this.f185077b = phoneNumber;
        this.f185078c = porting;
        this.d = esimGiftRecipient;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f185076a, iVar.f185076a) && Intrinsics.f(this.f185077b, iVar.f185077b) && Intrinsics.f(this.f185078c, iVar.f185078c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        int iC = y.c(this.f185078c, p.a.c(this.f185076a.hashCode() * 31, 31, this.f185077b), 31);
        EsimGiftRecipient esimGiftRecipient = this.d;
        return iC + (esimGiftRecipient == null ? 0 : esimGiftRecipient.hashCode());
    }
}
