package com.revolut.biometric_verification.impl.data.managers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pq.a;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/revolut/biometric_verification/impl/data/managers/DefferedUploadWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lpq/a;", "uploadDefferedFiles", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lpq/a;)V", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DefferedUploadWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f50466a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefferedUploadWorker(@NotNull Context appContext, @NotNull WorkerParameters workerParams, @NotNull a uploadDefferedFiles) {
        super(appContext, workerParams);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        Intrinsics.checkNotNullParameter(uploadDefferedFiles, "uploadDefferedFiles");
        this.f50466a = uploadDefferedFiles;
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
            boolean r0 = r5 instanceof br.a
            if (r0 == 0) goto L13
            r0 = r5
            br.a r0 = (br.a) r0
            int r1 = r0.f17856w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17856w = r1
            goto L18
        L13:
            br.a r0 = new br.a
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f17856w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r5)     // Catch: java.lang.Throwable -> L27
            goto L43
        L27:
            r5 = move-exception
            goto L48
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            yhm.o.b(r5)
            yhm.m$a r5 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27
            pq.a r5 = r4.f50466a     // Catch: java.lang.Throwable -> L27
            r0.f17856w = r3     // Catch: java.lang.Throwable -> L27
            yr.d r5 = (yr.d) r5     // Catch: java.lang.Throwable -> L27
            java.lang.Object r5 = r5.a(r0)     // Catch: java.lang.Throwable -> L27
            if (r5 != r1) goto L43
            return r1
        L43:
            kotlin.Unit r5 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L27
            yhm.m$a r0 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27
            goto L4e
        L48:
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.n r5 = yhm.o.a(r5)
        L4e:
            boolean r0 = r5 instanceof yhm.n
            if (r0 != 0) goto L5a
            androidx.work.ListenableWorker$Result r5 = androidx.work.ListenableWorker.Result.success()
            kotlin.jvm.internal.Intrinsics.h(r5)
            goto L73
        L5a:
            java.lang.Throwable r5 = yhm.m.a(r5)
            if (r5 == 0) goto L6c
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            r2 = 0
            java.lang.String r3 = "[UPLOAD_WORKER]"
            rd0.d.a(r1, r3, r2, r5, r0)
        L6c:
            androidx.work.ListenableWorker$Result r5 = androidx.work.ListenableWorker.Result.failure()
            kotlin.jvm.internal.Intrinsics.h(r5)
        L73:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.biometric_verification.impl.data.managers.DefferedUploadWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
