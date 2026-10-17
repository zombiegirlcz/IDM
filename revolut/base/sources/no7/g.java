package no7;

import com.revolut.feature.insurance_car.impl.data.model.InsurableCar;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InsurableCar f217936a;

    public g(InsurableCar car) {
        Intrinsics.checkNotNullParameter(car, "car");
        this.f217936a = car;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f217936a, ((g) obj2).f217936a);
    }

    public final int hashCode() {
        return this.f217936a.hashCode();
    }
}
