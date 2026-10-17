package b9k;

import com.revolut.feature.transfer.models.transfer.RecipientTrustState;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;

/* JADX INFO: loaded from: classes11.dex */
public final class s extends gim.c {
    public PeerToPeerRecipient u;
    public hrf.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public RecipientTrustState f13847w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f13848x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ t f13849y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, gim.c cVar) {
        super(cVar);
        this.f13849y = tVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f13848x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f13849y.e(null, null, this);
    }
}
