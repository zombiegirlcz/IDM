package uvb;

import com.revolut.feature.rev_points.giftcards.api.navigation.descriptor.RevPointsGiftcardsPurchaseController$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsGiftcardsPurchaseController$InputData f283352a;

    public i(RevPointsGiftcardsPurchaseController$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f283352a = inputData;
    }

    public final RevPointsGiftcardsPurchaseController$InputData b() {
        return this.f283352a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f283352a, ((i) obj2).f283352a);
    }

    public final int hashCode() {
        return this.f283352a.f83671a.hashCode();
    }
}
