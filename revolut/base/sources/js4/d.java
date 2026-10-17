package js4;

import com.revolut.feature.credit.card.api.models.instalment.CreditCardInstalmentChangeTermQuote;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardInstalmentChangeTermQuote f178121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditCardInstalmentChangeTermQuote.UpdatedInstalment f178122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f178123c;
    public final wi0.b d;
    public final int e;

    public d(CreditCardInstalmentChangeTermQuote quote, CreditCardInstalmentChangeTermQuote.UpdatedInstalment selectedInstalment, dj0.d principalAmount, wi0.b countryCode, int i) {
        Intrinsics.checkNotNullParameter(quote, "quote");
        Intrinsics.checkNotNullParameter(selectedInstalment, "selectedInstalment");
        Intrinsics.checkNotNullParameter(principalAmount, "principalAmount");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f178121a = quote;
        this.f178122b = selectedInstalment;
        this.f178123c = principalAmount;
        this.d = countryCode;
        this.e = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f178121a, dVar.f178121a) && Intrinsics.f(this.f178122b, dVar.f178122b) && Intrinsics.f(this.f178123c, dVar.f178123c) && Intrinsics.f(this.d, dVar.d) && this.e == dVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + p.a.c(v7.c((this.f178122b.hashCode() + (this.f178121a.hashCode() * 31)) * 31, 31, this.f178123c), 31, this.d.f297794a);
    }
}
