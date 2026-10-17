package pkj;

import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f237201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimGiftRecipient f237202b;

    public g(String phoneNumber, EsimGiftRecipient esimGiftRecipient) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        this.f237201a = phoneNumber;
        this.f237202b = esimGiftRecipient;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f237201a, gVar.f237201a) && Intrinsics.f(this.f237202b, gVar.f237202b);
    }

    public final int hashCode() {
        int iHashCode = this.f237201a.hashCode() * 31;
        EsimGiftRecipient esimGiftRecipient = this.f237202b;
        return iHashCode + (esimGiftRecipient == null ? 0 : esimGiftRecipient.hashCode());
    }
}
