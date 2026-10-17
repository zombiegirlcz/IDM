package s9f;

import aii.r;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferInSelectedAsset;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferInSelectedAsset f261174a;

    public c(TransferInSelectedAsset selectedAsset) {
        Intrinsics.checkNotNullParameter(selectedAsset, "selectedAsset");
        this.f261174a = selectedAsset;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f261174a, ((c) obj2).f261174a);
    }

    public final int hashCode() {
        return this.f261174a.hashCode();
    }
}
