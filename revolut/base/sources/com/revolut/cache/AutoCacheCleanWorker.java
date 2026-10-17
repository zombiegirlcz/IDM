package com.revolut.cache;

import android.content.Context;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pzl.e;
import tsk.t;
import wu.a;
import wu.b;
import wu.c;
import wu.d;
import wu.f;
import wu.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/revolut/cache/AutoCacheCleanWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lkotlin/Function0;", "", "featureToggleProvider", "Lwu/g;", "cacheCleaner", "Lwu/b;", "config", "Lwu/a;", "listener", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lkotlin/jvm/functions/Function0;Lwu/g;Lwu/b;Lwu/a;)V", "Companion", "a", "cache_cleaner_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AutoCacheCleanWorker extends Worker {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f50674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f50675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f50676c;
    public final a d;

    /* JADX INFO: renamed from: com.revolut.cache.AutoCacheCleanWorker$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class Companion {
        private Companion() {
        }

        public Companion(int i) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoCacheCleanWorker(@NotNull Context context, @NotNull WorkerParameters workerParams, @NotNull Function0<Boolean> featureToggleProvider, @NotNull g cacheCleaner, @NotNull b config, @NotNull a listener) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        Intrinsics.checkNotNullParameter(featureToggleProvider, "featureToggleProvider");
        Intrinsics.checkNotNullParameter(cacheCleaner, "cacheCleaner");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f50674a = featureToggleProvider;
        this.f50675b = cacheCleaner;
        this.f50676c = config;
        this.d = listener;
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.Result doWork() {
        if (!((Boolean) this.f50674a.invoke()).booleanValue()) {
            ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
            Intrinsics.checkNotNullExpressionValue(resultSuccess, "success(...)");
            return resultSuccess;
        }
        f fVarW = ((t) this.f50675b).w(this.f50676c);
        boolean zEquals = fVarW.equals(c.f300042a);
        a aVar = this.d;
        if (zEquals) {
            ((e) aVar).b();
            ListenableWorker.Result resultSuccess2 = ListenableWorker.Result.success(new Data.Builder().putString("result", "NothingToShrink").build());
            Intrinsics.h(resultSuccess2);
            return resultSuccess2;
        }
        if (fVarW instanceof d) {
            d dVar = (d) fVarW;
            ((e) aVar).c(dVar.a());
            ListenableWorker.Result resultSuccess3 = ListenableWorker.Result.success(new Data.Builder().putString("result", "Shrank").putLong("freedUpBytes", dVar.a()).build());
            Intrinsics.h(resultSuccess3);
            return resultSuccess3;
        }
        if (!(fVarW instanceof wu.e)) {
            throw new NoWhenBranchMatchedException();
        }
        wu.e eVar = (wu.e) fVarW;
        ((e) aVar).a(eVar.a());
        ListenableWorker.Result resultFailure = ListenableWorker.Result.failure(new Data.Builder().putString("result", "Error").putString("exception", eVar.a().getMessage()).build());
        Intrinsics.h(resultFailure);
        return resultFailure;
    }
}
