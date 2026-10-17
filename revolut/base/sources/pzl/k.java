package pzl;

import com.revolut.utils.job.workers.CreditCardProductsWorker;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class k extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ CreditCardProductsWorker v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f241027w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(CreditCardProductsWorker creditCardProductsWorker, Continuation continuation) {
        super(continuation);
        this.v = creditCardProductsWorker;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f241027w |= Integer.MIN_VALUE;
        return this.v.doWork(this);
    }
}
