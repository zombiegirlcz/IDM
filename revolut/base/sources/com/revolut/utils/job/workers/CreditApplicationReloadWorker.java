package com.revolut.utils.job.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wt3.b;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0002\u000b\fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/revolut/utils/job/workers/CreditApplicationReloadWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lwt3/b;", "creditInteractor", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lwt3/b;)V", "Companion", "a", "br/b", "app_retail_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditApplicationReloadWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkerParameters f107340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f107341b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditApplicationReloadWorker(@NotNull Context context, @NotNull WorkerParameters workerParams, @NotNull b creditInteractor) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        Intrinsics.checkNotNullParameter(creditInteractor, "creditInteractor");
        this.f107340a = workerParams;
        this.f107341b = creditInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(kotlin.coroutines.Continuation r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof pzl.h
            if (r0 == 0) goto L13
            r0 = r13
            pzl.h r0 = (pzl.h) r0
            int r1 = r0.f241023w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f241023w = r1
            goto L18
        L13:
            pzl.h r0 = new pzl.h
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f241023w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r13)
            goto L7e
        L27:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L2f:
            yhm.o.b(r13)
            int r13 = r12.getRunAttemptCount()
            r2 = 3
            if (r13 <= r2) goto L43
            androidx.work.ListenableWorker$Result r13 = androidx.work.ListenableWorker.Result.failure()
            java.lang.String r0 = "failure(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r0)
            return r13
        L43:
            androidx.work.WorkerParameters r13 = r12.f107340a
            androidx.work.Data r2 = r13.getInputData()
            java.lang.String r4 = "reload_eligibility.extra"
            r5 = 0
            boolean r7 = r2.getBoolean(r4, r5)
            androidx.work.Data r2 = r13.getInputData()
            boolean r8 = r2.getBoolean(r4, r5)
            androidx.work.Data r13 = r13.getInputData()
            java.lang.String r2 = "reload_config.extra"
            boolean r9 = r13.getBoolean(r2, r5)
            r0.f241023w = r3
            wt3.b r13 = r12.f107341b
            r10 = r13
            hw3.i r10 = (hw3.i) r10
            r10.getClass()
            hw3.h r6 = new hw3.h
            r11 = 0
            r6.<init>(r7, r8, r9, r10, r11)
            java.lang.Object r13 = skm.e0.o(r6, r0)
            if (r13 != r1) goto L79
            goto L7b
        L79:
            kotlin.Unit r13 = kotlin.Unit.f186387a
        L7b:
            if (r13 != r1) goto L7e
            return r1
        L7e:
            androidx.work.ListenableWorker$Result r13 = androidx.work.ListenableWorker.Result.success()
            java.lang.String r0 = "success(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r0)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.utils.job.workers.CreditApplicationReloadWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
