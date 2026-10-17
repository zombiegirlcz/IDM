package iaf;

import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferInSelectedAsset;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferInSelectedAsset f159999a;

    public f(TransferInSelectedAsset selectedAsset) {
        Intrinsics.checkNotNullParameter(selectedAsset, "selectedAsset");
        this.f159999a = selectedAsset;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f159999a, ((f) obj2).f159999a);
    }

    public final int hashCode() {
        return this.f159999a.hashCode();
    }
}
