package br;

import al4.q;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.revolut.biometric_verification.impl.data.managers.DefferedUploadWorker;
import com.revolut.feature.apm.wero.impl.interactor.WeroKeySyncWorker;
import com.revolut.feature.junior_progression.impl.push.JuniorProgressionRefreshWorker;
import com.revolut.utils.job.workers.CreditApplicationReloadWorker;
import com.revolut.utils.job.workers.CreditApplicationStopDataMonitoringWorker;
import com.revolut.utils.job.workers.CreditCardProductsWorker;
import com.revolut.utils.job.workers.IncrementBeneficiaryTransactionsWorker;
import kk8.o;
import kotlin.jvm.internal.Intrinsics;
import yr.d;

/* JADX INFO: loaded from: classes17.dex */
public final class b implements k90.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17857a = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f17858b;

    public b(d uploadDefferedFiles) {
        Intrinsics.checkNotNullParameter(uploadDefferedFiles, "uploadDefferedFiles");
        this.f17858b = uploadDefferedFiles;
    }

    @Override // k90.a
    public final ListenableWorker a(Context appContext, WorkerParameters params) {
        switch (this.f17857a) {
            case 0:
                Intrinsics.checkNotNullParameter(appContext, "appContext");
                Intrinsics.checkNotNullParameter(params, "params");
                return new DefferedUploadWorker(appContext, params, (d) this.f17858b);
            case 1:
                Intrinsics.checkNotNullParameter(appContext, "appContext");
                Intrinsics.checkNotNullParameter(params, "params");
                return new JuniorProgressionRefreshWorker(appContext, params, (o) this.f17858b);
            case 2:
                Intrinsics.checkNotNullParameter(appContext, "appContext");
                Intrinsics.checkNotNullParameter(params, "params");
                return new CreditApplicationReloadWorker(appContext, params, (wt3.b) this.f17858b);
            case 3:
                Intrinsics.checkNotNullParameter(appContext, "appContext");
                Intrinsics.checkNotNullParameter(params, "params");
                return new CreditApplicationStopDataMonitoringWorker(appContext, params, (sp3.a) this.f17858b);
            case 4:
                Intrinsics.checkNotNullParameter(appContext, "appContext");
                Intrinsics.checkNotNullParameter(params, "params");
                return new CreditCardProductsWorker(appContext, params, (q) this.f17858b);
            case 5:
                Intrinsics.checkNotNullParameter(appContext, "appContext");
                Intrinsics.checkNotNullParameter(params, "params");
                return new IncrementBeneficiaryTransactionsWorker(appContext, params, (o71.a) this.f17858b);
            default:
                Intrinsics.checkNotNullParameter(appContext, "appContext");
                Intrinsics.checkNotNullParameter(params, "params");
                return new WeroKeySyncWorker(appContext, params, (eh2.a) this.f17858b);
        }
    }

    public b(o71.a beneficiaryRepository) {
        Intrinsics.checkNotNullParameter(beneficiaryRepository, "beneficiaryRepository");
        this.f17858b = beneficiaryRepository;
    }

    public b(o juniorProgressionRefreshInteractor) {
        Intrinsics.checkNotNullParameter(juniorProgressionRefreshInteractor, "juniorProgressionRefreshInteractor");
        this.f17858b = juniorProgressionRefreshInteractor;
    }

    public b(q interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.f17858b = interactor;
    }

    public b(eh2.a statusChecker) {
        Intrinsics.checkNotNullParameter(statusChecker, "statusChecker");
        this.f17858b = statusChecker;
    }

    public b(wt3.b creditInteractor) {
        Intrinsics.checkNotNullParameter(creditInteractor, "creditInteractor");
        this.f17858b = creditInteractor;
    }

    public b(sp3.a creditDataMonitoringFacade) {
        Intrinsics.checkNotNullParameter(creditDataMonitoringFacade, "creditDataMonitoringFacade");
        this.f17858b = creditDataMonitoringFacade;
    }
}
