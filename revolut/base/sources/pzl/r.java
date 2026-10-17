package pzl;

import com.revolut.utils.job.workers.ProductAccountMigrationWorker;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class r extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ ProductAccountMigrationWorker v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f241038w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ProductAccountMigrationWorker productAccountMigrationWorker, Continuation continuation) {
        super(continuation);
        this.v = productAccountMigrationWorker;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f241038w |= Integer.MIN_VALUE;
        return this.v.doWork(this);
    }
}
