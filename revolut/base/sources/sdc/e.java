package sdc;

import com.revolut.feature.revolutpay.api.shared.domain.models.PaymentInitiationParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f261849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PaymentInitiationParams f261850b;

    public e(c idempotencyKey, PaymentInitiationParams paymentInitiationParams) {
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        this.f261849a = idempotencyKey;
        this.f261850b = paymentInitiationParams;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f261849a, eVar.f261849a) && Intrinsics.f(this.f261850b, eVar.f261850b);
    }

    public final int hashCode() {
        int iHashCode = this.f261849a.hashCode() * 31;
        PaymentInitiationParams paymentInitiationParams = this.f261850b;
        return iHashCode + (paymentInitiationParams == null ? 0 : paymentInitiationParams.hashCode());
    }
}
