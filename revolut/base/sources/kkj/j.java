package kkj;

import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPorting;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberSelections;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f185079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimPhoneNumberSelections f185080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EsimPhoneNumberPorting f185081c;
    public final EsimGiftRecipient d;

    public j(EsimGiftRecipient esimGiftRecipient, EsimPhoneNumberPorting porting, EsimPhoneNumberSelections phoneNumberSelections, String subscriptionId) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(phoneNumberSelections, "phoneNumberSelections");
        Intrinsics.checkNotNullParameter(porting, "porting");
        this.f185079a = subscriptionId;
        this.f185080b = phoneNumberSelections;
        this.f185081c = porting;
        this.d = esimGiftRecipient;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f185079a, jVar.f185079a) && Intrinsics.f(this.f185080b, jVar.f185080b) && Intrinsics.f(this.f185081c, jVar.f185081c) && Intrinsics.f(this.d, jVar.d);
    }

    public final int hashCode() {
        int iC = y.c(this.f185081c, (this.f185080b.hashCode() + (this.f185079a.hashCode() * 31)) * 31, 31);
        EsimGiftRecipient esimGiftRecipient = this.d;
        return iC + (esimGiftRecipient == null ? 0 : esimGiftRecipient.hashCode());
    }
}
