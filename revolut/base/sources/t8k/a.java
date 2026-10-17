package t8k;

import com.revolut.feature.transfer.models.quotes.TransferQuoteUserIdentifier;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import hx7.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zm3.e;
import zm3.f;
import zm3.l;
import zm3.n;
import zm3.o;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a {
    public static final String a(PeerToPeerRecipient peerToPeerRecipient) {
        Intrinsics.checkNotNullParameter(peerToPeerRecipient, "<this>");
        zm3.a aVar = peerToPeerRecipient.f102270a;
        l lVar = aVar instanceof l ? (l) aVar : null;
        if (lVar != null) {
            return lVar.getCode();
        }
        return null;
    }

    public static final TransferQuoteUserIdentifier b(PeerToPeerRecipient peerToPeerRecipient) {
        Intrinsics.checkNotNullParameter(peerToPeerRecipient, "<this>");
        zm3.a aVar = peerToPeerRecipient.f102270a;
        if (aVar instanceof l) {
            return new TransferQuoteUserIdentifier.Code(((l) aVar).getCode());
        }
        if (aVar instanceof f) {
            return new TransferQuoteUserIdentifier.Phone(((f) aVar).f323345a);
        }
        if (aVar instanceof e) {
            return new TransferQuoteUserIdentifier.Email(((e) aVar).f323340a);
        }
        if (aVar instanceof o) {
            return new TransferQuoteUserIdentifier.Phone(((o) aVar).f323376a);
        }
        if (aVar instanceof n) {
            return new TransferQuoteUserIdentifier.Email(((n) aVar).f323373a);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String c(PeerToPeerRecipient peerToPeerRecipient) {
        Intrinsics.checkNotNullParameter(peerToPeerRecipient, "<this>");
        zm3.a aVar = peerToPeerRecipient.f102270a;
        l lVar = aVar instanceof l ? (l) aVar : null;
        if (lVar != null) {
            return lVar.N0();
        }
        return null;
    }

    public static final Boolean d(PeerToPeerRecipient peerToPeerRecipient) {
        Intrinsics.checkNotNullParameter(peerToPeerRecipient, "<this>");
        zm3.a aVar = peerToPeerRecipient.f102270a;
        l lVar = aVar instanceof l ? (l) aVar : null;
        if (lVar != null) {
            return Boolean.valueOf(q.K(lVar));
        }
        return null;
    }

    public static final boolean e(PeerToPeerRecipient peerToPeerRecipient) {
        Intrinsics.checkNotNullParameter(peerToPeerRecipient, "<this>");
        zm3.a aVar = peerToPeerRecipient.f102270a;
        l lVar = aVar instanceof l ? (l) aVar : null;
        if (lVar != null) {
            return q.N(lVar);
        }
        return false;
    }

    public static final String f(PeerToPeerRecipient peerToPeerRecipient) {
        Intrinsics.checkNotNullParameter(peerToPeerRecipient, "<this>");
        return q.v(peerToPeerRecipient.f102270a);
    }
}
