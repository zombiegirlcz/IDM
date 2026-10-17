package ro7;

import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.manual_input.CarManualInputScreenContract$ManualCarInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CarManualInputScreenContract$ManualCarInfo f255919a;

    public g(CarManualInputScreenContract$ManualCarInfo car) {
        Intrinsics.checkNotNullParameter(car, "car");
        this.f255919a = car;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f255919a, ((g) obj2).f255919a);
    }

    public final int hashCode() {
        return this.f255919a.hashCode();
    }
}
