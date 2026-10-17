package e4k;

import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.c {
    public boolean A;
    public /* synthetic */ Object B;
    public final /* synthetic */ e C;
    public int D;
    public TransferFlowType u;
    public BankTransferData v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Set f122579w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public aim.o f122580x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public aim.o f122581y;
    public aim.o z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, gim.c cVar) {
        super(cVar);
        this.C = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.B = obj2;
        this.D |= Integer.MIN_VALUE;
        return this.C.b(null, null, false, null, this);
    }
}
