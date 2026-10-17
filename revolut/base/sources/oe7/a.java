package oe7;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.revolut.feature.in_app_calls.workers.TwilioCallsDynamicFeaturesWorker;
import com.revolut.utils.job.workers.CardSceneDynamicFeaturesWorker;
import com.revolut.utils.job.workers.OnboardingDynamicFeaturesWorker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements k90.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f224557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xg0.a f224558b;

    public a(xg0.a dynamicDelivery, int i) {
        this.f224557a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(dynamicDelivery, "dynamicDelivery");
                this.f224558b = dynamicDelivery;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(dynamicDelivery, "dynamicDelivery");
                this.f224558b = dynamicDelivery;
                break;
            default:
                Intrinsics.checkNotNullParameter(dynamicDelivery, "dynamicDelivery");
                this.f224558b = dynamicDelivery;
                break;
        }
    }

    @Override // k90.a
    public final ListenableWorker a(Context appContext, WorkerParameters params) {
        switch (this.f224557a) {
            case 0:
                Intrinsics.checkNotNullParameter(appContext, "appContext");
                Intrinsics.checkNotNullParameter(params, "params");
                return new TwilioCallsDynamicFeaturesWorker(this.f224558b, appContext, params);
            case 1:
                Intrinsics.checkNotNullParameter(appContext, "appContext");
                Intrinsics.checkNotNullParameter(params, "params");
                return new CardSceneDynamicFeaturesWorker(this.f224558b, appContext, params);
            default:
                Intrinsics.checkNotNullParameter(appContext, "appContext");
                Intrinsics.checkNotNullParameter(params, "params");
                return new OnboardingDynamicFeaturesWorker(appContext, params, this.f224558b);
        }
    }
}
