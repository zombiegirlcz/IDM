package com.revolut.utils.job.workers;

import al4.e;
import al4.m;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0002\r\u000eB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/revolut/utils/job/workers/CreditCardDebitToCreditInstalmentPlansWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lal4/m;", "creditInteractor", "Lal4/e;", "debitInteractor", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lal4/m;Lal4/e;)V", "Companion", "pzl/a", "a", "app_retail_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardDebitToCreditInstalmentPlansWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkerParameters f107344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f107345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f107346c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditCardDebitToCreditInstalmentPlansWorker(@NotNull Context context, @NotNull WorkerParameters workerParams, @NotNull m creditInteractor, @NotNull e debitInteractor) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        Intrinsics.checkNotNullParameter(creditInteractor, "creditInteractor");
        Intrinsics.checkNotNullParameter(debitInteractor, "debitInteractor");
        this.f107344a = workerParams;
        this.f107345b = creditInteractor;
        this.f107346c = debitInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e5, code lost:
    
        if (((om4.r1) r3).n(r2, r0) != r1) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.String] */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.utils.job.workers.CreditCardDebitToCreditInstalmentPlansWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
