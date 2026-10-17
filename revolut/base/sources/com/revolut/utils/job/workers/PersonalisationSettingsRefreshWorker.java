package com.revolut.utils.job.workers;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.RxWorker;
import androidx.work.WorkerParameters;
import az0.r1;
import efm.d0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.d;
import mk0.p;
import no.f2;
import org.jetbrains.annotations.NotNull;
import pd.b;
import rfm.f0;
import skm.p0;
import te0.w;
import ue0.e;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0002\u000b\fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/revolut/utils/job/workers/PersonalisationSettingsRefreshWorker;", "Landroidx/work/RxWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lmk0/p;", "personalisationStorageLoader", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lmk0/p;)V", "Companion", "pv9/l", "a", "app_retail_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PersonalisationSettingsRefreshWorker extends RxWorker {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f107359a;

    /* JADX INFO: renamed from: com.revolut.utils.job.workers.PersonalisationSettingsRefreshWorker$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalisationSettingsRefreshWorker(@NotNull Context context, @NotNull WorkerParameters workerParams, @NotNull p personalisationStorageLoader) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        Intrinsics.checkNotNullParameter(personalisationStorageLoader, "personalisationStorageLoader");
        this.f107359a = personalisationStorageLoader;
    }

    @Override // androidx.work.RxWorker
    public final d0 createWork() {
        d coroutineContext = p0.f264003c;
        p pVar = this.f107359a;
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        f0 f0VarF = b.n(coroutineContext, new r1(pVar, null, 16)).f(w.j(ListenableWorker.Result.success()));
        Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
        return e.I(f0VarF, h0.f322473a, new f2(this, 6));
    }
}
