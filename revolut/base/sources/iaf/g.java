package iaf;

import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferInSelectedAsset;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferInSelectedAsset f160000a;

    public g(TransferInSelectedAsset selectedAsset) {
        Intrinsics.checkNotNullParameter(selectedAsset, "selectedAsset");
        this.f160000a = selectedAsset;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f160000a, ((g) obj2).f160000a);
    }

    public final int hashCode() {
        return this.f160000a.hashCode();
    }
}
