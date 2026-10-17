package com.revolut.feature.apm.wero.impl.interactor;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.RxWorker;
import androidx.work.WorkerParameters;
import efm.d0;
import eh2.a;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pd.b;
import pfm.z;
import qh2.l;
import qh2.o;
import ue0.e;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0002\u000b\fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/revolut/feature/apm/wero/impl/interactor/WeroKeySyncWorker;", "Landroidx/work/RxWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Leh2/a;", "statusChecker", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Leh2/a;)V", "Companion", "br/b", "a", "feature_apm_wero_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WeroKeySyncWorker extends RxWorker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f63048a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeroKeySyncWorker(@NotNull Context context, @NotNull WorkerParameters workerParams, @NotNull a statusChecker) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        Intrinsics.checkNotNullParameter(statusChecker, "statusChecker");
        this.f63048a = statusChecker;
    }

    @Override // androidx.work.RxWorker
    public final d0 createWork() {
        if (getRunAttemptCount() >= 3) {
            return d0.m(ListenableWorker.Result.failure());
        }
        o oVar = (o) this.f63048a;
        oVar.getClass();
        z zVarD = b.n(g.f186406a, new l(oVar, null, 0)).D(ListenableWorker.Result.success());
        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
        return e.F(zVarD, ListenableWorker.Result.retry());
    }
}
