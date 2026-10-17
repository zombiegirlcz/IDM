package s6f;

import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.c {
    public com.revolut.feature.trading.managed_portfolios.impl.ui.details.flow.a u;
    public TransferSubjectId.Portfolio v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public WealthAccountType f260341w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f260342x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.trading.managed_portfolios.impl.ui.details.flow.a f260343y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.trading.managed_portfolios.impl.ui.details.flow.a aVar, gim.c cVar) {
        super(cVar);
        this.f260343y = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f260342x = obj2;
        this.z |= Integer.MIN_VALUE;
        return com.revolut.feature.trading.managed_portfolios.impl.ui.details.flow.a.I2(this.f260343y, null, this);
    }
}
