package pzl;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.revolut.cache.AutoCacheCleanWorker;
import com.revolut.utils.job.workers.ApmMultibancoDynamicFeaturesWorker;
import com.revolut.utils.job.workers.CreditCardDebitToCreditInstalmentPlansWorker;
import com.revolut.utils.job.workers.CreditDynamicFeaturesWorker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements k90.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f241014a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f241015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f241016c;

    public a(ih0.b remoteConfig, com.revolut.analytics.tracking.v3.d analyticsTracker) {
        Intrinsics.checkNotNullParameter(remoteConfig, "remoteConfig");
        Intrinsics.checkNotNullParameter(analyticsTracker, "analyticsTracker");
        this.f241015b = remoteConfig;
        this.f241016c = analyticsTracker;
    }

    @Override // k90.a
    public final ListenableWorker a(Context appContext, WorkerParameters params) {
        switch (this.f241014a) {
            case 0:
                Intrinsics.checkNotNullParameter(appContext, "appContext");
                Intrinsics.checkNotNullParameter(params, "params");
                return new ApmMultibancoDynamicFeaturesWorker((uw1.c) this.f241015b, (xg0.a) this.f241016c, appContext, params);
            case 1:
                Intrinsics.checkNotNullParameter(appContext, "appContext");
                Intrinsics.checkNotNullParameter(params, "params");
                return new AutoCacheCleanWorker(appContext, params, new pyc.a(this, 1), new tsk.t(appContext), new wu.b(zhm.u.c("video")), new e((com.revolut.analytics.tracking.v3.d) this.f241016c));
            case 2:
                Intrinsics.checkNotNullParameter(appContext, "appContext");
                Intrinsics.checkNotNullParameter(params, "params");
                return new CreditCardDebitToCreditInstalmentPlansWorker(appContext, params, (al4.m) this.f241015b, (al4.e) this.f241016c);
            default:
                Intrinsics.checkNotNullParameter(appContext, "appContext");
                Intrinsics.checkNotNullParameter(params, "params");
                return new CreditDynamicFeaturesWorker(appContext, params, (up3.b) this.f241015b, (xg0.a) this.f241016c);
        }
    }

    public a(al4.m creditInteractor, al4.e debitInteractor) {
        Intrinsics.checkNotNullParameter(creditInteractor, "creditInteractor");
        Intrinsics.checkNotNullParameter(debitInteractor, "debitInteractor");
        this.f241015b = creditInteractor;
        this.f241016c = debitInteractor;
    }

    public a(uw1.c apmFeatureChecker, xg0.a dynamicDelivery) {
        Intrinsics.checkNotNullParameter(apmFeatureChecker, "apmFeatureChecker");
        Intrinsics.checkNotNullParameter(dynamicDelivery, "dynamicDelivery");
        this.f241015b = apmFeatureChecker;
        this.f241016c = dynamicDelivery;
    }

    public a(up3.b creditFeatureAvailabilityInteractor, xg0.a dynamicDelivery) {
        Intrinsics.checkNotNullParameter(creditFeatureAvailabilityInteractor, "creditFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(dynamicDelivery, "dynamicDelivery");
        this.f241015b = creditFeatureAvailabilityInteractor;
        this.f241016c = dynamicDelivery;
    }
}
