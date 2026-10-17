package f9h;

import com.revolut.feature.wealth.impl.domain.workers.TradingTransactionsCleanUpWorker;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ TradingTransactionsCleanUpWorker v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f132970w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(TradingTransactionsCleanUpWorker tradingTransactionsCleanUpWorker, gim.c cVar) {
        super(cVar);
        this.v = tradingTransactionsCleanUpWorker;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f132970w |= Integer.MIN_VALUE;
        return this.v.a(this);
    }
}
