package com.revolut.feature.junior_progression.impl.push;

import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import ipa.j;
import ipa.k;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements hpa.a {

    @NotNull
    private static final nk8.a Companion = new nk8.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkManager f77151a;

    public a(WorkManager workManager) {
        Intrinsics.checkNotNullParameter(workManager, "workManager");
        this.f77151a = workManager;
    }

    @Override // hpa.a
    public final boolean b(j message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (!Intrinsics.f(k.b(message), "PROGRESSION_COMPLETED")) {
            return false;
        }
        Intrinsics.checkNotNullParameter(message, "<this>");
        String str = (String) message.get("target_plan_id");
        Constraints constraintsBuild = new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build();
        OneTimeWorkRequest.Builder builder = new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) JuniorProgressionRefreshWorker.class);
        JuniorProgressionRefreshWorker.INSTANCE.getClass();
        Pair[] pairArr = {new Pair("target_plan_id", str)};
        Data.Builder builder2 = new Data.Builder();
        Pair pair = pairArr[0];
        builder2.put((String) pair.f186385a, pair.f186386b);
        OneTimeWorkRequest oneTimeWorkRequestBuild = builder.setInputData(builder2.build()).setConstraints(constraintsBuild).build();
        this.f77151a.enqueueUniqueWork("progression_refresh", ExistingWorkPolicy.REPLACE, oneTimeWorkRequestBuild);
        return true;
    }
}
