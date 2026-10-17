package com.revolut.feature.wealth.impl.domain.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import y2f.a;
import ybl.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/revolut/feature/wealth/impl/domain/workers/TradingTransactionsCleanUpWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lybl/k;", "tradingAccountsInteractor", "Ly2f/a;", "tradingTransactionsInteractor", "Lxoj/a;", "featuresInteractor", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lybl/k;Ly2f/a;Lxoj/a;)V", "Companion", "f9h/a", "a", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TradingTransactionsCleanUpWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f95520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f95521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xoj.a f95522c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradingTransactionsCleanUpWorker(@NotNull Context context, @NotNull WorkerParameters workerParams, @NotNull k tradingAccountsInteractor, @NotNull a tradingTransactionsInteractor, @NotNull xoj.a featuresInteractor) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(tradingTransactionsInteractor, "tradingTransactionsInteractor");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        this.f95520a = tradingAccountsInteractor;
        this.f95521b = tradingTransactionsInteractor;
        this.f95522c = featuresInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007d, code lost:
    
        if (r8 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof f9h.b
            if (r0 == 0) goto L13
            r0 = r8
            f9h.b r0 = (f9h.b) r0
            int r1 = r0.f132970w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f132970w = r1
            goto L18
        L13:
            f9h.b r0 = new f9h.b
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f132970w
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            yhm.o.b(r8)
            goto L80
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            yhm.o.b(r8)
            goto L56
        L37:
            yhm.o.b(r8)
            ybl.k r8 = r7.f95520a
            r2 = 7
            kotlinx.coroutines.flow.Flow r8 = ybl.k.k(r8, r3, r3, r3, r2)
            et6.a r2 = new et6.a
            r6 = 18
            r2.<init>(r6)
            r6 = 6
            jhi.b r8 = mo3.a.h(r8, r2, r3, r6)
            r0.f132970w = r5
            java.lang.Object r8 = vkm.q.x(r8, r0)
            if (r8 != r1) goto L56
            goto L7f
        L56:
            java.util.List r8 = (java.util.List) r8
            r0.f132970w = r4
            y2f.a r2 = r7.f95521b
            d4f.p r2 = (d4f.p) r2
            f4f.a r2 = r2.f111300a
            y3f.v r2 = (y3f.v) r2
            r2.getClass()
            skm.p0 r4 = skm.p0.f264001a
            elm.f r4 = elm.f.f127540b
            y20.a1 r5 = new y20.a1
            r6 = 4
            r5.<init>(r2, r8, r3, r6)
            java.lang.Object r8 = skm.e0.J(r4, r5, r0)
            if (r8 != r1) goto L76
            goto L78
        L76:
            kotlin.Unit r8 = kotlin.Unit.f186387a
        L78:
            if (r8 != r1) goto L7b
            goto L7d
        L7b:
            kotlin.Unit r8 = kotlin.Unit.f186387a
        L7d:
            if (r8 != r1) goto L80
        L7f:
            return r1
        L80:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.wealth.impl.domain.workers.TradingTransactionsCleanUpWorker.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0092, code lost:
    
        if (a(r0) != r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(kotlin.coroutines.Continuation r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof f9h.c
            if (r0 == 0) goto L13
            r0 = r10
            f9h.c r0 = (f9h.c) r0
            int r1 = r0.f132972x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f132972x = r1
            goto L18
        L13:
            f9h.c r0 = new f9h.c
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f132972x
            xoj.a r3 = r9.f95522c
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L44
            if (r2 == r6) goto L40
            if (r2 == r5) goto L3a
            if (r2 != r4) goto L32
            yhm.o.b(r10)     // Catch: java.lang.Exception -> L30
            goto L95
        L30:
            r10 = move-exception
            goto L9a
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L3a:
            java.lang.Boolean r2 = r0.u
            yhm.o.b(r10)
            goto L73
        L40:
            yhm.o.b(r10)
            goto L5b
        L44:
            yhm.o.b(r10)
            yoj.c r10 = yoj.c.WEALTH_TRADING
            yoj.d r2 = yoj.d.DISABLED
            r8 = r3
            cpj.b r8 = (cpj.b) r8
            ufm.i r10 = r8.f(r10, r2)
            r0.f132972x = r6
            java.lang.Object r10 = nim.a.b(r10, r0)
            if (r10 != r1) goto L5b
            goto L94
        L5b:
            r2 = r10
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            yoj.c r10 = yoj.c.ROBO
            yoj.d r6 = yoj.d.DISABLED
            cpj.b r3 = (cpj.b) r3
            ufm.i r10 = r3.f(r10, r6)
            r0.u = r2
            r0.f132972x = r5
            java.lang.Object r10 = nim.a.b(r10, r0)
            if (r10 != r1) goto L73
            goto L94
        L73:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L8a
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L82
            goto L8a
        L82:
            androidx.work.ListenableWorker$Result r10 = androidx.work.ListenableWorker.Result.success()
            kotlin.jvm.internal.Intrinsics.h(r10)
            return r10
        L8a:
            r0.u = r7     // Catch: java.lang.Exception -> L30
            r0.f132972x = r4     // Catch: java.lang.Exception -> L30
            java.lang.Object r10 = r9.a(r0)     // Catch: java.lang.Exception -> L30
            if (r10 != r1) goto L95
        L94:
            return r1
        L95:
            androidx.work.ListenableWorker$Result r7 = androidx.work.ListenableWorker.Result.success()     // Catch: java.lang.Exception -> L30
            goto La3
        L9a:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r7, r7, r10, r0)
        La3:
            if (r7 != 0) goto Lae
            androidx.work.ListenableWorker$Result r7 = androidx.work.ListenableWorker.Result.failure()
            java.lang.String r10 = "failure(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r10)
        Lae:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.wealth.impl.domain.workers.TradingTransactionsCleanUpWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
