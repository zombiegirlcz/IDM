package com.revolut.utils.job.workers;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.RxWorker;
import androidx.work.WorkerParameters;
import com.revolut.domain.interactors.transactions.a;
import efm.d0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pyc.p;
import ue0.e;
import ufm.b;
import ufm.i;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0002\u000b\fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/revolut/utils/job/workers/FetchAndSaveTransactionWorker;", "Landroidx/work/RxWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lcom/revolut/domain/interactors/transactions/a;", "transactionsInteractor", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/revolut/domain/interactors/transactions/a;)V", "Companion", "pzl/n", "a", "app_retail_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FetchAndSaveTransactionWorker extends RxWorker {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkerParameters f107352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f107353b;

    /* JADX INFO: renamed from: com.revolut.utils.job.workers.FetchAndSaveTransactionWorker$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchAndSaveTransactionWorker(@NotNull Context context, @NotNull WorkerParameters workerParams, @NotNull a transactionsInteractor) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        this.f107352a = workerParams;
        this.f107353b = transactionsInteractor;
    }

    @Override // androidx.work.RxWorker
    public final d0 createWork() {
        String string = this.f107352a.getInputData().getString("JOB_EXTRA_TRANSACTION_ID");
        if (string == null) {
            b bVarM = d0.m(ListenableWorker.Result.failure());
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        d0 d0VarFirstOrError = m70.a.g(a.c(this.f107353b, string, null, true, 6), null, null, 3).firstOrError();
        pz4.a aVar = new pz4.a(17, new p(19));
        d0VarFirstOrError.getClass();
        i iVar = new i(d0VarFirstOrError, aVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return e.F(iVar, ListenableWorker.Result.failure());
    }
}
