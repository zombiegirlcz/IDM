package k3k;

import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.c {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ i C;
    public int D;
    public TransferFlowType u;
    public RemittanceTransferData v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Set f180750w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FundingSource f180751x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f180752y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, gim.c cVar) {
        super(cVar);
        this.C = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.B = obj2;
        this.D |= Integer.MIN_VALUE;
        return this.C.a(null, null, null, false, this);
    }
}
