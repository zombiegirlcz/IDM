package pzl;

import com.revolut.utils.job.workers.ProductAccountMigrationWorker;

/* JADX INFO: loaded from: classes12.dex */
public final class u extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ ProductAccountMigrationWorker v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f241044w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ProductAccountMigrationWorker productAccountMigrationWorker, gim.c cVar) {
        super(cVar);
        this.v = productAccountMigrationWorker;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f241044w |= Integer.MIN_VALUE;
        return ProductAccountMigrationWorker.a(this.v, this);
    }
}
