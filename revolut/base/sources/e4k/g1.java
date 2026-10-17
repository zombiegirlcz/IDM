package e4k;

import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;

/* JADX INFO: loaded from: classes11.dex */
public final class g1 extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a B;
    public int C;
    public yji.l u;
    public com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public e f122598w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TransferFlowType f122599x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public BankTransferData f122600y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a aVar, gim.c cVar) {
        super(cVar);
        this.B = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a.z2(this.B, this);
    }
}
