package y7k;

import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OrderQuote f311571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f311572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f311573c;
    public final List d;
    public final hrf.h e;
    public final PaymentPocketInfo f;

    public s(OrderQuote orderQuote, long j2, boolean z, List suggestions, hrf.h errorState, PaymentPocketInfo paymentPocketInfo) {
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        Intrinsics.checkNotNullParameter(errorState, "errorState");
        this.f311571a = orderQuote;
        this.f311572b = j2;
        this.f311573c = z;
        this.d = suggestions;
        this.e = errorState;
        this.f = paymentPocketInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f311571a, sVar.f311571a) && this.f311572b == sVar.f311572b && this.f311573c == sVar.f311573c && Intrinsics.f(this.d, sVar.d) && this.e.equals(sVar.e) && Intrinsics.f(this.f, sVar.f);
    }

    public final int hashCode() {
        OrderQuote orderQuote = this.f311571a;
        int iHashCode = (this.e.hashCode() + p.a.d(j6.a.c(a0.d.c((orderQuote == null ? 0 : orderQuote.hashCode()) * 31, 31, this.f311572b), 31, this.f311573c), 31, this.d)) * 31;
        PaymentPocketInfo paymentPocketInfo = this.f;
        return iHashCode + (paymentPocketInfo != null ? paymentPocketInfo.hashCode() : 0);
    }
}
