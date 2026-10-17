package j9k;

import com.revolut.feature.transfer.models.transfer.RecipientTrustState;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;

/* JADX INFO: loaded from: classes11.dex */
public final class x extends gim.c {
    public PeerToPeerRecipient u;
    public hrf.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public RecipientTrustState f172392w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f172393x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ z f172394y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(z zVar, gim.c cVar) {
        super(cVar);
        this.f172394y = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f172393x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f172394y.b(null, null, this);
    }
}
