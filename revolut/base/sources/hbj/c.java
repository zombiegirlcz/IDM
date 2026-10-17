package hbj;

import aii.e;
import com.revolut.retail.feature.crypto_deposits.api.navigation.CryptoDepositReturnDetailsBottomSheetControllerInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoDepositReturnDetailsBottomSheetControllerInputData f150754a;

    public c(CryptoDepositReturnDetailsBottomSheetControllerInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f150754a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f150754a, ((c) obj2).f150754a);
    }

    public final int hashCode() {
        return this.f150754a.f100049a.hashCode();
    }
}
