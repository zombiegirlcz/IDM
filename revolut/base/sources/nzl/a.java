package nzl;

import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;
import com.revolut.utils.job.workers.CreditApplicationReloadWorker;
import com.revolut.utils.job.workers.CreditCardProductsWorker;
import com.revolut.utils.job.workers.FetchAndSaveTransactionWorker;
import com.revolut.utils.job.workers.ProfileLocationWorker;
import com.revolut.utils.job.workers.TransactionsReloadWorker;
import ih0.b;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import lm.d;
import mri.w;
import yhm.j;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkManager f221092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f221093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f221094c;
    public final Lazy d;

    public a(WorkManager workManager, b remoteConfig) {
        Intrinsics.checkNotNullParameter(workManager, "workManager");
        Intrinsics.checkNotNullParameter(remoteConfig, "remoteConfig");
        this.f221092a = workManager;
        this.f221093b = remoteConfig;
        this.f221094c = j.b(new d(17));
        this.d = j.b(new d(18));
    }

    public final void a(String transactionId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        OneTimeWorkRequest oneTimeWorkRequestBuild = new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) FetchAndSaveTransactionWorker.class).setInputData(new Data.Builder().putString("JOB_EXTRA_TRANSACTION_ID", transactionId).build()).setConstraints(b()).build();
        this.f221092a.enqueueUniqueWork("Fetch and Save transaction", ExistingWorkPolicy.REPLACE, oneTimeWorkRequestBuild);
    }

    public final Constraints b() {
        return (Constraints) this.d.getValue();
    }

    public final void c(boolean z, boolean z3) {
        OneTimeWorkRequest oneTimeWorkRequestBuild = new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) CreditApplicationReloadWorker.class).setConstraints(b()).setInputData(new Data.Builder().putBoolean("reload_config.extra", z3).putBoolean("reload_eligibility.extra", true).putBoolean("reload_eligibility.extra", z).build()).setBackoffCriteria(BackoffPolicy.EXPONENTIAL, 1L, TimeUnit.MINUTES).build();
        this.f221092a.enqueueUniqueWork("Reload credit application", ExistingWorkPolicy.REPLACE, oneTimeWorkRequestBuild);
    }

    @Override // od0.e
    public final void clear() {
        WorkManager workManager = this.f221092a;
        workManager.cancelUniqueWork("profile-background-work");
        workManager.cancelUniqueWork("personalisation-refresh-work");
        workManager.cancelUniqueWork("PeerToPeerChatPublicKeyPropagationWorker");
        workManager.cancelUniqueWork("Auto clean cache");
        workManager.cancelUniqueWork("Reload Transactions History");
        workManager.cancelUniqueWork("Increment Beneficiary Transactions");
        workManager.cancelUniqueWork("wallets-reload-background-work");
        workManager.cancelUniqueWork("Fetch and Save transaction");
        workManager.cancelUniqueWork("WeroKeySyncWorker");
        workManager.cancelUniqueWork("MoveMoneyBalanceSyncWorker");
        workManager.cancelUniqueWork("product-account-migration-work");
        workManager.cancelUniqueWork("InAppCalls.RefreshToken.Work");
    }

    public final void d(long j2, String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f221092a.enqueue(new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) CreditCardProductsWorker.class).setConstraints(b()).setInputData(new Data.Builder().putString("facility_id.extra", facilityId).build()).setInitialDelay(j2, TimeUnit.SECONDS).setBackoffCriteria(BackoffPolicy.EXPONENTIAL, 5L, TimeUnit.MINUTES).build());
    }

    public final void e() {
        OneTimeWorkRequest oneTimeWorkRequestBuild = new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) TransactionsReloadWorker.class).setConstraints(b()).build();
        this.f221092a.enqueueUniqueWork("Reload Transactions History", ExistingWorkPolicy.REPLACE, oneTimeWorkRequestBuild);
    }

    public final void g() {
        this.f221092a.enqueueUniquePeriodicWork("profile-background-work", ExistingPeriodicWorkPolicy.KEEP, new PeriodicWorkRequest.Builder(ProfileLocationWorker.class, 30L, TimeUnit.MINUTES).setConstraints((Constraints) this.f221094c.getValue()).build());
    }
}
