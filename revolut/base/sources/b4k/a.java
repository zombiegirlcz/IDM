package b4k;

import com.revolut.feature.bank_transfer.models.PaymentVendor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentVendor f12416a;

    public a(PaymentVendor vendor) {
        Intrinsics.checkNotNullParameter(vendor, "vendor");
        this.f12416a = vendor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f12416a, ((a) obj2).f12416a);
    }

    public final int hashCode() {
        return this.f12416a.hashCode();
    }
}
