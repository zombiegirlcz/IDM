package com.revolut.utils.job.workers;

import android.content.Context;
import androidx.work.RxWorker;
import androidx.work.WorkerParameters;
import efm.d0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import no.f2;
import o70.a;
import org.jetbrains.annotations.NotNull;
import ufm.i;
import w39.b;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0002\r\u000eB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/revolut/utils/job/workers/ProfileLocationWorker;", "Landroidx/work/RxWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lw39/b;", "locationInteractor", "Lylg/b;", "userInteractor", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lw39/b;Lylg/b;)V", "Companion", "pzl/v", "a", "app_retail_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProfileLocationWorker extends RxWorker {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f107363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ylg.b f107364b;

    /* JADX INFO: renamed from: com.revolut.utils.job.workers.ProfileLocationWorker$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileLocationWorker(@NotNull Context context, @NotNull WorkerParameters workerParams, @NotNull b locationInteractor, @NotNull ylg.b userInteractor) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f107363a = locationInteractor;
        this.f107364b = userInteractor;
    }

    @Override // androidx.work.RxWorker
    public final d0 createWork() {
        i iVar = new i(a.b(((z39.b) this.f107363a).b()), new pv9.b(new f2(this, 7), 4), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }
}
