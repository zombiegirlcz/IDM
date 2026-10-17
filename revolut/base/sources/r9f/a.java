package r9f;

import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferBroker;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferInSelectedAsset;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferBroker f252597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferInSelectedAsset f252598b;

    public a(TransferBroker transferBroker, TransferInSelectedAsset selectedAsset) {
        Intrinsics.checkNotNullParameter(transferBroker, "transferBroker");
        Intrinsics.checkNotNullParameter(selectedAsset, "selectedAsset");
        this.f252597a = transferBroker;
        this.f252598b = selectedAsset;
    }

    public final TransferInSelectedAsset b() {
        return this.f252598b;
    }

    public final TransferBroker c() {
        return this.f252597a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f252597a, aVar.f252597a) && Intrinsics.f(this.f252598b, aVar.f252598b);
    }

    public final int hashCode() {
        return this.f252598b.hashCode() + (this.f252597a.hashCode() * 31);
    }
}
