package kkj;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f185070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f185071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EsimGiftRecipient f185072c;

    public f(Data phoneNumberSelections, Data esimSubscription, EsimGiftRecipient esimGiftRecipient) {
        Intrinsics.checkNotNullParameter(phoneNumberSelections, "phoneNumberSelections");
        Intrinsics.checkNotNullParameter(esimSubscription, "esimSubscription");
        this.f185070a = phoneNumberSelections;
        this.f185071b = esimSubscription;
        this.f185072c = esimGiftRecipient;
    }

    public static f a(f fVar, Data phoneNumberSelections, Data esimSubscription, int i) {
        if ((i & 1) != 0) {
            phoneNumberSelections = fVar.f185070a;
        }
        if ((i & 2) != 0) {
            esimSubscription = fVar.f185071b;
        }
        EsimGiftRecipient esimGiftRecipient = fVar.f185072c;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(phoneNumberSelections, "phoneNumberSelections");
        Intrinsics.checkNotNullParameter(esimSubscription, "esimSubscription");
        return new f(phoneNumberSelections, esimSubscription, esimGiftRecipient);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f185070a, fVar.f185070a) && Intrinsics.f(this.f185071b, fVar.f185071b) && Intrinsics.f(this.f185072c, fVar.f185072c);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f185071b, this.f185070a.hashCode() * 31, 31);
        EsimGiftRecipient esimGiftRecipient = this.f185072c;
        return iC + (esimGiftRecipient == null ? 0 : esimGiftRecipient.hashCode());
    }
}
