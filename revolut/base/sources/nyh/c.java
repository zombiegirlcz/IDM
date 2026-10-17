package nyh;

import aii.e;
import com.revolut.feature_crypto_order_flow.api.navigation.FirmPriceDevianceBottomSheetControllerProvider$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FirmPriceDevianceBottomSheetControllerProvider$InputData f220876a;

    public c(FirmPriceDevianceBottomSheetControllerProvider$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f220876a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f220876a, ((c) obj2).f220876a);
    }

    public final int hashCode() {
        return this.f220876a.hashCode();
    }
}
