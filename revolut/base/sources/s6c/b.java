package s6c;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.Quote;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Quote f260215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f260216b;

    public b(Quote quote, dj0.d totalInRequestedCurrency) {
        Intrinsics.checkNotNullParameter(quote, "quote");
        Intrinsics.checkNotNullParameter(totalInRequestedCurrency, "totalInRequestedCurrency");
        this.f260215a = quote;
        this.f260216b = totalInRequestedCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f260215a, bVar.f260215a) && Intrinsics.f(this.f260216b, bVar.f260216b);
    }

    public final int hashCode() {
        return this.f260216b.hashCode() + (this.f260215a.hashCode() * 31);
    }
}
