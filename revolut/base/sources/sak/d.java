package sak;

import com.revolut.feature.apm.core.models.transfers.ApmPaymentMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmPaymentMethod f261443a;

    public d(ApmPaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        this.f261443a = paymentMethod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f261443a, ((d) obj2).f261443a);
    }

    public final int hashCode() {
        return this.f261443a.hashCode();
    }
}
