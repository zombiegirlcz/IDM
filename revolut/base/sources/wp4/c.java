package wp4;

import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardAutopayPayment.AutoPayment f299038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f299039b;

    public c(CreditCardAutopayPayment.AutoPayment payment, wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(payment, "payment");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f299038a = payment;
        this.f299039b = countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f299038a, cVar.f299038a) && Intrinsics.f(this.f299039b, cVar.f299039b);
    }

    @Override // wp4.e
    public final wi0.b getCountryCode() {
        return this.f299039b;
    }

    public final int hashCode() {
        return this.f299039b.f297794a.hashCode() + (this.f299038a.hashCode() * 31);
    }
}
