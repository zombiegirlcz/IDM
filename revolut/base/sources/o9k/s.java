package o9k;

import com.revolut.domain.models.transfers.PeerToPeerTransferDescriptor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class s extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PeerToPeerTransferDescriptor f223357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q9k.a f223358b;

    public s(PeerToPeerTransferDescriptor descriptor, q9k.a juniorWithPockets) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(juniorWithPockets, "juniorWithPockets");
        this.f223357a = descriptor;
        this.f223358b = juniorWithPockets;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f223357a, sVar.f223357a) && Intrinsics.f(this.f223358b, sVar.f223358b);
    }

    public final int hashCode() {
        return this.f223358b.hashCode() + (this.f223357a.hashCode() * 31);
    }
}
