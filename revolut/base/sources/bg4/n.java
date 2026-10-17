package bg4;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.Quote;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Quote f15109a;

    public n(Quote quote) {
        Intrinsics.checkNotNullParameter(quote, "quote");
        this.f15109a = quote;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f15109a, ((n) obj2).f15109a);
    }

    public final int hashCode() {
        return this.f15109a.hashCode();
    }
}
