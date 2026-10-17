package kp7;

import com.revolut.feature.insurance_car.impl.data.model.Benefit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Benefit f188181a;

    public k(Benefit benefit) {
        Intrinsics.checkNotNullParameter(benefit, "benefit");
        this.f188181a = benefit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f188181a, ((k) obj2).f188181a);
    }

    public final int hashCode() {
        return this.f188181a.hashCode();
    }
}
