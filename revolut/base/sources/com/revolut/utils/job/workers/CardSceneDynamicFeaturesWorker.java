package com.revolut.utils.job.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xg0.a;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0002\u000b\fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/revolut/utils/job/workers/CardSceneDynamicFeaturesWorker;", "Landroidx/work/CoroutineWorker;", "Lxg0/a;", "dynamicDelivery", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Lxg0/a;Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Companion", "oe7/a", "a", "app_retail_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardSceneDynamicFeaturesWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f107338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f107339b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardSceneDynamicFeaturesWorker(@NotNull a dynamicDelivery, @NotNull Context context, @NotNull WorkerParameters workerParams) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(dynamicDelivery, "dynamicDelivery");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        this.f107338a = dynamicDelivery;
        this.f107339b = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof pzl.g
            if (r0 == 0) goto L13
            r0 = r8
            pzl.g r0 = (pzl.g) r0
            int r1 = r0.f241022w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f241022w = r1
            goto L18
        L13:
            pzl.g r0 = new pzl.g
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f241022w
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
            java.lang.String r8 = "ui_kit_card_3d_scene_retail"
            java.util.Set r8 = zhm.y0.b(r8)
            r0.f241022w = r3
            xg0.a r2 = r7.f107338a
            oi0.b r2 = (oi0.b) r2
            android.content.Context r3 = r7.f107339b
            java.lang.Object r8 = r2.b(r3, r8, r0)
            if (r8 != r1) goto L47
            return r1
        L47:
            xg0.j r8 = (xg0.j) r8
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r1 = rd0.c.DEBUG
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "finalStatus: "
            r0.<init>(r2)
            r0.append(r8)
            java.lang.String r3 = r0.toString()
            r5 = 0
            r6 = 16
            java.lang.String r2 = "CardSceneDynamicFeaturesWorker"
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
            java.lang.String r2 = "CardSceneDynamicFeaturesWorker"
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
            java.lang.String r2 = "Card 3D Scene download has failed with error = "
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
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.utils.job.workers.CardSceneDynamicFeaturesWorker.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(kotlin.coroutines.Continuation r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof pzl.f
            if (r0 == 0) goto L13
            r0 = r11
            pzl.f r0 = (pzl.f) r0
            int r1 = r0.f241021w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f241021w = r1
            goto L18
        L13:
            pzl.f r0 = new pzl.f
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f241021w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r11)
            return r11
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L32:
            yhm.o.b(r11)
            goto L70
        L36:
            yhm.o.b(r11)
            int r11 = r10.getRunAttemptCount()
            r2 = 3
            if (r11 <= r2) goto L5b
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "Worker failed after 4 attempts, stopping"
            r11.<init>(r0)
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            r2 = 0
            rd0.d.a(r1, r2, r2, r11, r0)
            androidx.work.ListenableWorker$Result r11 = androidx.work.ListenableWorker.Result.failure()
            java.lang.String r0 = "failure(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)
            return r11
        L5b:
            java.lang.String r11 = "ui_kit_card_3d_scene_retail"
            java.util.Set r11 = zhm.y0.b(r11)
            r0.f241021w = r4
            xg0.a r2 = r10.f107338a
            oi0.b r2 = (oi0.b) r2
            android.content.Context r4 = r10.f107339b
            java.lang.Object r11 = r2.c(r4, r11, r0)
            if (r11 != r1) goto L70
            goto L95
        L70:
            xg0.h r11 = (xg0.h) r11
            java.util.Set r11 = r11.f305464a
            boolean r11 = r11.isEmpty()
            java.util.concurrent.CopyOnWriteArrayList r2 = rd0.d.f253311a
            rd0.c r4 = rd0.c.DEBUG
            java.lang.String r2 = "doWork: "
            java.lang.String r6 = com.google.android.gms.internal.mlkit_vision_face.a.r(r2, r11)
            r8 = 0
            r9 = 16
            java.lang.String r5 = "CardSceneDynamicFeaturesWorker"
            r7 = 0
            rd0.d.b(r4, r5, r6, r7, r8, r9)
            if (r11 != 0) goto L97
            r0.f241021w = r3
            java.lang.Object r11 = r10.a(r0)
            if (r11 != r1) goto L96
        L95:
            return r1
        L96:
            return r11
        L97:
            androidx.work.ListenableWorker$Result r11 = androidx.work.ListenableWorker.Result.success()
            java.lang.String r0 = "success(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.utils.job.workers.CardSceneDynamicFeaturesWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
