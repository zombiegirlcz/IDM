package og5;

import aii.e;
import com.revolut.feature.crypto.gift.asset.api.navigation.CryptoGiftAssetTransferInfoInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoGiftAssetTransferInfoInputData f225032a;

    public a(CryptoGiftAssetTransferInfoInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f225032a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f225032a, ((a) obj2).f225032a);
    }

    public final int hashCode() {
        return this.f225032a.hashCode();
    }
}
