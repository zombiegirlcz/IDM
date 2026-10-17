package uvb;

import com.revolut.feature.rev_points.giftcards.api.navigation.descriptor.RevPointsGiftcardsCheckoutController$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsGiftcardsCheckoutController$InputData f283346a;

    public a(RevPointsGiftcardsCheckoutController$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f283346a = inputData;
    }

    public final RevPointsGiftcardsCheckoutController$InputData b() {
        return this.f283346a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f283346a, ((a) obj2).f283346a);
    }

    public final int hashCode() {
        return this.f283346a.hashCode();
    }
}
