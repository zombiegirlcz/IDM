package pzl;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.revolut.utils.job.workers.FetchAndSaveTransactionWorker;
import com.revolut.utils.job.workers.TransactionsReloadWorker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class n implements k90.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f241031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f241032b;

    public n(com.revolut.domain.interactors.transactions.a transactionsInteractor, int i) {
        this.f241031a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
                this.f241032b = transactionsInteractor;
                break;
            default:
                Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
                this.f241032b = transactionsInteractor;
                break;
        }
    }

    @Override // k90.a
    public final ListenableWorker a(Context appContext, WorkerParameters params) {
        switch (this.f241031a) {
            case 0:
                Intrinsics.checkNotNullParameter(appContext, "appContext");
                Intrinsics.checkNotNullParameter(params, "params");
                return new FetchAndSaveTransactionWorker(appContext, params, this.f241032b);
            default:
                Intrinsics.checkNotNullParameter(appContext, "appContext");
                Intrinsics.checkNotNullParameter(params, "params");
                return new TransactionsReloadWorker(appContext, params, this.f241032b);
        }
    }
}
