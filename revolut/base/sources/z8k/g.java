package z8k;

import com.revolut.feature.transfer.core.models.CurrencyFilteringPolicy;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.retail.feature.balance.picker.api.models.SupportedTargetCurrencies;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.c {
    public SupportedTargetCurrencies.Unordered A;
    public CurrencyFilteringPolicy B;
    public /* synthetic */ Object C;
    public final /* synthetic */ com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.a D;
    public int E;
    public PeerToPeerRecipient u;
    public hrf.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TransferFlowType.Pro f320175w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f320176x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public xi0.b f320177y;
    public io3.l z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.a aVar, gim.c cVar) {
        super(cVar);
        this.D = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.C = obj2;
        this.E |= Integer.MIN_VALUE;
        return this.D.d(null, null, null, null, this);
    }
}
