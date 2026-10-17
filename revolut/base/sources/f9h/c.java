package f9h;

import com.revolut.feature.wealth.impl.domain.workers.TradingTransactionsCleanUpWorker;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.c {
    public Boolean u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TradingTransactionsCleanUpWorker f132971w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f132972x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TradingTransactionsCleanUpWorker tradingTransactionsCleanUpWorker, Continuation continuation) {
        super(continuation);
        this.f132971w = tradingTransactionsCleanUpWorker;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f132972x |= Integer.MIN_VALUE;
        return this.f132971w.doWork(this);
    }
}
