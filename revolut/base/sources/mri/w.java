package mri;

import androidx.work.BackoffPolicy;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import com.revolut.utils.job.workers.CreditApplicationStopDataMonitoringWorker;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public interface w extends od0.e {
    static void r0(w wVar, String applicationId) {
        String[] ignoreProviders = new String[0];
        nzl.a aVar = (nzl.a) wVar;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(ignoreProviders, "ignoreProviders");
        aVar.f221092a.enqueueUniqueWork("Stop credit application data monitoring", ExistingWorkPolicy.KEEP, new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) CreditApplicationStopDataMonitoringWorker.class).setConstraints(aVar.b()).setInputData(new Data.Builder().putString("application_id.extra", applicationId).putStringArray("client_monitoring_ignore_providers.extra", ignoreProviders).build()).setBackoffCriteria(BackoffPolicy.EXPONENTIAL, 1L, TimeUnit.MINUTES).build());
    }
}
