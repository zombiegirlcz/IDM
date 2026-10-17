package n8i;

import com.revolut.feature.credit.card.api.models.creditcard.CreditCardPaymentDetails;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class v implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardPaymentDetails f213474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f213475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f213476c;
    public final boolean d;
    public final wi0.b e;

    public v(CreditCardPaymentDetails paymentDetails, dj0.d inputAmount, boolean z, boolean z3, wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(paymentDetails, "paymentDetails");
        Intrinsics.checkNotNullParameter(inputAmount, "inputAmount");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f213474a = paymentDetails;
        this.f213475b = inputAmount;
        this.f213476c = z;
        this.d = z3;
        this.e = countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f213474a, vVar.f213474a) && Intrinsics.f(this.f213475b, vVar.f213475b) && this.f213476c == vVar.f213476c && this.d == vVar.d && Intrinsics.f(this.e, vVar.e);
    }

    public final int hashCode() {
        return this.e.f297794a.hashCode() + j6.a.c(j6.a.c(v7.c(this.f213474a.hashCode() * 31, 31, this.f213475b), 31, this.f213476c), 31, this.d);
    }
}
