package t9k;

import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PeerToPeerRecipient f269050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f269051b;

    public d(PeerToPeerRecipient recipient, long j2) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        this.f269050a = recipient;
        this.f269051b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f269050a, dVar.f269050a) && this.f269051b == dVar.f269051b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f269051b) + (this.f269050a.hashCode() * 31);
    }
}
