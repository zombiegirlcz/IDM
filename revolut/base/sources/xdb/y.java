package xdb;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentMethod.Pocket f304415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f304416b;

    public y(PaymentMethod.Pocket pocket, boolean z) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        this.f304415a = pocket;
        this.f304416b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f304415a, yVar.f304415a) && this.f304416b == yVar.f304416b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f304416b) + (this.f304415a.hashCode() * 31);
    }
}
