package com.revolut.utils.job.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xg0.a;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0002\u000b\fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/revolut/utils/job/workers/OnboardingDynamicFeaturesWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lxg0/a;", "dynamicDelivery", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lxg0/a;)V", "Companion", "oe7/a", "a", "app_retail_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OnboardingDynamicFeaturesWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f107356c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f107357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f107358b;

    /* JADX INFO: renamed from: com.revolut.utils.job.workers.OnboardingDynamicFeaturesWorker$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    static {
        String[] elements = {"feature_incode_sdk", "feature_fourthline_impl"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f107356c = d.y0(elements);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingDynamicFeaturesWorker(@NotNull Context context, @NotNull WorkerParameters workerParams, @NotNull a dynamicDelivery) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        Intrinsics.checkNotNullParameter(dynamicDelivery, "dynamicDelivery");
        this.f107357a = context;
        this.f107358b = dynamicDelivery;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.Set r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof pzl.p
            if (r0 == 0) goto L13
            r0 = r8
            pzl.p r0 = (pzl.p) r0
            int r1 = r0.f241034w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f241034w = r1
            goto L18
        L13:
            pzl.p r0 = new pzl.p
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f241034w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L41
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r8)
            r0.f241034w = r3
            xg0.a r8 = r6.f107358b
            oi0.b r8 = (oi0.b) r8
            android.content.Context r2 = r6.f107357a
            java.lang.Object r8 = r8.b(r2, r7, r0)
            if (r8 != r1) goto L41
            return r1
        L41:
            xg0.j r8 = (xg0.j) r8
            java.util.concurrent.CopyOnWriteArrayList r7 = rd0.d.f253311a
            rd0.c r0 = rd0.c.DEBUG
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "Deferred installation status: "
            r7.<init>(r1)
            r7.append(r8)
            java.lang.String r2 = r7.toString()
            r4 = 0
            r5 = 16
            java.lang.String r1 = "OnboardingDynamicFeaturesWorker"
            r3 = 0
            rd0.d.b(r0, r1, r2, r3, r4, r5)
            xg0.q r7 = xg0.q.f305476a
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r8, r7)
            if (r7 == 0) goto L70
            androidx.work.ListenableWorker$Result r7 = androidx.work.ListenableWorker.Result.success()
            java.lang.String r8 = "success(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            return r7
        L70:
            xg0.l r7 = xg0.l.f305470a
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r8, r7)
            if (r7 == 0) goto L8b
            r4 = 0
            r5 = 16
            java.lang.String r1 = "OnboardingDynamicFeaturesWorker"
            java.lang.String r2 = "Installation deferred. Will retry to confirm installation"
            r3 = 0
            rd0.d.b(r0, r1, r2, r3, r4, r5)
            androidx.work.ListenableWorker$Result r7 = androidx.work.ListenableWorker.Result.retry()
            kotlin.jvm.internal.Intrinsics.h(r7)
            return r7
        L8b:
            boolean r7 = r8 instanceof xg0.o
            if (r7 == 0) goto Lb2
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            xg0.o r8 = (xg0.o) r8
            java.lang.String r0 = r8.f305474a
            java.lang.String r1 = "Onboarding modules download has failed with error = "
            java.lang.String r0 = j6.a.q(r1, r0)
            java.lang.Exception r8 = r8.f305475b
            r7.<init>(r0, r8)
            zhm.h0 r8 = zhm.h0.f322473a
            rd0.c r0 = rd0.c.ERROR
            r1 = 0
            java.lang.String r2 = "OnboardingDynamicFeaturesWorker"
            rd0.d.a(r0, r2, r1, r7, r8)
            androidx.work.ListenableWorker$Result r7 = androidx.work.ListenableWorker.Result.retry()
            kotlin.jvm.internal.Intrinsics.h(r7)
            return r7
        Lb2:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.utils.job.workers.OnboardingDynamicFeaturesWorker.a(java.util.Set, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof pzl.o
            if (r0 == 0) goto L13
            r0 = r6
            pzl.o r0 = (pzl.o) r0
            int r1 = r0.f241033w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f241033w = r1
            goto L18
        L13:
            pzl.o r0 = new pzl.o
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f241033w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            return r6
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            yhm.o.b(r6)
            goto L6e
        L36:
            yhm.o.b(r6)
            int r6 = r5.getRunAttemptCount()
            r2 = 3
            if (r6 <= r2) goto L5d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Worker failed after 3 attempts, stopping"
            r6.<init>(r0)
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            r2 = 0
            java.lang.String r3 = "OnboardingDynamicFeaturesWorker"
            rd0.d.a(r1, r3, r2, r6, r0)
            androidx.work.ListenableWorker$Result r6 = androidx.work.ListenableWorker.Result.failure()
            java.lang.String r0 = "failure(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            return r6
        L5d:
            r0.f241033w = r4
            xg0.a r6 = r5.f107358b
            oi0.b r6 = (oi0.b) r6
            android.content.Context r2 = r5.f107357a
            java.util.Set r4 = com.revolut.utils.job.workers.OnboardingDynamicFeaturesWorker.f107356c
            java.lang.Object r6 = r6.c(r2, r4, r0)
            if (r6 != r1) goto L6e
            goto L83
        L6e:
            xg0.h r6 = (xg0.h) r6
            java.util.Set r6 = r6.f305464a
            r2 = r6
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L85
            r0.f241033w = r3
            java.lang.Object r6 = r5.a(r6, r0)
            if (r6 != r1) goto L84
        L83:
            return r1
        L84:
            return r6
        L85:
            androidx.work.ListenableWorker$Result r6 = androidx.work.ListenableWorker.Result.success()
            kotlin.jvm.internal.Intrinsics.h(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.utils.job.workers.OnboardingDynamicFeaturesWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
