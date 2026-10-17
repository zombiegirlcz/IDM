package p5a;

import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.feature.transfer.models.transfer.RecipientTrustState;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.c {
    public RecipientTrustState A;
    public PeerToPeerTransferData B;
    public /* synthetic */ Object C;
    public final /* synthetic */ l D;
    public int E;
    public zm3.a u;
    public dj0.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public FundingSource f233066w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public PeerToPeerRecipient f233067x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public hrf.f f233068y;
    public xi0.b z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l lVar, gim.c cVar) {
        super(cVar);
        this.D = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.C = obj2;
        this.E |= Integer.MIN_VALUE;
        return this.D.c(null, null, this);
    }
}
