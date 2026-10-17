package bsa;

import com.revolut.feature.push_to_card.impl.ui.amount.PushToCardTransferAmountScreenContract$InputData;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import opf.z;
import tof.a3;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.c {
    public final /* synthetic */ i A;
    public int B;
    public PushToCardTransferAmountScreenContract$InputData.NewTransfer u;
    public a3 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public dj0.d f18146w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public z f18147x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TransferMoneyPocket f18148y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, gim.c cVar) {
        super(cVar);
        this.A = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.b(null, this);
    }
}
