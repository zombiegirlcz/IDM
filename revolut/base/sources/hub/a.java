package hub;

import com.revolut.feature.rev_points.api.navigation.descriptor.LifestyleRevPointsOptInController$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LifestyleRevPointsOptInController$InputData f155597a;

    public a(LifestyleRevPointsOptInController$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f155597a = inputData;
    }

    public final LifestyleRevPointsOptInController$InputData b() {
        return this.f155597a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f155597a, ((a) obj2).f155597a);
    }

    public final int hashCode() {
        return this.f155597a.hashCode();
    }
}
