package e4k;

import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends gim.c {
    public boolean A;
    public boolean B;
    public /* synthetic */ Object C;
    public final /* synthetic */ e D;
    public int E;
    public TransferFlowType u;
    public BankTransferData v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Set f122572w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Set f122573x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f122574y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, gim.c cVar) {
        super(cVar);
        this.D = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.C = obj2;
        this.E |= Integer.MIN_VALUE;
        return this.D.a(null, null, null, null, false, this);
    }
}
