package gdc;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.CardPaymentAvailability;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f143135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f143136c;
    public final com.revolut.feature.revolutpay.shared.ui.add_payment_method.a d;
    public final String e;
    public final CardPaymentAvailability f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f143137g;

    public k(String pan, String expirationDate, String cardholderName, com.revolut.feature.revolutpay.shared.ui.add_payment_method.a postcodeState, String cvv, CardPaymentAvailability cardPaymentAvailability, boolean z) {
        Intrinsics.checkNotNullParameter(pan, "pan");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        Intrinsics.checkNotNullParameter(cardholderName, "cardholderName");
        Intrinsics.checkNotNullParameter(postcodeState, "postcodeState");
        Intrinsics.checkNotNullParameter(cvv, "cvv");
        Intrinsics.checkNotNullParameter(cardPaymentAvailability, "cardPaymentAvailability");
        this.f143134a = pan;
        this.f143135b = expirationDate;
        this.f143136c = cardholderName;
        this.d = postcodeState;
        this.e = cvv;
        this.f = cardPaymentAvailability;
        this.f143137g = z;
    }

    public static k a(k kVar, String str, String str2, String str3, com.revolut.feature.revolutpay.shared.ui.add_payment_method.a aVar, String str4, boolean z, int i) {
        if ((i & 1) != 0) {
            str = kVar.f143134a;
        }
        String pan = str;
        if ((i & 2) != 0) {
            str2 = kVar.f143135b;
        }
        String expirationDate = str2;
        if ((i & 4) != 0) {
            str3 = kVar.f143136c;
        }
        String cardholderName = str3;
        if ((i & 8) != 0) {
            aVar = kVar.d;
        }
        com.revolut.feature.revolutpay.shared.ui.add_payment_method.a postcodeState = aVar;
        if ((i & 16) != 0) {
            str4 = kVar.e;
        }
        String cvv = str4;
        CardPaymentAvailability cardPaymentAvailability = kVar.f;
        if ((i & 64) != 0) {
            z = kVar.f143137g;
        }
        kVar.getClass();
        Intrinsics.checkNotNullParameter(pan, "pan");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        Intrinsics.checkNotNullParameter(cardholderName, "cardholderName");
        Intrinsics.checkNotNullParameter(postcodeState, "postcodeState");
        Intrinsics.checkNotNullParameter(cvv, "cvv");
        Intrinsics.checkNotNullParameter(cardPaymentAvailability, "cardPaymentAvailability");
        return new k(pan, expirationDate, cardholderName, postcodeState, cvv, cardPaymentAvailability, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f143134a, kVar.f143134a) && Intrinsics.f(this.f143135b, kVar.f143135b) && Intrinsics.f(this.f143136c, kVar.f143136c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f) && this.f143137g == kVar.f143137g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f143137g) + ((this.f.hashCode() + p.a.c((this.d.hashCode() + p.a.c(p.a.c(this.f143134a.hashCode() * 31, 31, this.f143135b), 31, this.f143136c)) * 31, 31, this.e)) * 31);
    }
}
