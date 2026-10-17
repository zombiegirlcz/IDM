package com.revolut.utils.job.workers;

import al4.q;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0002\u000b\fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/revolut/utils/job/workers/CreditCardProductsWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lal4/q;", "creditInteractor", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lal4/q;)V", "Companion", "br/b", "a", "app_retail_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardProductsWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkerParameters f107347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f107348b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditCardProductsWorker(@NotNull Context context, @NotNull WorkerParameters workerParams, @NotNull q creditInteractor) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        Intrinsics.checkNotNullParameter(creditInteractor, "creditInteractor");
        this.f107347a = workerParams;
        this.f107348b = creditInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof pzl.k
            if (r0 == 0) goto L13
            r0 = r6
            pzl.k r0 = (pzl.k) r0
            int r1 = r0.f241027w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f241027w = r1
            goto L18
        L13:
            pzl.k r0 = new pzl.k
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f241027w
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r6)
            yhm.m r6 = (yhm.m) r6
            java.lang.Object r6 = r6.f314193a
            goto L59
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            yhm.o.b(r6)
            androidx.work.WorkerParameters r6 = r5.f107347a
            androidx.work.Data r6 = r6.getInputData()
            java.lang.String r2 = "facility_id.extra"
            java.lang.String r6 = r6.getString(r2)
            int r2 = r5.getRunAttemptCount()
            r4 = 3
            if (r2 > r4) goto L6f
            if (r6 != 0) goto L4c
            goto L6f
        L4c:
            r0.f241027w = r3
            al4.q r2 = r5.f107348b
            om4.y3 r2 = (om4.y3) r2
            java.lang.Object r6 = r2.j(r6, r0)
            if (r6 != r1) goto L59
            return r1
        L59:
            yhm.m$a r0 = yhm.m.INSTANCE
            boolean r6 = r6 instanceof yhm.n
            if (r6 != 0) goto L67
            androidx.work.ListenableWorker$Result r6 = androidx.work.ListenableWorker.Result.success()
            kotlin.jvm.internal.Intrinsics.h(r6)
            return r6
        L67:
            androidx.work.ListenableWorker$Result r6 = androidx.work.ListenableWorker.Result.retry()
            kotlin.jvm.internal.Intrinsics.h(r6)
            return r6
        L6f:
            androidx.work.ListenableWorker$Result r6 = androidx.work.ListenableWorker.Result.failure()
            java.lang.String r0 = "failure(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.utils.job.workers.CreditCardProductsWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
