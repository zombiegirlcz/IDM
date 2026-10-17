package com.revolut.utils.job.workers;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.RxWorker;
import androidx.work.WorkerParameters;
import efm.d0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o71.a;
import org.jetbrains.annotations.NotNull;
import pfm.n;
import pfm.z;
import r21.h;
import te0.w;
import ue0.e;
import ufm.b;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0002\u000b\fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/revolut/utils/job/workers/IncrementBeneficiaryTransactionsWorker;", "Landroidx/work/RxWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lo71/a;", "beneficiaryRepository", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lo71/a;)V", "Companion", "br/b", "a", "app_retail_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IncrementBeneficiaryTransactionsWorker extends RxWorker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkerParameters f107354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f107355b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IncrementBeneficiaryTransactionsWorker(@NotNull Context context, @NotNull WorkerParameters workerParams, @NotNull a beneficiaryRepository) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        Intrinsics.checkNotNullParameter(beneficiaryRepository, "beneficiaryRepository");
        this.f107354a = workerParams;
        this.f107355b = beneficiaryRepository;
    }

    @Override // androidx.work.RxWorker
    public final d0 createWork() {
        String id10 = this.f107354a.getInputData().getString("BENEFICIARY_ID_KEY");
        if (id10 == null) {
            b bVarM = d0.m(ListenableWorker.Result.failure());
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        h hVar = (h) this.f107355b;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        n nVar = new n(new pu9.a(hVar, id10, 13), 1);
        Intrinsics.checkNotNullExpressionValue(nVar, "fromCallable(...)");
        z zVarD = w.g0(nVar).D(ListenableWorker.Result.success());
        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
        return e.F(zVarD, ListenableWorker.Result.failure());
    }
}
