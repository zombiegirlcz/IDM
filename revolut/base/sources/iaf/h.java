package iaf;

import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferInSelectedAsset;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferInSelectedAsset f160001a;

    public h(TransferInSelectedAsset selectedAsset) {
        Intrinsics.checkNotNullParameter(selectedAsset, "selectedAsset");
        this.f160001a = selectedAsset;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f160001a, ((h) obj2).f160001a);
    }

    public final int hashCode() {
        return this.f160001a.hashCode();
    }
}
