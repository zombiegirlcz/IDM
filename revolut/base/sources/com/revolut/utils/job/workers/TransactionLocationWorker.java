package com.revolut.utils.job.workers;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.RxWorker;
import androidx.work.WorkerParameters;
import efm.d0;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o70.a;
import org.jetbrains.annotations.NotNull;
import pth.m;
import te0.w;
import ue0.e;
import ufm.i;
import ufm.p;
import w39.b;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0002\u000b\fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/revolut/utils/job/workers/TransactionLocationWorker;", "Landroidx/work/RxWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lw39/b;", "locationInteractor", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lw39/b;)V", "Companion", "pzl/w", "a", "app_retail_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransactionLocationWorker extends RxWorker {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkerParameters f107365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f107366b;

    /* JADX INFO: renamed from: com.revolut.utils.job.workers.TransactionLocationWorker$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public Companion(int i) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionLocationWorker(@NotNull Context context, @NotNull WorkerParameters workerParams, @NotNull b locationInteractor) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        this.f107365a = workerParams;
        this.f107366b = locationInteractor;
    }

    @Override // androidx.work.RxWorker
    public final d0 createWork() {
        String string = this.f107365a.getInputData().getString("JOB_EXTRA_TRANSACTION_ID");
        if (string == null) {
            ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
            Intrinsics.checkNotNullExpressionValue(resultSuccess, "success(...)");
            return w.j(resultSuccess);
        }
        int i = 19;
        p pVarT = new i(a.b(((z39.b) this.f107366b).b()), new pz4.a(i, new m(this, string, i)), 0).t(60L, TimeUnit.SECONDS);
        Intrinsics.checkNotNullExpressionValue(pVarT, "timeout(...)");
        return e.I(pVarT, h0.f322473a, new pyc.p(21));
    }
}
