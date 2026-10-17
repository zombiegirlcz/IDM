package o9k;

import com.revolut.domain.models.transfers.PeerToPeerTransferDescriptor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class v extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PeerToPeerTransferDescriptor f223371a;

    public v(PeerToPeerTransferDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f223371a = descriptor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && Intrinsics.f(this.f223371a, ((v) obj2).f223371a);
    }

    public final int hashCode() {
        return this.f223371a.hashCode();
    }
}
