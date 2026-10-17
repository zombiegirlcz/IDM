package l9k;

import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PeerToPeerRecipient f193276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PeerToPeerTransferData f193277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f193278c;
    public final qv0.i d;
    public final List e;

    public i(PeerToPeerRecipient recipient, PeerToPeerTransferData transferData, j jVar, qv0.i iVar, List transferSectionData) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        Intrinsics.checkNotNullParameter(transferSectionData, "transferSectionData");
        this.f193276a = recipient;
        this.f193277b = transferData;
        this.f193278c = jVar;
        this.d = iVar;
        this.e = transferSectionData;
    }

    public static i a(i iVar, PeerToPeerTransferData peerToPeerTransferData, j jVar, qv0.i iVar2, List list, int i) {
        PeerToPeerTransferData transferData = peerToPeerTransferData;
        PeerToPeerRecipient recipient = iVar.f193276a;
        if ((i & 2) != 0) {
            transferData = iVar.f193277b;
        }
        if ((i & 4) != 0) {
            jVar = iVar.f193278c;
        }
        if ((i & 8) != 0) {
            iVar2 = iVar.d;
        }
        if ((i & 16) != 0) {
            list = iVar.e;
        }
        List transferSectionData = list;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        Intrinsics.checkNotNullParameter(transferSectionData, "transferSectionData");
        qv0.i iVar3 = iVar2;
        return new i(recipient, transferData, jVar, iVar3, transferSectionData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f193276a, iVar.f193276a) && Intrinsics.f(this.f193277b, iVar.f193277b) && Intrinsics.f(this.f193278c, iVar.f193278c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f193277b.hashCode() + (this.f193276a.hashCode() * 31)) * 31;
        j jVar = this.f193278c;
        int iHashCode2 = (iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        qv0.i iVar = this.d;
        return this.e.hashCode() + ((iHashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 31);
    }
}
