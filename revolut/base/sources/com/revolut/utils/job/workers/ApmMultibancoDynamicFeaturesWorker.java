package com.revolut.utils.job.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uw1.c;
import xg0.a;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0002\r\u000eB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/revolut/utils/job/workers/ApmMultibancoDynamicFeaturesWorker;", "Landroidx/work/CoroutineWorker;", "Luw1/c;", "apmFeatureChecker", "Lxg0/a;", "dynamicDelivery", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Luw1/c;Lxg0/a;Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Companion", "pzl/a", "a", "app_retail_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ApmMultibancoDynamicFeaturesWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f107335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f107336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f107337c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApmMultibancoDynamicFeaturesWorker(@NotNull c apmFeatureChecker, @NotNull a dynamicDelivery, @NotNull Context context, @NotNull WorkerParameters workerParams) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(apmFeatureChecker, "apmFeatureChecker");
        Intrinsics.checkNotNullParameter(dynamicDelivery, "dynamicDelivery");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        this.f107335a = apmFeatureChecker;
        this.f107336b = dynamicDelivery;
        this.f107337c = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof pzl.c
            if (r0 == 0) goto L13
            r0 = r8
            pzl.c r0 = (pzl.c) r0
            int r1 = r0.f241019w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f241019w = r1
            goto L18
        L13:
            pzl.c r0 = new pzl.c
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f241019w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L47
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L2f:
            yhm.o.b(r8)
            java.lang.String r8 = "feature_apm_multibanco_sdk_impl"
            java.util.Set r8 = zhm.y0.b(r8)
            r0.f241019w = r3
            xg0.a r2 = r7.f107336b
            oi0.b r2 = (oi0.b) r2
            android.content.Context r3 = r7.f107337c
            java.lang.Object r8 = r2.b(r3, r8, r0)
            if (r8 != r1) goto L47
            return r1
        L47:
            xg0.j r8 = (xg0.j) r8
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r1 = rd0.c.DEBUG
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "ApmMultibancoDynamicFeaturesWorker: finalStatus: "
            r0.<init>(r2)
            r0.append(r8)
            java.lang.String r3 = r0.toString()
            r5 = 0
            r6 = 16
            java.lang.String r2 = "MBWAY SDK"
            r4 = 0
            rd0.d.b(r1, r2, r3, r4, r5, r6)
            xg0.q r0 = xg0.q.f305476a
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r8, r0)
            if (r0 == 0) goto L76
            androidx.work.ListenableWorker$Result r8 = androidx.work.ListenableWorker.Result.success()
            java.lang.String r0 = "success(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)
            return r8
        L76:
            xg0.l r0 = xg0.l.f305470a
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r8, r0)
            if (r0 == 0) goto L91
            r5 = 0
            r6 = 16
            java.lang.String r2 = "MBWAY SDK"
            java.lang.String r3 = "Installation deferred. Will retry to confirm installation"
            r4 = 0
            rd0.d.b(r1, r2, r3, r4, r5, r6)
            androidx.work.ListenableWorker$Result r8 = androidx.work.ListenableWorker.Result.retry()
            kotlin.jvm.internal.Intrinsics.h(r8)
            return r8
        L91:
            boolean r0 = r8 instanceof xg0.o
            if (r0 == 0) goto Lb6
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            xg0.o r8 = (xg0.o) r8
            java.lang.String r1 = r8.f305474a
            java.lang.String r2 = "MBWay SDK download has failed with error = "
            java.lang.String r1 = j6.a.q(r2, r1)
            java.lang.Exception r8 = r8.f305475b
            r0.<init>(r1, r8)
            zhm.h0 r8 = zhm.h0.f322473a
            rd0.c r1 = rd0.c.ERROR
            r2 = 0
            rd0.d.a(r1, r2, r2, r0, r8)
            androidx.work.ListenableWorker$Result r8 = androidx.work.ListenableWorker.Result.retry()
            kotlin.jvm.internal.Intrinsics.h(r8)
            return r8
        Lb6:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.utils.job.workers.ApmMultibancoDynamicFeaturesWorker.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.utils.job.workers.ApmMultibancoDynamicFeaturesWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
