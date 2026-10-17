package ln7;

import com.revolut.feature.insurance_car.impl.data.model.Benefit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Benefit f197111a;

    public d(Benefit benefit) {
        Intrinsics.checkNotNullParameter(benefit, "benefit");
        this.f197111a = benefit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f197111a, ((d) obj2).f197111a);
    }

    public final int hashCode() {
        return this.f197111a.hashCode();
    }
}
