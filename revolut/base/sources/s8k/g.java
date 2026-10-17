package s8k;

import com.revolut.domain.models.transfers.PeerToPeerTransferDescriptor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f261064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PeerToPeerTransferDescriptor f261065b;

    public g(dj0.d money, PeerToPeerTransferDescriptor transferDescriptor) {
        Intrinsics.checkNotNullParameter(money, "money");
        Intrinsics.checkNotNullParameter(transferDescriptor, "transferDescriptor");
        this.f261064a = money;
        this.f261065b = transferDescriptor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f261064a, gVar.f261064a) && Intrinsics.f(this.f261065b, gVar.f261065b);
    }

    public final int hashCode() {
        return this.f261065b.hashCode() + (this.f261064a.hashCode() * 31);
    }
}
