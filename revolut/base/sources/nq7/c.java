package nq7;

import com.revolut.feature.insurance_car.impl.data.model.FailedPaymentDetails;
import com.revolut.feature.insurance_car.impl.data.model.InsurableCar;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InsurableCar f218371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FailedPaymentDetails f218372b;

    public c(InsurableCar car, FailedPaymentDetails failedPaymentDetails) {
        Intrinsics.checkNotNullParameter(car, "car");
        Intrinsics.checkNotNullParameter(failedPaymentDetails, "failedPaymentDetails");
        this.f218371a = car;
        this.f218372b = failedPaymentDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f218371a, cVar.f218371a) && Intrinsics.f(this.f218372b, cVar.f218372b);
    }

    public final int hashCode() {
        return this.f218372b.hashCode() + (this.f218371a.hashCode() * 31);
    }
}
