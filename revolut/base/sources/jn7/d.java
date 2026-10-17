package jn7;

import com.revolut.feature.insurance_car.impl.data.model.Benefit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Benefit f176652a;

    public d(Benefit benefit) {
        Intrinsics.checkNotNullParameter(benefit, "benefit");
        this.f176652a = benefit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f176652a, ((d) obj2).f176652a);
    }

    public final int hashCode() {
        return this.f176652a.hashCode();
    }
}
