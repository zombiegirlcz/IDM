package hub;

import com.revolut.feature.rev_points.api.navigation.descriptor.RevPointsPersonalisationTargetingOnboardingController$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsPersonalisationTargetingOnboardingController$InputData f155601a;

    public e(RevPointsPersonalisationTargetingOnboardingController$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f155601a = inputData;
    }

    public final RevPointsPersonalisationTargetingOnboardingController$InputData b() {
        return this.f155601a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f155601a, ((e) obj2).f155601a);
    }

    public final int hashCode() {
        return this.f155601a.f83545a.hashCode();
    }
}
