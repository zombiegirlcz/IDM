package gxi;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentMethod.Pocket f147748a;

    public e(PaymentMethod.Pocket pocket) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        this.f147748a = pocket;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f147748a, ((e) obj2).f147748a);
    }

    public final int hashCode() {
        return this.f147748a.hashCode();
    }
}
