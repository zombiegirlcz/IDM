package com.revolut.utils.job.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import cm2.g;
import hj8.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qfe.d;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0002\u0013\u0014B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/revolut/utils/job/workers/ProductAccountMigrationWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lhj8/a;", "juniorProfileInteractor", "Losg/a;", "newWalletsInteractor", "Lpa7/a;", "hiddenAccountsInteractor", "Lqfe/d;", "productAccountMigrator", "Lcm2/g;", "backgroundsMigrator", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lhj8/a;Losg/a;Lpa7/a;Lqfe/d;Lcm2/g;)V", "Companion", "pzl/q", "a", "app_retail_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProductAccountMigrationWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f107360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final osg.a f107361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pa7.a f107362c;
    public final d d;
    public final g e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductAccountMigrationWorker(@NotNull Context context, @NotNull WorkerParameters workerParams, @NotNull a juniorProfileInteractor, @NotNull osg.a newWalletsInteractor, @NotNull pa7.a hiddenAccountsInteractor, @NotNull d productAccountMigrator, @NotNull g backgroundsMigrator) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(newWalletsInteractor, "newWalletsInteractor");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        Intrinsics.checkNotNullParameter(productAccountMigrator, "productAccountMigrator");
        Intrinsics.checkNotNullParameter(backgroundsMigrator, "backgroundsMigrator");
        this.f107360a = juniorProfileInteractor;
        this.f107361b = newWalletsInteractor;
        this.f107362c = hiddenAccountsInteractor;
        this.d = productAccountMigrator;
        this.e = backgroundsMigrator;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.revolut.utils.job.workers.ProductAccountMigrationWorker r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof pzl.u
            if (r0 == 0) goto L13
            r0 = r6
            pzl.u r0 = (pzl.u) r0
            int r1 = r0.f241044w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f241044w = r1
            goto L18
        L13:
            pzl.u r0 = new pzl.u
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f241044w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L55
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            hj8.a r6 = r5.f107360a
            r2 = 0
            nj8.n r6 = (nj8.n) r6
            w4l.h r4 = w4l.h.f294642c
            wkm.l r6 = r6.k(r2, r4)
            pth.l r2 = new pth.l
            r4 = 27
            r2.<init>(r5, r4)
            kotlinx.coroutines.flow.Flow r5 = boh.f.e(r6, r2)
            zfd.e r5 = zi0.c.w(r5)
            r0.f241044w = r3
            java.lang.Object r6 = vkm.q.x(r5, r0)
            if (r6 != r1) goto L55
            return r1
        L55:
            com.revolut.data.model.Data r6 = (com.revolut.data.model.Data) r6
            java.lang.Object r5 = r6.getContent()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.utils.job.workers.ProductAccountMigrationWorker.a(com.revolut.utils.job.workers.ProductAccountMigrationWorker, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof pzl.r
            if (r0 == 0) goto L13
            r0 = r5
            pzl.r r0 = (pzl.r) r0
            int r1 = r0.f241038w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f241038w = r1
            goto L18
        L13:
            pzl.r r0 = new pzl.r
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f241038w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            pzl.t r5 = new pzl.t
            r2 = 0
            r5.<init>(r4, r2)
            r0.f241038w = r3
            java.lang.Object r5 = skm.e0.o(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            java.lang.String r0 = "coroutineScope(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.utils.job.workers.ProductAccountMigrationWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
