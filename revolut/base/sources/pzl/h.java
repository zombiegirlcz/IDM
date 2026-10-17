package pzl;

import com.revolut.utils.job.workers.CreditApplicationReloadWorker;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ CreditApplicationReloadWorker v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f241023w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(CreditApplicationReloadWorker creditApplicationReloadWorker, Continuation continuation) {
        super(continuation);
        this.v = creditApplicationReloadWorker;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f241023w |= Integer.MIN_VALUE;
        return this.v.doWork(this);
    }
}
