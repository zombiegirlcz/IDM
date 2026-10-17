package ju4;

import com.revolut.feature.credit.card.api.models.creditcard.CreditCardPaymentDetails;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardPaymentDetails f178574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f178575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f178576c;
    public final dj0.d d;
    public final boolean e;
    public final dm4.e f;

    public a(CreditCardPaymentDetails paymentDetails, wi0.b countryCode, xi0.b currency, dj0.d enteredAmount, boolean z, dm4.e eVar) {
        Intrinsics.checkNotNullParameter(paymentDetails, "paymentDetails");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(enteredAmount, "enteredAmount");
        this.f178574a = paymentDetails;
        this.f178575b = countryCode;
        this.f178576c = currency;
        this.d = enteredAmount;
        this.e = z;
        this.f = eVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f178574a, aVar.f178574a) && Intrinsics.f(this.f178575b, aVar.f178575b) && Intrinsics.f(this.f178576c, aVar.f178576c) && Intrinsics.f(this.d, aVar.d) && this.e == aVar.e && Intrinsics.f(this.f, aVar.f);
    }

    public final int hashCode() {
        int iC = j6.a.c(v7.c(h30.l.j(this.f178576c, p.a.c(this.f178574a.hashCode() * 31, 31, this.f178575b.f297794a), 31), 31, this.d), 31, this.e);
        dm4.e eVar = this.f;
        return iC + (eVar == null ? 0 : eVar.f115857a.hashCode());
    }
}
