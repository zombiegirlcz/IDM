package com.revolut.utils.job.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import up3.b;
import xg0.a;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0002\r\u000eB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/revolut/utils/job/workers/CreditDynamicFeaturesWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lup3/b;", "creditFeatureAvailabilityInteractor", "Lxg0/a;", "dynamicDelivery", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lup3/b;Lxg0/a;)V", "Companion", "pzl/a", "a", "app_retail_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditDynamicFeaturesWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f107349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f107350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f107351c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditDynamicFeaturesWorker(@NotNull Context context, @NotNull WorkerParameters workerParams, @NotNull b creditFeatureAvailabilityInteractor, @NotNull a dynamicDelivery) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        Intrinsics.checkNotNullParameter(creditFeatureAvailabilityInteractor, "creditFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(dynamicDelivery, "dynamicDelivery");
        this.f107349a = context;
        this.f107350b = creditFeatureAvailabilityInteractor;
        this.f107351c = dynamicDelivery;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof pzl.m
            if (r0 == 0) goto L13
            r0 = r7
            pzl.m r0 = (pzl.m) r0
            int r1 = r0.f241030w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f241030w = r1
            goto L18
        L13:
            pzl.m r0 = new pzl.m
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f241030w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L47
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            yhm.o.b(r7)
            java.lang.String r7 = "feature_credit_data_monitoring_sdk"
            java.util.Set r7 = zhm.y0.b(r7)
            r0.f241030w = r3
            xg0.a r2 = r6.f107351c
            oi0.b r2 = (oi0.b) r2
            android.content.Context r3 = r6.f107349a
            java.lang.Object r7 = r2.b(r3, r7, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            xg0.j r7 = (xg0.j) r7
            xg0.q r0 = xg0.q.f305476a
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r7, r0)
            if (r0 == 0) goto L5b
            androidx.work.ListenableWorker$Result r7 = androidx.work.ListenableWorker.Result.success()
            java.lang.String r0 = "success(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            return r7
        L5b:
            xg0.l r0 = xg0.l.f305470a
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r7, r0)
            if (r0 == 0) goto L79
            java.util.concurrent.CopyOnWriteArrayList r7 = rd0.d.f253311a
            rd0.c r0 = rd0.c.DEBUG
            r4 = 0
            r5 = 16
            r1 = 0
            java.lang.String r2 = "Installation deferred. Will retry to confirm installation"
            r3 = 0
            rd0.d.b(r0, r1, r2, r3, r4, r5)
            androidx.work.ListenableWorker$Result r7 = androidx.work.ListenableWorker.Result.retry()
            kotlin.jvm.internal.Intrinsics.h(r7)
            return r7
        L79:
            boolean r0 = r7 instanceof xg0.o
            if (r0 == 0) goto La0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            xg0.o r7 = (xg0.o) r7
            java.lang.String r1 = r7.f305474a
            java.lang.String r2 = "Data monitoring sdk download has failed with error = "
            java.lang.String r1 = j6.a.q(r2, r1)
            java.lang.Exception r7 = r7.f305475b
            r0.<init>(r1, r7)
            zhm.h0 r7 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            r2 = 0
            rd0.d.a(r1, r2, r2, r0, r7)
            androidx.work.ListenableWorker$Result r7 = androidx.work.ListenableWorker.Result.retry()
            kotlin.jvm.internal.Intrinsics.h(r7)
            return r7
        La0:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.utils.job.workers.CreditDynamicFeaturesWorker.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.utils.job.workers.CreditDynamicFeaturesWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
