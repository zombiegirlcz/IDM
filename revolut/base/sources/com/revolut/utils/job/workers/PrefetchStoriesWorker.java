package com.revolut.utils.job.workers;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.RxWorker;
import androidx.work.WorkerParameters;
import efm.d0;
import k90.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0002\t\nB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/revolut/utils/job/workers/PrefetchStoriesWorker;", "Landroidx/work/RxWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Companion", "b", "a", "app_retail_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PrefetchStoriesWorker extends RxWorker {

    /* JADX INFO: loaded from: classes12.dex */
    public static final class b implements a {
        @Override // k90.a
        public final ListenableWorker a(Context appContext, WorkerParameters params) {
            Intrinsics.checkNotNullParameter(appContext, "appContext");
            Intrinsics.checkNotNullParameter(params, "params");
            return new PrefetchStoriesWorker(appContext, params);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrefetchStoriesWorker(@NotNull Context context, @NotNull WorkerParameters workerParams) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
    }

    @Override // androidx.work.RxWorker
    public final d0 createWork() {
        ufm.b bVarM = d0.m(ListenableWorker.Result.success());
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }
}
