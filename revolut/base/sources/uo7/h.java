package uo7;

import com.revolut.feature.insurance_car.impl.data.model.InsurableCar;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InsurableCar f281576a;

    public h(InsurableCar car) {
        Intrinsics.checkNotNullParameter(car, "car");
        this.f281576a = car;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f281576a, ((h) obj2).f281576a);
    }

    public final int hashCode() {
        return this.f281576a.hashCode();
    }
}
