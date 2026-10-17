package c3k;

import aii.r;
import com.revolut.feature.bank_transfer.models.PaymentVendor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentVendor f20957a;

    public d(PaymentVendor paymentVendor) {
        Intrinsics.checkNotNullParameter(paymentVendor, "paymentVendor");
        this.f20957a = paymentVendor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f20957a, ((d) obj2).f20957a);
    }

    public final int hashCode() {
        return this.f20957a.hashCode();
    }
}
