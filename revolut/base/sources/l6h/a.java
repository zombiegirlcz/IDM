package l6h;

import androidx.work.Constraints;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import com.revolut.feature.wealth.gia.margin_trading.impl.pushes.WealthGiaMarginCallRefreshWorker;
import ipa.j;
import ipa.k;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements hpa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkManager f192405a;

    public a(WorkManager workManager) {
        Intrinsics.checkNotNullParameter(workManager, "workManager");
        this.f192405a = workManager;
    }

    @Override // hpa.a
    public final boolean b(j message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (!Intrinsics.f(k.b(message), "INVEST_MARGIN_CALL_UPDATE")) {
            return false;
        }
        OneTimeWorkRequest oneTimeWorkRequestBuild = new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) WealthGiaMarginCallRefreshWorker.class).setConstraints(new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build()).build();
        this.f192405a.enqueueUniqueWork("WealthGiaMarginCallRefreshWorker", ExistingWorkPolicy.KEEP, oneTimeWorkRequestBuild);
        return true;
    }
}
