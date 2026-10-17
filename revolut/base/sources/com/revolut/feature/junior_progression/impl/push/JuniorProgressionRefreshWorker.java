package com.revolut.feature.junior_progression.impl.push;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0002\u000b\fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/revolut/feature/junior_progression/impl/push/JuniorProgressionRefreshWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Ldk8/a;", "juniorProgressionRefreshInteractor", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Ldk8/a;)V", "Companion", "br/b", "a", "feature_junior_progression_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorProgressionRefreshWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkerParameters f77149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dk8.a f77150b;

    /* JADX INFO: renamed from: com.revolut.feature.junior_progression.impl.push.JuniorProgressionRefreshWorker$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JuniorProgressionRefreshWorker(@NotNull Context context, @NotNull WorkerParameters workerParams, @NotNull dk8.a juniorProgressionRefreshInteractor) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        Intrinsics.checkNotNullParameter(juniorProgressionRefreshInteractor, "juniorProgressionRefreshInteractor");
        this.f77149a = workerParams;
        this.f77150b = juniorProgressionRefreshInteractor;
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
            boolean r0 = r5 instanceof nk8.b
            if (r0 == 0) goto L13
            r0 = r5
            nk8.b r0 = (nk8.b) r0
            int r1 = r0.f216756w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f216756w = r1
            goto L18
        L13:
            nk8.b r0 = new nk8.b
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f216756w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r5)     // Catch: java.lang.Exception -> L27
            goto L6d
        L27:
            r5 = move-exception
            goto L77
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            yhm.o.b(r5)
            androidx.work.WorkerParameters r5 = r4.f77149a     // Catch: java.lang.Exception -> L27
            androidx.work.Data r5 = r5.getInputData()     // Catch: java.lang.Exception -> L27
            java.lang.String r2 = "target_plan_id"
            java.lang.String r5 = r5.getString(r2)     // Catch: java.lang.Exception -> L27
            dk8.a r2 = r4.f77150b     // Catch: java.lang.Exception -> L27
            r0.f216756w = r3     // Catch: java.lang.Exception -> L27
            kk8.o r2 = (kk8.o) r2     // Catch: java.lang.Exception -> L27
            zm0.b r3 = r2.f184522c     // Catch: java.lang.Exception -> L27
            cn0.g r3 = (cn0.g) r3     // Catch: java.lang.Exception -> L27
            mm0.o r3 = r3.d()     // Catch: java.lang.Exception -> L27
            boolean r3 = r3 instanceof mm0.n     // Catch: java.lang.Exception -> L27
            if (r3 != 0) goto L55
            kotlin.Unit r5 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L27
            goto L6a
        L55:
            if (r5 == 0) goto L61
            java.lang.Object r5 = r2.a(r5, r0)     // Catch: java.lang.Exception -> L27
            if (r5 != r1) goto L5e
            goto L6a
        L5e:
            kotlin.Unit r5 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L27
            goto L6a
        L61:
            java.lang.Object r5 = r2.b(r0)     // Catch: java.lang.Exception -> L27
            if (r5 != r1) goto L68
            goto L6a
        L68:
            kotlin.Unit r5 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L27
        L6a:
            if (r5 != r1) goto L6d
            return r1
        L6d:
            androidx.work.ListenableWorker$Result r5 = androidx.work.ListenableWorker.Result.success()     // Catch: java.lang.Exception -> L27
            java.lang.String r0 = "success(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)     // Catch: java.lang.Exception -> L27
            return r5
        L77:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Failed to handle progression push in worker"
            r0.<init>(r1, r5)
            zhm.h0 r5 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            r2 = 0
            java.lang.String r3 = "ProgressionRefreshWorker"
            rd0.d.a(r1, r3, r2, r0, r5)
            androidx.work.ListenableWorker$Result r5 = androidx.work.ListenableWorker.Result.failure()
            java.lang.String r0 = "failure(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.junior_progression.impl.push.JuniorProgressionRefreshWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
