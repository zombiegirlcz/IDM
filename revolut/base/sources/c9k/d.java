package c9k;

import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.PeerToPeerAmountScreenContract$InputData;
import tof.a3;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.c {
    public final /* synthetic */ l A;
    public int B;
    public PeerToPeerAmountScreenContract$InputData.NewTransfer u;
    public xi0.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public a3 f22484w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f22485x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TransferMoneyPocket f22486y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l lVar, gim.c cVar) {
        super(cVar);
        this.A = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.b(null, this);
    }
}
