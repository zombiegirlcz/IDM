package com.revolut.feature.in_app_calls.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rd0.c;
import rd0.d;
import xg0.a;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0002\u000b\fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/revolut/feature/in_app_calls/workers/TwilioCallsDynamicFeaturesWorker;", "Landroidx/work/CoroutineWorker;", "Lxg0/a;", "dynamicDelivery", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Lxg0/a;Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Companion", "oe7/a", "a", "feature_in_app_calls_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TwilioCallsDynamicFeaturesWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f74837a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwilioCallsDynamicFeaturesWorker(@NotNull a dynamicDelivery, @NotNull Context context, @NotNull WorkerParameters workerParams) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(dynamicDelivery, "dynamicDelivery");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        this.f74837a = dynamicDelivery;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof oe7.c
            if (r0 == 0) goto L13
            r0 = r8
            oe7.c r0 = (oe7.c) r0
            int r1 = r0.f224561w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f224561w = r1
            goto L18
        L13:
            oe7.c r0 = new oe7.c
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f224561w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L4c
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r8)
            android.content.Context r8 = r6.getApplicationContext()
            java.lang.String r2 = "getApplicationContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)
            java.util.Set r7 = zhm.y0.b(r7)
            r0.f224561w = r3
            xg0.a r2 = r6.f74837a
            oi0.b r2 = (oi0.b) r2
            java.lang.Object r8 = r2.b(r8, r7, r0)
            if (r8 != r1) goto L4c
            return r1
        L4c:
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
            java.lang.String r1 = "InAppCalls"
            r3 = 0
            rd0.d.b(r0, r1, r2, r3, r4, r5)
            xg0.q r7 = xg0.q.f305476a
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r8, r7)
            if (r7 == 0) goto L7b
            androidx.work.ListenableWorker$Result r7 = androidx.work.ListenableWorker.Result.success()
            java.lang.String r8 = "success(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            return r7
        L7b:
            xg0.l r7 = xg0.l.f305470a
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r8, r7)
            if (r7 == 0) goto L94
            r4 = 0
            r5 = 16
            java.lang.String r1 = "InAppCalls"
            java.lang.String r2 = "Installation deferred. Will retry to confirm installation"
            r3 = 0
            rd0.d.b(r0, r1, r2, r3, r4, r5)
            r7 = 0
            androidx.work.ListenableWorker$Result r7 = r6.b(r7)
            return r7
        L94:
            boolean r7 = r8 instanceof xg0.o
            if (r7 == 0) goto Lae
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            xg0.o r8 = (xg0.o) r8
            java.lang.String r0 = r8.f305474a
            java.lang.String r1 = "Deferred installation failed with error = "
            java.lang.String r0 = j6.a.q(r1, r0)
            java.lang.Exception r8 = r8.f305475b
            r7.<init>(r0, r8)
            androidx.work.ListenableWorker$Result r7 = r6.b(r7)
            return r7
        Lae:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.in_app_calls.workers.TwilioCallsDynamicFeaturesWorker.a(java.lang.String, gim.c):java.lang.Object");
    }

    public final ListenableWorker.Result b(IllegalStateException illegalStateException) {
        if (getRunAttemptCount() < 10) {
            ListenableWorker.Result resultRetry = ListenableWorker.Result.retry();
            Intrinsics.checkNotNullExpressionValue(resultRetry, "retry(...)");
            return resultRetry;
        }
        if (illegalStateException != null) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(c.ERROR, "InAppCalls", null, illegalStateException, h0Var);
        } else {
            IllegalStateException illegalStateException2 = new IllegalStateException(j6.a.l(getRunAttemptCount() + 1, "Worker failed after ", " attempts, stopping"));
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = d.f253311a;
            d.a(c.ERROR, "InAppCalls", null, illegalStateException2, h0Var2);
        }
        ListenableWorker.Result resultFailure = ListenableWorker.Result.failure();
        Intrinsics.checkNotNullExpressionValue(resultFailure, "failure(...)");
        return resultFailure;
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
            boolean r0 = r13 instanceof oe7.b
            if (r0 == 0) goto L13
            r0 = r13
            oe7.b r0 = (oe7.b) r0
            int r1 = r0.f224560x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f224560x = r1
            goto L18
        L13:
            oe7.b r0 = new oe7.b
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f224560x
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            yhm.o.b(r13)
            return r13
        L2b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L33:
            java.lang.String r2 = r0.u
            yhm.o.b(r13)
            goto L80
        L39:
            yhm.o.b(r13)
            androidx.work.Data r13 = r12.getInputData()
            java.lang.String r2 = "module_name"
            java.lang.String r2 = r13.getString(r2)
            if (r2 != 0) goto L64
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "TwilioCallsDynamicFeaturesWorker requires 'module_name' input data"
            r13.<init>(r0)
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            java.lang.String r2 = "InAppCalls"
            rd0.d.a(r1, r2, r3, r13, r0)
            androidx.work.ListenableWorker$Result r13 = androidx.work.ListenableWorker.Result.failure()
            java.lang.String r0 = "failure(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r0)
            return r13
        L64:
            android.content.Context r13 = r12.getApplicationContext()
            java.lang.String r6 = "getApplicationContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r6)
            java.util.Set r6 = zhm.y0.b(r2)
            r0.u = r2
            r0.f224560x = r5
            xg0.a r5 = r12.f74837a
            oi0.b r5 = (oi0.b) r5
            java.lang.Object r13 = r5.c(r13, r6, r0)
            if (r13 != r1) goto L80
            goto Lc1
        L80:
            xg0.h r13 = (xg0.h) r13
            java.util.Set r13 = r13.f305464a
            boolean r13 = r13.isEmpty()
            java.util.concurrent.CopyOnWriteArrayList r5 = rd0.d.f253311a
            rd0.c r6 = rd0.c.DEBUG
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "doWork: isModuleInstalled="
            r5.<init>(r7)
            r5.append(r13)
            java.lang.String r7 = ", module="
            r5.append(r7)
            r5.append(r2)
            java.lang.String r8 = r5.toString()
            r10 = 0
            r11 = 16
            java.lang.String r7 = "InAppCalls"
            r9 = 0
            rd0.d.b(r6, r7, r8, r9, r10, r11)
            if (r13 == 0) goto Lb7
            androidx.work.ListenableWorker$Result r13 = androidx.work.ListenableWorker.Result.success()
            java.lang.String r0 = "success(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r0)
            return r13
        Lb7:
            r0.u = r3
            r0.f224560x = r4
            java.lang.Object r13 = r12.a(r2, r0)
            if (r13 != r1) goto Lc2
        Lc1:
            return r1
        Lc2:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.in_app_calls.workers.TwilioCallsDynamicFeaturesWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
