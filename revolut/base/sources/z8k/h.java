package z8k;

import com.revolut.feature.transfer.core.models.CurrencyFilteringPolicy;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.retail.feature.balance.picker.api.models.SupportedTargetCurrencies;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends gim.c {
    public xi0.b A;
    public io3.l B;
    public SupportedTargetCurrencies.Unordered C;
    public CurrencyFilteringPolicy D;
    public int E;
    public int F;
    public int G;
    public int H;
    public boolean I;
    public /* synthetic */ Object J;
    public final /* synthetic */ com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.a K;
    public int L;
    public PeerToPeerTransferData u;
    public PeerToPeerRecipient v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public hrf.f f320179w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TransferFlowType f320180x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Set f320181y;
    public String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.a aVar, gim.c cVar) {
        super(cVar);
        this.K = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.J = obj2;
        this.L |= Integer.MIN_VALUE;
        return this.K.e(null, null, this);
    }
}
