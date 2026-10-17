package c9k;

import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.PeerToPeerAmountScreenContract$InputData;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends gim.c {
    public final /* synthetic */ l A;
    public int B;
    public PeerToPeerAmountScreenContract$InputData.NewTransfer u;
    public dj0.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public FundingSource f22493w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public xi0.b f22494x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f22495y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, gim.c cVar) {
        super(cVar);
        this.A = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.g(null, null, null, this);
    }
}
