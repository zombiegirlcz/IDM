package o3k;

import com.revolut.core.model.account.AccountId;
import com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceRouteId;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.amount.RemittanceAmountScreenContract$InputData;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.c {
    public long A;
    public boolean B;
    public /* synthetic */ Object C;
    public final /* synthetic */ g D;
    public int E;
    public RemittanceAmountScreenContract$InputData.NewTransfer u;
    public AccountId v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public xi0.b f221833w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f221834x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f221835y;
    public RemittanceRouteId z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, gim.c cVar) {
        super(cVar);
        this.D = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.C = obj2;
        this.E |= Integer.MIN_VALUE;
        return this.D.c(null, this);
    }
}
