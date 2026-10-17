package com.revolut.utils.job.workers;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.RxWorker;
import androidx.work.WorkerParameters;
import com.revolut.domain.interactors.transactions.a;
import efm.d0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mjf.b0;
import org.jetbrains.annotations.NotNull;
import pfm.z;
import tof.q6;
import ue0.e;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0002\u000b\fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/revolut/utils/job/workers/TransactionsReloadWorker;", "Landroidx/work/RxWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lcom/revolut/domain/interactors/transactions/a;", "transactionsInteractor", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/revolut/domain/interactors/transactions/a;)V", "Companion", "pzl/n", "a", "app_retail_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransactionsReloadWorker extends RxWorker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f107367a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionsReloadWorker(@NotNull Context context, @NotNull WorkerParameters workerParams, @NotNull a transactionsInteractor) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        this.f107367a = transactionsInteractor;
    }

    @Override // androidx.work.RxWorker
    public final d0 createWork() {
        z zVarD = ((b0) this.f107367a).g(new q6[0]).D(ListenableWorker.Result.success());
        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
        return e.F(zVarD, ListenableWorker.Result.failure());
    }
}
