package dgj;

import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPorting;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EsimPhoneNumberPorting f114704c;
    public final EsimGiftRecipient d;

    public d(String subscriptionId, String phoneNumber, EsimPhoneNumberPorting porting, EsimGiftRecipient esimGiftRecipient) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(porting, "porting");
        this.f114702a = subscriptionId;
        this.f114703b = phoneNumber;
        this.f114704c = porting;
        this.d = esimGiftRecipient;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f114702a, dVar.f114702a) && Intrinsics.f(this.f114703b, dVar.f114703b) && Intrinsics.f(this.f114704c, dVar.f114704c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        int iC = y.c(this.f114704c, p.a.c(this.f114702a.hashCode() * 31, 31, this.f114703b), 31);
        EsimGiftRecipient esimGiftRecipient = this.d;
        return iC + (esimGiftRecipient == null ? 0 : esimGiftRecipient.hashCode());
    }
}
