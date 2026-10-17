package pv9;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.revolut.feature.payments.messaging.data.impl.encryption.PeerToPeerChatPublicKeyPropagationWorker;
import com.revolut.utils.job.workers.AnalyticsToggleRefreshWorker;
import com.revolut.utils.job.workers.PersonalisationSettingsRefreshWorker;
import kotlin.jvm.internal.Intrinsics;
import mk0.p;

/* JADX INFO: loaded from: classes13.dex */
public final class l implements k90.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f240033a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f240034b;

    public l(loi.a analyticsInteractor) {
        Intrinsics.checkNotNullParameter(analyticsInteractor, "analyticsInteractor");
        this.f240034b = analyticsInteractor;
    }

    @Override // k90.a
    public final ListenableWorker a(Context appContext, WorkerParameters params) {
        switch (this.f240033a) {
            case 0:
                Intrinsics.checkNotNullParameter(appContext, "appContext");
                Intrinsics.checkNotNullParameter(params, "params");
                return new PeerToPeerChatPublicKeyPropagationWorker(appContext, params, (cv9.a) this.f240034b);
            case 1:
                Intrinsics.checkNotNullParameter(appContext, "appContext");
                Intrinsics.checkNotNullParameter(params, "params");
                return new AnalyticsToggleRefreshWorker(appContext, params, (loi.a) this.f240034b);
            default:
                Intrinsics.checkNotNullParameter(appContext, "appContext");
                Intrinsics.checkNotNullParameter(params, "params");
                Object obj2 = ((k51.a) this.f240034b).get();
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                return new PersonalisationSettingsRefreshWorker(appContext, params, (p) obj2);
        }
    }

    public l(cv9.a encryptionInteractor) {
        Intrinsics.checkNotNullParameter(encryptionInteractor, "encryptionInteractor");
        this.f240034b = encryptionInteractor;
    }

    public l(k51.a personalisationStorageLoader) {
        Intrinsics.checkNotNullParameter(personalisationStorageLoader, "personalisationStorageLoader");
        this.f240034b = personalisationStorageLoader;
    }
}
