package e3j;

import com.revolut.retail.feature.beneficiary.api.domain.PaymentCode;
import kotlin.jvm.internal.Intrinsics;
import xo9.h;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentCode f122331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f122332b;

    public d(PaymentCode paymentCode, String rawCode) {
        Intrinsics.checkNotNullParameter(paymentCode, "paymentCode");
        Intrinsics.checkNotNullParameter(rawCode, "rawCode");
        this.f122331a = paymentCode;
        this.f122332b = rawCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f122331a, dVar.f122331a) && Intrinsics.f(this.f122332b, dVar.f122332b);
    }

    public final int hashCode() {
        return this.f122332b.hashCode() + (this.f122331a.hashCode() * 31);
    }
}
