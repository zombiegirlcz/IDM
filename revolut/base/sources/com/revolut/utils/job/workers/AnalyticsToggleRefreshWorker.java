package com.revolut.utils.job.workers;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.RxWorker;
import androidx.work.WorkerParameters;
import efm.d0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import loi.a;
import org.jetbrains.annotations.NotNull;
import rfm.f0;
import te0.w;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/revolut/utils/job/workers/AnalyticsToggleRefreshWorker;", "Landroidx/work/RxWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lloi/a;", "analyticsInteractor", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lloi/a;)V", "pv9/l", "app_retail_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AnalyticsToggleRefreshWorker extends RxWorker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f107334a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsToggleRefreshWorker(@NotNull Context context, @NotNull WorkerParameters workerParams, @NotNull a analyticsInteractor) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        Intrinsics.checkNotNullParameter(analyticsInteractor, "analyticsInteractor");
        this.f107334a = analyticsInteractor;
    }

    @Override // androidx.work.RxWorker
    public final d0 createWork() {
        f0 f0VarF = ((noi.a) this.f107334a).a().f(w.j(ListenableWorker.Result.success()));
        Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
        return f0VarF;
    }
}
