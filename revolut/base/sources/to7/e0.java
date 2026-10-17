package to7;

import com.revolut.feature.insurance_car.impl.data.model.CarVariation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e0 implements y7a.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CarVariation f272524a;

    public e0(CarVariation variation) {
        Intrinsics.checkNotNullParameter(variation, "variation");
        this.f272524a = variation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e0) && Intrinsics.f(this.f272524a, ((e0) obj2).f272524a);
    }

    public final int hashCode() {
        return this.f272524a.hashCode();
    }
}
