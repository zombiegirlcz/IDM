package km7;

import aii.r;
import com.revolut.feature.insurance_car.impl.data.model.InsurableCar;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InsurableCar f185731a;

    public c(InsurableCar car) {
        Intrinsics.checkNotNullParameter(car, "car");
        this.f185731a = car;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f185731a, ((c) obj2).f185731a);
    }

    public final int hashCode() {
        return this.f185731a.hashCode();
    }
}
