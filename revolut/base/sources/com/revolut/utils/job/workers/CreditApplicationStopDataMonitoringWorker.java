package com.revolut.utils.job.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sp3.a;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0002\u000b\fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/revolut/utils/job/workers/CreditApplicationStopDataMonitoringWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lsp3/a;", "creditDataMonitoringFacade", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lsp3/a;)V", "Companion", "a", "br/b", "app_retail_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditApplicationStopDataMonitoringWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkerParameters f107342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f107343b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditApplicationStopDataMonitoringWorker(@NotNull Context context, @NotNull WorkerParameters workerParams, @NotNull a creditDataMonitoringFacade) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        Intrinsics.checkNotNullParameter(creditDataMonitoringFacade, "creditDataMonitoringFacade");
        this.f107342a = workerParams;
        this.f107343b = creditDataMonitoringFacade;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.utils.job.workers.CreditApplicationStopDataMonitoringWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
