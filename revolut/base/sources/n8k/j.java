package n8k;

import com.revolut.domain.models.transfers.PeerToPeerTransferDescriptor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PeerToPeerTransferDescriptor.Link f213513a;

    public j(PeerToPeerTransferDescriptor.Link descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f213513a = descriptor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && this.f213513a.equals(((j) obj2).f213513a);
    }

    public final int hashCode() {
        return this.f213513a.hashCode();
    }
}
