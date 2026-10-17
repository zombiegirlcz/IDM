package pzl;

import com.revolut.utils.job.workers.WalletsReloadWorker;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class x extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ WalletsReloadWorker v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f241049w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(WalletsReloadWorker walletsReloadWorker, Continuation continuation) {
        super(continuation);
        this.v = walletsReloadWorker;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f241049w |= Integer.MIN_VALUE;
        return this.v.doWork(this);
    }
}
