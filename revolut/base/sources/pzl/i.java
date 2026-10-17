package pzl;

import com.revolut.utils.job.workers.CreditApplicationStopDataMonitoringWorker;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class i extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ CreditApplicationStopDataMonitoringWorker v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f241024w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(CreditApplicationStopDataMonitoringWorker creditApplicationStopDataMonitoringWorker, Continuation continuation) {
        super(continuation);
        this.v = creditApplicationStopDataMonitoringWorker;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f241024w |= Integer.MIN_VALUE;
        return this.v.doWork(this);
    }
}
