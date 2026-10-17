package nyh;

import aii.e;
import com.revolut.feature_crypto_order_flow.api.navigation.AccountBalanceLimitBottomSheetControllerProvider$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountBalanceLimitBottomSheetControllerProvider$InputData f220874a;

    public a(AccountBalanceLimitBottomSheetControllerProvider$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f220874a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f220874a, ((a) obj2).f220874a);
    }

    public final int hashCode() {
        return this.f220874a.f96712a.hashCode();
    }
}
