package nr6;

import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderPayment;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f218534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f218535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AcquiringOrderPayment f218536c;

    public a0(dj0.d amount, String str, AcquiringOrderPayment paymentToRefund) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(paymentToRefund, "paymentToRefund");
        this.f218534a = amount;
        this.f218535b = str;
        this.f218536c = paymentToRefund;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f218534a, a0Var.f218534a) && Intrinsics.f(this.f218535b, a0Var.f218535b) && Intrinsics.f(this.f218536c, a0Var.f218536c);
    }

    public final int hashCode() {
        int iHashCode = this.f218534a.hashCode() * 31;
        String str = this.f218535b;
        return this.f218536c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
