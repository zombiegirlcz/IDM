package com.revolut.feature_move_money.impl.interactor;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import c8i.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0002\u000b\fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/revolut/feature_move_money/impl/interactor/MoveMoneyBalanceSyncWorker;", "Landroidx/work/CoroutineWorker;", "Lc8i/m;", "balanceUpdater", "Landroidx/work/WorkerParameters;", "workerParams", "Landroid/content/Context;", "context", "<init>", "(Lc8i/m;Landroidx/work/WorkerParameters;Landroid/content/Context;)V", "Companion", "c8i/d", "a", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MoveMoneyBalanceSyncWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f97399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WorkerParameters f97400b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoveMoneyBalanceSyncWorker(@NotNull m balanceUpdater, @NotNull WorkerParameters workerParams, @NotNull Context context) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(balanceUpdater, "balanceUpdater");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f97399a = balanceUpdater;
        this.f97400b = workerParams;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0092, code lost:
    
        if (r2 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0094, code lost:
    
        r10 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0096, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0097, code lost:
    
        if (r10 == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0099, code lost:
    
        r0.u = r9;
        r0.v = r10;
        r0.f22195y = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a5, code lost:
    
        if (skm.k0.b(1000, r0) != r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b8, code lost:
    
        if (skm.e0.o(r2, r0) == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ba, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(mri.v r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof c8i.f
            if (r0 == 0) goto L13
            r0 = r10
            c8i.f r0 = (c8i.f) r0
            int r1 = r0.f22195y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22195y = r1
            goto L18
        L13:
            c8i.f r0 = new c8i.f
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f22193w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f22195y
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r10)
            goto Lbb
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            int r9 = r0.v
            mri.v r2 = r0.u
            yhm.o.b(r10)
            r10 = r9
            r9 = r2
            goto La8
        L3f:
            yhm.o.b(r10)
            java.util.Set r10 = r9.f208149a
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L4a:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L91
            java.lang.Object r2 = r10.next()
            r6 = r2
            mri.s r6 = (mri.s) r6
            c8i.m r7 = r8.f97399a
            r7.getClass()
            java.lang.String r7 = "info"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r7)
            boolean r7 = r6 instanceof mri.n
            if (r7 != 0) goto L92
            mri.h r7 = mri.h.INSTANCE
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r6, r7)
            if (r7 == 0) goto L6e
            goto L92
        L6e:
            boolean r2 = r6 instanceof mri.d
            if (r2 != 0) goto L4a
            boolean r2 = r6 instanceof mri.g
            if (r2 != 0) goto L4a
            mri.k r2 = mri.k.INSTANCE
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r6, r2)
            if (r2 != 0) goto L4a
            boolean r2 = r6 instanceof mri.q
            if (r2 != 0) goto L4a
            mri.r r2 = mri.r.INSTANCE
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r6, r2)
            if (r2 == 0) goto L8b
            goto L4a
        L8b:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L91:
            r2 = r4
        L92:
            if (r2 == 0) goto L96
            r10 = r5
            goto L97
        L96:
            r10 = 0
        L97:
            if (r10 == 0) goto La8
            r0.u = r9
            r0.v = r10
            r0.f22195y = r5
            r5 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r2 = skm.k0.b(r5, r0)
            if (r2 != r1) goto La8
            goto Lba
        La8:
            c34.d r2 = new c34.d
            r5 = 5
            r2.<init>(r9, r8, r4, r5)
            r0.u = r4
            r0.v = r10
            r0.f22195y = r3
            java.lang.Object r9 = skm.e0.o(r2, r0)
            if (r9 != r1) goto Lbb
        Lba:
            return r1
        Lbb:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature_move_money.impl.interactor.MoveMoneyBalanceSyncWorker.a(mri.v, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof c8i.e
            if (r0 == 0) goto L13
            r0 = r7
            c8i.e r0 = (c8i.e) r0
            int r1 = r0.f22189w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22189w = r1
            goto L18
        L13:
            c8i.e r0 = new c8i.e
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f22189w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L90
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            yhm.o.b(r7)
            int r7 = r6.getRunAttemptCount()
            r2 = 3
            if (r7 < r2) goto L41
            androidx.work.ListenableWorker$Result r7 = androidx.work.ListenableWorker.Result.failure()
            kotlin.jvm.internal.Intrinsics.h(r7)
            return r7
        L41:
            androidx.work.WorkerParameters r7 = r6.f97400b
            androidx.work.Data r7 = r7.getInputData()
            java.lang.String r2 = "JOB_EXTRA_BALANCE_JOB_INFO"
            java.lang.String r7 = r7.getString(r2)
            java.lang.String r2 = "failure(...)"
            if (r7 != 0) goto L59
            androidx.work.ListenableWorker$Result r7 = androidx.work.ListenableWorker.Result.failure()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r2)
            return r7
        L59:
            yhm.m$a r4 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L6f
            rlm.b r4 = kotlinx.serialization.json.Json.d     // Catch: java.lang.Throwable -> L6f
            r4.getClass()     // Catch: java.lang.Throwable -> L6f
            mri.u r5 = mri.v.Companion     // Catch: java.lang.Throwable -> L6f
            kotlinx.serialization.KSerializer r5 = r5.serializer()     // Catch: java.lang.Throwable -> L6f
            mlm.b r5 = (mlm.b) r5     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r7 = r4.b(r5, r7)     // Catch: java.lang.Throwable -> L6f
            mri.v r7 = (mri.v) r7     // Catch: java.lang.Throwable -> L6f
            goto L76
        L6f:
            r7 = move-exception
            yhm.m$a r4 = yhm.m.INSTANCE
            yhm.n r7 = yhm.o.a(r7)
        L76:
            boolean r4 = r7 instanceof yhm.n
            if (r4 == 0) goto L7b
            r7 = 0
        L7b:
            mri.v r7 = (mri.v) r7
            if (r7 != 0) goto L87
            androidx.work.ListenableWorker$Result r7 = androidx.work.ListenableWorker.Result.failure()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r2)
            return r7
        L87:
            r0.f22189w = r3
            java.lang.Object r7 = r6.a(r7, r0)
            if (r7 != r1) goto L90
            return r1
        L90:
            androidx.work.ListenableWorker$Result r7 = androidx.work.ListenableWorker.Result.success()
            kotlin.jvm.internal.Intrinsics.h(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature_move_money.impl.interactor.MoveMoneyBalanceSyncWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
