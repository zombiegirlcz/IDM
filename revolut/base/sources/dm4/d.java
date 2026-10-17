package dm4;

import com.revolut.feature.credit.card.api.models.creditcard.CreditCardPaymentDetails;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardPaymentDetails f115854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f115855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wi0.b f115856c;

    public d(CreditCardPaymentDetails paymentDetails, dj0.d enteredAmount, wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(paymentDetails, "paymentDetails");
        Intrinsics.checkNotNullParameter(enteredAmount, "enteredAmount");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f115854a = paymentDetails;
        this.f115855b = enteredAmount;
        this.f115856c = countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f115854a, dVar.f115854a) && Intrinsics.f(this.f115855b, dVar.f115855b) && Intrinsics.f(this.f115856c, dVar.f115856c);
    }

    public final int hashCode() {
        return this.f115856c.f297794a.hashCode() + j6.a.c(v7.c(this.f115854a.hashCode() * 31, 31, this.f115855b), 31, false);
    }
}
