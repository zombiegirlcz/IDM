package b9k;

import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;

/* JADX INFO: loaded from: classes11.dex */
public final class p extends gim.c {
    public PeerToPeerRecipient u;
    public hrf.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f13842w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ t f13843x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f13844y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(t tVar, gim.c cVar) {
        super(cVar);
        this.f13843x = tVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f13842w = obj2;
        this.f13844y |= Integer.MIN_VALUE;
        return this.f13843x.b(null, null, null, this);
    }
}
