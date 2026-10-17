package pzl;

import com.revolut.utils.job.workers.CreditDynamicFeaturesWorker;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class l extends gim.c {
    public boolean u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CreditDynamicFeaturesWorker f241028w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f241029x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(CreditDynamicFeaturesWorker creditDynamicFeaturesWorker, Continuation continuation) {
        super(continuation);
        this.f241028w = creditDynamicFeaturesWorker;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f241029x |= Integer.MIN_VALUE;
        return this.f241028w.doWork(this);
    }
}
